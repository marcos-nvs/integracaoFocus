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
@Table(name = "TIPOPARTO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoparto.findAll", query = "SELECT t FROM Tipoparto t"),
    @NamedQuery(name = "Tipoparto.findByCodPar", query = "SELECT t FROM Tipoparto t WHERE t.codPar = :codPar"),
    @NamedQuery(name = "Tipoparto.findByDescricao", query = "SELECT t FROM Tipoparto t WHERE t.descricao = :descricao")})
public class Tipoparto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PAR")
    private Integer codPar;
    @Column(name = "DESCRICAO")
    private String descricao;
    @OneToMany(mappedBy = "codPar", fetch = FetchType.EAGER)
    private List<Pacientes> pacientesList;

    public Tipoparto() {
    }

    public Tipoparto(Integer codPar) {
        this.codPar = codPar;
    }

    public Integer getCodPar() {
        return codPar;
    }

    public void setCodPar(Integer codPar) {
        this.codPar = codPar;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public List<Pacientes> getPacientesList() {
        return pacientesList;
    }

    public void setPacientesList(List<Pacientes> pacientesList) {
        this.pacientesList = pacientesList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPar != null ? codPar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoparto)) {
            return false;
        }
        Tipoparto other = (Tipoparto) object;
        if ((this.codPar == null && other.codPar != null) || (this.codPar != null && !this.codPar.equals(other.codPar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Tipoparto[ codPar=" + codPar + " ]";
    }
    
}
