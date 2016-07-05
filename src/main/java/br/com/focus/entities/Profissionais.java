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
import javax.persistence.CascadeType;
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
@Table(name = "PROFISSIONAIS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Profissionais.findAll", query = "SELECT p FROM Profissionais p"),
    @NamedQuery(name = "Profissionais.findByCodProf", query = "SELECT p FROM Profissionais p WHERE p.codProf = :codProf"),
    @NamedQuery(name = "Profissionais.findByDtcad", query = "SELECT p FROM Profissionais p WHERE p.dtcad = :dtcad"),
    @NamedQuery(name = "Profissionais.findByNome", query = "SELECT p FROM Profissionais p WHERE p.nome = :nome"),
    @NamedQuery(name = "Profissionais.findBySexo", query = "SELECT p FROM Profissionais p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "Profissionais.findByEndereco", query = "SELECT p FROM Profissionais p WHERE p.endereco = :endereco"),
    @NamedQuery(name = "Profissionais.findByBairro", query = "SELECT p FROM Profissionais p WHERE p.bairro = :bairro"),
    @NamedQuery(name = "Profissionais.findByMunicipio", query = "SELECT p FROM Profissionais p WHERE p.municipio = :municipio"),
    @NamedQuery(name = "Profissionais.findByCep", query = "SELECT p FROM Profissionais p WHERE p.cep = :cep"),
    @NamedQuery(name = "Profissionais.findByNlicenca", query = "SELECT p FROM Profissionais p WHERE p.nlicenca = :nlicenca"),
    @NamedQuery(name = "Profissionais.findByCpf", query = "SELECT p FROM Profissionais p WHERE p.cpf = :cpf"),
    @NamedQuery(name = "Profissionais.findByRg", query = "SELECT p FROM Profissionais p WHERE p.rg = :rg"),
    @NamedQuery(name = "Profissionais.findByDtnasc", query = "SELECT p FROM Profissionais p WHERE p.dtnasc = :dtnasc"),
    @NamedQuery(name = "Profissionais.findByDdd", query = "SELECT p FROM Profissionais p WHERE p.ddd = :ddd"),
    @NamedQuery(name = "Profissionais.findByFoneres", query = "SELECT p FROM Profissionais p WHERE p.foneres = :foneres"),
    @NamedQuery(name = "Profissionais.findByFonecom", query = "SELECT p FROM Profissionais p WHERE p.fonecom = :fonecom"),
    @NamedQuery(name = "Profissionais.findByCelular", query = "SELECT p FROM Profissionais p WHERE p.celular = :celular"),
    @NamedQuery(name = "Profissionais.findByAtivo", query = "SELECT p FROM Profissionais p WHERE p.ativo = :ativo"),
    @NamedQuery(name = "Profissionais.findByConjugue", query = "SELECT p FROM Profissionais p WHERE p.conjugue = :conjugue"),
    @NamedQuery(name = "Profissionais.findByNascconjugue", query = "SELECT p FROM Profissionais p WHERE p.nascconjugue = :nascconjugue"),
    @NamedQuery(name = "Profissionais.findByNum", query = "SELECT p FROM Profissionais p WHERE p.num = :num"),
    @NamedQuery(name = "Profissionais.findByCodArea", query = "SELECT p FROM Profissionais p WHERE p.codArea = :codArea"),
    @NamedQuery(name = "Profissionais.findByCodMicro", query = "SELECT p FROM Profissionais p WHERE p.codMicro = :codMicro"),
    @NamedQuery(name = "Profissionais.findByCns", query = "SELECT p FROM Profissionais p WHERE p.cns = :cns"),
    @NamedQuery(name = "Profissionais.findByNomeusuario", query = "SELECT p FROM Profissionais p WHERE p.nomeusuario = :nomeusuario"),
    @NamedQuery(name = "Profissionais.findByCodLogradouro", query = "SELECT p FROM Profissionais p WHERE p.codLogradouro = :codLogradouro"),
    @NamedQuery(name = "Profissionais.findByCodTipolog", query = "SELECT p FROM Profissionais p WHERE p.codTipolog = :codTipolog"),
    @NamedQuery(name = "Profissionais.findByCoduf", query = "SELECT p FROM Profissionais p WHERE p.coduf = :coduf"),
    @NamedQuery(name = "Profissionais.findByCodCidadao", query = "SELECT p FROM Profissionais p WHERE p.codCidadao = :codCidadao"),
    @NamedQuery(name = "Profissionais.findByTitulo", query = "SELECT p FROM Profissionais p WHERE p.titulo = :titulo"),
    @NamedQuery(name = "Profissionais.findByAtivaPainelSenha", query = "SELECT p FROM Profissionais p WHERE p.ativaPainelSenha = :ativaPainelSenha"),
    @NamedQuery(name = "Profissionais.findByCodUfEmissor", query = "SELECT p FROM Profissionais p WHERE p.codUfEmissor = :codUfEmissor"),
    @NamedQuery(name = "Profissionais.findByEmail", query = "SELECT p FROM Profissionais p WHERE p.email = :email"),
    @NamedQuery(name = "Profissionais.findByComplemento", query = "SELECT p FROM Profissionais p WHERE p.complemento = :complemento"),
    @NamedQuery(name = "Profissionais.findByPontoRef", query = "SELECT p FROM Profissionais p WHERE p.pontoRef = :pontoRef"),
    @NamedQuery(name = "Profissionais.findByCodIbgeMun", query = "SELECT p FROM Profissionais p WHERE p.codIbgeMun = :codIbgeMun"),
    @NamedQuery(name = "Profissionais.findByAvlUsuario", query = "SELECT p FROM Profissionais p WHERE p.avlUsuario = :avlUsuario"),
    @NamedQuery(name = "Profissionais.findByAvlSenha", query = "SELECT p FROM Profissionais p WHERE p.avlSenha = :avlSenha")})
