/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaTecnicaAngieTejeda.Ordenes.Services;

import com.pruebaTecnicaAngieTejeda.Ordenes.Models.Orden;
import com.pruebaTecnicaAngieTejeda.Ordenes.Repositorios.OrdenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
/**
 *
 * @author KAROLA
 */
@Service
public class OrdenesService {
    
    private final OrdenRepository ordenRepository;

    @Autowired
    public OrdenesService(OrdenRepository ordenRepository) {
        this.ordenRepository = ordenRepository;
    }

    public Flux<Orden> getAllOrdenes() {
        return Flux.fromIterable(ordenRepository.findAll());
    }

    public Mono<Orden> getOrdenById(Long id) {
        return Mono.justOrEmpty(ordenRepository.findById(id));
    }

    public Mono<Orden> createOrden(Orden order) {
        return Mono.just(ordenRepository.save(order));
    }

    public Mono<Orden> updateOrden(Long id, Orden order) {
        order.setId(id);
        return Mono.just(ordenRepository.save(order));
    }

    public Mono<Void> deleteOrden(Long id) {
        ordenRepository.deleteById(id);
        return Mono.empty();
    }
}