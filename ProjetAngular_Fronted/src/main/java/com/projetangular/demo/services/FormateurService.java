/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetangular.demo.services;

import com.projetangular.demo.model.Formateur;
import java.util.List;

/**
 *
 * @author modibo.samake
 */
public interface FormateurService {
public abstract Formateur Ajouter_Formateur(Formateur formateur);
public abstract Formateur Modifier_Formateur(Long id, Formateur formateur);
public abstract List<Formateur> list_Formateur();
public abstract Formateur Afficher_Formateur_by_id(Long id);
void Supprimer_Formateur(Long id);
}
