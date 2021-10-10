import java.util.Scanner;
public class Brayner4BA {
    static void operacionesCRMC(){
        Scanner in = new Scanner(System.in);
        //definir variables
        double n1, n2, opcion, resultado;
        //datos de entrada
        System.out.print("Ingresa el primer valor: ");
        n1 = in.nextDouble();
        in.nextLine();
        System.out.print("Ingresa el segundo valor: ");
        n2 = in.nextDouble();
        in.nextLine();
        System.out.print(" Elija el numero de la operación que desea realizar:                     ");
        System.out.println ("\t1.-Sumar");
        System.out.println ("\t2.-Restar");
        System.out.println ("\t3.-Multiplicar");
        System.out.println ("\t4.-Dividir");
        System.out.println ("\t5.-Potencia");
        System.out.print ("\t: ");
        opcion = in.nextDouble();
        in.nextLine();
        resultado=0;
        //proceso
        if(opcion==1)
            resultado=n1+n2;
        if(opcion==2)
            resultado=n1-n2;
        if(opcion==3)
            resultado=n1*n2;
        if(opcion==4)
            resultado=n1/n2; 
         if(opcion==5)
            resultado=Math.pow ( n1 , n2 ) ;
        //datos de salida
        System.out.println("Valor de resultado: " + resultado);
    }
       public static void main(String[] args) {
       operacionesCRMC();
       }
}