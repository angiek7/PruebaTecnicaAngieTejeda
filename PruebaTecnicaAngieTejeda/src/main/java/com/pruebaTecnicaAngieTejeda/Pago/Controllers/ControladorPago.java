/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaTecnicaAngieTejeda.Pago.Controllers;

import com.pruebaTecnicaAngieTejeda.Pago.Models.Pago;
import com.pruebaTecnicaAngieTejeda.Pago.Services.PagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 *
 * @author KAROLA
 */
@RestController
@RequestMapping("/api/pago")
public class ControladorPago {

    private final PagoService pagoService;

    @Autowired
    public ControladorPago(PagoService pagoService) {
        this.pagoService = pagoService;
    }

    @PostMapping("/procesar")
    public ResponseEntity<String> procesarPago(@RequestBody Pago pago) {
        String mensaje = pagoService.procesarPago(pago);
        return ResponseEntity.ok(mensaje);
    }
}