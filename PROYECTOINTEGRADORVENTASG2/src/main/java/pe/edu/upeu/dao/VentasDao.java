package pe.edu.upeu.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.fusesource.jansi.Ansi;
import org.fusesource.jansi.AnsiConsole;
import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ClienteTO;
import pe.edu.upeu.modelo.DescuentoTO;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.modelo.VentaDetalleTO;
import pe.edu.upeu.modelo.VentaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class VentasDao extends AppCrud{
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    
    LeerArchivo leerArch;
    ProductoTO prodTO;
    ClienteTO cliTO;
    VentaTO ventTO;
    VentaDetalleTO vdTO;
    DescuentoTO desTO;
    
    final String TABLE_PRODUCTO="Producto.txt";   
    final String TABLE_CLIENTE="Cliente.txt";   
    final String TABLE_VENTA="Venta.txt";   
    final String TABLE_DETALLE_VENTA="VentaDetalle.txt";  
    
    SimpleDateFormat formatofechahora = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    SimpleDateFormat formatofecha = new SimpleDateFormat("dd-MM-yyyy");    

    public void registroVenta() {
        
        System.out.println("*******************Venta***************");
        String dni=crearCliente(leerTecla.leer("", "Ingrese el DNI del Cliente"));
        double igvX=0;
        double subtotalX=0;
        double importeTotalX=0;

        VentaTO ventaTO=crearVenta(dni);
        if (ventaTO!=null) {
            String opcion="SI";
            do {                
                VentaDetalleTO vdXTo=crearCarritoVenta(ventaTO);
                importeTotalX+=vdXTo.getTotalpago();
                opcion=leerTecla.leer("", "Desea agregar productos a carrito de ventas");
            } while (opcion.toUpperCase().equals("SI"));
            subtotalX=(importeTotalX*100)/118;
            igvX=subtotalX*0.18;

            leerArch=new LeerArchivo(TABLE_VENTA); 
            ventaTO.setSubtotal(subtotalX);
            ventaTO.setIgv(igvX);
            ventaTO.setImportetotal(importeTotalX);
            editarRegistro(leerArch, 0, ventTO.getIdVenta(), ventaTO);
        }
        
    }

    public VentaTO crearVenta(String dni) {
        leerArch=new LeerArchivo(TABLE_VENTA);        
        ventTO=new VentaTO();
        ventTO.setIdVenta(generarId(leerArch, 0, "V", 1));
        ventTO.setDni(dni);
        ventTO.setFecha(formatofechahora.format(new Date()));
        ventTO.setUsuario("anonimo");
        ventTO.setIgv(0);
        ventTO.setImportetotal(0);
        ventTO.setSubtotal(0);
        leerArch=new LeerArchivo(TABLE_VENTA);
        agregarContenido(leerArch, ventTO);       
        return ventTO;
    }

    public VentaDetalleTO crearCarritoVenta(VentaTO vto) {
        util.clearConsole();
        System.out.println("====================Carrito de Ventas=====================");
        mostrarProducto();
        leerArch=new LeerArchivo(TABLE_DETALLE_VENTA);
        vdTO=new VentaDetalleTO();
        vdTO.setIdVentaDetalle(generarId(leerArch, 0, "VD", 2));
        vdTO.setIdVenta(vto.getIdVenta());
        vdTO.setIdProducto(leerTecla.leer("", "Ingrese Id del Producto a vender"));        
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        Object[][] dataP= buscarContenido(leerArch, 0, vdTO.getIdProducto());
        double precioP=Double.parseDouble(String.valueOf(dataP[0][3]));
        vdTO.setPrecioUnit(precioP);
        vdTO.setCantidad(leerTecla.leer(0, "Ingrese cantidad a vender"));
        vdTO.setDescuento(0);
        vdTO.setTotalpago((vdTO.getPrecioUnit()*vdTO.getCantidad())-vdTO.getDescuento());

        leerArch=new LeerArchivo(TABLE_DETALLE_VENTA);
        agregarContenido(leerArch, vdTO);
        return vdTO;
    }

    public void mostrarProducto() {
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
       Object[][] dataPro= listarContenido(leerArch);
       for (int i = 0; i < dataPro.length; i++) {
           System.out.print(dataPro[i][0]+"="+dataPro[i][1]+
           " (Precio:"+(
            Double.parseDouble(String.valueOf(dataPro[i][4])) 
           )+
            "/ Stock:"+dataPro[i][4]+")\t ! " );
       }
       System.out.println("\n");
    }   
    
    public String crearCliente(String dni) {
        leerArch=new LeerArchivo(TABLE_CLIENTE);
        Object[][] datCli= buscarContenido(leerArch, 0, dni);
        if(datCli!=null){
            return dni;
        }else{
            leerArch=new LeerArchivo(TABLE_CLIENTE);
            cliTO=new ClienteTO();
            cliTO.setDni(dni);
            cliTO.setNombre(leerTecla.leer("", "Ingrese nombre cliente"));
            agregarContenido(leerArch, cliTO);
            return cliTO.getDni();
        }       
    }        
    public void ReporteVentasRangoFecha() {
        
        util.clearConsole();
        leerArch=new LeerArchivo(TABLE_VENTA);
        Object[][] datPrev= listarContenido(leerArch);
        String fechaInit=leerTecla.leer("", "Ingrese Fecha Inicio");
        String fechaFinal=leerTecla.leer("", "Ingrese Fecha Fin");
        int cantidadFilas=0;
        try { //Leer ventas y saber cuantos coinciden eon el rango de fechas
            for (int i = 0; i < datPrev.length; i++) {
                String[] tempFecha=String.valueOf(datPrev[i][2]).split(" ");
                Date fechaTemX=formatofecha.parse(tempFecha[0]);
                if (
                    (fechaTemX.after(formatofecha.parse(fechaInit)) || tempFecha[0].equals(fechaInit)) && 
                    (fechaTemX.before(formatofecha.parse(fechaFinal)) || tempFecha[0].equals(fechaFinal))
                ) {
                    cantidadFilas++;
                }
            }  
            // pasar la data a la nueva matriz
            VentaTO[] dataVentas=new VentaTO[cantidadFilas];
            int indiceVentorV=0;
            for (int i = 0; i < datPrev.length; i++) {
                String[] tempFecha=String.valueOf(datPrev[i][2]).split(" ");
                Date fechaTemX=formatofecha.parse(tempFecha[0]);
                if (
                    (fechaTemX.after(formatofecha.parse(fechaInit)) || tempFecha[0].equals(fechaInit)) && 
                    (fechaTemX.before(formatofecha.parse(fechaFinal)) || tempFecha[0].equals(fechaFinal))
                ) {
                    VentaTO vtOX=new VentaTO();
                    vtOX.setIdVenta(String.valueOf(datPrev[i][0]));
                    vtOX.setDni(String.valueOf(datPrev[i][1]));
                    vtOX.setFecha(String.valueOf(datPrev[i][2]));
                    vtOX.setUsuario("Anonimo");
                    vtOX.setSubtotal(Double.parseDouble(String.valueOf(datPrev[i][3])));
                    vtOX.setIgv(Double.parseDouble(String.valueOf(datPrev[i][4])));
                    vtOX.setImportetotal(Double.parseDouble(String.valueOf(datPrev[i][5])));
                    dataVentas[indiceVentorV]=vtOX;
                    indiceVentorV++;
                }
            } 
            AnsiConsole.systemInstall();  
            Ansi color=new Ansi();   
            
            //Imprimir Reporte
            System.out.println(color.render("@|blue ============================ Reporte Ventas ==========================|@"));
            System.out.println("************Fecha Inicio:"+fechaInit+" a Fecha Fin:"+fechaFinal+"*********");
            util.pintarLine('H', 40);
            util.pintarTextHeadBody('H', 3, "ID,DNI,Fech.Venta,SubTotal, IGV, Imp. Total");
            System.out.println();
            util.pintarLine('H', 40);
            double subtotX=0, igvX=0, impTotX=0;
            for (VentaTO xx : dataVentas) {
                String dataXX=xx.getIdVenta()+","+xx.getDni()+","+xx.getFecha()
                +","+xx.getSubtotal()+","+xx.getIgv()+","+xx.getImportetotal();
                subtotX+=xx.getSubtotal();
                igvX+=xx.getIgv();
                impTotX+=xx.getImportetotal();
                util.pintarTextHeadBody('B',3,dataXX);
            }  //Math.round(double*100.0)/100.0
            util.pintarLine('H', 40);
            color=new Ansi();   
            //System.out.println(color.render("@|blue Holasss |@ @|green VErsdsd |@  "));       
            System.out.println(color.render("@|red Sub. Total: S/.|@ @|green "+ (Math.round(subtotX*100.0)/100.0)+
            "|@ | @|blue IGV: S/.|@ @|green "+(Math.round(igvX*100.0)/100.0)+
            "|@ |  @|blue Imp. Total: S/. |@ @|green "+(Math.round(impTotX*100.0)/100.0)+"|@"));
            util.pintarLine('H', 40);

        } catch (Exception e) {
            System.err.println("Error al reportar ventas : "+e.getMessage());
        }
    }


}
