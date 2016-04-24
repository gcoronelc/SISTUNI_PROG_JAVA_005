package pe.egcc.app002.service;

/**
 *
 * @author Gustavo Coronel
 */
public class VentaService {

  public double getTotal(double precio, int cant){
    return (precio * cant);
  }
  
  public double getImporte(double precio, int cant){
    return getTotal(precio, cant) / 1.18;
  }

  public double getImpuesto(double precio, int cant){
    return getTotal(precio, cant) - getImporte(precio, cant);
  }
  
}
