package pe.egcc.service;

import pe.egcc.espec.MateEspec;
import pe.egcc.impl.MateImpl1;
import pe.egcc.impl.MateImpl2;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Fabrica {

  public static final int IMPL1 = 1;
  public static final int IMPL2 = 2;
  
  public static Servicios getServicios(int tipo){
    MateEspec mate = null;
    switch(tipo){
      case IMPL1:
        mate = new MateImpl1();
        break;
      case IMPL2:
        mate = new MateImpl2();
        break;
    }
    Servicios servicios = new Servicios();
    servicios.setMate(mate);
    return servicios;
  }
  
}
