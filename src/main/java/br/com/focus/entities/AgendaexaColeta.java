/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author F12684146896
 */
@Entity
@Table(name = "AGENDAEXA_COLETA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgendaexaColeta.findAll", query = "SELECT a FROM AgendaexaColeta a"),
    @NamedQuery(name = "AgendaexaColeta.findByCodAgeexaColeta", query = "SELECT a FROM AgendaexaColeta a WHERE a.codAgeexaColeta = :codAgeexaColeta"),
    @NamedQuery(name = "AgendaexaColeta.findByCodigoBarraControle", query = "SELECT a FROM AgendaexaColeta a WHERE a.codigoBarraControle = :codigoBarraControle"),
    @NamedQuery(name = "AgendaexaColeta.findByMaquinaColetou", query = "SELECT a FROM AgendaexaColeta a WHERE a.maquinaColetou = :maquinaColetou"),
    @NamedQuery(name = "AgendaexaColeta.findByDataHoraColetou", query = "SELECT a FROM AgendaexaColeta a WHERE a.dataHoraColetou = :dataHoraColetou")})
public class AgendaexaColeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_AGEEXA_COLETA")
    private Integer codAgeexaColeta;
    @Column(name = "CODIGO_BARRA_CONTROLE")
    private String codigoBarraControle;
    @Column(name = "MAQUINA_COLETOU")
    private String maquinaColetou;
    @Column(name = "DATA_HORA_COLETOU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraColetou;
    @JoinColumn(name = "COD_AGENDAEXA_MASTER", referencedColumnName = "COD_AGENDAEXA_MASTER")
    @ManyToOne(fetch = FetchType.EAGER)
    private AgendaexaMaster codAgendaexaMaster;
    @JoinColumn(name = "COD_LOTEEXA_COLETA", referencedColumnName = "COD_LOTEEXA_COLETA")
    @ManyToOne(fetch = FetchType.EAGER)
    private LoteexaColeta codLoteexaColeta;
    @JoinColumn(name = "COD_USU_COLETOU", referencedColumnName = "COD_USU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios codUsuColetou;
    @OneToMany(mappedBy = "codAgeexaColeta", fetch = FetchType.EAGER)
    private List<Agendaexa> agendaexaList;

    public AgendaexaColeta() {
    }

    public AgendaexaColeta(Integer codAgeexaColeta) {
        this.codAgeexaColeta = codAgeexaColeta;
    }

    public Integer getCodAgeexaColeta() {
        return codAgeexaColeta;
    }

    public void setCodAgeexaColeta(Integer codAgeexaColeta) {
        this.codAgeexaColeta = codAgeexaColeta;
    }

    public String getCodigoBarraControle() {
        return codigoBarraControle;
    }

    public void setCodigoBarraControle(String codigoBarraControle) {
        this.codigoBarraControle = codigoBarraControle;
    }

    public String getMaquinaColetou() {
        return maquinaColetou;
    }

    public void setMaquinaColetou(String maquinaColetou) {
        this.maquinaColetou = maquinaColetou;
    }

    public Date getDataHoraColetou() {
        return dataHoraColetou;
    }

    public void setDataHoraColetou(Date dataHoraColetou) {
        this.dataHoraColetou = dataHoraColetou;
    }

    public AgendaexaMaster getCodAgendaexaMaster() {
        return codAgendaexaMaster;
    }

    public void setCodAgendaexaMaster(AgendaexaMaster codAgendaexaMaster) {
        this.codAgendaexaMaster = codAgendaexaMaster;
    }

    public LoteexaColeta getCodLoteexaColeta() {
        return codLoteexaColeta;
    }

    public void setCodLoteexaColeta(LoteexaColeta codLoteexaColeta) {
        this.codLoteexaColeta = codLoteexaColeta;
    }

    public Usuarios getCodUsuColetou() {
        return codUsuColetou;
    }

    public void setCodUsuColetou(Usuarios codUsuColetou) {
        this.codUsuColetou = codUsuColetou;
    }

    @XmlTransient
    public List<Agendaexa> getAgendaexaList() {
        return agendaexaList;
    }

    public void setAgendaexaList(List<Agendaexa> agendaexaList) {
        this.agendaexaList = agendaexaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAgeexaColeta != null ? codAgeexaColeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgendaexaColeta)) {
            return false;
        }
        AgendaexaColeta other = (AgendaexaColeta) object;
        if ((this.codAgeexaColeta == null && other.codAgeexaColeta != null) || (this.codAgeexaColeta != null && !this.codAgeexaColeta.equals(other.codAgeexaColeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.AgendaexaColeta[ codAgeexaColeta=" + codAgeexaColeta + " ]";
    }
    
}
