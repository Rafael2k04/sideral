package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class VentaTO {
   public String idVenta;
   public String dni;
   public String fecha;
   public double subtotal;
   public double igv;
   public double importetotal;
   public String usuario;

}