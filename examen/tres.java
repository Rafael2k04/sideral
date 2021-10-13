
   
import java.util.Scanner;
public class TipodeVacuna {
    static void algoritmoVacunaCRMC(){ 
        Scanner in = new Scanner(System.in);
        int edad, sexo;
        System.out.print("Ingresa su edad actual: ");
        edad = in.nextInt();
        in.nextLine();
        System.out.println("Seleccione con 1 ó 2 su sexo.");
        System.out.println("\t1.- Femenino");
        System.out.println("\t2.- Masculino");
        System.out.print("\t: ");
        do {
            sexo = in.nextInt();
            in.nextLine();
            if (sexo<1||sexo>2)
                System.out.print("Valor incorrecto. Ingr\u00E9intente nuevamente.: ");
        } while (sexo<1||sexo>2);
        if((sexo==2&&edad>=16&&edad<70)||edad<16)
            System.out.println("Le corresponde la vacuna de tipo A");
        if(sexo==1&&edad>=16&&edad<70)
            System.out.println("Le corresponde la vacuna de tipo B");
        if(edad>70)
            System.out.println("Le corresponde la vacuna de tipo C");
    }
      public static void main(String[] args) {
      algoritmoVacunaCRMC();
}
}   
