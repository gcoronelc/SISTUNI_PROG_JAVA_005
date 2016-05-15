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
public abstract class PasajeAbstract {
    
    protected final double IGV = 0.18;
    protected final double ATENCION = 0.07;
    
    public abstract ItemDto[] procesar(double total);
}
