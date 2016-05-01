package pe.egcc.prueba;

import pe.egcc.model.Mate;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    Mate mate = new Mate();
    
    System.out.println("S1: " + mate.sumar(5, 7));
    System.out.println("S2: " + mate.sumar(5.0, 7));
    
  }
  
}
