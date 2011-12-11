package lusano.engineenvioemailsmarcacaodeconsulta.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Empresa;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.FilialPK;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Paciente;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-11T11:25:22")
@StaticMetamodel(Filial.class)
public class Filial_ { 

    public static volatile SingularAttribute<Filial, String> nomFilial;
    public static volatile SingularAttribute<Filial, Boolean> indReceberCopiaEmail;
    public static volatile SingularAttribute<Filial, Empresa> empresa;
    public static volatile SingularAttribute<Filial, FilialPK> filialPK;
    public static volatile SingularAttribute<Filial, String> txtEmailFilial;
    public static volatile SingularAttribute<Filial, Boolean> indAtivo;
    public static volatile CollectionAttribute<Filial, Paciente> pacienteCollection;

}