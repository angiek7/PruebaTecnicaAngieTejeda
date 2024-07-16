/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pruebaTecnicaAngieTejeda.Ordenes.Repositorios;

import com.pruebaTecnicaAngieTejeda.Ordenes.Models.OrdenItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author KAROLA
 */
@Repository
public interface OrdenItemRepository extends JpaRepository<OrdenItem, Long> {}