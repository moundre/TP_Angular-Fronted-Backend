/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.projetangular.demo.services;

import com.projetangular.demo.model.Presence;
import java.util.Date;
import java.util.List;

/**
 *
 * @author modibo.samake
 * 
 * 
 * public abstract Presence Afficher_Presence_by_id_apprenant(Long id);
public abstract Presence Afficher_Presence_by_date(Date date);
public abstract Presence Afficher_Presence_by_week(Date week);
public abstract Presence Afficher_Presence_by_month(Date month);
 */
public interface PresenceService {
public abstract List<Presence> list_presence();


// public List<Presence> list_Presence();


}
