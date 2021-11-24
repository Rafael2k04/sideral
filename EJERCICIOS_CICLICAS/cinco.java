import java.util.Scanner;
public class cinco{
  static Scanner sc = new Scanner(System.in);

  static void ahorroPesos() {
    //Definir Variables 
    double ahorroDias, ahorroInicial=3;
    //Datos de Entrada
    System.out.println("***** Ejercicio 4.5 ******");
    //Proceso y Datos de Salida
    for (int dia=1; dia<=365; dia++) {
      ahorroDias=Math.pow(ahorroInicial, dia);
      System.out.println("Lo ahorrado en el dia "+dia+" es "+ahorroDias+ " pesos");
    }
  }

  public static void main(String[] args) {
    ahorroPesos();
  }
}