package pe.egcc.prueba;

import pe.egcc.util.EGCCUtil;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba01 {

  public static void main(String[] args) {

    int[] lista;
    lista = new int[5];

    EGCCUtil.mostrarArreglo(lista);

    lista[3] = 500;
    lista[1] = 800;

    EGCCUtil.mostrarArreglo(lista);
    
  }

}
