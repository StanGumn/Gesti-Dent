/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import ENTITIES.FichaClinica;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author stand
 */
@Stateless
public class FichaClinicaFacade extends AbstractFacade<FichaClinica> {
    @PersistenceContext(unitName = "GestidentPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public FichaClinicaFacade() {
        super(FichaClinica.class);
    }
    
}
