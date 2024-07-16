/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.pruebaTecnicaAngieTejeda.Cliente.Repositorios;

import com.pruebaTecnicaAngieTejeda.Cliente.Models.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author KAROLA
 */
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}  
