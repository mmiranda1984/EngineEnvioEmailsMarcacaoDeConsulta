/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.factory;

import lusano.engineenvioemailsmarcacaodeconsulta.service.ServicoConsultasEmail;
import lusano.engineenvioemailsmarcacaodeconsulta.service.ServicoConsultasEmailImpl;

/**
 *
 * @author mmiranda1984
 */
public class FabricaServico {
    
    public static ServicoConsultasEmail obterServicoConsultasEmailImpl(){
        return new ServicoConsultasEmailImpl();
    }
}
