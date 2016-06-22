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
import javax.persistence.ManyToMany;
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
@Table(name = "MATERIAL_EXA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MaterialExa.findAll", query = "SELECT m FROM MaterialExa m"),
    @NamedQuery(name = "MaterialExa.findByCodMaterial", query = "SELECT m FROM MaterialExa m WHERE m.codMaterial = :codMaterial"),
    @NamedQuery(name = "MaterialExa.findByDescricao", query = "SELECT m FROM MaterialExa m WHERE m.descricao = :descricao"),
    @NamedQuery(name = "MaterialExa.findBySigla", query = "SELECT m FROM MaterialExa m WHERE m.sigla = :sigla")})
public class MaterialExa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_MATERIAL")
    private Integer codMaterial;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "SIGLA")
    private String sigla;
    @ManyToMany(mappedBy = "materialExaList", fetch = FetchType.EAGER)
    private List<CadExame> cadExameList;
    @OneToMany(mappedBy = "codMaterial", fetch = FetchType.EAGER)
    private List<Agendaexa> agendaexaList;

    public MaterialExa() {
    }

    public MaterialExa(Integer codMaterial) {
        this.codMaterial = codMaterial;
    }

    public Integer getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(Integer codMaterial) {
        this.codMaterial = codMaterial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @XmlTransient
    public List<CadExame> getCadExameList() {
        return cadExameList;
    }

    public void setCadExameList(List<CadExame> cadExameList) {
        this.cadExameList = cadExameList;
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
        hash += (codMaterial != null ? codMaterial.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MaterialExa)) {
            return false;
        }
        MaterialExa other = (MaterialExa) object;
        if ((this.codMaterial == null && other.codMaterial != null) || (this.codMaterial != null && !this.codMaterial.equals(other.codMaterial))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.MaterialExa[ codMaterial=" + codMaterial + " ]";
    }
    
}
