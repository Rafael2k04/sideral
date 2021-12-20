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
        prodTO.setIdMarca(leerTecla.leer("", "Ingrese Id de Categoria"));
        prodTO.setNombre(leerTecla.leer("", "Ingrese nombre producto"));
        prodTO.setTalla(leerTecla.leer(0, "Ingrese talla"));
        prodTO.setGenero(leerTecla.leer("","Ingrese genero"));
        prodTO.setTipo(leerTecla.leer("", "Ingrese el tipo"));
        prodTO.setUnidmed(leerTecla.leer("", "Ingrese la Unidad Med."));
        prodTO.setPreciounit(leerTecla.leer(0.0, "Ingrese el precio Unit"));
        prodTO.setStock(leerTecla.leer(0, "Ingrese Stock del Producto"));
        prodTO.setUtilidad(leerTecla.leer(0.0, "Ingrese la Utilidad"));                        
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        agregarContenido(leerArch, prodTO);

    }

    public void reportProducto() {
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        Object[][] dataPro= listarContenido(leerArch);
        util.pintarLine('H', 20);
        util.pintarTextHeadBody('H', 3, "Id,Nombre,stock");
        System.out.println("");
        util.pintarLine('H', 20);
        String dataPrint="";
        if(dataPro!=null){
            for (int i = 0; i < dataPro.length; i++) {
                dataPrint=dataPro[i][0]+","+dataPro[i][1]+","+dataPro[i][7];
                util.pintarTextHeadBody('B', 3, dataPrint); 
            }
            util.pintarLine('H', 20);
        }
    }

    public void updateProducto() {        
        util.clearConsole();
        reportProducto();
        String idProd=leerTecla.leer("", "Ingrese el Id del Producto");
        prodTO=new ProductoTO();
        prodTO.setUtilidad(leerTecla.leer(0.0, "Ingrese la nueva U-tilidad"));
        prodTO.setPreciounit(leerTecla.leer(0.0, "Ingrese el nuevo prec. unitario"));
        prodTO.setStock(leerTecla.leer(0, "Ingrese el nuevo stock"));
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
