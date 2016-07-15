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
@Table(name = "GRUPOEXA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupoexa.findAll", query = "SELECT g FROM Grupoexa g"),
    @NamedQuery(name = "Grupoexa.findByCodExa", query = "SELECT g FROM Grupoexa g WHERE g.codExa = :codExa"),
    @NamedQuery(name = "Grupoexa.findByDescricao", query = "SELECT g FROM Grupoexa g WHERE g.descricao = :descricao")})
public class Grupoexa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_EXA")
    private Integer codExa;
    @Column(name = "DESCRICAO")
    private String descricao;
//    @OneToMany(mappedBy = "codExa", fetch = FetchType.EAGER)
//    private List<Agendaexa> agendaexaList;

    public Grupoexa() {
    }

    public Grupoexa(Integer codExa) {
        this.codExa = codExa;
    }

    public Integer getCodExa() {
        return codExa;
    }

    public void setCodExa(Integer codExa) {
        this.codExa = codExa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

//    @XmlTransient
//    public List<Agendaexa> getAgendaexaList() {
//        return agendaexaList;
//    }
//
//    public void setAgendaexaList(List<Agendaexa> agendaexaList) {
//        this.agendaexaList = agendaexaList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codExa != null ? codExa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupoexa)) {
            return false;
        }
        Grupoexa other = (Grupoexa) object;
        if ((this.codExa == null && other.codExa != null) || (this.codExa != null && !this.codExa.equals(other.codExa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Grupoexa[ codExa=" + codExa + " ]";
    }
    
}
