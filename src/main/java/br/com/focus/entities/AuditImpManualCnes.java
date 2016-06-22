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
@Table(name = "AUDIT_IMP_MANUAL_CNES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AuditImpManualCnes.findAll", query = "SELECT a FROM AuditImpManualCnes a"),
    @NamedQuery(name = "AuditImpManualCnes.findByCodAuditImp", query = "SELECT a FROM AuditImpManualCnes a WHERE a.codAuditImp = :codAuditImp"),
    @NamedQuery(name = "AuditImpManualCnes.findByNomeUsuImportou", query = "SELECT a FROM AuditImpManualCnes a WHERE a.nomeUsuImportou = :nomeUsuImportou"),
    @NamedQuery(name = "AuditImpManualCnes.findByMaquinaImportou", query = "SELECT a FROM AuditImpManualCnes a WHERE a.maquinaImportou = :maquinaImportou"),
    @NamedQuery(name = "AuditImpManualCnes.findByDataHoraImportou", query = "SELECT a FROM AuditImpManualCnes a WHERE a.dataHoraImportou = :dataHoraImportou"),
    @NamedQuery(name = "AuditImpManualCnes.findByTipo", query = "SELECT a FROM AuditImpManualCnes a WHERE a.tipo = :tipo")})
public class AuditImpManualCnes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_AUDIT_IMP")
    private Integer codAuditImp;
    @Column(name = "NOME_USU_IMPORTOU")
    private String nomeUsuImportou;
    @Column(name = "MAQUINA_IMPORTOU")
    private String maquinaImportou;
    @Column(name = "DATA_HORA_IMPORTOU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraImportou;
    @Column(name = "TIPO")
    private String tipo;
    @OneToMany(mappedBy = "codAuditImp", fetch = FetchType.EAGER)
    private List<Profissionais> profissionaisList;
    @JoinColumn(name = "V_ESUS", referencedColumnName = "COD_IDENTIFICACAO")
    @ManyToOne(fetch = FetchType.EAGER)
    private EsusIdentificacao vEsus;
    @JoinColumn(name = "COD_USU_IMPORTOU", referencedColumnName = "COD_USU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios codUsuImportou;

    public AuditImpManualCnes() {
    }

    public AuditImpManualCnes(Integer codAuditImp) {
        this.codAuditImp = codAuditImp;
    }

    public Integer getCodAuditImp() {
        return codAuditImp;
    }

    public void setCodAuditImp(Integer codAuditImp) {
        this.codAuditImp = codAuditImp;
    }

    public String getNomeUsuImportou() {
        return nomeUsuImportou;
    }

    public void setNomeUsuImportou(String nomeUsuImportou) {
        this.nomeUsuImportou = nomeUsuImportou;
    }

    public String getMaquinaImportou() {
        return maquinaImportou;
    }

    public void setMaquinaImportou(String maquinaImportou) {
        this.maquinaImportou = maquinaImportou;
    }

    public Date getDataHoraImportou() {
        return dataHoraImportou;
    }

    public void setDataHoraImportou(Date dataHoraImportou) {
        this.dataHoraImportou = dataHoraImportou;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public List<Profissionais> getProfissionaisList() {
        return profissionaisList;
    }

    public void setProfissionaisList(List<Profissionais> profissionaisList) {
        this.profissionaisList = profissionaisList;
    }

    public EsusIdentificacao getVEsus() {
        return vEsus;
    }

    public void setVEsus(EsusIdentificacao vEsus) {
        this.vEsus = vEsus;
    }

    public Usuarios getCodUsuImportou() {
        return codUsuImportou;
    }

    public void setCodUsuImportou(Usuarios codUsuImportou) {
        this.codUsuImportou = codUsuImportou;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAuditImp != null ? codAuditImp.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AuditImpManualCnes)) {
            return false;
        }
        AuditImpManualCnes other = (AuditImpManualCnes) object;
        if ((this.codAuditImp == null && other.codAuditImp != null) || (this.codAuditImp != null && !this.codAuditImp.equals(other.codAuditImp))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.AuditImpManualCnes[ codAuditImp=" + codAuditImp + " ]";
    }
    
}
