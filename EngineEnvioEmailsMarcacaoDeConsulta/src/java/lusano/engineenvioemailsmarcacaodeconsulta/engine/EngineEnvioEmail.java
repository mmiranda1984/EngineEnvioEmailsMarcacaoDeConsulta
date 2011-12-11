/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.engine;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Consulta;
import lusano.engineenvioemailsmarcacaodeconsulta.factory.FabricaServico;
import lusano.engineenvioemailsmarcacaodeconsulta.service.ServicoConsultasEmail;
import lusano.engineenvioemailsmarcacaodeconsulta.util.ConstantsUtil;
import lusano.enviaremail.util.EnviarEmail;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 *
 * @author mmiranda1984
 */
public class EngineEnvioEmail implements Job, Serializable{

    public void execute(JobExecutionContext arg0) throws JobExecutionException {
        //System.out.println("Enviou lista de e-mail");
        ServicoConsultasEmail servico = FabricaServico.obterServicoConsultasEmailImpl();
        List<Consulta> listaConsulta = servico.obterListaDeConsultasParaEnvioDeEmail();
        
        EnviarEmail email = new EnviarEmail();
        
        for (Consulta consulta : listaConsulta) {
            
            
            email.enviarEmail(consulta.getPaciente().getTxtEmailPaciente(), 
                    obterEmailDeCopia(consulta), 
                    "", 
                    ConstantsUtil.getTituloEmailConsulta(), 
                    obterCorpoDaMensagem(consulta));
        }
   }
    
    private String obterEmailDeCopia(Consulta consulta){
        String copiaPara = "";
        
        if (consulta.getPaciente().getFilial().getIndReceberCopiaEmail())
            copiaPara = consulta.getPaciente().getFilial().getTxtEmailFilial();

        return copiaPara;
    }
    
    private String obterCorpoDaMensagem(Consulta consulta){
	DateFormat dataFormatadaConsulta = new SimpleDateFormat("dd/MM/yyyy");

        String corpoMensagem = ConstantsUtil.getCorpoEmailConsulta();
        corpoMensagem = corpoMensagem.replace("<nomepaciente>", consulta.getPaciente().getNomPaciente());
        corpoMensagem = corpoMensagem.replace("<datconsulta>", dataFormatadaConsulta.format(consulta.getDatConsulta()));
        corpoMensagem = corpoMensagem.replace("<horaconsulta>", consulta.getHorConsulta());
        corpoMensagem = corpoMensagem.replace("<nomeempresa>", consulta.getPaciente().getFilial().getEmpresa().getNomEmpresa());
        corpoMensagem = corpoMensagem.replace("<nomefilial>", consulta.getPaciente().getFilial().getNomFilial());
        
        return corpoMensagem;
    }

}
