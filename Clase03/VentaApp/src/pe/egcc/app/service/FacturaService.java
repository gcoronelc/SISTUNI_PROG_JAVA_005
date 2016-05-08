package pe.egcc.app.service;

import pe.egcc.app.dto.ItemDto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class FacturaService extends CompAbstract {

  @Override
  public ItemDto[] procesar(double total) {
    // Variables
    double consumo, impuesto, servicio, totalGeneral;
    // Proceso
    consumo = total / (1 + IGV);
    impuesto = total - consumo;
    servicio = total * SERVICIO;
    totalGeneral = total + servicio;
    // Reporte
    ItemDto[] repo = {
      new ItemDto("Consumo", consumo),
      new ItemDto("Impuesto", impuesto),
      new ItemDto("Total", total),
      new ItemDto("Servicio", servicio),
      new ItemDto("Total General", totalGeneral)
    };
    return repo;
  }

}
