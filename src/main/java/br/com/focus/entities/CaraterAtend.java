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
@Table(name = "CaraterAtend")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CaraterAtend.findAll", query = "SELECT c FROM CaraterAtend c"),
    @NamedQuery(name = "CaraterAtend.findByCodCarater", query = "SELECT c FROM CaraterAtend c WHERE c.codCarater = :codCarater"),
    @NamedQuery(name = "CaraterAtend.findByDescricao", query = "SELECT c FROM CaraterAtend c WHERE c.descricao = :descricao")})
public class CaraterAtend implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CARATER")
    private String codCarater;
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(mappedBy = "caratInter", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList;

    public CaraterAtend() {
    }

    public CaraterAtend(String codCarater) {
        this.codCarater = codCarater;
    }

    public String getCodCarater() {
        return codCarater;
    }

    public void setCodCarater(String codCarater) {
        this.codCarater = codCarater;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Internacao> getInternacaoList() {
        return internacaoList;
    }

    public void setInternacaoList(List<Internacao> internacaoList) {
        this.internacaoList = internacaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCarater != null ? codCarater.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CaraterAtend)) {
            return false;
        }
        CaraterAtend other = (CaraterAtend) object;
        if ((this.codCarater == null && other.codCarater != null) || (this.codCarater != null && !this.codCarater.equals(other.codCarater))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.CaraterAtend[ codCarater=" + codCarater + " ]";
    }
    
}
