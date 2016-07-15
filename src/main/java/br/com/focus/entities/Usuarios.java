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
@Table(name = "USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuarios.findAll", query = "SELECT u FROM Usuarios u"),
    @NamedQuery(name = "Usuarios.findByCodUsu", query = "SELECT u FROM Usuarios u WHERE u.codUsu = :codUsu"),
    @NamedQuery(name = "Usuarios.findByNome", query = "SELECT u FROM Usuarios u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuarios.findBySenha", query = "SELECT u FROM Usuarios u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuarios.findByNomeComp", query = "SELECT u FROM Usuarios u WHERE u.nomeComp = :nomeComp"),
    @NamedQuery(name = "Usuarios.findByAuditoria", query = "SELECT u FROM Usuarios u WHERE u.auditoria = :auditoria"),
    @NamedQuery(name = "Usuarios.findByAtivo", query = "SELECT u FROM Usuarios u WHERE u.ativo = :ativo"),
    @NamedQuery(name = "Usuarios.findByExpira", query = "SELECT u FROM Usuarios u WHERE u.expira = :expira"),
    @NamedQuery(name = "Usuarios.findByDataExpira", query = "SELECT u FROM Usuarios u WHERE u.dataExpira = :dataExpira"),
    @NamedQuery(name = "Usuarios.findByDataUltSenha", query = "SELECT u FROM Usuarios u WHERE u.dataUltSenha = :dataUltSenha"),
    @NamedQuery(name = "Usuarios.findBySistema", query = "SELECT u FROM Usuarios u WHERE u.sistema = :sistema"),
    @NamedQuery(name = "Usuarios.findByForcatrocasenha", query = "SELECT u FROM Usuarios u WHERE u.forcatrocasenha = :forcatrocasenha"),
    @NamedQuery(name = "Usuarios.findByResetarSenha", query = "SELECT u FROM Usuarios u WHERE u.resetarSenha = :resetarSenha"),
    @NamedQuery(name = "Usuarios.findByPermitirDarPermissao", query = "SELECT u FROM Usuarios u WHERE u.permitirDarPermissao = :permitirDarPermissao")})
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_USU")
    private Integer codUsu;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "SENHA")
    private String senha;
    @Basic(optional = false)
    @Column(name = "NOME_COMP")
    private String nomeComp;
    @Basic(optional = false)
    @Column(name = "AUDITORIA")
    private boolean auditoria;
    @Basic(optional = false)
    @Column(name = "ATIVO")
    private boolean ativo;
    @Column(name = "EXPIRA")
    private Boolean expira;
    @Column(name = "DATA_EXPIRA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataExpira;
    @Column(name = "DATA_ULT_SENHA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltSenha;
    @Column(name = "SISTEMA")
    private Character sistema;
    @Column(name = "FORCATROCASENHA")
    private Boolean forcatrocasenha;
    @Column(name = "RESETAR_SENHA")
    private Boolean resetarSenha;
    @Column(name = "PERMITIR_DAR_PERMISSAO")
    private Boolean permitirDarPermissao;
    @OneToMany(mappedBy = "codUsuUsando", fetch = FetchType.EAGER)
    private List<Labexa> labexaList;
    @OneToMany(mappedBy = "codUsuGerou", fetch = FetchType.EAGER)
    private List<LoteexaColeta> loteexaColetaList;
    @OneToMany(mappedBy = "codUsuConfirmou", fetch = FetchType.EAGER)
    private List<LoteexaColeta> loteexaColetaList1;
    @OneToMany(mappedBy = "codUsuColetou", fetch = FetchType.EAGER)
    private List<AgendaexaColeta> agendaexaColetaList;
    @OneToMany(mappedBy = "codUsuImportou", fetch = FetchType.EAGER)
    private List<AuditImpManualCnes> auditImpManualCnesList;
    @OneToMany(mappedBy = "codUsuUsando", fetch = FetchType.EAGER)
    private List<Cotasexalab> cotasexalabList;
    @JoinColumn(name = "COD_GRUPO_USU", referencedColumnName = "COD_GRUPO_USU")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private GrupoUsuarios codGrupoUsu;
    @JoinColumn(name = "COD_PROF", referencedColumnName = "COD_PROF")
    @ManyToOne(fetch = FetchType.EAGER)
    private Profissionais codProf;
    @OneToMany(mappedBy = "codUsu", fetch = FetchType.EAGER)
    private List<EsusIdentificacao> esusIdentificacaoList;
//    @OneToMany(mappedBy = "codUsuAgendo", fetch = FetchType.EAGER)
//    private List<AgendaexaMaster> agendaexaMasterList;
//    @OneToMany(mappedBy = "codUsu", fetch = FetchType.EAGER)
//    private List<Agendaexa> agendaexaList;
    @OneToMany(mappedBy = "codUsuAddfatura", fetch = FetchType.EAGER)
    private List<Bpaitens> bpaitensList;

    public Usuarios() {
    }

    public Usuarios(Integer codUsu) {
        this.codUsu = codUsu;
    }

    public Usuarios(Integer codUsu, String nome, String nomeComp, boolean auditoria, boolean ativo) {
        this.codUsu = codUsu;
        this.nome = nome;
        this.nomeComp = nomeComp;
        this.auditoria = auditoria;
        this.ativo = ativo;
    }

    public Integer getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Integer codUsu) {
        this.codUsu = codUsu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeComp() {
        return nomeComp;
    }

    public void setNomeComp(String nomeComp) {
        this.nomeComp = nomeComp;
    }

    public boolean getAuditoria() {
        return auditoria;
    }

    public void setAuditoria(boolean auditoria) {
        this.auditoria = auditoria;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public Boolean getExpira() {
        return expira;
    }

    public void setExpira(Boolean expira) {
        this.expira = expira;
    }

    public Date getDataExpira() {
        return dataExpira;
    }

    public void setDataExpira(Date dataExpira) {
        this.dataExpira = dataExpira;
    }

    public Date getDataUltSenha() {
        return dataUltSenha;
    }

    public void setDataUltSenha(Date dataUltSenha) {
        this.dataUltSenha = dataUltSenha;
    }

    public Character getSistema() {
        return sistema;
    }

    public void setSistema(Character sistema) {
        this.sistema = sistema;
    }

    public Boolean getForcatrocasenha() {
        return forcatrocasenha;
    }

    public void setForcatrocasenha(Boolean forcatrocasenha) {
        this.forcatrocasenha = forcatrocasenha;
    }

    public Boolean getResetarSenha() {
        return resetarSenha;
    }

    public void setResetarSenha(Boolean resetarSenha) {
        this.resetarSenha = resetarSenha;
    }

    public Boolean getPermitirDarPermissao() {
        return permitirDarPermissao;
    }

    public void setPermitirDarPermissao(Boolean permitirDarPermissao) {
        this.permitirDarPermissao = permitirDarPermissao;
    }

    @XmlTransient
    public List<Labexa> getLabexaList() {
        return labexaList;
    }

    public void setLabexaList(List<Labexa> labexaList) {
        this.labexaList = labexaList;
    }

    @XmlTransient
    public List<LoteexaColeta> getLoteexaColetaList() {
        return loteexaColetaList;
    }

    public void setLoteexaColetaList(List<LoteexaColeta> loteexaColetaList) {
        this.loteexaColetaList = loteexaColetaList;
    }

    @XmlTransient
    public List<LoteexaColeta> getLoteexaColetaList1() {
        return loteexaColetaList1;
    }

    public void setLoteexaColetaList1(List<LoteexaColeta> loteexaColetaList1) {
        this.loteexaColetaList1 = loteexaColetaList1;
    }

    @XmlTransient
    public List<AgendaexaColeta> getAgendaexaColetaList() {
        return agendaexaColetaList;
    }

    public void setAgendaexaColetaList(List<AgendaexaColeta> agendaexaColetaList) {
        this.agendaexaColetaList = agendaexaColetaList;
    }

    @XmlTransient
    public List<AuditImpManualCnes> getAuditImpManualCnesList() {
        return auditImpManualCnesList;
    }

    public void setAuditImpManualCnesList(List<AuditImpManualCnes> auditImpManualCnesList) {
        this.auditImpManualCnesList = auditImpManualCnesList;
    }

    @XmlTransient
    public List<Cotasexalab> getCotasexalabList() {
        return cotasexalabList;
    }

    public void setCotasexalabList(List<Cotasexalab> cotasexalabList) {
        this.cotasexalabList = cotasexalabList;
    }

    public GrupoUsuarios getCodGrupoUsu() {
        return codGrupoUsu;
    }

    public void setCodGrupoUsu(GrupoUsuarios codGrupoUsu) {
        this.codGrupoUsu = codGrupoUsu;
    }

    public Profissionais getCodProf() {
        return codProf;
    }

    public void setCodProf(Profissionais codProf) {
        this.codProf = codProf;
    }

    @XmlTransient
    public List<EsusIdentificacao> getEsusIdentificacaoList() {
        return esusIdentificacaoList;
    }

    public void setEsusIdentificacaoList(List<EsusIdentificacao> esusIdentificacaoList) {
        this.esusIdentificacaoList = esusIdentificacaoList;
    }

//    @XmlTransient
//    public List<AgendaexaMaster> getAgendaexaMasterList() {
//        return agendaexaMasterList;
//    }
//
//    public void setAgendaexaMasterList(List<AgendaexaMaster> agendaexaMasterList) {
//        this.agendaexaMasterList = agendaexaMasterList;
//    }

//    @XmlTransient
//    public List<Agendaexa> getAgendaexaList() {
//        return agendaexaList;
//    }
//
//    public void setAgendaexaList(List<Agendaexa> agendaexaList) {
//        this.agendaexaList = agendaexaList;
//    }

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
        hash += (codUsu != null ? codUsu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuarios)) {
            return false;
        }
        Usuarios other = (Usuarios) object;
        if ((this.codUsu == null && other.codUsu != null) || (this.codUsu != null && !this.codUsu.equals(other.codUsu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Usuarios[ codUsu=" + codUsu + " ]";
    }
    
}
