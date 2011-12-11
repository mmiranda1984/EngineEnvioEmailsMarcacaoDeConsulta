package lusano.engineenvioemailsmarcacaodeconsulta.entity;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import lusano.engineenvioemailsmarcacaodeconsulta.entity.Filial;

@Generated(value="EclipseLink-2.2.0.v20110202-r8913", date="2011-12-11T11:25:22")
@StaticMetamodel(Empresa.class)
public class Empresa_ { 

    public static volatile SingularAttribute<Empresa, String> nomEmpresa;
    public static volatile SingularAttribute<Empresa, String> txtEmailEmpresa;
    public static volatile SingularAttribute<Empresa, Integer> codEmpresa;
    public static volatile SingularAttribute<Empresa, Boolean> indAtivo;
    public static volatile CollectionAttribute<Empresa, Filial> filialCollection;

}