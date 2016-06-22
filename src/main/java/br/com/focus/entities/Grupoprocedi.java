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
@Table(name = "GRUPOPROCEDI")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Grupoprocedi.findAll", query = "SELECT g FROM Grupoprocedi g"),
    @NamedQuery(name = "Grupoprocedi.findByCodGru", query = "SELECT g FROM Grupoprocedi g WHERE g.codGru = :codGru"),
    @NamedQuery(name = "Grupoprocedi.findByDescricao", query = "SELECT g FROM Grupoprocedi g WHERE g.descricao = :descricao"),
    @NamedQuery(name = "Grupoprocedi.findByDescrigeral", query = "SELECT g FROM Grupoprocedi g WHERE g.descrigeral = :descrigeral"),
    @NamedQuery(name = "Grupoprocedi.findByNgrupo", query = "SELECT g FROM Grupoprocedi g WHERE g.ngrupo = :ngrupo")})
public class Grupoprocedi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_GRU")
    private Integer codGru;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "DESCRIGERAL")
    private String descrigeral;
    @Column(name = "NGRUPO")
    private Integer ngrupo;
    @OneToMany(mappedBy = "codGru", fetch = FetchType.EAGER)
    private List<Procedimentos> procedimentosList;

    public Grupoprocedi() {
    }

    public Grupoprocedi(Integer codGru) {
        this.codGru = codGru;
    }

    public Integer getCodGru() {
        return codGru;
    }

    public void setCodGru(Integer codGru) {
        this.codGru = codGru;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescrigeral() {
        return descrigeral;
    }

    public void setDescrigeral(String descrigeral) {
        this.descrigeral = descrigeral;
    }

    public Integer getNgrupo() {
        return ngrupo;
    }

    public void setNgrupo(Integer ngrupo) {
        this.ngrupo = ngrupo;
    }

    @XmlTransient
    public List<Procedimentos> getProcedimentosList() {
        return procedimentosList;
    }

    public void setProcedimentosList(List<Procedimentos> procedimentosList) {
        this.procedimentosList = procedimentosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codGru != null ? codGru.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Grupoprocedi)) {
            return false;
        }
        Grupoprocedi other = (Grupoprocedi) object;
        if ((this.codGru == null && other.codGru != null) || (this.codGru != null && !this.codGru.equals(other.codGru))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Grupoprocedi[ codGru=" + codGru + " ]";
    }
    
}
