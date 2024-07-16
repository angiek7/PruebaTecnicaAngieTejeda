/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaTecnicaAngieTejeda.Ordenes.Controllers;

import com.pruebaTecnicaAngieTejeda.Ordenes.Models.Orden;
import com.pruebaTecnicaAngieTejeda.Ordenes.Services.OrdenesService;
import com.pruebaTecnicaAngieTejeda.productos.Models.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 *
 * @author KAROLA
 */
@RestController
@RequestMapping("/api/ordenes")
public class ControladorOrdenes {

    private final OrdenesService ordenesService;

    @Autowired
    public ControladorOrdenes(OrdenesService ordenesService) {
        this.ordenesService = ordenesService;
    }

    @GetMapping
    public Flux<Orden> getAllOrdenes() {
        return ordenesService.getAllOrdenes();
    }

    @GetMapping("/{id}")
    public Mono<ResponseEntity<Orden>> getOrdenById(@PathVariable Long id) {
        return ordenesService.getOrdenById(id)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Orden> createOrden(@RequestBody Orden orden) {
        return ordenesService.createOrden(orden);
    }

    @PutMapping("/{id}")
    public Mono<ResponseEntity<Orden>> updateOrden(@PathVariable Long id, @RequestBody Orden orden) {
        return ordenesService.updateOrden(id, orden)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public Mono<ResponseEntity<Object>> deleteOrden(@PathVariable Long id) {
        return ordenesService.deleteOrden(id)
                .thenReturn(ResponseEntity.noContent().build())
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
}