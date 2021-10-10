import java.util.Scanner;
public class Regalos{
  static Scanner sc = new Scanner(System.in);
  static void algoritmoRegalos(){
    // definir variables
    double monto =0;
    String  regalo ="";
    //datos de entrada
    System.out.println("Ingrese el monto de dinero que dispone");
    monto=sc .nextDouble();  
    //proceso
    if (monto>=1 && monto<=10){
      regalo="\nTarjera";
    }
   else if (monto>=11 && monto<=100){
      regalo="\nChocolate\nTarjera";
    }
    else if(monto>=101 && monto<=250){
      regalo="\nFlores\nChocolate\nTarjera";
      }
   else if(monto>250){
     regalo="\nAnillo\nFlores\nChocolate\nTarjera";
   }
   else{
      regalo="Ninguno";
   }
    //datos de salida
    System.out.println("Usted puede elegir los siguentes regalos:"+regalo);
  }
    public static void main(String[] arg){
    algoritmoRegalos();
  }
}