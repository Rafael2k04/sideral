import java.util.Scanner;
public class TrabajoDos{
  static Scanner sc = new Scanner(System.in);
  static void salarioyPuntosCRMC(){
    // definir variables
    double puntos =0;
    String  bono ="";
    //datos de entrada
    System.out.println("Ingrese el puntaje que alcanzo");
    puntos=sc .nextDouble();  
    //proceso
    if (puntos>=100 && puntos<=200){bono="10% del salario minimo";}
    else if (puntos>=201 && puntos<=300){bono="40% del salario minimo";}
    else if(puntos>=301 && puntos<=400){bono="70% salario minimo";}
    else if(puntos>401){bono="80% salario minimo";}
   else{bono="No alcanzo bono";}
    //datos de salida
    System.out.println("Usted a ganado el siguiente bono :"+bono);
  }
    public static void main(String[] arg){
    salarioyPuntosCRMC();
  }
}