package pe.egcc.prueba;

import pe.egcc.model.Producto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {
  
  public static void main(String[] args) {
    
    Producto bean = new Producto();
    mostrar(bean);
    
    bean.setNombre("Torta de Chocolate");
    bean.setPrecio(80.0);
    bean.setStock(1000);
    mostrar(bean);
    
  }

  private static void mostrar(Producto bean) {
    System.out.println("--------------");
    System.out.println("Nombre: " + bean.getNombre());
    System.out.println("Precio: " + bean.getPrecio());
    System.out.println("Stock: " + bean.getStock());
  }
  
}
