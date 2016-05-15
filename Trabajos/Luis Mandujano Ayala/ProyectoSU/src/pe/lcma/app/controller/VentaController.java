/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.lcma.app.controller;

import pe.lcma.app.dto.ItemDto;
import pe.lcma.app.service.PAvionService;
import pe.lcma.app.service.PBusService;
import pe.lcma.app.service.PasajeAbstract;

/**
 *
 * @author Alumno
 */
public class VentaController {
    
    public ItemDto[] procesar(String tipo, double total) {
        
        PasajeAbstract pas = null;
        if(tipo.equals("BUS")) {
            pas = new PBusService();
        }else if(tipo.equals("AVION")) {
            pas = new PAvionService();
        }
        
        return pas.procesar(total);
    }
}
