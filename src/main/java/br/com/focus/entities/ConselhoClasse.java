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
@Table(name = "CONSELHO_CLASSE")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ConselhoClasse.findAll", query = "SELECT c FROM ConselhoClasse c"),
    @NamedQuery(name = "ConselhoClasse.findByCodConselho", query = "SELECT c FROM ConselhoClasse c WHERE c.codConselho = :codConselho"),
    @NamedQuery(name = "ConselhoClasse.findBySigla", query = "SELECT c FROM ConselhoClasse c WHERE c.sigla = :sigla"),
    @NamedQuery(name = "ConselhoClasse.findByNome", query = "SELECT c FROM ConselhoClasse c WHERE c.nome = :nome"),
    @NamedQuery(name = "ConselhoClasse.findByNomeCurto", query = "SELECT c FROM ConselhoClasse c WHERE c.nomeCurto = :nomeCurto")})
public class ConselhoClasse implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CONSELHO")
    private Integer codConselho;
    @Column(name = "SIGLA")
    private String sigla;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "NOME_CURTO")
    private String nomeCurto;
    @OneToMany(mappedBy = "codConselho", fetch = FetchType.EAGER)
    private List<Profissionais> profissionaisList;

    public ConselhoClasse() {
    }

    public ConselhoClasse(Integer codConselho) {
        this.codConselho = codConselho;
    }

    public Integer getCodConselho() {
        return codConselho;
    }

    public void setCodConselho(Integer codConselho) {
        this.codConselho = codConselho;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNomeCurto() {
        return nomeCurto;
    }

    public void setNomeCurto(String nomeCurto) {
        this.nomeCurto = nomeCurto;
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
        hash += (codConselho != null ? codConselho.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConselhoClasse)) {
            return false;
        }
        ConselhoClasse other = (ConselhoClasse) object;
        if ((this.codConselho == null && other.codConselho != null) || (this.codConselho != null && !this.codConselho.equals(other.codConselho))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.ConselhoClasse[ codConselho=" + codConselho + " ]";
    }
    
}
