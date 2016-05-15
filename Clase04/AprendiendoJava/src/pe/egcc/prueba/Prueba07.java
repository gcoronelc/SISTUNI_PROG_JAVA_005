package pe.egcc.prueba;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba07 {

  public static void main(String[] args) {
    
    Map<String,Object> rec;
    rec = new HashMap<>();
    
    rec.put("nombre", "televisor");
    rec.put("cantidad", 500);
    rec.put("ingresos", 1390000.0);
    rec.put("saldo", 240);
    
    
    for(String key: rec.keySet()){
      System.out.println(key + " | " + rec.get(key));
    }
    
    
  }
  
  
}
