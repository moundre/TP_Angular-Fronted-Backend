/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetangular.demo.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author modibo.samake
 */
@Entity
public class Presence implements Serializable{
   @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_presence;
   
    @Temporal(TemporalType.DATE)
    private Date date_aujourd;
    
    @Temporal(TemporalType.TIME)
    private Date heure_depart;
    
    @Temporal(TemporalType.TIME)
    private Date heure_arriver;
    
    @ManyToOne
    private Apprenant apprenant;

    public Presence() {
    }
    
    public Long getId_presence() {
        return id_presence;
    }

    public void setId_presence(Long id_presence) {
        this.id_presence = id_presence;
    }

    public Date getDate_aujourd() {
        return date_aujourd;
    }

    public void setDate_aujourd(Date date_aujourd) {
        this.date_aujourd = date_aujourd;
    }

    public Date getHeure_depart() {
        return heure_depart;
    }

    public void setHeure_depart(Date heure_depart) {
        this.heure_depart = heure_depart;
    }

    public Date getHeure_arriver() {
        return heure_arriver;
    }

    public void setHeure_arriver(Date heure_arriver) {
        this.heure_arriver = heure_arriver;
    }
    
        
}
