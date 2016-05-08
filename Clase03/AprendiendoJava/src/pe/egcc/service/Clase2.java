package pe.egcc.service;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Clase2 extends Clase1 {

  @Override
  public int sumar(int n1, int n2) {
    int s;
    s = (n1 + n2) * (n1 - n2);
    return s;
  }

}
