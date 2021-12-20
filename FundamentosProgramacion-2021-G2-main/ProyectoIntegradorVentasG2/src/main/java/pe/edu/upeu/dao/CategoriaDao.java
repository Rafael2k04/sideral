package pe.edu.upeu.dao;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.CategoriaTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class CategoriaDao extends AppCrud{
    LeerTeclado leerTecla=new LeerTeclado();
    UtilsX util=new UtilsX();
    
    LeerArchivo leerArch;
    CategoriaTO catTO;
    final String TABLE_CATEGORIA="Categoria.txt";      

    public void mostrarMarca() {
        leerArch=new LeerArchivo(TABLE_CATEGORIA);
        Object[][] dataMar=listarContenido(leerArch);
        if (dataMar!=null) {
            for (int i = 0; i < dataMar.length; i++) {
                System.out.println(dataMar[i][0]+"="+dataMar[i][1]);
            }            
        }
        System.out.println("\n");
    }

    public void createMarca() {
        leerArch=new LeerArchivo(TABLE_CATEGORIA);
        catTO=new CategoriaTO();
        catTO.setIdMarca(generarId(leerArch, 0, "M", 1));        
        catTO.setNombre(leerTecla.leer("", "Ingrese nombre de categoria"));
        leerArch=new LeerArchivo(TABLE_CATEGORIA);
        agregarContenido(leerArch, catTO);
    }

}
