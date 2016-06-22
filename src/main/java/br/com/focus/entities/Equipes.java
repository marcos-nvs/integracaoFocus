/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author F12684146896
 */
@Entity
@Table(name = "EQUIPES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equipes.findAll", query = "SELECT e FROM Equipes e"),
    @NamedQuery(name = "Equipes.findByCodEquipe", query = "SELECT e FROM Equipes e WHERE e.codEquipe = :codEquipe"),
    @NamedQuery(name = "Equipes.findByCodIbge", query = "SELECT e FROM Equipes e WHERE e.codIbge = :codIbge"),
    @NamedQuery(name = "Equipes.findByCodUni", query = "SELECT e FROM Equipes e WHERE e.codUni = :codUni"),
    @NamedQuery(name = "Equipes.findByCodigo", query = "SELECT e FROM Equipes e WHERE e.codigo = :codigo"),
    @NamedQuery(name = "Equipes.findByCodArea", query = "SELECT e FROM Equipes e WHERE e.codArea = :codArea"),
    @NamedQuery(name = "Equipes.findByNome", query = "SELECT e FROM Equipes e WHERE e.nome = :nome"),
    @NamedQuery(name = "Equipes.findByTipo", query = "SELECT e FROM Equipes e WHERE e.tipo = :tipo"),
    @NamedQuery(name = "Equipes.findByDtVigenciaInicial", query = "SELECT e FROM Equipes e WHERE e.dtVigenciaInicial = :dtVigenciaInicial"),
    @NamedQuery(name = "Equipes.findByDtVigenciaFinal", query = "SELECT e FROM Equipes e WHERE e.dtVigenciaFinal = :dtVigenciaFinal")})
public class Equipes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_EQUIPE")
    private Integer codEquipe;
    @Column(name = "COD_IBGE")
    private String codIbge;
    @Column(name = "COD_UNI")
    private Integer codUni;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "COD_AREA")
    private String codArea;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "TIPO")
    private String tipo;
    @Column(name = "DT_VIGENCIA_INICIAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVigenciaInicial;
    @Column(name = "DT_VIGENCIA_FINAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVigenciaFinal;
    @OneToMany(mappedBy = "codEquipe", fetch = FetchType.EAGER)
    private List<Bpaitens> bpaitensList;

    public Equipes() {
    }

    public Equipes(Integer codEquipe) {
        this.codEquipe = codEquipe;
    }

    public Integer getCodEquipe() {
        return codEquipe;
    }

    public void setCodEquipe(Integer codEquipe) {
        this.codEquipe = codEquipe;
    }

    public String getCodIbge() {
        return codIbge;
    }

    public void setCodIbge(String codIbge) {
        this.codIbge = codIbge;
    }

    public Integer getCodUni() {
        return codUni;
    }

    public void setCodUni(Integer codUni) {
        this.codUni = codUni;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getCodArea() {
        return codArea;
    }

    public void setCodArea(String codArea) {
        this.codArea = codArea;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Date getDtVigenciaInicial() {
        return dtVigenciaInicial;
    }

    public void setDtVigenciaInicial(Date dtVigenciaInicial) {
        this.dtVigenciaInicial = dtVigenciaInicial;
    }

    public Date getDtVigenciaFinal() {
        return dtVigenciaFinal;
    }

    public void setDtVigenciaFinal(Date dtVigenciaFinal) {
        this.dtVigenciaFinal = dtVigenciaFinal;
    }

    @XmlTransient
    public List<Bpaitens> getBpaitensList() {
        return bpaitensList;
    }

    public void setBpaitensList(List<Bpaitens> bpaitensList) {
        this.bpaitensList = bpaitensList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codEquipe != null ? codEquipe.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equipes)) {
            return false;
        }
        Equipes other = (Equipes) object;
        if ((this.codEquipe == null && other.codEquipe != null) || (this.codEquipe != null && !this.codEquipe.equals(other.codEquipe))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Equipes[ codEquipe=" + codEquipe + " ]";
    }
    
}
