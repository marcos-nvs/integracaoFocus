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
import javax.persistence.JoinColumns;
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
@Table(name = "BPAITENS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Bpaitens.findAll", query = "SELECT b FROM Bpaitens b"),
    @NamedQuery(name = "Bpaitens.findByCodBpaiten", query = "SELECT b FROM Bpaitens b WHERE b.codBpaiten = :codBpaiten"),
    @NamedQuery(name = "Bpaitens.findByMesano", query = "SELECT b FROM Bpaitens b WHERE b.mesano = :mesano"),
    @NamedQuery(name = "Bpaitens.findByCodUni", query = "SELECT b FROM Bpaitens b WHERE b.codUni = :codUni"),
    @NamedQuery(name = "Bpaitens.findByCarater", query = "SELECT b FROM Bpaitens b WHERE b.carater = :carater"),
    @NamedQuery(name = "Bpaitens.findByNautoriza", query = "SELECT b FROM Bpaitens b WHERE b.nautoriza = :nautoriza"),
    @NamedQuery(name = "Bpaitens.findByCodigocid", query = "SELECT b FROM Bpaitens b WHERE b.codigocid = :codigocid"),
    @NamedQuery(name = "Bpaitens.findByIdade", query = "SELECT b FROM Bpaitens b WHERE b.idade = :idade"),
    @NamedQuery(name = "Bpaitens.findByData", query = "SELECT b FROM Bpaitens b WHERE b.data = :data"),
    @NamedQuery(name = "Bpaitens.findByProcedimento", query = "SELECT b FROM Bpaitens b WHERE b.procedimento = :procedimento"),
    @NamedQuery(name = "Bpaitens.findByPabFae", query = "SELECT b FROM Bpaitens b WHERE b.pabFae = :pabFae"),
    @NamedQuery(name = "Bpaitens.findByIndividual", query = "SELECT b FROM Bpaitens b WHERE b.individual = :individual"),
    @NamedQuery(name = "Bpaitens.findByQuantidade", query = "SELECT b FROM Bpaitens b WHERE b.quantidade = :quantidade"),
    @NamedQuery(name = "Bpaitens.findBySus", query = "SELECT b FROM Bpaitens b WHERE b.sus = :sus"),
    @NamedQuery(name = "Bpaitens.findByNome", query = "SELECT b FROM Bpaitens b WHERE b.nome = :nome"),
    @NamedQuery(name = "Bpaitens.findByDtNasc", query = "SELECT b FROM Bpaitens b WHERE b.dtNasc = :dtNasc"),
    @NamedQuery(name = "Bpaitens.findBySexo", query = "SELECT b FROM Bpaitens b WHERE b.sexo = :sexo"),
    @NamedQuery(name = "Bpaitens.findByCodibge", query = "SELECT b FROM Bpaitens b WHERE b.codibge = :codibge"),
    @NamedQuery(name = "Bpaitens.findByCodRacacor", query = "SELECT b FROM Bpaitens b WHERE b.codRacacor = :codRacacor"),
    @NamedQuery(name = "Bpaitens.findByTipoFAAFAO", query = "SELECT b FROM Bpaitens b WHERE b.tipoFAAFAO = :tipoFAAFAO"),
    @NamedQuery(name = "Bpaitens.findByCompletado", query = "SELECT b FROM Bpaitens b WHERE b.completado = :completado"),
    @NamedQuery(name = "Bpaitens.findByCodProf", query = "SELECT b FROM Bpaitens b WHERE b.codProf = :codProf"),
    @NamedQuery(name = "Bpaitens.findByCnsProf", query = "SELECT b FROM Bpaitens b WHERE b.cnsProf = :cnsProf"),
    @NamedQuery(name = "Bpaitens.findByCodPro", query = "SELECT b FROM Bpaitens b WHERE b.codPro = :codPro"),
    @NamedQuery(name = "Bpaitens.findBySoro", query = "SELECT b FROM Bpaitens b WHERE b.soro = :soro"),
    @NamedQuery(name = "Bpaitens.findByCodigoEtnia", query = "SELECT b FROM Bpaitens b WHERE b.codigoEtnia = :codigoEtnia"),
    @NamedQuery(name = "Bpaitens.findByCodNacionalidade", query = "SELECT b FROM Bpaitens b WHERE b.codNacionalidade = :codNacionalidade"),
    @NamedQuery(name = "Bpaitens.findByNacionalidade", query = "SELECT b FROM Bpaitens b WHERE b.nacionalidade = :nacionalidade"),
    @NamedQuery(name = "Bpaitens.findByVersaoCruza", query = "SELECT b FROM Bpaitens b WHERE b.versaoCruza = :versaoCruza"),
    @NamedQuery(name = "Bpaitens.findByFaturada", query = "SELECT b FROM Bpaitens b WHERE b.faturada = :faturada"),
    @NamedQuery(name = "Bpaitens.findByLotesGerados", query = "SELECT b FROM Bpaitens b WHERE b.lotesGerados = :lotesGerados"),
    @NamedQuery(name = "Bpaitens.findByCodServico", query = "SELECT b FROM Bpaitens b WHERE b.codServico = :codServico"),
    @NamedQuery(name = "Bpaitens.findByTipoProced", query = "SELECT b FROM Bpaitens b WHERE b.tipoProced = :tipoProced"),
    @NamedQuery(name = "Bpaitens.findByCodAreaEquipe", query = "SELECT b FROM Bpaitens b WHERE b.codAreaEquipe = :codAreaEquipe"),
    @NamedQuery(name = "Bpaitens.findByCnpjOpm", query = "SELECT b FROM Bpaitens b WHERE b.cnpjOpm = :cnpjOpm"),
    @NamedQuery(name = "Bpaitens.findByCodigoEquipe", query = "SELECT b FROM Bpaitens b WHERE b.codigoEquipe = :codigoEquipe"),
    @NamedQuery(name = "Bpaitens.findByDeficiente", query = "SELECT b FROM Bpaitens b WHERE b.deficiente = :deficiente"),
    @NamedQuery(name = "Bpaitens.findByMesanoFatura", query = "SELECT b FROM Bpaitens b WHERE b.mesanoFatura = :mesanoFatura"),
    @NamedQuery(name = "Bpaitens.findByDataAddfatura", query = "SELECT b FROM Bpaitens b WHERE b.dataAddfatura = :dataAddfatura"),
    @NamedQuery(name = "Bpaitens.findByMaqAddfatura", query = "SELECT b FROM Bpaitens b WHERE b.maqAddfatura = :maqAddfatura")})
