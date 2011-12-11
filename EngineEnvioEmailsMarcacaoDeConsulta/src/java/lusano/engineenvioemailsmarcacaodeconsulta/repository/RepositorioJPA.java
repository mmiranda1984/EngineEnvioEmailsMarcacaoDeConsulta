/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import lusano.engineenvioemailsmarcacaodeconsulta.util.EntityManagerUtil;

/**
 *
 * @author mmiranda1984
 */
public class RepositorioJPA<E> {

    protected EntityManager getEntityManager() {
        return EntityManagerUtil.getEntityManager();
    }
    
}
