import java.util.Scanner;
public class Ejercicio_4_1 {
  static Scanner sc = new Scanner(System.in);

  static void salario() {
    //Definir Variables
    int i;
    double salario_inicial, salario_recibido;
    //Datos de Entrada
    System.out.println("***** Ejercicio 4.1 ******");
    salario_inicial=1500;
    //Proceso y Datos de Salida
    
    for (i=1; i<=6; i++) {
      System.out.println("Año: "+i);
      salario_recibido=salario_inicial*Math.pow(1.1, i);
      System.out.println("Salario inicial: "+Math.round(salario_inicial));
      System.out.println("Salario recibido: "+Math.round(salario_recibido));
      System.out.println();
    }
  }

  public static void main(String[] args) {
    salario();
  }
}