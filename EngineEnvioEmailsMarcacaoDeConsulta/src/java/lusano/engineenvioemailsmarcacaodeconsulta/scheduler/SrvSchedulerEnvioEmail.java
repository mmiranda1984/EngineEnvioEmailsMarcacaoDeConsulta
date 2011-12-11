/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.scheduler;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletConfig;
import javax.servlet.http.HttpServlet;
import lusano.engineenvioemailsmarcacaodeconsulta.engine.EngineEnvioEmail;
import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerUtils;
import org.quartz.impl.StdSchedulerFactory;

/**
 *
 * @author mmiranda1984
 */
public class SrvSchedulerEnvioEmail extends HttpServlet {
    
    private static final long serialVersionUID = 1L;

    public SrvSchedulerEnvioEmail() {
        super();
    }


    public void init(ServletConfig config){
        Trigger trigger = TriggerUtils.makeDailyTrigger("TriggerEmailMarcacaoConsulta", 11, 42);
        trigger.setName( "TriggerEmailMarcacaoConsulta" );
 
        JobDetail jobDetail = new JobDetail( "EnviarEmailMarcacaoDeConsulta", EngineEnvioEmail.class );
 
        Scheduler scheduler;
        try {
            scheduler = new StdSchedulerFactory().getScheduler();
            scheduler.scheduleJob( jobDetail, trigger );
            scheduler.start();
        } catch (SchedulerException ex) {
            ex.printStackTrace();
        }
    }

}
