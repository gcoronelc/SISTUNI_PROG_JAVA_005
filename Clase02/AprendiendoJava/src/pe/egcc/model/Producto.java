package pe.egcc.model;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Producto {

  private String nombre;
  private double precio;
  private int stock;

  public Producto() {
    //this.nombre = "Chocolate";
    //this.precio = 5.0;
    //this.stock = 100;
    this("Helado de Menta", 10.0, 500);
    System.out.println("Objeto creado.");
  }
  
  public Producto(String nombre, double precio, int stock) {
    this.nombre = nombre;
    this.precio = precio;
    this.stock = stock;
  }

  @Override
  protected void finalize() throws Throwable {
    System.err.println("Chau objeto.");
  }
  
  

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public double getPrecio() {
    return precio;
  }

  public void setPrecio(double precio) {
    this.precio = precio;
  }

  public int getStock() {
    return stock;
  }

  public void setStock(int stock) {
    this.stock = stock;
  }

}
