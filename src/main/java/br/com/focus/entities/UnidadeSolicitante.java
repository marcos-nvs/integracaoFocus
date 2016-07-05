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
@Table(name = "UNIDADE_SOLICITANTE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UnidadeSolicitante.findAll", query = "SELECT u FROM UnidadeSolicitante u"),
    @NamedQuery(name = "UnidadeSolicitante.findByCodUnisolicitante", query = "SELECT u FROM UnidadeSolicitante u WHERE u.codUnisolicitante = :codUnisolicitante"),
    @NamedQuery(name = "UnidadeSolicitante.findByCnes", query = "SELECT u FROM UnidadeSolicitante u WHERE u.cnes = :cnes"),
    @NamedQuery(name = "UnidadeSolicitante.findByNome", query = "SELECT u FROM UnidadeSolicitante u WHERE u.nome = :nome"),
    @NamedQuery(name = "UnidadeSolicitante.findByResponsavel", query = "SELECT u FROM UnidadeSolicitante u WHERE u.responsavel = :responsavel")})
public class UnidadeSolicitante implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_UNISOLICITANTE")
    private Integer codUnisolicitante;
    @Column(name = "CNES")
    private Integer cnes;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "RESPONSAVEL")
    private String responsavel;
//    @OneToMany(mappedBy = "codUnisolicitante", fetch = FetchType.EAGER)
//    private List<AgendaexaMaster> agendaexaMasterList;
//    @OneToMany(mappedBy = "codUnisolicitante", fetch = FetchType.EAGER)
//    private List<Agendaexa> agendaexaList;

    public UnidadeSolicitante() {
    }

    public UnidadeSolicitante(Integer codUnisolicitante) {
        this.codUnisolicitante = codUnisolicitante;
    }

    public Integer getCodUnisolicitante() {
        return codUnisolicitante;
    }

    public void setCodUnisolicitante(Integer codUnisolicitante) {
        this.codUnisolicitante = codUnisolicitante;
    }

    public Integer getCnes() {
        return cnes;
    }

    public void setCnes(Integer cnes) {
        this.cnes = cnes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

//    @XmlTransient
//    public List<AgendaexaMaster> getAgendaexaMasterList() {
//        return agendaexaMasterList;
//    }
//
//    public void setAgendaexaMasterList(List<AgendaexaMaster> agendaexaMasterList) {
//        this.agendaexaMasterList = agendaexaMasterList;
//    }

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
        hash += (codUnisolicitante != null ? codUnisolicitante.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnidadeSolicitante)) {
            return false;
        }
        UnidadeSolicitante other = (UnidadeSolicitante) object;
        if ((this.codUnisolicitante == null && other.codUnisolicitante != null) || (this.codUnisolicitante != null && !this.codUnisolicitante.equals(other.codUnisolicitante))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.UnidadeSolicitante[ codUnisolicitante=" + codUnisolicitante + " ]";
    }
    
}