public class Profissionais implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PROF")
    private Integer codProf;
    @Column(name = "DTCAD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtcad;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "MUNICIPIO")
    private String municipio;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "NLICENCA")
    private String nlicenca;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "RG")
    private String rg;
    @Column(name = "DTNASC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnasc;
    @Column(name = "DDD")
    private String ddd;
    @Column(name = "FONERES")
    private String foneres;
    @Column(name = "FONECOM")
    private String fonecom;
    @Column(name = "CELULAR")
    private String celular;
    @Column(name = "ATIVO")
    private String ativo;
    @Column(name = "CONJUGUE")
    private String conjugue;
    @Column(name = "NASCCONJUGUE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nascconjugue;
    @Column(name = "NUM")
    private String num;
    @Column(name = "COD_AREA")
    private Integer codArea;
    @Column(name = "COD_MICRO")
    private Integer codMicro;
    @Column(name = "CNS")
    private String cns;
    @Column(name = "NOMEUSUARIO")
    private String nomeusuario;
    @Column(name = "COD_LOGRADOURO")
    private Integer codLogradouro;
    @Column(name = "COD_TIPOLOG")
    private Integer codTipolog;
    @Column(name = "CODUF")
    private String coduf;
    @Column(name = "COD_CIDADAO")
    private Integer codCidadao;
    @Column(name = "TITULO")
    private String titulo;
    @Column(name = "ATIVA_PAINEL_SENHA")
    private Boolean ativaPainelSenha;
    @Column(name = "COD_UF_EMISSOR")
    private String codUfEmissor;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "PONTO_REF")
    private String pontoRef;
    @Column(name = "COD_IBGE_MUN")
    private String codIbgeMun;
    @Column(name = "AVL_USUARIO")
    private String avlUsuario;
    @Column(name = "AVL_SENHA")
    private String avlSenha;
    @JoinColumn(name = "COD_AUDIT_IMP", referencedColumnName = "COD_AUDIT_IMP")
    @ManyToOne(fetch = FetchType.EAGER)
    private AuditImpManualCnes codAuditImp;
    @JoinColumn(name = "COD_CONSELHO", referencedColumnName = "COD_CONSELHO")
    @ManyToOne(fetch = FetchType.EAGER)
    private ConselhoClasse codConselho;
    @JoinColumn(name = "V_ESUS", referencedColumnName = "COD_IDENTIFICACAO")
    @ManyToOne(fetch = FetchType.EAGER)
    private EsusIdentificacao vEsus;
    @JoinColumn(name = "COD_PFS", referencedColumnName = "COD_PFS")
    @ManyToOne(fetch = FetchType.EAGER)
    private Profissao codPfs;
    @OneToMany(mappedBy = "codProf", fetch = FetchType.EAGER)
    private List<Usuarios> usuariosList;
    @OneToMany(mappedBy = "codProfAuto", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList;
    @OneToMany(mappedBy = "codProfSolic", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList1;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codProf", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList2;
    @OneToMany(mappedBy = "codProfAlta", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList3;
//    @OneToMany(mappedBy = "codProf", fetch = FetchType.EAGER)
//    private List<AgendaexaMaster> agendaexaMasterList;
    @OneToMany(mappedBy = "codProf", fetch = FetchType.EAGER)
    private List<Agendaexa> agendaexaList;

    public Profissionais() {
    }

    public Profissionais(Integer codProf) {
        this.codProf = codProf;
    }

    public Integer getCodProf() {
        return codProf;
    }

    public void setCodProf(Integer codProf) {
        this.codProf = codProf;
    }

    public Date getDtcad() {
        return dtcad;
    }

    public void setDtcad(Date dtcad) {
        this.dtcad = dtcad;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNlicenca() {
        return nlicenca;
    }

    public void setNlicenca(String nlicenca) {
        this.nlicenca = nlicenca;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Date getDtnasc() {
        return dtnasc;
    }

    public void setDtnasc(Date dtnasc) {
        this.dtnasc = dtnasc;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getFoneres() {
        return foneres;
    }

    public void setFoneres(String foneres) {
        this.foneres = foneres;
    }

    public String getFonecom() {
        return fonecom;
    }

    public void setFonecom(String fonecom) {
        this.fonecom = fonecom;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getAtivo() {
        return ativo;
    }

    public void setAtivo(String ativo) {
        this.ativo = ativo;
    }

    public String getConjugue() {
        return conjugue;
    }

    public void setConjugue(String conjugue) {
        this.conjugue = conjugue;
    }

    public Date getNascconjugue() {
        return nascconjugue;
    }

    public void setNascconjugue(Date nascconjugue) {
        this.nascconjugue = nascconjugue;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public Integer getCodArea() {
        return codArea;
    }

    public void setCodArea(Integer codArea) {
        this.codArea = codArea;
    }

    public Integer getCodMicro() {
        return codMicro;
    }

    public void setCodMicro(Integer codMicro) {
        this.codMicro = codMicro;
    }

    public String getCns() {
        return cns;
    }

    public void setCns(String cns) {
        this.cns = cns;
    }

    public String getNomeusuario() {
        return nomeusuario;
    }

    public void setNomeusuario(String nomeusuario) {
        this.nomeusuario = nomeusuario;
    }

    public Integer getCodLogradouro() {
        return codLogradouro;
    }

    public void setCodLogradouro(Integer codLogradouro) {
        this.codLogradouro = codLogradouro;
    }

    public Integer getCodTipolog() {
        return codTipolog;
    }

    public void setCodTipolog(Integer codTipolog) {
        this.codTipolog = codTipolog;
    }

    public String getCoduf() {
        return coduf;
    }

    public void setCoduf(String coduf) {
        this.coduf = coduf;
    }

    public Integer getCodCidadao() {
        return codCidadao;
    }

    public void setCodCidadao(Integer codCidadao) {
        this.codCidadao = codCidadao;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean getAtivaPainelSenha() {
        return ativaPainelSenha;
    }

    public void setAtivaPainelSenha(Boolean ativaPainelSenha) {
        this.ativaPainelSenha = ativaPainelSenha;
    }

    public String getCodUfEmissor() {
        return codUfEmissor;
    }

    public void setCodUfEmissor(String codUfEmissor) {
        this.codUfEmissor = codUfEmissor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getPontoRef() {
        return pontoRef;
    }

    public void setPontoRef(String pontoRef) {
        this.pontoRef = pontoRef;
    }

    public String getCodIbgeMun() {
        return codIbgeMun;
    }

    public void setCodIbgeMun(String codIbgeMun) {
        this.codIbgeMun = codIbgeMun;
    }

    public String getAvlUsuario() {
        return avlUsuario;
    }

    public void setAvlUsuario(String avlUsuario) {
        this.avlUsuario = avlUsuario;
    }

    public String getAvlSenha() {
        return avlSenha;
    }

    public void setAvlSenha(String avlSenha) {
        this.avlSenha = avlSenha;
    }

    public AuditImpManualCnes getCodAuditImp() {
        return codAuditImp;
    }

    public void setCodAuditImp(AuditImpManualCnes codAuditImp) {
        this.codAuditImp = codAuditImp;
    }

    public ConselhoClasse getCodConselho() {
        return codConselho;
    }

    public void setCodConselho(ConselhoClasse codConselho) {
        this.codConselho = codConselho;
    }

    public EsusIdentificacao getVEsus() {
        return vEsus;
    }

    public void setVEsus(EsusIdentificacao vEsus) {
        this.vEsus = vEsus;
    }

    public Profissao getCodPfs() {
        return codPfs;
    }

    public void setCodPfs(Profissao codPfs) {
        this.codPfs = codPfs;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @XmlTransient
    public List<Internacao> getInternacaoList() {
        return internacaoList;
    }

    public void setInternacaoList(List<Internacao> internacaoList) {
        this.internacaoList = internacaoList;
    }

    @XmlTransient
    public List<Internacao> getInternacaoList1() {
        return internacaoList1;
    }

    public void setInternacaoList1(List<Internacao> internacaoList1) {
        this.internacaoList1 = internacaoList1;
    }

    @XmlTransient
    public List<Internacao> getInternacaoList2() {
        return internacaoList2;
    }

    public void setInternacaoList2(List<Internacao> internacaoList2) {
        this.internacaoList2 = internacaoList2;
    }

    @XmlTransient
    public List<Internacao> getInternacaoList3() {
        return internacaoList3;
    }

    public void setInternacaoList3(List<Internacao> internacaoList3) {
        this.internacaoList3 = internacaoList3;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProf != null ? codProf.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profissionais)) {
            return false;
        }
        Profissionais other = (Profissionais) object;
        if ((this.codProf == null && other.codProf != null) || (this.codProf != null && !this.codProf.equals(other.codProf))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Profissionais[ codProf=" + codProf + " ]";
    }
    
}
