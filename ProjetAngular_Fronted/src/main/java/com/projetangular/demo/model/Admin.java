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
public class Admin {
    @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_admin;
    private String nom_admin;
    private String prenom_admin;
    private String email_admin;
    private String password_admin;

    public Admin() {
    }

    public Long getId_admin() {
        return id_admin;
    }

    public void setId_admin(Long id_admin) {
        this.id_admin = id_admin;
    }

    public String getNom_admin() {
        return nom_admin;
    }

    public void setNom_admin(String nom_admin) {
        this.nom_admin = nom_admin;
    }

    public String getPrenom_admin() {
        return prenom_admin;
    }

    public void setPrenom_admin(String prenom_admin) {
        this.prenom_admin = prenom_admin;
    }

    public String getEmail_admin() {
        return email_admin;
    }

    public void setEmail_admin(String email_admin) {
        this.email_admin = email_admin;
    }

    public String getPassword_admin() {
        return password_admin;
    }

    public void setPassword_admin(String password_admin) {
        this.password_admin = password_admin;
    }

    @Override
    public String toString() {
        return "Admin{" + 
                "id_admin=" + id_admin + 
                ", nom_admin=" + nom_admin + 
                ", prenom_admin=" + prenom_admin +
                ", email_admin=" + email_admin +
                ", password_admin=" + password_admin +
                '}';
    }
    
}
