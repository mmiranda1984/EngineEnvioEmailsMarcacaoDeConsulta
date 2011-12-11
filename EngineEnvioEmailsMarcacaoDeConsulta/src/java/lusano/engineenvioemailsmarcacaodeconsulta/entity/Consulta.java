/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lusano.engineenvioemailsmarcacaodeconsulta.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mmiranda1984
 */
@Entity
@Table(name = "CONSULTA", catalog = "MARCACAODECONSULTA", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Consulta.findAll", query = "SELECT c FROM Consulta c"),
    @NamedQuery(name = "Consulta.findByCodConsulta", query = "SELECT c FROM Consulta c WHERE c.consultaPK.codConsulta = :codConsulta"),
    @NamedQuery(name = "Consulta.findByCodPacienteConsulta", query = "SELECT c FROM Consulta c WHERE c.consultaPK.codPacienteConsulta = :codPacienteConsulta"),
    @NamedQuery(name = "Consulta.findByDatConsulta", query = "SELECT c FROM Consulta c WHERE c.datConsulta = :datConsulta"),
    @NamedQuery(name = "Consulta.findByHorConsulta", query = "SELECT c FROM Consulta c WHERE c.horConsulta = :horConsulta"),
    @NamedQuery(name = "Consulta.findByNumDiasAntecedenciaEmail", query = "SELECT c FROM Consulta c WHERE c.numDiasAntecedenciaEmail = :numDiasAntecedenciaEmail"),
    @NamedQuery(name = "Paciente.obterListaDeConsultasParaEnvioEmail", query = "SELECT c FROM Consulta c WHERE c.paciente.indAtivo = 1 AND c.paciente.filial.indAtivo = 1 AND c.paciente.filial.empresa.indAtivo = 1 AND c.datConsulta = :datConsulta")
})
public class Consulta implements Serializable {
    @Column(name = "DAT_CONSULTA")
    @Temporal(TemporalType.DATE)
    private Date datConsulta;
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ConsultaPK consultaPK;
    @Column(name = "HOR_CONSULTA")
    private String horConsulta;
    @Column(name = "NUM_DIAS_ANTECEDENCIA_EMAIL")
    private Integer numDiasAntecedenciaEmail;
    @JoinColumn(name = "COD_PACIENTE_CONSULTA", referencedColumnName = "COD_PACIENTE", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Paciente paciente;

    public Consulta() {
    }

    public Consulta(ConsultaPK consultaPK) {
        this.consultaPK = consultaPK;
    }

    public Consulta(int codConsulta, int codPacienteConsulta) {
        this.consultaPK = new ConsultaPK(codConsulta, codPacienteConsulta);
    }

    public ConsultaPK getConsultaPK() {
        return consultaPK;
    }

    public void setConsultaPK(ConsultaPK consultaPK) {
        this.consultaPK = consultaPK;
    }

    public Date getDatConsulta() {
        return datConsulta;
    }

    public void setDatConsulta(Date datConsulta) {
        this.datConsulta = datConsulta;
    }

    public String getHorConsulta() {
        return horConsulta;
    }

    public void setHorConsulta(String horConsulta) {
        this.horConsulta = horConsulta;
    }

    public Integer getNumDiasAntecedenciaEmail() {
        return numDiasAntecedenciaEmail;
    }

    public void setNumDiasAntecedenciaEmail(Integer numDiasAntecedenciaEmail) {
        this.numDiasAntecedenciaEmail = numDiasAntecedenciaEmail;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (consultaPK != null ? consultaPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Consulta)) {
            return false;
        }
        Consulta other = (Consulta) object;
        if ((this.consultaPK == null && other.consultaPK != null) || (this.consultaPK != null && !this.consultaPK.equals(other.consultaPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "lusano.engineenvioemailsmarcacaodeconsulta.entity.Consulta[ consultaPK=" + consultaPK + " ]";
    }
}
