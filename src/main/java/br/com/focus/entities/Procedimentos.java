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
import javax.persistence.ManyToOne;
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
@Table(name = "PROCEDIMENTOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Procedimentos.findAll", query = "SELECT p FROM Procedimentos p"),
    @NamedQuery(name = "Procedimentos.findByCodProced", query = "SELECT p FROM Procedimentos p WHERE p.codProced = :codProced"),
    @NamedQuery(name = "Procedimentos.findByCodigo", query = "SELECT p FROM Procedimentos p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "Procedimentos.findByDescricao", query = "SELECT p FROM Procedimentos p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "Procedimentos.findByValor", query = "SELECT p FROM Procedimentos p WHERE p.valor = :valor"),
    @NamedQuery(name = "Procedimentos.findByValortotal", query = "SELECT p FROM Procedimentos p WHERE p.valortotal = :valortotal"),
    @NamedQuery(name = "Procedimentos.findByQuantidade", query = "SELECT p FROM Procedimentos p WHERE p.quantidade = :quantidade"),
    @NamedQuery(name = "Procedimentos.findByStatus", query = "SELECT p FROM Procedimentos p WHERE p.status = :status")})
public class Procedimentos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PROCED")
    private Integer codProced;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRICAO")
    private String descricao;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Float valor;
    @Column(name = "VALORTOTAL")
    private Float valortotal;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private String status;
    @JoinColumn(name = "COD_GRU", referencedColumnName = "COD_GRU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Grupoprocedi codGru;
//    @OneToMany(mappedBy = "codProced", fetch = FetchType.EAGER)
//    private List<Agendaexa> agendaexaList;

    public Procedimentos() {
    }

    public Procedimentos(Integer codProced) {
        this.codProced = codProced;
    }

    public Procedimentos(Integer codProced, String status) {
        this.codProced = codProced;
        this.status = status;
    }

    public Integer getCodProced() {
        return codProced;
    }

    public void setCodProced(Integer codProced) {
        this.codProced = codProced;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Float getValortotal() {
        return valortotal;
    }

    public void setValortotal(Float valortotal) {
        this.valortotal = valortotal;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Grupoprocedi getCodGru() {
        return codGru;
    }

    public void setCodGru(Grupoprocedi codGru) {
        this.codGru = codGru;
    }

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
        hash += (codProced != null ? codProced.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Procedimentos)) {
            return false;
        }
        Procedimentos other = (Procedimentos) object;
        if ((this.codProced == null && other.codProced != null) || (this.codProced != null && !this.codProced.equals(other.codProced))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Procedimentos[ codProced=" + codProced + " ]";
    }
    
}
