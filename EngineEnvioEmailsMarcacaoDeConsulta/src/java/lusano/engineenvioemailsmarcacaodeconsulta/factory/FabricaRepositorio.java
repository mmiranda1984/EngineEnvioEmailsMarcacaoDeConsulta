/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.factory;

import lusano.engineenvioemailsmarcacaodeconsulta.repository.RepositorioConsultasEmail;
import lusano.engineenvioemailsmarcacaodeconsulta.repository.RepositorioConsultasEmailImpl;

/**
 *
 * @author mmiranda1984
 */
public class FabricaRepositorio {
 
    public static RepositorioConsultasEmail obterRepositorioDeConsultasEmail(){
        return new RepositorioConsultasEmailImpl();
    }
    
}
