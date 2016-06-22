/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author F12684146896
 */
@Entity
@Table(name = "COTAS_EXA_LAB_UNI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CotasExaLabUni.findAll", query = "SELECT c FROM CotasExaLabUni c"),
    @NamedQuery(name = "CotasExaLabUni.findByCodCotaExaLabUni", query = "SELECT c FROM CotasExaLabUni c WHERE c.codCotaExaLabUni = :codCotaExaLabUni"),
    @NamedQuery(name = "CotasExaLabUni.findByCodUni", query = "SELECT c FROM CotasExaLabUni c WHERE c.codUni = :codUni"),
    @NamedQuery(name = "CotasExaLabUni.findByQtdeTotal", query = "SELECT c FROM CotasExaLabUni c WHERE c.qtdeTotal = :qtdeTotal"),
    @NamedQuery(name = "CotasExaLabUni.findByQtdeAgendada", query = "SELECT c FROM CotasExaLabUni c WHERE c.qtdeAgendada = :qtdeAgendada"),
    @NamedQuery(name = "CotasExaLabUni.findByCodUnisolicitante", query = "SELECT c FROM CotasExaLabUni c WHERE c.codUnisolicitante = :codUnisolicitante")})
public class CotasExaLabUni implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_COTA_EXA_LAB_UNI")
    private Integer codCotaExaLabUni;
    @Column(name = "COD_UNI")
    private Integer codUni;
    @Column(name = "QTDE_TOTAL")
    private Integer qtdeTotal;
    @Column(name = "QTDE_AGENDADA")
    private Integer qtdeAgendada;
    @Column(name = "COD_UNISOLICITANTE")
    private Integer codUnisolicitante;
    @JoinColumn(name = "COD_COTASEXALAB", referencedColumnName = "COD_COTASEXALAB")
    @ManyToOne(fetch = FetchType.EAGER)
    private Cotasexalab codCotasexalab;
    @OneToMany(mappedBy = "codCotaExaLabUni", fetch = FetchType.EAGER)
    private List<Agendaexa> agendaexaList;

    public CotasExaLabUni() {
    }

    public CotasExaLabUni(Integer codCotaExaLabUni) {
        this.codCotaExaLabUni = codCotaExaLabUni;
    }

    public Integer getCodCotaExaLabUni() {
        return codCotaExaLabUni;
    }

    public void setCodCotaExaLabUni(Integer codCotaExaLabUni) {
        this.codCotaExaLabUni = codCotaExaLabUni;
    }

    public Integer getCodUni() {
        return codUni;
    }

    public void setCodUni(Integer codUni) {
        this.codUni = codUni;
    }

    public Integer getQtdeTotal() {
        return qtdeTotal;
    }

    public void setQtdeTotal(Integer qtdeTotal) {
        this.qtdeTotal = qtdeTotal;
    }

    public Integer getQtdeAgendada() {
        return qtdeAgendada;
    }

    public void setQtdeAgendada(Integer qtdeAgendada) {
        this.qtdeAgendada = qtdeAgendada;
    }

    public Integer getCodUnisolicitante() {
        return codUnisolicitante;
    }

    public void setCodUnisolicitante(Integer codUnisolicitante) {
        this.codUnisolicitante = codUnisolicitante;
    }

    public Cotasexalab getCodCotasexalab() {
        return codCotasexalab;
    }

    public void setCodCotasexalab(Cotasexalab codCotasexalab) {
        this.codCotasexalab = codCotasexalab;
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
        hash += (codCotaExaLabUni != null ? codCotaExaLabUni.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CotasExaLabUni)) {
            return false;
        }
        CotasExaLabUni other = (CotasExaLabUni) object;
        if ((this.codCotaExaLabUni == null && other.codCotaExaLabUni != null) || (this.codCotaExaLabUni != null && !this.codCotaExaLabUni.equals(other.codCotaExaLabUni))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.CotasExaLabUni[ codCotaExaLabUni=" + codCotaExaLabUni + " ]";
    }
    
}
