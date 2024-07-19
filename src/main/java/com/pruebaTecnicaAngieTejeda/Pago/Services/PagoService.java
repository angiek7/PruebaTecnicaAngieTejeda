/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaTecnicaAngieTejeda.Pago.Services;

import com.pruebaTecnicaAngieTejeda.Pago.Models.Pago;
import org.springframework.stereotype.Service;

/**
 *
 * @author KAROLA
 */
@Service
public class PagoService {

    public String procesarPago(Pago pago) {
     
        return "¡Pago Procesado Exitosamente!!!"; 
    }
}