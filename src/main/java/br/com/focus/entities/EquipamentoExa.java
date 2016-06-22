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
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
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
@Table(name = "EQUIPAMENTO_EXA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EquipamentoExa.findAll", query = "SELECT e FROM EquipamentoExa e"),
    @NamedQuery(name = "EquipamentoExa.findByCodEquipamento", query = "SELECT e FROM EquipamentoExa e WHERE e.codEquipamento = :codEquipamento"),
    @NamedQuery(name = "EquipamentoExa.findByNome", query = "SELECT e FROM EquipamentoExa e WHERE e.nome = :nome"),
    @NamedQuery(name = "EquipamentoExa.findBySigla", query = "SELECT e FROM EquipamentoExa e WHERE e.sigla = :sigla")})
public class EquipamentoExa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_EQUIPAMENTO")
    private Integer codEquipamento;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "SIGLA")
    private String sigla;
    @JoinTable(name = "EXAME_EQUIPAMENTO", joinColumns = {
        @JoinColumn(name = "COD_EQUIPAMENTO", referencedColumnName = "COD_EQUIPAMENTO")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_EXAME", referencedColumnName = "COD_EXAME")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<CadExame> cadExameList;
    @OneToMany(mappedBy = "codEquipamento", fetch = FetchType.EAGER)
    private List<Agendaexa> agendaexaList;

    public EquipamentoExa() {
    }

    public EquipamentoExa(Integer codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public Integer getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(Integer codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        hash += (codEquipamento != null ? codEquipamento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipamentoExa)) {
            return false;
        }
        EquipamentoExa other = (EquipamentoExa) object;
        if ((this.codEquipamento == null && other.codEquipamento != null) || (this.codEquipamento != null && !this.codEquipamento.equals(other.codEquipamento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.EquipamentoExa[ codEquipamento=" + codEquipamento + " ]";
    }
    
}
