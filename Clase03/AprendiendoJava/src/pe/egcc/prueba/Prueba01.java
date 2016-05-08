package pe.egcc.prueba;

import pe.egcc.service.MateService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    System.out.println(MateService.getSaludo());
    System.out.println("8 + 7 = " + MateService.sumar(8, 7));
  }

}
