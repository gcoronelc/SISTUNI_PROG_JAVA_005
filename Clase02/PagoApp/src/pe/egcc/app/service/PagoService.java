package pe.egcc.app.service;

import pe.egcc.app.dto.PagoDto;

/**
 *
 * @author Gustavo Coronel
 * @email gcoronelc@gmail.com
 * @blog www.desarrollasoftware.com
 */
public class PagoService {

  /**
   * Recibe el dto con los dato, se debe calcular los resultados.
   * 
   * @param dto Objeto DTO con los datos.
   */
  public void procesar(PagoDto dto) {
    // Vaiables
    double ingresos, renta, neto;
    // Proceso
    ingresos = dto.getHorasDia() * dto.getDias() * dto.getPagoHora();
    if(ingresos > 1500.0){
      renta = ingresos * 0.08;
    } else {
      renta = 0.0;
    }
    neto = ingresos - renta;
    // Salida
    dto.setIngresos(ingresos);
    dto.setRenta(renta);
    dto.setNeto(neto);
  }
  
  
}
