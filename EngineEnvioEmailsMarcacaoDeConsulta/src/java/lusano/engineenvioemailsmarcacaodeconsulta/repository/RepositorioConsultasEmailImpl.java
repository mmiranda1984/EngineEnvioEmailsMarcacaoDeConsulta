/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.repository;

import java.util.List;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Consulta;

/**
 *
 * @author mmiranda1984
 */
public class RepositorioConsultasEmailImpl extends RepositorioJPA<Consulta> implements RepositorioConsultasEmail{

    public List<Consulta> obterListaDeConsultasParaEnvioDeEmail(String dataAtual){
        Query query;
        query = getEntityManager().createNamedQuery("Consulta.obterListaDeConsultasParaEnvioEmail", Consulta.class);
        query.setParameter("datConsulta", dataAtual);

        try {
            return query.getResultList();
        } catch (NoResultException ex) {
            ex.printStackTrace();
            return null;
        }
    }
    
}
