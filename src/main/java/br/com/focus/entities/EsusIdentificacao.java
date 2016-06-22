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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ESUS_IDENTIFICACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EsusIdentificacao.findAll", query = "SELECT e FROM EsusIdentificacao e"),
    @NamedQuery(name = "EsusIdentificacao.findByCodIdentificacao", query = "SELECT e FROM EsusIdentificacao e WHERE e.codIdentificacao = :codIdentificacao"),
    @NamedQuery(name = "EsusIdentificacao.findByData", query = "SELECT e FROM EsusIdentificacao e WHERE e.data = :data"),
    @NamedQuery(name = "EsusIdentificacao.findByOrigem", query = "SELECT e FROM EsusIdentificacao e WHERE e.origem = :origem"),
    @NamedQuery(name = "EsusIdentificacao.findByDestino", query = "SELECT e FROM EsusIdentificacao e WHERE e.destino = :destino"),
    @NamedQuery(name = "EsusIdentificacao.findByCodIbgeMun", query = "SELECT e FROM EsusIdentificacao e WHERE e.codIbgeMun = :codIbgeMun"),
    @NamedQuery(name = "EsusIdentificacao.findByNomeUsu", query = "SELECT e FROM EsusIdentificacao e WHERE e.nomeUsu = :nomeUsu"),
    @NamedQuery(name = "EsusIdentificacao.findByMaquina", query = "SELECT e FROM EsusIdentificacao e WHERE e.maquina = :maquina"),
    @NamedQuery(name = "EsusIdentificacao.findByDataHora", query = "SELECT e FROM EsusIdentificacao e WHERE e.dataHora = :dataHora")})
public class EsusIdentificacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_IDENTIFICACAO")
    private Integer codIdentificacao;
    @Column(name = "DATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Column(name = "ORIGEM")
    private String origem;
    @Column(name = "DESTINO")
    private String destino;
    @Column(name = "COD_IBGE_MUN")
    private String codIbgeMun;
    @Column(name = "NOME_USU")
    private String nomeUsu;
    @Column(name = "MAQUINA")
    private String maquina;
    @Column(name = "DATA_HORA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHora;
    @OneToMany(mappedBy = "vEsus", fetch = FetchType.EAGER)
    private List<Profissionais> profissionaisList;
    @OneToMany(mappedBy = "vEsus", fetch = FetchType.EAGER)
    private List<AuditImpManualCnes> auditImpManualCnesList;
    @JoinColumn(name = "COD_USU", referencedColumnName = "COD_USU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios codUsu;

    public EsusIdentificacao() {
    }

    public EsusIdentificacao(Integer codIdentificacao) {
        this.codIdentificacao = codIdentificacao;
    }

    public Integer getCodIdentificacao() {
        return codIdentificacao;
    }

    public void setCodIdentificacao(Integer codIdentificacao) {
        this.codIdentificacao = codIdentificacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getCodIbgeMun() {
        return codIbgeMun;
    }

    public void setCodIbgeMun(String codIbgeMun) {
        this.codIbgeMun = codIbgeMun;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    @XmlTransient
    public List<Profissionais> getProfissionaisList() {
        return profissionaisList;
    }

    public void setProfissionaisList(List<Profissionais> profissionaisList) {
        this.profissionaisList = profissionaisList;
    }

    @XmlTransient
    public List<AuditImpManualCnes> getAuditImpManualCnesList() {
        return auditImpManualCnesList;
    }

    public void setAuditImpManualCnesList(List<AuditImpManualCnes> auditImpManualCnesList) {
        this.auditImpManualCnesList = auditImpManualCnesList;
    }

    public Usuarios getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Usuarios codUsu) {
        this.codUsu = codUsu;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codIdentificacao != null ? codIdentificacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EsusIdentificacao)) {
            return false;
        }
        EsusIdentificacao other = (EsusIdentificacao) object;
        if ((this.codIdentificacao == null && other.codIdentificacao != null) || (this.codIdentificacao != null && !this.codIdentificacao.equals(other.codIdentificacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.EsusIdentificacao[ codIdentificacao=" + codIdentificacao + " ]";
    }
    
}
