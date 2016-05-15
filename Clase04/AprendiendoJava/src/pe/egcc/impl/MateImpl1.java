package pe.egcc.impl;

import pe.egcc.espec.MateEspec;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class MateImpl1 implements MateEspec {

  @Override
  public int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  @Override
  public int restar(int n1, int n2) {
    return (n1 - n2);
  }

}
