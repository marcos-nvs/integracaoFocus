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
@Table(name = "PACIENTE_RESTRICAO_ALIMENTAR")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PacienteRestricaoAlimentar.findAll", query = "SELECT p FROM PacienteRestricaoAlimentar p"),
    @NamedQuery(name = "PacienteRestricaoAlimentar.findByCodPacRestricao", query = "SELECT p FROM PacienteRestricaoAlimentar p WHERE p.codPacRestricao = :codPacRestricao"),
    @NamedQuery(name = "PacienteRestricaoAlimentar.findByCodPac", query = "SELECT p FROM PacienteRestricaoAlimentar p WHERE p.codPac = :codPac"),
    @NamedQuery(name = "PacienteRestricaoAlimentar.findByDescricao", query = "SELECT p FROM PacienteRestricaoAlimentar p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "PacienteRestricaoAlimentar.findByAtivo", query = "SELECT p FROM PacienteRestricaoAlimentar p WHERE p.ativo = :ativo")})
public class PacienteRestricaoAlimentar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PAC_RESTRICAO")
    private Integer codPacRestricao;
    @Column(name = "COD_PAC")
    private Integer codPac;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "ATIVO")
    private Boolean ativo;
    @OneToMany(mappedBy = "codRestricaoAlimentar", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList;

    public PacienteRestricaoAlimentar() {
    }

    public PacienteRestricaoAlimentar(Integer codPacRestricao) {
        this.codPacRestricao = codPacRestricao;
    }

    public Integer getCodPacRestricao() {
        return codPacRestricao;
    }

    public void setCodPacRestricao(Integer codPacRestricao) {
        this.codPacRestricao = codPacRestricao;
    }

    public Integer getCodPac() {
        return codPac;
    }

    public void setCodPac(Integer codPac) {
        this.codPac = codPac;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
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
        hash += (codPacRestricao != null ? codPacRestricao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PacienteRestricaoAlimentar)) {
            return false;
        }
        PacienteRestricaoAlimentar other = (PacienteRestricaoAlimentar) object;
        if ((this.codPacRestricao == null && other.codPacRestricao != null) || (this.codPacRestricao != null && !this.codPacRestricao.equals(other.codPacRestricao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.PacienteRestricaoAlimentar[ codPacRestricao=" + codPacRestricao + " ]";
    }
    
}
