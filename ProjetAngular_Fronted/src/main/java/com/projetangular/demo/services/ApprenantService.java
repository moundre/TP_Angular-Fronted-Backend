/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetangular.demo.services;

import com.projetangular.demo.model.Apprenant;
import com.projetangular.demo.model.Formateur;
import java.util.List;

/**
 *
 * @author modibo.samake
 */
public interface ApprenantService {
public abstract Apprenant Ajouter_Apprenant(Apprenant apprenant);
public abstract Apprenant Modifier_Apprenant(Long id, Apprenant apprenant);
public abstract List<Apprenant> list_Apprenant();
public abstract Apprenant Afficher_Apprenant_by_id(Long id);
void Supprimer_Apprenant(Long id);

    public Formateur Ajouter_Formateur(Formateur formateur);

    public Formateur Afficher_Formateur_by_id(Long id);

    public void Supprimer_Formateur(Long id);

}
