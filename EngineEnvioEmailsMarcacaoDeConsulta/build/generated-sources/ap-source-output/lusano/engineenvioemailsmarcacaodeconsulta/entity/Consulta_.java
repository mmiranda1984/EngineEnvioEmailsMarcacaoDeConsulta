package lusano.engineenvioemailsmarcacaodeconsulta.entity;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.ConsultaPK;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Paciente;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-11T11:25:22")
@StaticMetamodel(Consulta.class)
public class Consulta_ { 

    public static volatile SingularAttribute<Consulta, Integer> numDiasAntecedenciaEmail;
    public static volatile SingularAttribute<Consulta, Paciente> paciente;
    public static volatile SingularAttribute<Consulta, String> horConsulta;
    public static volatile SingularAttribute<Consulta, ConsultaPK> consultaPK;
    public static volatile SingularAttribute<Consulta, Date> datConsulta;

}