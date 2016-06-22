/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
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
@Table(name = "SERVICO_CLASSIFICACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ServicoClassificacao.findAll", query = "SELECT s FROM ServicoClassificacao s"),
    @NamedQuery(name = "ServicoClassificacao.findByCodSer", query = "SELECT s FROM ServicoClassificacao s WHERE s.servicoClassificacaoPK.codSer = :codSer"),
    @NamedQuery(name = "ServicoClassificacao.findByCodigo", query = "SELECT s FROM ServicoClassificacao s WHERE s.codigo = :codigo"),
    @NamedQuery(name = "ServicoClassificacao.findByCodClassificacao", query = "SELECT s FROM ServicoClassificacao s WHERE s.servicoClassificacaoPK.codClassificacao = :codClassificacao"),
    @NamedQuery(name = "ServicoClassificacao.findByNome", query = "SELECT s FROM ServicoClassificacao s WHERE s.nome = :nome")})
public class ServicoClassificacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ServicoClassificacaoPK servicoClassificacaoPK;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "NOME")
    private String nome;
    @JoinColumn(name = "COD_SER", referencedColumnName = "COD_SER", insertable = false, updatable = false)
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Servicos servicos;
    @OneToMany(mappedBy = "servicoClassificacao", fetch = FetchType.EAGER)
    private List<Bpaitens> bpaitensList;

    public ServicoClassificacao() {
    }

    public ServicoClassificacao(ServicoClassificacaoPK servicoClassificacaoPK) {
        this.servicoClassificacaoPK = servicoClassificacaoPK;
    }

    public ServicoClassificacao(int codSer, String codClassificacao) {
        this.servicoClassificacaoPK = new ServicoClassificacaoPK(codSer, codClassificacao);
    }

    public ServicoClassificacaoPK getServicoClassificacaoPK() {
        return servicoClassificacaoPK;
    }

    public void setServicoClassificacaoPK(ServicoClassificacaoPK servicoClassificacaoPK) {
        this.servicoClassificacaoPK = servicoClassificacaoPK;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Servicos getServicos() {
        return servicos;
    }

    public void setServicos(Servicos servicos) {
        this.servicos = servicos;
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
        hash += (servicoClassificacaoPK != null ? servicoClassificacaoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicoClassificacao)) {
            return false;
        }
        ServicoClassificacao other = (ServicoClassificacao) object;
        if ((this.servicoClassificacaoPK == null && other.servicoClassificacaoPK != null) || (this.servicoClassificacaoPK != null && !this.servicoClassificacaoPK.equals(other.servicoClassificacaoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.ServicoClassificacao[ servicoClassificacaoPK=" + servicoClassificacaoPK + " ]";
    }
    
}
