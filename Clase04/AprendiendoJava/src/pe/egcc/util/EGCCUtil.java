package pe.egcc.util;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public final class EGCCUtil {

  private EGCCUtil() {
  }

  public static void mostrarArreglo(int[] lista) {
    System.out.println("Tamaño: " + lista.length);
    for (int i = 0; i < lista.length; i++) {
      int valor = lista[i];
      System.out.println(valor);
    }
  }

}
