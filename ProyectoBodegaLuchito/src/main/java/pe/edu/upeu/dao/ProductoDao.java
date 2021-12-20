package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.ProductoTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class ProductoDao extends AppCrud{

    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    
    LeerArchivo leerArch;
    ProductoTO prodTO;
    CategoriaDao mDao;
    final String TABLE_PRODUCTO="Producto.txt";    

    public void createProducto() {
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        prodTO=new ProductoTO();
        prodTO.setIdProducto(generarId(leerArch, 0, "P", 1));
        mDao=new CategoriaDao();
        mDao.mostrarMarca();
        prodTO.setIdCate(leerTecla.leer("", "Ingrese Id de categoria"));
        prodTO.setNombre(leerTecla.leer("", "Ingrese nombre producto"));
        prodTO.setUnidadMed(leerTecla.leer("", "Ingrese la Unidad Med."));
        prodTO.setPrecioUnit(leerTecla.leer(0.0, "Ingrese el precio Unit"));
        prodTO.setUtilidad(leerTecla.leer(0.0, "Ingrese la Utilidad"));                        
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        agregarContenido(leerArch, prodTO);

    }

    public void reportProducto() {
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        Object[][] dataPro= listarContenido(leerArch);
        util.pintarLine('H', 80);
        util.pintarTextHeadBody('H', 6, "Id,Nombre,idCate,unidadMed,precio,utilidad");
        System.out.println("");
        util.pintarLine('H', 80);
        String dataPrint="";
        if(dataPro!=null){
            for (int i = 0; i < dataPro.length; i++) {
                dataPrint=dataPro[i][0]+","+dataPro[i][1]+","+dataPro[i][2]+","+dataPro[i][3]+","+dataPro[i][4]+","+dataPro[i][5];
                util.pintarTextHeadBody('B', 6, dataPrint); 
            }
            util.pintarLine('H', 80);
        }
    }

    public void updateProducto() {        
        util.clearConsole();
        reportProducto();
        String idProd=leerTecla.leer("", "Ingrese el Id del Producto");
        prodTO=new ProductoTO();
        prodTO.setUtilidad(leerTecla.leer(0.0, "Ingrese la nueva U-tilidad"));
        prodTO.setPrecioUnit(leerTecla.leer(0.0, "Ingrese el nuevo prec. unitario"));
        leerArch=new LeerArchivo(TABLE_PRODUCTO);

        editarRegistro(leerArch, 0, idProd, prodTO);
        util.clearConsole();
        reportProducto();
    }

    public void deleteProducto() {
        reportProducto();
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        String idProd=leerTecla.leer("", "Ingrese el Id del Producto");
        eliminarRegistros(leerArch, 0, idProd);
        util.clearConsole();
        reportProducto();
    }
}