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
@Table(name = "COLETAEXA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Coletaexa.findAll", query = "SELECT c FROM Coletaexa c"),
    @NamedQuery(name = "Coletaexa.findByCodCol", query = "SELECT c FROM Coletaexa c WHERE c.codCol = :codCol"),
    @NamedQuery(name = "Coletaexa.findByNome", query = "SELECT c FROM Coletaexa c WHERE c.nome = :nome"),
    @NamedQuery(name = "Coletaexa.findByTelefone", query = "SELECT c FROM Coletaexa c WHERE c.telefone = :telefone"),
    @NamedQuery(name = "Coletaexa.findByEndereco", query = "SELECT c FROM Coletaexa c WHERE c.endereco = :endereco"),
    @NamedQuery(name = "Coletaexa.findByResponsavel", query = "SELECT c FROM Coletaexa c WHERE c.responsavel = :responsavel")})
public class Coletaexa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_COL")
    private Integer codCol;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "RESPONSAVEL")
    private String responsavel;
    @OneToMany(mappedBy = "codCol", fetch = FetchType.EAGER)
    private List<Agendaexa> agendaexaList;

    public Coletaexa() {
    }

    public Coletaexa(Integer codCol) {
        this.codCol = codCol;
    }

    public Integer getCodCol() {
        return codCol;
    }

    public void setCodCol(Integer codCol) {
        this.codCol = codCol;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
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
        hash += (codCol != null ? codCol.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Coletaexa)) {
            return false;
        }
        Coletaexa other = (Coletaexa) object;
        if ((this.codCol == null && other.codCol != null) || (this.codCol != null && !this.codCol.equals(other.codCol))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Coletaexa[ codCol=" + codCol + " ]";
    }
    
}
