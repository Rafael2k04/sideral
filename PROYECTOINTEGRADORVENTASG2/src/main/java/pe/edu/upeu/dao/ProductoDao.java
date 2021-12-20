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
    final String TABLE_PRODUCTO="Producto.txt";    

    public void createProducto() {
        leerArch=new LeerArchivo(TABLE_PRODUCTO);
        prodTO=new ProductoTO();
        prodTO.setIdProducto(generarId(leerArch, 0, "P", 1));
        
        
        leerArch=new LeerArchivo(TABLE_PRODUCTO);

    }

    public void reportProducto() {
        
    }

    public void updateProducto() {
        
    }

    public void deleteProducto() {
        
    }
}