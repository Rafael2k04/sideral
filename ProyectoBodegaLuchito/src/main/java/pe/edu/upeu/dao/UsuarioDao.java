package pe.edu.upeu.dao;

import java.io.Console;

import pe.edu.upeu.data.AppCrud;
import pe.edu.upeu.modelo.UsuarioTO;
import pe.edu.upeu.util.LeerArchivo;
import pe.edu.upeu.util.LeerTeclado;
import pe.edu.upeu.util.UtilsX;

public class UsuarioDao extends AppCrud {
    
LeerTeclado leerTecla=new LeerTeclado();
UtilsX util=new UtilsX();

LeerArchivo leerArch;
UsuarioTO userTO;
final String TABLE_USER="Usuario.txt";

public void registrarNuevoUsuario() {    
    userTO=new UsuarioTO();
    userTO.setUsuario(leerTecla.leer("", "Ingrese un usuario"));
    userTO.setPassword(leerTecla.leer("", "Ingrese una contraseña"));
    userTO.setPerfil(leerTecla.leer("", "Ingrese un perfil (VENDEDOR/ADMINISTRADOR)"));
    leerArch=new LeerArchivo(TABLE_USER);
    agregarContenido(leerArch, userTO);
}

public void listarUsuarios(){
    leerArch=new LeerArchivo(TABLE_USER);
    Object[][] data=listarContenido(leerArch);
    util.pintarLine('H', 20);
    util.pintarTextHeadBody('H', 5, "Usuario,Password,Perfil");
    System.out.println("");
    util.pintarLine('H', 20);
    String dataPrint="";
    for (int i = 0; i < data.length; i++) {
        dataPrint=data[i][0]+","+data[i][1]+","+data[i][2];
        util.pintarTextHeadBody('B', 5, dataPrint); 
    }
    util.pintarLine('H', 20);
}

public boolean login() {    
    String usuario=leerTecla.leer("","Usuario");
    Console cons=System.console();
    System.out.println("Ingrese su clave:");
    char[] clave=cons.readPassword();
    leerArch=new LeerArchivo(TABLE_USER);
    Object[][] dataUser= buscarContenido(leerArch, 0, usuario);    
    if(dataUser!=null){
        if(String.valueOf(dataUser[0][1]).equals(String.valueOf(clave))){
            return true;
        }else{
            System.out.println("La contraseña es incorrecta");
            return login();
        }
    }else{
        System.out.println("Intenete Nuevamente:");
        return login();
    }    
}


}