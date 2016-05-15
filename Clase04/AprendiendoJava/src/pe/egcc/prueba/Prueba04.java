package pe.egcc.prueba;

import java.util.ArrayList;
import java.util.List;
import pe.egcc.domain.Producto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba04 {

  public static void main(String[] args) {
    
    List<Producto> lista;
    lista = new ArrayList<>();
    
    lista.add(new Producto("Televisor", 4500.0, 700));
    lista.add(new Producto("Laptop", 6890.0, 500));
    lista.add(new Producto("Impresora", 1456.0, 600));
    lista.add(new Producto("Tablet", 2680.0, 490));
    
    for (int i = 0; i < lista.size(); i++) {
      Producto p = lista.get(i);
      System.out.println(p.getNombre() + " | " + p.getPrecio());
    }
    
    
    lista.add(0, new Producto("Coca Cola",2.0, 1000));
    
    System.out.println("--------------------");
    for (Producto p : lista) {
      System.out.println(p.getNombre() + " | " + p.getPrecio());
    }
    
  }
  
}
