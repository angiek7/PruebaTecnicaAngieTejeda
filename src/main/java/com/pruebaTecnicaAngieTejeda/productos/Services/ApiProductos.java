/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaTecnicaAngieTejeda.productos.Services;

import com.pruebaTecnicaAngieTejeda.productos.Models.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;
/**
 *
 * @author KAROLA
 */
@Service
public class ApiProductos {
    
    @Autowired
    private WebClient.Builder webClientBuilder;

    public Mono<Producto[]> getAllProductos() {
        return webClientBuilder.build()
                .get()
                .uri("https://fakestoreapi.com/products")
                .retrieve()
                .bodyToMono(Producto[].class);
    }

    public Mono<Producto> getProductoById(Long id) {
        return webClientBuilder.build()
                .get()
                .uri("https://fakestoreapi.com/products/{id}", id)
                .retrieve()
                .bodyToMono(Producto.class);
    }

    public Mono<String[]> getAllCategorias() {
        return webClientBuilder.build()
                .get()
                .uri("https://fakestoreapi.com/products/categories")
                .retrieve()
                .bodyToMono(String[].class);
    }

    public Mono<Producto[]> getProductosByCategoria(String category) {
        return webClientBuilder.build()
                .get()
                .uri("https://fakestoreapi.com/products/category/{category}", category)
                .retrieve()
                .bodyToMono(Producto[].class);
    }

}

