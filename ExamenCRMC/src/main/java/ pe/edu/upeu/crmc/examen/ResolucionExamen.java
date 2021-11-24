package  pe.edu.upeu.crmc.examen;
import pe.edu.upeu.crmc.utils.LeerTeclado;

public class ResolucionExamen {
    static LeerTeclado sc=new LeerTeclado();
    //EJERCICIO 2
    public void impuestoVehiculos() {
        //Variables
        double totalImpPagar=0, impuestoUniV=0, impuestoTotalCateg=0;
        //Proceso, datos entrad, datos de salida
        for (int categ = 1; categ <= 3; categ++) {
            int cantidadV=sc.leer(0,"Ingrese la cantidad de Vehiculos de categoria "+categ+":");
            double costoV=sc.leer(0,"Ingrese el costo de Vehiculos de categoria "+categ+":"); 
            if (categ==1) {impuestoUniV=costoV*0.12;}
            if (categ==2) {impuestoUniV=costoV*0.08;}
            if (categ==3) {impuestoUniV=costoV*0.05;}

            impuestoTotalCateg=impuestoUniV*cantidadV;
            totalImpPagar+=impuestoTotalCateg;
            System.out.println("El impuesto a pagar por cada vehiculo de categoria "+categ+" es:"+impuestoUniV);
            System.out.println("El total impuesto de cateroria "+categ+" es:"+impuestoTotalCateg);
            System.out.println("\n\n");
        }
        System.out.println("El total de impuesto por todos los vehiculos es:"+totalImpPagar);
    }
    //EJERCICIO 3
    public void MultiplicaciondeunNumeroENtero() {
        System.out.println("Tabla de multiplicación");
        //variables
        int n, multiplicador;
        //datos de entrada 
        n=sc.leer(0,"\nIngresar el numero entero positivo a multiplicar: ");
        multiplicador=sc.leer(0,"\nIngresar el limite de tu multiplicador");  
        //Proceso
        if (n>0) {
            for (int i=1; i<=multiplicador; i++){
                System.out.println(n+"x"+i+" = "+n*i);
            }
        }else {
            System.out.println("El numero es incorrecto" ); 
        }
    }
    //EJERCICIO 4
    public  void numerosperfectos() {
        //Variables
        int nu,contn=1,suma=0;
        //Datos de entrada
        nu=sc.leer(0,"Indique el numero");
        while (contn<nu) {
          if (nu % contn == 0) {
              System.out.println (contn);
              suma=suma+contn;
          }
          contn++;
    }
      System.out.println(suma);
      if (suma==nu) {
          System.out.println("El numero "+suma+" es perfecto");
      }
      else {
          System.out.println("El numero  no es perfecto");
      }
    } 
    //EJERCICIO 5
    public void exponenten() {
        //Declarar Variables
         int base,exponente;
         //Datos de entrada
         base=sc.leer(0,"Ingrese la base ");
         exponente=sc.leer(0,"Ingrese el exponente ");
        //proceso
         System.out.println(base+"^"+exponente+"="+recursividad(base,exponente));
        }
        public double recursividad(int base,int exponente) {
            if (exponente==0) {
                return 1;
            }else {
            return base*recursividad(base,exponente-1);
        }
    }
}