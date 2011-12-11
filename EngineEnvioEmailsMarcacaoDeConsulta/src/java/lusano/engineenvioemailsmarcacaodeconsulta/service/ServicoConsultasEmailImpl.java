/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Consulta;
import lusano.engineenvioemailsmarcacaodeconsulta.factory.FabricaRepositorio;
import lusano.engineenvioemailsmarcacaodeconsulta.repository.RepositorioConsultasEmail;

/**
 *
 * @author mmiranda1984
 */
public class ServicoConsultasEmailImpl implements ServicoConsultasEmail{

    public List<Consulta> obterListaDeConsultasParaEnvioDeEmail(){
	DateFormat dataFormatadaConsulta = new SimpleDateFormat("yyyy-MM-dd");
	Date dataAtual = new Date();

        RepositorioConsultasEmail rep = FabricaRepositorio.obterRepositorioDeConsultasEmail();
        return rep.obterListaDeConsultasParaEnvioDeEmail(dataFormatadaConsulta.format(dataAtual));
    }
    
}
