/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetangular.demo.controllers;

import com.projetangular.demo.model.Apprenant;
import com.projetangular.demo.model.Formateur;
import com.projetangular.demo.model.Presence;
import com.projetangular.demo.services.ApprenantService;
import com.projetangular.demo.services.FormateurService;
import com.projetangular.demo.services.PresenceService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author modibo.samake
 */
@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {
    @Autowired
     ApprenantService serviceImp;
    
    @Autowired
     FormateurService serviceImpfor;
    
    @Autowired
     PresenceService serviceImppre;
  //API pour Apprenant
    @GetMapping("/all/apprenant")
    public List<Apprenant> getApprenantList(){
    return  serviceImp.list_Apprenant();
    }
    @PostMapping(value="/apprenant")
    public Apprenant save(@RequestBody Apprenant apprenant) {
        return serviceImp.Ajouter_Apprenant(apprenant);
    }
    
    @PutMapping("/apprenant/{id}")
    public Apprenant update(@RequestBody Apprenant apprenant, @PathVariable Long id){
        return serviceImp.Modifier_Apprenant(id, apprenant);
    }
    
    @GetMapping(path = "/apprenant/{id}")
    public Apprenant getOneapprenant(@PathVariable(value= "id") Long id){
        return serviceImp.Afficher_Apprenant_by_id(id);
    }
    
    @DeleteMapping("/apprenant/{id}")
    public void deleteapprenant(@PathVariable Long id) {
        serviceImp.Supprimer_Apprenant(id);
    }
    
    
    
   //API pour Formateur
    @GetMapping("/all/formateur")
    public List<Formateur> getFormateurList(){
    return  serviceImpfor.list_Formateur();

    }
     @PostMapping(value="/formateur")
    public Formateur save(@RequestBody Formateur formateur) {
        return serviceImpfor.Ajouter_Formateur(formateur);
    }
    @PutMapping(path = "/formateur/{id}")
    public Formateur update(@RequestBody Formateur formateur, @PathVariable Long id){
        return serviceImpfor.Modifier_Formateur(id, formateur);
    }
     @GetMapping(path = "/formateur/{id}")
    public Formateur getOneformateur(@PathVariable(value= "id") Long id){
        return serviceImpfor.Afficher_Formateur_by_id(id);
    }
   @DeleteMapping("/formateur/{id}")
    public void deleteformateur(@PathVariable Long id) {
        serviceImpfor.Supprimer_Formateur(id);
    }
    
    //API pour liste_Ptrésence
    @GetMapping("/presence")
    public List<Presence> getPresenceList(){
        
        return  serviceImppre.list_presence();
    }
}
