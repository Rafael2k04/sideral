package pe.edu.upeu.modelo;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentaDetalleTO {
   public String idVentaDetalle;
   public String idVenta;
   public String idProducto;
   public int cantidad;
   public double precioUnit;
   public double descuento;
   public double totalpago;
}
