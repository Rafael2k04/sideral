package pe.edu.upeu.modelo;

import lombok.Data;

@Data
public class DetalleVentaTO {
  public String idVentaDetalle;
  public String idVenta;
  public String idProducto;
  public double cantidad;
  public double precioUnit;
  public double total;

}
