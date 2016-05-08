package pe.egcc.prueba;

import pe.egcc.service.Clase1;
import pe.egcc.service.Clase2;
import pe.egcc.service.Clase3;
import pe.egcc.service.Clase4;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba03 {

  public static void main(String[] args) {
    
    Clase1 bean = new Clase2();
    
    System.out.println("Compatibilidad");
    System.out.println("Object: " + ((bean instanceof Object)?"SI":"NO"));
    System.out.println("Clase1: " + ((bean instanceof Clase1)?"SI":"NO"));
    System.out.println("Clase2: " + ((bean instanceof Clase2)?"SI":"NO"));
    System.out.println("Clase3: " + ((bean instanceof Clase3)?"SI":"NO"));
    System.out.println("Clase4: " + ((bean instanceof Clase4)?"SI":"NO"));
    
    
  }
  
  
}
