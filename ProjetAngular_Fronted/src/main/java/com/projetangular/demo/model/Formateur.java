/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetangular.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author modibo.samake
 */
@Entity
public class Formateur {
    @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id_formateur;
   
    private String nom_formateur;
    private String prenom_formateur;
    private String email_formateur;
    private String password_formateur; 

    public Formateur() {
    }

    public Long getId_formateur() {
        return id_formateur;
    }

    public void setId_formateur(Long id_formateur) {
        this.id_formateur = id_formateur;
    }

    public String getNom_formateur() {
        return nom_formateur;
    }

    public void setNom_formateur(String nom_formateur) {
        this.nom_formateur = nom_formateur;
    }

    public String getPrenom_formateur() {
        return prenom_formateur;
    }

    public void setPrenom_formateur(String prenom_formateur) {
        this.prenom_formateur = prenom_formateur;
    }

    public String getEmail_formateur() {
        return email_formateur;
    }

    public void setEmail_formateur(String email_formateur) {
        this.email_formateur = email_formateur;
    }

    public String getPassword_formateur() {
        return password_formateur;
    }

    public void setPassword_formateur(String password_formateur) {
        this.password_formateur = password_formateur;
    }

    @Override
    public String toString() {
        return "Formateur{" + 
                "id_formateur=" + id_formateur +
                ", nom_formateur=" + nom_formateur +
                ", prenom_formateur=" + prenom_formateur +
                ", email_formateur=" + email_formateur +
                ", password_formateur=" + password_formateur +
                '}';
    }
    
}
