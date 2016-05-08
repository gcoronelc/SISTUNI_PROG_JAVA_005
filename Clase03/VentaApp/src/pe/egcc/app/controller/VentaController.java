package pe.egcc.app.controller;

import pe.egcc.app.dto.ItemDto;
import pe.egcc.app.service.BoletaService;
import pe.egcc.app.service.CompAbstract;
import pe.egcc.app.service.FacturaService;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class VentaController {

  public ItemDto[] procesar(String tipo, double total) {
    CompAbstract comp = null;
    if(tipo.equals("FACTURA")){
      comp = new FacturaService();
    } else if(tipo.equals("BOLETA")){
      comp = new BoletaService();
    }
    return comp.procesar(total);
  }

  
  
}
