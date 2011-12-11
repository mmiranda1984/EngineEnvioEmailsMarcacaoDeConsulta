package lusano.engineenvioemailsmarcacaodeconsulta.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Consulta;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Filial;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.PacientePK;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-11T11:25:22")
@StaticMetamodel(Paciente.class)
public class Paciente_ { 

    public static volatile SingularAttribute<Paciente, Filial> filial;
    public static volatile SingularAttribute<Paciente, String> txtEmailPaciente;
    public static volatile CollectionAttribute<Paciente, Consulta> consultaCollection;
    public static volatile SingularAttribute<Paciente, String> nomPaciente;
    public static volatile SingularAttribute<Paciente, String> numIdentificacaoPaciente;
    public static volatile SingularAttribute<Paciente, PacientePK> pacientePK;
    public static volatile SingularAttribute<Paciente, String> numContatoPaciente;
    public static volatile SingularAttribute<Paciente, Boolean> indAtivo;

}