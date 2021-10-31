import java.util.Scanner;
public class cuatro{
  static Scanner sc = new Scanner(System.in);

  static void focos() {
    //Definir Variables
    int color, focos_blancos=0, focos_rojos=0, focos_verdes=0, i, n;
    //Datos de Entrada
    System.out.println("***** Ejercicio 4.4 ******");
    System.out.println("Ingresa el numero de lotes de focos:");
    n=sc.nextInt();
    //Proceso
    for (i=1; i<=n; i++) {
      System.out.println("Lote numero: "+i);
      System.out.println("Seleccione el color del lote:");
      System.out.println("1=verde\n2=blanco\n3=rojo");
      do {
          color=sc.nextInt();
          sc.nextLine();
          if (color<1||color>3)
           System.out.print("Valor incorrecto. Ingr\u00E9salo nuevamente.: ");
      }
      while (color<1||color>3);
      if(color==1)
          focos_verdes=focos_verdes+1;
      if(color==2)
          focos_blancos=focos_blancos+1;
      if(color==3)
          focos_rojos=focos_rojos+1;
      System.out.println();
    }
    //Datos de Salida
    System.out.println("Lote de focos verdes: " + focos_verdes);
    System.out.println("Lote de focos blancos: " + focos_blancos);
    System.out.println("Lote de focos rojos: " + focos_rojos);
  }

  public static void main(String[] args) {
    focos();
  }
}
