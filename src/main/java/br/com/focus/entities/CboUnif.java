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
@Table(name = "CBO_UNIF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CboUnif.findAll", query = "SELECT c FROM CboUnif c"),
    @NamedQuery(name = "CboUnif.findById", query = "SELECT c FROM CboUnif c WHERE c.id = :id"),
    @NamedQuery(name = "CboUnif.findByCodCbo", query = "SELECT c FROM CboUnif c WHERE c.codCbo = :codCbo"),
    @NamedQuery(name = "CboUnif.findByDescricao", query = "SELECT c FROM CboUnif c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "CboUnif.findByCodId", query = "SELECT c FROM CboUnif c WHERE c.codId = :codId"),
    @NamedQuery(name = "CboUnif.findByCompetencia", query = "SELECT c FROM CboUnif c WHERE c.competencia = :competencia"),
    @NamedQuery(name = "CboUnif.findByEsus", query = "SELECT c FROM CboUnif c WHERE c.esus = :esus"),
    @NamedQuery(name = "CboUnif.findByDescrEsus", query = "SELECT c FROM CboUnif c WHERE c.descrEsus = :descrEsus")})
public class CboUnif implements Serializable {

    private static final long serialVersionUID = 1L;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "ID")
    private Double id;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CBO")
    private String codCbo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Basic(optional = false)
    @Column(name = "COD_ID")
    private int codId;
    @Column(name = "COMPETENCIA")
    private String competencia;
    @Column(name = "ESUS")
    private Boolean esus;
    @Column(name = "DESCR_ESUS")
    private String descrEsus;
    @OneToMany(mappedBy = "codCbo", fetch = FetchType.EAGER)
    private List<Bpaitens> bpaitensList;

    public CboUnif() {
    }

    public CboUnif(String codCbo) {
        this.codCbo = codCbo;
    }

    public CboUnif(String codCbo, int codId) {
        this.codCbo = codCbo;
        this.codId = codId;
    }

    public Double getId() {
        return id;
    }

    public void setId(Double id) {
        this.id = id;
    }

    public String getCodCbo() {
        return codCbo;
    }

    public void setCodCbo(String codCbo) {
        this.codCbo = codCbo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCodId() {
        return codId;
    }

    public void setCodId(int codId) {
        this.codId = codId;
    }

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    public Boolean getEsus() {
        return esus;
    }

    public void setEsus(Boolean esus) {
        this.esus = esus;
    }

    public String getDescrEsus() {
        return descrEsus;
    }

    public void setDescrEsus(String descrEsus) {
        this.descrEsus = descrEsus;
    }

    @XmlTransient
    public List<Bpaitens> getBpaitensList() {
        return bpaitensList;
    }

    public void setBpaitensList(List<Bpaitens> bpaitensList) {
        this.bpaitensList = bpaitensList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCbo != null ? codCbo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CboUnif)) {
            return false;
        }
        CboUnif other = (CboUnif) object;
        if ((this.codCbo == null && other.codCbo != null) || (this.codCbo != null && !this.codCbo.equals(other.codCbo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.CboUnif[ codCbo=" + codCbo + " ]";
    }
    
}
