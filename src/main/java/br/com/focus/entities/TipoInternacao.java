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
@Table(name = "TIPO_INTERNACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoInternacao.findAll", query = "SELECT t FROM TipoInternacao t"),
    @NamedQuery(name = "TipoInternacao.findByCodTipoInternacao", query = "SELECT t FROM TipoInternacao t WHERE t.codTipoInternacao = :codTipoInternacao"),
    @NamedQuery(name = "TipoInternacao.findByDescricao", query = "SELECT t FROM TipoInternacao t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "TipoInternacao.findByCodTipointernacao", query = "SELECT t FROM TipoInternacao t WHERE t.codTipointernacao = :codTipointernacao")})
public class TipoInternacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Cod_Tipo_Internacao")
    private Integer codTipoInternacao;
    @Column(name = "Descricao")
    private String descricao;
    @Column(name = "COD_TIPOINTERNACAO")
    private String codTipointernacao;
    @OneToMany(mappedBy = "codTipoInternacao", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList;

    public TipoInternacao() {
    }

    public TipoInternacao(Integer codTipoInternacao) {
        this.codTipoInternacao = codTipoInternacao;
    }

    public Integer getCodTipoInternacao() {
        return codTipoInternacao;
    }

    public void setCodTipoInternacao(Integer codTipoInternacao) {
        this.codTipoInternacao = codTipoInternacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodTipointernacao() {
        return codTipointernacao;
    }

    public void setCodTipointernacao(String codTipointernacao) {
        this.codTipointernacao = codTipointernacao;
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
        hash += (codTipoInternacao != null ? codTipoInternacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoInternacao)) {
            return false;
        }
        TipoInternacao other = (TipoInternacao) object;
        if ((this.codTipoInternacao == null && other.codTipoInternacao != null) || (this.codTipoInternacao != null && !this.codTipoInternacao.equals(other.codTipoInternacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.TipoInternacao[ codTipoInternacao=" + codTipoInternacao + " ]";
    }
    
}
