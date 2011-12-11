/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.repository;

import java.util.List;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Consulta;

/**
 *
 * @author mmiranda1984
 */
public interface RepositorioConsultasEmail {
    
    List<Consulta> obterListaDeConsultasParaEnvioDeEmail(String dataAtual);
}
