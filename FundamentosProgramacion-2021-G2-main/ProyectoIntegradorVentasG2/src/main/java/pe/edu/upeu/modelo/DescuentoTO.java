package pe.edu.upeu.modelo;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

//@Data
@Getter @Setter
public class DescuentoTO {
  public String idProducto;
  public int cantidad;
  public double descuento;


}
