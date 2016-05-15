/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.lcma.app.service;

import pe.lcma.app.dto.ItemDto;

/**
 *
 * @author Alumno
 */
public class PAvionService extends PasajeAbstract {
    
    @Override
    public ItemDto[] procesar(double total) {
        
        //variables
        double pasaje,impuesto, atencion, totalGeneral;
        
        //proceso
        pasaje = total/(1+IGV);
        impuesto = total-pasaje;
        atencion = total*ATENCION;
        totalGeneral = total+atencion;
        
        //reporte
        ItemDto[] reporte = {
            new ItemDto("Pasaje", pasaje),
            new ItemDto("Impuesto", impuesto),
            new ItemDto("Total", total),
            new ItemDto("Atencion", atencion),
            new ItemDto("Total General", totalGeneral)
        };
        
        return reporte;
    }
}
