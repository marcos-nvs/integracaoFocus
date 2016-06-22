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
@Table(name = "LOTEEXA_COLETA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoteexaColeta.findAll", query = "SELECT l FROM LoteexaColeta l"),
    @NamedQuery(name = "LoteexaColeta.findByCodLoteexaColeta", query = "SELECT l FROM LoteexaColeta l WHERE l.codLoteexaColeta = :codLoteexaColeta"),
    @NamedQuery(name = "LoteexaColeta.findByCodUni", query = "SELECT l FROM LoteexaColeta l WHERE l.codUni = :codUni"),
    @NamedQuery(name = "LoteexaColeta.findByMaquinaGerou", query = "SELECT l FROM LoteexaColeta l WHERE l.maquinaGerou = :maquinaGerou"),
    @NamedQuery(name = "LoteexaColeta.findByDataHoraGerou", query = "SELECT l FROM LoteexaColeta l WHERE l.dataHoraGerou = :dataHoraGerou"),
    @NamedQuery(name = "LoteexaColeta.findByMaquinaConfirmou", query = "SELECT l FROM LoteexaColeta l WHERE l.maquinaConfirmou = :maquinaConfirmou"),
    @NamedQuery(name = "LoteexaColeta.findByDataHoraConfirmou", query = "SELECT l FROM LoteexaColeta l WHERE l.dataHoraConfirmou = :dataHoraConfirmou"),
    @NamedQuery(name = "LoteexaColeta.findByStatus", query = "SELECT l FROM LoteexaColeta l WHERE l.status = :status")})
public class LoteexaColeta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_LOTEEXA_COLETA")
    private Integer codLoteexaColeta;
    @Column(name = "COD_UNI")
    private Integer codUni;
    @Column(name = "MAQUINA_GEROU")
    private String maquinaGerou;
    @Column(name = "DATA_HORA_GEROU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraGerou;
    @Column(name = "MAQUINA_CONFIRMOU")
    private String maquinaConfirmou;
    @Column(name = "DATA_HORA_CONFIRMOU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraConfirmou;
    @Column(name = "STATUS")
    private Character status;
    @JoinColumn(name = "COD_USU_GEROU", referencedColumnName = "COD_USU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios codUsuGerou;
    @JoinColumn(name = "COD_USU_CONFIRMOU", referencedColumnName = "COD_USU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios codUsuConfirmou;
    @OneToMany(mappedBy = "codLoteexaColeta", fetch = FetchType.EAGER)
    private List<AgendaexaColeta> agendaexaColetaList;

    public LoteexaColeta() {
    }

    public LoteexaColeta(Integer codLoteexaColeta) {
        this.codLoteexaColeta = codLoteexaColeta;
    }

    public Integer getCodLoteexaColeta() {
        return codLoteexaColeta;
    }

    public void setCodLoteexaColeta(Integer codLoteexaColeta) {
        this.codLoteexaColeta = codLoteexaColeta;
    }

    public Integer getCodUni() {
        return codUni;
    }

    public void setCodUni(Integer codUni) {
        this.codUni = codUni;
    }

    public String getMaquinaGerou() {
        return maquinaGerou;
    }

    public void setMaquinaGerou(String maquinaGerou) {
        this.maquinaGerou = maquinaGerou;
    }

    public Date getDataHoraGerou() {
        return dataHoraGerou;
    }

    public void setDataHoraGerou(Date dataHoraGerou) {
        this.dataHoraGerou = dataHoraGerou;
    }

    public String getMaquinaConfirmou() {
        return maquinaConfirmou;
    }

    public void setMaquinaConfirmou(String maquinaConfirmou) {
        this.maquinaConfirmou = maquinaConfirmou;
    }

    public Date getDataHoraConfirmou() {
        return dataHoraConfirmou;
    }

    public void setDataHoraConfirmou(Date dataHoraConfirmou) {
        this.dataHoraConfirmou = dataHoraConfirmou;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    public Usuarios getCodUsuGerou() {
        return codUsuGerou;
    }

    public void setCodUsuGerou(Usuarios codUsuGerou) {
        this.codUsuGerou = codUsuGerou;
    }

    public Usuarios getCodUsuConfirmou() {
        return codUsuConfirmou;
    }

    public void setCodUsuConfirmou(Usuarios codUsuConfirmou) {
        this.codUsuConfirmou = codUsuConfirmou;
    }

    @XmlTransient
    public List<AgendaexaColeta> getAgendaexaColetaList() {
        return agendaexaColetaList;
    }

    public void setAgendaexaColetaList(List<AgendaexaColeta> agendaexaColetaList) {
        this.agendaexaColetaList = agendaexaColetaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLoteexaColeta != null ? codLoteexaColeta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoteexaColeta)) {
            return false;
        }
        LoteexaColeta other = (LoteexaColeta) object;
        if ((this.codLoteexaColeta == null && other.codLoteexaColeta != null) || (this.codLoteexaColeta != null && !this.codLoteexaColeta.equals(other.codLoteexaColeta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.LoteexaColeta[ codLoteexaColeta=" + codLoteexaColeta + " ]";
    }
    
}
