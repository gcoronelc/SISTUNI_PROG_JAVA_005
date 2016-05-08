package pe.egcc.app.service;

import pe.egcc.app.dto.ItemDto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public abstract class CompAbstract {
  
  protected final double IGV = 0.18;
  protected final double SERVICIO = 0.10;

  public abstract ItemDto[] procesar( double total);
  
}
