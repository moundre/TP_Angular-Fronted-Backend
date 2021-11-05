/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetangular.demo.services;

import com.projetangular.demo.model.Apprenant;
import com.projetangular.demo.model.Formateur;
import com.projetangular.demo.model.Presence;
import com.projetangular.demo.repositories.ApprenantRepository;
import com.projetangular.demo.repositories.FormateurRepository;
import com.projetangular.demo.repositories.PresenceRepository;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author modibo.samake
 */
@Service
public class ServiceImp implements ApprenantService, FormateurService, PresenceService{
    
    @Autowired  
    PresenceRepository presenceRepository;
    
    @Autowired  
    ApprenantRepository apprenantRepository;
    
    @Autowired  
    FormateurRepository formateurRepository;

    @Override
    public Apprenant Ajouter_Apprenant(Apprenant apprenant) {
        return apprenantRepository.save(apprenant);
    }

    @Override
    public Apprenant Modifier_Apprenant(Long id, Apprenant apprenant) {
        Apprenant apprenants = apprenantRepository.findById(id).orElseThrow();
        apprenants.setNom(apprenant.getNom());
        apprenants.setPrenom(apprenant.getPrenom());
        apprenants.setEmail(apprenant.getEmail());
        apprenants.setPassword(apprenant.getPassword());
        return apprenantRepository.save(apprenants);
    }

    @Override
    public List<Apprenant> list_Apprenant() {
        return apprenantRepository.findAll();
    }

    @Override
    public Apprenant Afficher_Apprenant_by_id(Long id) {
        return apprenantRepository.findById(id).get();
    }

    @Override
    public void Supprimer_Apprenant(Long id) {
        apprenantRepository.deleteById(id);
    }

    @Override
    public Formateur Ajouter_Formateur(Formateur formateur) {
        return formateurRepository.save(formateur);
    }

    @Override
    public Formateur Modifier_Formateur(Long id, Formateur formateur) {
        Apprenant apprenants = apprenantRepository.findById(id).orElseThrow();
        apprenants.setNom(formateur.getNom_formateur());
        formateur.setPrenom_formateur(formateur.getPrenom_formateur());
        formateur.setEmail_formateur(formateur.getEmail_formateur());
        formateur.setPassword_formateur(formateur.getPassword_formateur());
        return formateurRepository.save(formateur);
    }

    @Override
    public List<Formateur> list_Formateur() {
       return formateurRepository.findAll();
    }

    @Override
    public Formateur Afficher_Formateur_by_id(Long id) {
       return formateurRepository.findById(id).get();
    }

    @Override
    public void Supprimer_Formateur(Long id) {
       formateurRepository.deleteById(id);
    }

    @Override
    public List<Presence> list_presence() {
        return presenceRepository.findAll();
    }


  
  
}
