package pe.egcc.service;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public final class MateService {

  private static final String SALUDO;

  static {
    SALUDO = "HOLA AMIGOS DE JAVA, NOS VEMOS EN NETBEANS.";
  }

  private MateService() {
  }

  public static int sumar(int n1, int n2) {
    return (n1 + n2);
  }

  public static String getSaludo() {
    return SALUDO;
  }

}
