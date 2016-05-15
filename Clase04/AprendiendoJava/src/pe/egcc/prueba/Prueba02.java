package pe.egcc.prueba;

import pe.egcc.util.EGCCUtil;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class Prueba02 {

  public static void main(String[] args) {

    int[] lista = {54,23,87,23,45,67,65,23};

    EGCCUtil.mostrarArreglo(lista);

    lista[3] = 500;
    lista[1] = 800;

    EGCCUtil.mostrarArreglo(lista);
    
  }

}
