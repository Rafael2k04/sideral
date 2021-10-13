import java.util.Scanner;
public class Meses{
static Scanner sc = new Scanner(System.in);
static void mesdelanho(){

  // definir variables
  int mesNum;
  String mesLetra="";
  //datos de entrada
  System.out.println(" Ingrese el numero de mes entre 1 - 12");

  mesNum=sc.nextInt();
  //proceso
  switch (mesNum){
    case 1: mesLetra="Enero"; break;
    case 2: mesLetra="Febrero"; break;
    case 3: mesLetra="Marzo"; break;
    case 4: mesLetra="Abril"; break;
    case 5: mesLetra="Mayo"; break;
    case 6: mesLetra="Junio"; break;
    case 7: mesLetra="Julio"; break;
    case 8: mesLetra="Agosto"; break;
    case 9: mesLetra="Septiembre"; break;
    case 10: mesLetra="Octubre"; break;
    case 11: mesLetra="Noviembre"; break;
    case 12: mesLetra="Diciembre"; break;
    default: System.out.println ("Este mes no es valido!");break;
  }
  //datos de salida
  System.out.println("El mes " +mesNum+ " es: " +mesLetra);
  

}
public static void main(String[] arg){
  mesdelanho();
}
}