package pe.egcc.service;

import pe.egcc.espec.MateEspec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Servicios {
  
  private MateEspec mate;

  public void setMate(MateEspec mate) {
    this.mate = mate;
  }
  
  public int sumar(int n1, int n2){
    return mate.sumar(n1, n2);
  }
  
  
}
