import java.util.Scanner;
public class Ejercicio_4_3 {
  static Scanner sc = new Scanner(System.in);

  static void nCantidad(){
    //Definir Variables
    int n, f, valor, cantidad1=0, cantidad2=0, cantidad3=0;
    //Datos de Entrada
    System.out.println("***** Ejercicio 4.3 ******");
    System.out.println("Ingrese la cantidad de valores:");
    n=sc.nextInt();
    //Proceso
    for(f=1;f<=n;f++) {
      System.out.println("Ingrese el valor "+f+":");
      valor=sc.nextInt();
      if(valor>0){
        cantidad1=cantidad1+1;
      }
      else if(valor==0){
        cantidad2=cantidad2+1;
      }
      else {
        cantidad3=cantidad3+1;
      }
    }
    //Datos de Salida
    System.out.println("La cantidad de numeros mayores a 0 son: "+cantidad1);
    System.out.println("La cantidad de numeros iguales a 0 son: "+cantidad2);
    System.out.println("La cantidad de numeros menores a 0 son: "+cantidad3);
  }

  public static void main(String[] args) {
    nCantidad();
  }
}