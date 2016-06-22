/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "CONVENIO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Convenio.findAll", query = "SELECT c FROM Convenio c"),
    @NamedQuery(name = "Convenio.findByCodConv", query = "SELECT c FROM Convenio c WHERE c.codConv = :codConv"),
    @NamedQuery(name = "Convenio.findByNome", query = "SELECT c FROM Convenio c WHERE c.nome = :nome"),
    @NamedQuery(name = "Convenio.findByTabPreco", query = "SELECT c FROM Convenio c WHERE c.tabPreco = :tabPreco")})
public class Convenio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CONV")
    private Integer codConv;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "TAB_PRECO")
    private Character tabPreco;
    @OneToMany(mappedBy = "codConv", fetch = FetchType.EAGER)
    private List<Pacientes> pacientesList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codConv", fetch = FetchType.EAGER)
    private List<TipoPlano> tipoPlanoList;

    public Convenio() {
    }

    public Convenio(Integer codConv) {
        this.codConv = codConv;
    }

    public Integer getCodConv() {
        return codConv;
    }

    public void setCodConv(Integer codConv) {
        this.codConv = codConv;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getTabPreco() {
        return tabPreco;
    }

    public void setTabPreco(Character tabPreco) {
        this.tabPreco = tabPreco;
    }

    @XmlTransient
    public List<Pacientes> getPacientesList() {
        return pacientesList;
    }

    public void setPacientesList(List<Pacientes> pacientesList) {
        this.pacientesList = pacientesList;
    }

    @XmlTransient
    public List<TipoPlano> getTipoPlanoList() {
        return tipoPlanoList;
    }

    public void setTipoPlanoList(List<TipoPlano> tipoPlanoList) {
        this.tipoPlanoList = tipoPlanoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codConv != null ? codConv.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Convenio)) {
            return false;
        }
        Convenio other = (Convenio) object;
        if ((this.codConv == null && other.codConv != null) || (this.codConv != null && !this.codConv.equals(other.codConv))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Convenio[ codConv=" + codConv + " ]";
    }
    
}
