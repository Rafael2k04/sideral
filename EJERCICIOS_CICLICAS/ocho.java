import java.util.Scanner;
public class Ejercicio_4_1 {
  static Scanner sc = new Scanner(System.in);
  
  static void articulos() {
    //Definir variables
    System.out.println("Ingrese la cantidad de articulos los cuales se le descontara");
    String descuento=""; 
    //datos de entrada
    System.out.println("***** Ejercicio 4.8 ******");
    int precio=sc.nextInt();
    if(precio<=200){
    descuento="0.15";
    }else if (precio>100 && precio<200){
    descuento="0.12";}
    else if (precio<100){
    descuento="0.10";}
    //Datos de salida:
    System.out.println("El descuento que recivira es: "+descuento);
  }

  public static void main(String[] args) {
    articulos();
  }
}