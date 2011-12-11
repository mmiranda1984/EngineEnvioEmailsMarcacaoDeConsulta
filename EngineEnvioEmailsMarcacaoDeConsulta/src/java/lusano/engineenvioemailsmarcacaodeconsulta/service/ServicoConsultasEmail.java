/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.service;

import java.util.List;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Consulta;

/**
 *
 * @author mmiranda1984
 */
public interface ServicoConsultasEmail {
    
    List<Consulta> obterListaDeConsultasParaEnvioDeEmail();
}
