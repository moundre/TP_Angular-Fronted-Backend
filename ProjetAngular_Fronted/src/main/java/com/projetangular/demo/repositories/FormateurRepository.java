/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetangular.demo.repositories;

import com.projetangular.demo.model.Formateur;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author modibo.samake
 */
public interface FormateurRepository extends JpaRepository<Formateur, Long> {
    
}
