package pe.egcc.prueba;

import pe.egcc.service.Fabrica;
import pe.egcc.service.Servicios;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba08 {

  public static void main(String[] args) {
    
    Servicios servicios = Fabrica.getServicios(Fabrica.IMPL1);
    
    System.out.println("8 + 5 = " + servicios.sumar(8, 5));
    
  }
}
