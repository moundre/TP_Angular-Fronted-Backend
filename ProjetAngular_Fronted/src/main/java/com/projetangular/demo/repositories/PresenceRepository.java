/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetangular.demo.repositories;

import com.projetangular.demo.model.Presence;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author modibo.samake
 */
@Repository
public interface PresenceRepository extends JpaRepository<Presence, Long> {

    
}
