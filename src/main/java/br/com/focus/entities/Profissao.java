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
@Table(name = "PROFISSAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profissao.findAll", query = "SELECT p FROM Profissao p"),
    @NamedQuery(name = "Profissao.findByCodPfs", query = "SELECT p FROM Profissao p WHERE p.codPfs = :codPfs"),
    @NamedQuery(name = "Profissao.findByDescricao", query = "SELECT p FROM Profissao p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Profissao.findBySigla", query = "SELECT p FROM Profissao p WHERE p.sigla = :sigla"),
    @NamedQuery(name = "Profissao.findByEspecialidade", query = "SELECT p FROM Profissao p WHERE p.especialidade = :especialidade"),
    @NamedQuery(name = "Profissao.findByAgenda", query = "SELECT p FROM Profissao p WHERE p.agenda = :agenda"),
    @NamedQuery(name = "Profissao.findByTipo", query = "SELECT p FROM Profissao p WHERE p.tipo = :tipo"),
    @NamedQuery(name = "Profissao.findByCondutor", query = "SELECT p FROM Profissao p WHERE p.condutor = :condutor")})
public class Profissao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PFS")
    private Integer codPfs;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "SIGLA")
    private String sigla;
    @Column(name = "ESPECIALIDADE")
    private String especialidade;
    @Column(name = "AGENDA")
    private String agenda;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "CONDUTOR")
    private String condutor;
    @OneToMany(mappedBy = "codPfs", fetch = FetchType.EAGER)
    private List<Profissionais> profissionaisList;

    public Profissao() {
    }

    public Profissao(Integer codPfs) {
        this.codPfs = codPfs;
    }

    public Integer getCodPfs() {
        return codPfs;
    }

    public void setCodPfs(Integer codPfs) {
        this.codPfs = codPfs;
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

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getAgenda() {
        return agenda;
    }

    public void setAgenda(String agenda) {
        this.agenda = agenda;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCondutor() {
        return condutor;
    }

    public void setCondutor(String condutor) {
        this.condutor = condutor;
    }

    @XmlTransient
    public List<Profissionais> getProfissionaisList() {
        return profissionaisList;
    }

    public void setProfissionaisList(List<Profissionais> profissionaisList) {
        this.profissionaisList = profissionaisList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codPfs != null ? codPfs.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profissao)) {
            return false;
        }
        Profissao other = (Profissao) object;
        if ((this.codPfs == null && other.codPfs != null) || (this.codPfs != null && !this.codPfs.equals(other.codPfs))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Profissao[ codPfs=" + codPfs + " ]";
    }
    
}
