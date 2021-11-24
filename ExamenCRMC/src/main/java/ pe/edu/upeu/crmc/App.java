package  pe.edu.upeu.crmc;
import pe.edu.upeu.crmc.examen.ResolucionExamen;
import pe.edu.upeu.crmc.utils.*;
import java.util.Scanner;
public class App {
    public static ResolucionExamen re;
    static Scanner sc=new Scanner(System.in);
    static LeerTeclado lt=new LeerTeclado();
  static void menuOpciones(){
    re=new ResolucionExamenCDZC();
    int opcion=0;
    String msg="Eliga el ejercicio que desea probar\n1=Ejercicio 2\n2=Ejercicio 3\n3=Ejercicio 4\n4=Ejercicio 5\n0=salir del menu";
    opcion=lt.leer(0,msg);
    while(opcion!=0){
      switch(opcion){
        case 1:re.impuestoVehiculos(); break;
        case 2:re.MultiplicaciondeunNumeroENtero(); break;
        case 3:re.numerosperfectos(); break;
        case 4:re.exponenten(); break;
        default: System.out.println("Opcion no existe!");
      }
      opcion=lt.leer(0,msg);
    }
  }
  public static void main( String[] args ){
    menuOpciones();
  }
}