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
@Table(name = "FAMILIA_EXAME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "FamiliaExame.findAll", query = "SELECT f FROM FamiliaExame f"),
    @NamedQuery(name = "FamiliaExame.findByCodFamiliaexame", query = "SELECT f FROM FamiliaExame f WHERE f.codFamiliaexame = :codFamiliaexame"),
    @NamedQuery(name = "FamiliaExame.findByDescricao", query = "SELECT f FROM FamiliaExame f WHERE f.descricao = :descricao"),
    @NamedQuery(name = "FamiliaExame.findByCor", query = "SELECT f FROM FamiliaExame f WHERE f.cor = :cor")})
public class FamiliaExame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_FAMILIAEXAME")
    private Integer codFamiliaexame;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "COR")
    private String cor;
    @OneToMany(mappedBy = "codFamiliaexame", fetch = FetchType.EAGER)
    private List<CadExame> cadExameList;

    public FamiliaExame() {
    }

    public FamiliaExame(Integer codFamiliaexame) {
        this.codFamiliaexame = codFamiliaexame;
    }

    public Integer getCodFamiliaexame() {
        return codFamiliaexame;
    }

    public void setCodFamiliaexame(Integer codFamiliaexame) {
        this.codFamiliaexame = codFamiliaexame;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @XmlTransient
    public List<CadExame> getCadExameList() {
        return cadExameList;
    }

    public void setCadExameList(List<CadExame> cadExameList) {
        this.cadExameList = cadExameList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codFamiliaexame != null ? codFamiliaexame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FamiliaExame)) {
            return false;
        }
        FamiliaExame other = (FamiliaExame) object;
        if ((this.codFamiliaexame == null && other.codFamiliaexame != null) || (this.codFamiliaexame != null && !this.codFamiliaexame.equals(other.codFamiliaexame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.FamiliaExame[ codFamiliaexame=" + codFamiliaexame + " ]";
    }
    
}