public class Bpaitens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_BPAITEN")
    private Integer codBpaiten;
    @Column(name = "MESANO")
    private String mesano;
    @Column(name = "COD_UNI")
    private Integer codUni;
    @Column(name = "CARATER")
    private String carater;
    @Column(name = "NAUTORIZA")
    private String nautoriza;
    @Column(name = "CODIGOCID")
    private String codigocid;
    @Column(name = "IDADE")
    private Integer idade;
    @Column(name = "Data")
    @Temporal(TemporalType.TIMESTAMP)
    private Date data;
    @Column(name = "PROCEDIMENTO")
    private String procedimento;
    @Column(name = "PAB_FAE")
    private String pabFae;
    @Column(name = "INDIVIDUAL")
    private Boolean individual;
    @Column(name = "QUANTIDADE")
    private Integer quantidade;
    @Column(name = "SUS")
    private String sus;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "DT_NASC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNasc;
    @Column(name = "SEXO")
    private Character sexo;
    @Column(name = "CODIBGE")
    private String codibge;
    @Column(name = "COD_RACACOR")
    private String codRacacor;
    @Column(name = "Tipo_FAA_FAO")
    private Character tipoFAAFAO;
    @Column(name = "COMPLETADO")
    private Boolean completado;
    @Column(name = "COD_PROF")
    private Integer codProf;
    @Column(name = "CNS_PROF")
    private String cnsProf;
    @Column(name = "COD_PRO")
    private String codPro;
    @Column(name = "SORO")
    private Boolean soro;
    @Column(name = "CODIGO_ETNIA")
    private String codigoEtnia;
    @Column(name = "COD_NACIONALIDADE")
    private String codNacionalidade;
    @Column(name = "NACIONALIDADE")
    private String nacionalidade;
    @Column(name = "VERSAO_CRUZA")
    private String versaoCruza;
    @Column(name = "FATURADA")
    private Boolean faturada;
    @Column(name = "LOTES_GERADOS")
    private String lotesGerados;
    @Column(name = "COD_SERVICO")
    private String codServico;
    @Column(name = "TIPO_PROCED")
    private Character tipoProced;
    @Column(name = "COD_AREA_EQUIPE")
    private String codAreaEquipe;
    @Column(name = "CNPJ_OPM")
    private String cnpjOpm;
    @Column(name = "CODIGO_EQUIPE")
    private String codigoEquipe;
    @Column(name = "DEFICIENTE")
    private Boolean deficiente;
    @Column(name = "MESANO_FATURA")
    private String mesanoFatura;
    @Column(name = "DATA_ADDFATURA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAddfatura;
    @Column(name = "MAQ_ADDFATURA")
    private String maqAddfatura;
    @OneToMany(mappedBy = "codBpaiten", fetch = FetchType.EAGER)
    private List<Agendaexa> agendaexaList;
    @JoinColumn(name = "COD_CBO", referencedColumnName = "COD_CBO")
    @ManyToOne(fetch = FetchType.EAGER)
    private CboUnif codCbo;
    @JoinColumn(name = "CID1", referencedColumnName = "COD_CID")
    @ManyToOne(fetch = FetchType.EAGER)
    private Cid cid1;
    @JoinColumn(name = "COD_EMPRESA_OPM", referencedColumnName = "COD_EMPRESA")
    @ManyToOne(fetch = FetchType.EAGER)
    private EmpresasOpm codEmpresaOpm;
    @JoinColumn(name = "COD_EQUIPE", referencedColumnName = "COD_EQUIPE")
    @ManyToOne(fetch = FetchType.EAGER)
    private Equipes codEquipe;
    @JoinColumn(name = "COD_LOTE_FATURA", referencedColumnName = "COD_LOTE_FATURA")
    @ManyToOne(fetch = FetchType.EAGER)
    private LoteFatura codLoteFatura;
    @JoinColumn(name = "COD_PROCUNIF", referencedColumnName = "COD_PROCUNIF")
    @ManyToOne(fetch = FetchType.EAGER)
    private ProcedimentoUnif codProcunif;
    @JoinColumns({
        @JoinColumn(name = "COD_SER", referencedColumnName = "COD_SER"),
        @JoinColumn(name = "COD_CLASSIFICACAO", referencedColumnName = "COD_CLASSIFICACAO")})
    @ManyToOne(fetch = FetchType.EAGER)
    private ServicoClassificacao servicoClassificacao;
    @JoinColumn(name = "COD_USU_ADDFATURA", referencedColumnName = "COD_USU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios codUsuAddfatura;

    public Bpaitens() {
    }

    public Bpaitens(Integer codBpaiten) {
        this.codBpaiten = codBpaiten;
    }

    public Integer getCodBpaiten() {
        return codBpaiten;
    }

    public void setCodBpaiten(Integer codBpaiten) {
        this.codBpaiten = codBpaiten;
    }

    public String getMesano() {
        return mesano;
    }

    public void setMesano(String mesano) {
        this.mesano = mesano;
    }

    public Integer getCodUni() {
        return codUni;
    }

    public void setCodUni(Integer codUni) {
        this.codUni = codUni;
    }

    public String getCarater() {
        return carater;
    }

    public void setCarater(String carater) {
        this.carater = carater;
    }

    public String getNautoriza() {
        return nautoriza;
    }

    public void setNautoriza(String nautoriza) {
        this.nautoriza = nautoriza;
    }

    public String getCodigocid() {
        return codigocid;
    }

    public void setCodigocid(String codigocid) {
        this.codigocid = codigocid;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getPabFae() {
        return pabFae;
    }

    public void setPabFae(String pabFae) {
        this.pabFae = pabFae;
    }

    public Boolean getIndividual() {
        return individual;
    }

    public void setIndividual(Boolean individual) {
        this.individual = individual;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public String getSus() {
        return sus;
    }

    public void setSus(String sus) {
        this.sus = sus;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDtNasc() {
        return dtNasc;
    }

    public void setDtNasc(Date dtNasc) {
        this.dtNasc = dtNasc;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public String getCodibge() {
        return codibge;
    }

    public void setCodibge(String codibge) {
        this.codibge = codibge;
    }

    public String getCodRacacor() {
        return codRacacor;
    }

    public void setCodRacacor(String codRacacor) {
        this.codRacacor = codRacacor;
    }

    public Character getTipoFAAFAO() {
        return tipoFAAFAO;
    }

    public void setTipoFAAFAO(Character tipoFAAFAO) {
        this.tipoFAAFAO = tipoFAAFAO;
    }

    public Boolean getCompletado() {
        return completado;
    }

    public void setCompletado(Boolean completado) {
        this.completado = completado;
    }

    public Integer getCodProf() {
        return codProf;
    }

    public void setCodProf(Integer codProf) {
        this.codProf = codProf;
    }

    public String getCnsProf() {
        return cnsProf;
    }

    public void setCnsProf(String cnsProf) {
        this.cnsProf = cnsProf;
    }

    public String getCodPro() {
        return codPro;
    }

    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    public Boolean getSoro() {
        return soro;
    }

    public void setSoro(Boolean soro) {
        this.soro = soro;
    }

    public String getCodigoEtnia() {
        return codigoEtnia;
    }

    public void setCodigoEtnia(String codigoEtnia) {
        this.codigoEtnia = codigoEtnia;
    }

    public String getCodNacionalidade() {
        return codNacionalidade;
    }

    public void setCodNacionalidade(String codNacionalidade) {
        this.codNacionalidade = codNacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getVersaoCruza() {
        return versaoCruza;
    }

    public void setVersaoCruza(String versaoCruza) {
        this.versaoCruza = versaoCruza;
    }

    public Boolean getFaturada() {
        return faturada;
    }

    public void setFaturada(Boolean faturada) {
        this.faturada = faturada;
    }

    public String getLotesGerados() {
        return lotesGerados;
    }

    public void setLotesGerados(String lotesGerados) {
        this.lotesGerados = lotesGerados;
    }

    public String getCodServico() {
        return codServico;
    }

    public void setCodServico(String codServico) {
        this.codServico = codServico;
    }

    public Character getTipoProced() {
        return tipoProced;
    }

    public void setTipoProced(Character tipoProced) {
        this.tipoProced = tipoProced;
    }

    public String getCodAreaEquipe() {
        return codAreaEquipe;
    }

    public void setCodAreaEquipe(String codAreaEquipe) {
        this.codAreaEquipe = codAreaEquipe;
    }

    public String getCnpjOpm() {
        return cnpjOpm;
    }

    public void setCnpjOpm(String cnpjOpm) {
        this.cnpjOpm = cnpjOpm;
    }

    public String getCodigoEquipe() {
        return codigoEquipe;
    }

    public void setCodigoEquipe(String codigoEquipe) {
        this.codigoEquipe = codigoEquipe;
    }

    public Boolean getDeficiente() {
        return deficiente;
    }

    public void setDeficiente(Boolean deficiente) {
        this.deficiente = deficiente;
    }

    public String getMesanoFatura() {
        return mesanoFatura;
    }

    public void setMesanoFatura(String mesanoFatura) {
        this.mesanoFatura = mesanoFatura;
    }

    public Date getDataAddfatura() {
        return dataAddfatura;
    }

    public void setDataAddfatura(Date dataAddfatura) {
        this.dataAddfatura = dataAddfatura;
    }

    public String getMaqAddfatura() {
        return maqAddfatura;
    }

    public void setMaqAddfatura(String maqAddfatura) {
        this.maqAddfatura = maqAddfatura;
    }

    @XmlTransient
    public List<Agendaexa> getAgendaexaList() {
        return agendaexaList;
    }

    public void setAgendaexaList(List<Agendaexa> agendaexaList) {
        this.agendaexaList = agendaexaList;
    }

    public CboUnif getCodCbo() {
        return codCbo;
    }

    public void setCodCbo(CboUnif codCbo) {
        this.codCbo = codCbo;
    }

    public Cid getCid1() {
        return cid1;
    }

    public void setCid1(Cid cid1) {
        this.cid1 = cid1;
    }

    public EmpresasOpm getCodEmpresaOpm() {
        return codEmpresaOpm;
    }

    public void setCodEmpresaOpm(EmpresasOpm codEmpresaOpm) {
        this.codEmpresaOpm = codEmpresaOpm;
    }

    public Equipes getCodEquipe() {
        return codEquipe;
    }

    public void setCodEquipe(Equipes codEquipe) {
        this.codEquipe = codEquipe;
    }

    public LoteFatura getCodLoteFatura() {
        return codLoteFatura;
    }

    public void setCodLoteFatura(LoteFatura codLoteFatura) {
        this.codLoteFatura = codLoteFatura;
    }

    public ProcedimentoUnif getCodProcunif() {
        return codProcunif;
    }

    public void setCodProcunif(ProcedimentoUnif codProcunif) {
        this.codProcunif = codProcunif;
    }

    public ServicoClassificacao getServicoClassificacao() {
        return servicoClassificacao;
    }

    public void setServicoClassificacao(ServicoClassificacao servicoClassificacao) {
        this.servicoClassificacao = servicoClassificacao;
    }

    public Usuarios getCodUsuAddfatura() {
        return codUsuAddfatura;
    }

    public void setCodUsuAddfatura(Usuarios codUsuAddfatura) {
        this.codUsuAddfatura = codUsuAddfatura;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codBpaiten != null ? codBpaiten.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Bpaitens)) {
            return false;
        }
        Bpaitens other = (Bpaitens) object;
        if ((this.codBpaiten == null && other.codBpaiten != null) || (this.codBpaiten != null && !this.codBpaiten.equals(other.codBpaiten))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Bpaitens[ codBpaiten=" + codBpaiten + " ]";
    }
    
}
