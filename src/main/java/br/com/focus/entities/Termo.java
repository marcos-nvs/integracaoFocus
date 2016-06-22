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
import javax.persistence.Lob;
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
@Table(name = "TERMO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Termo.findAll", query = "SELECT t FROM Termo t"),
    @NamedQuery(name = "Termo.findByCodTermo", query = "SELECT t FROM Termo t WHERE t.codTermo = :codTermo"),
    @NamedQuery(name = "Termo.findByDescricao", query = "SELECT t FROM Termo t WHERE t.descricao = :descricao")})
public class Termo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_TERMO")
    private Integer codTermo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Lob
    @Column(name = "TERMO")
    private String termo;
    @OneToMany(mappedBy = "codTermo", fetch = FetchType.EAGER)
    private List<ProcedimentoUnif> procedimentoUnifList;

    public Termo() {
    }

    public Termo(Integer codTermo) {
        this.codTermo = codTermo;
    }

    public Integer getCodTermo() {
        return codTermo;
    }

    public void setCodTermo(Integer codTermo) {
        this.codTermo = codTermo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTermo() {
        return termo;
    }

    public void setTermo(String termo) {
        this.termo = termo;
    }

    @XmlTransient
    public List<ProcedimentoUnif> getProcedimentoUnifList() {
        return procedimentoUnifList;
    }

    public void setProcedimentoUnifList(List<ProcedimentoUnif> procedimentoUnifList) {
        this.procedimentoUnifList = procedimentoUnifList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTermo != null ? codTermo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Termo)) {
            return false;
        }
        Termo other = (Termo) object;
        if ((this.codTermo == null && other.codTermo != null) || (this.codTermo != null && !this.codTermo.equals(other.codTermo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Termo[ codTermo=" + codTermo + " ]";
    }
    
}
