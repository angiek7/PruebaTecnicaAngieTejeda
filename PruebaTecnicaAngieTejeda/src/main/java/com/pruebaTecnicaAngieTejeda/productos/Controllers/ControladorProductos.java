/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaTecnicaAngieTejeda.productos.Controllers;

import com.pruebaTecnicaAngieTejeda.productos.Models.Producto;
import com.pruebaTecnicaAngieTejeda.productos.Services.ApiProductos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 *
 * @author KAROLA
 */
@RestController
@RequestMapping("/api/products")
public class ControladorProductos {
    
    @Autowired
    private final ApiProductos apiProductos;

    public ControladorProductos(ApiProductos apiProductos) {
        this.apiProductos = apiProductos;
    }

    @GetMapping
    public Mono<Producto[]> getAllProductos() {
        return apiProductos.getAllProductos();
    }

    @GetMapping("/{id}")
    public Mono<Producto> getProductoById(@PathVariable Long id) {
        return apiProductos.getProductoById(id);
    }
    
    @GetMapping("/categories")
    public Mono<String[]> getAllCategorias() {
        return apiProductos.getAllCategorias();
    }

    @GetMapping("/category/{category}")
    public Mono<Producto[]> getProductosByCategoria(@PathVariable String category) {
        return apiProductos.getProductosByCategoria(category);
    }
    
}
