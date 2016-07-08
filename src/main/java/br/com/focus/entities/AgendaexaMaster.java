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
import javax.persistence.Lob;
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
 * @author Marcos Naves
 */
@Entity
@Table(name = "AGENDAEXA_MASTER")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AgendaexaMaster.findAll", query = "SELECT a FROM AgendaexaMaster a"),
    @NamedQuery(name = "AgendaexaMaster.findByCodAgendaexaMaster", query = "SELECT a FROM AgendaexaMaster a WHERE a.codAgendaexaMaster = :codAgendaexaMaster"),
//    @NamedQuery(name = "AgendaexaMaster.findByNomeProf", query = "SELECT a FROM AgendaexaMaster a WHERE a.nomeProf = :nomeProf"),
//    @NamedQuery(name = "AgendaexaMaster.findByNomePac", query = "SELECT a FROM AgendaexaMaster a WHERE a.nomePac = :nomePac"),
//    @NamedQuery(name = "AgendaexaMaster.findBySexoPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.sexoPac = :sexoPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByDtNascPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.dtNascPac = :dtNascPac"),
//    @NamedQuery(name = "AgendaexaMaster.findBySusPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.susPac = :susPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByPesoPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.pesoPac = :pesoPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByAlturaPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.alturaPac = :alturaPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByDum", query = "SELECT a FROM AgendaexaMaster a WHERE a.dum = :dum"),
//    @NamedQuery(name = "AgendaexaMaster.findByGestante", query = "SELECT a FROM AgendaexaMaster a WHERE a.gestante = :gestante"),
//    @NamedQuery(name = "AgendaexaMaster.findByRecemNascido", query = "SELECT a FROM AgendaexaMaster a WHERE a.recemNascido = :recemNascido"),
//    @NamedQuery(name = "AgendaexaMaster.findByExtInt", query = "SELECT a FROM AgendaexaMaster a WHERE a.extInt = :extInt"),
//    @NamedQuery(name = "AgendaexaMaster.findByCodLab", query = "SELECT a FROM AgendaexaMaster a WHERE a.codLab = :codLab"),
//    @NamedQuery(name = "AgendaexaMaster.findByCodCol", query = "SELECT a FROM AgendaexaMaster a WHERE a.codCol = :codCol"),
//    @NamedQuery(name = "AgendaexaMaster.findByDataExa", query = "SELECT a FROM AgendaexaMaster a WHERE a.dataExa = :dataExa"),
//    @NamedQuery(name = "AgendaexaMaster.findByDataHoraColeta", query = "SELECT a FROM AgendaexaMaster a WHERE a.dataHoraColeta = :dataHoraColeta"),
//    @NamedQuery(name = "AgendaexaMaster.findByCodAla", query = "SELECT a FROM AgendaexaMaster a WHERE a.codAla = :codAla"),
//    @NamedQuery(name = "AgendaexaMaster.findByCodQuarto", query = "SELECT a FROM AgendaexaMaster a WHERE a.codQuarto = :codQuarto"),
//    @NamedQuery(name = "AgendaexaMaster.findByCodLeito", query = "SELECT a FROM AgendaexaMaster a WHERE a.codLeito = :codLeito"),
//    @NamedQuery(name = "AgendaexaMaster.findByCnesInternacao", query = "SELECT a FROM AgendaexaMaster a WHERE a.cnesInternacao = :cnesInternacao"),
//    @NamedQuery(name = "AgendaexaMaster.findByCnesExecutante", query = "SELECT a FROM AgendaexaMaster a WHERE a.cnesExecutante = :cnesExecutante"),
//    @NamedQuery(name = "AgendaexaMaster.findByCnesUniLogada", query = "SELECT a FROM AgendaexaMaster a WHERE a.cnesUniLogada = :cnesUniLogada"),
//    @NamedQuery(name = "AgendaexaMaster.findByColetaTotal", query = "SELECT a FROM AgendaexaMaster a WHERE a.coletaTotal = :coletaTotal"),
//    @NamedQuery(name = "AgendaexaMaster.findByUrgencia", query = "SELECT a FROM AgendaexaMaster a WHERE a.urgencia = :urgencia"),
//    @NamedQuery(name = "AgendaexaMaster.findByProtocoloAge", query = "SELECT a FROM AgendaexaMaster a WHERE a.protocoloAge = :protocoloAge"),
//    @NamedQuery(name = "AgendaexaMaster.findByMaquinaAgendo", query = "SELECT a FROM AgendaexaMaster a WHERE a.maquinaAgendo = :maquinaAgendo"),
//    @NamedQuery(name = "AgendaexaMaster.findByDataHoraAgendo", query = "SELECT a FROM AgendaexaMaster a WHERE a.dataHoraAgendo = :dataHoraAgendo"),
//    @NamedQuery(name = "AgendaexaMaster.findByPermitiNovaColeta", query = "SELECT a FROM AgendaexaMaster a WHERE a.permitiNovaColeta = :permitiNovaColeta"),
//    @NamedQuery(name = "AgendaexaMaster.findByAla", query = "SELECT a FROM AgendaexaMaster a WHERE a.ala = :ala"),
//    @NamedQuery(name = "AgendaexaMaster.findByQuarto", query = "SELECT a FROM AgendaexaMaster a WHERE a.quarto = :quarto"),
//    @NamedQuery(name = "AgendaexaMaster.findByLeito", query = "SELECT a FROM AgendaexaMaster a WHERE a.leito = :leito"),
//    @NamedQuery(name = "AgendaexaMaster.findByCodConv", query = "SELECT a FROM AgendaexaMaster a WHERE a.codConv = :codConv"),
//    @NamedQuery(name = "AgendaexaMaster.findByNomeConv", query = "SELECT a FROM AgendaexaMaster a WHERE a.nomeConv = :nomeConv"),
//    @NamedQuery(name = "AgendaexaMaster.findByCodCid", query = "SELECT a FROM AgendaexaMaster a WHERE a.codCid = :codCid"),
//    @NamedQuery(name = "AgendaexaMaster.findByDescCid", query = "SELECT a FROM AgendaexaMaster a WHERE a.descCid = :descCid"),
//    @NamedQuery(name = "AgendaexaMaster.findByDescrUnisolicitante", query = "SELECT a FROM AgendaexaMaster a WHERE a.descrUnisolicitante = :descrUnisolicitante"),
//    @NamedQuery(name = "AgendaexaMaster.findByNlicenca", query = "SELECT a FROM AgendaexaMaster a WHERE a.nlicenca = :nlicenca"),
//    @NamedQuery(name = "AgendaexaMaster.findByRgPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.rgPac = :rgPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByCpfPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.cpfPac = :cpfPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByNomeResp", query = "SELECT a FROM AgendaexaMaster a WHERE a.nomeResp = :nomeResp"),
//    @NamedQuery(name = "AgendaexaMaster.findByDddFone", query = "SELECT a FROM AgendaexaMaster a WHERE a.dddFone = :dddFone"),
//    @NamedQuery(name = "AgendaexaMaster.findByFonePac", query = "SELECT a FROM AgendaexaMaster a WHERE a.fonePac = :fonePac"),
//    @NamedQuery(name = "AgendaexaMaster.findByDddCel", query = "SELECT a FROM AgendaexaMaster a WHERE a.dddCel = :dddCel"),
//    @NamedQuery(name = "AgendaexaMaster.findByCelPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.celPac = :celPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByCodDomPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.codDomPac = :codDomPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByEnderecoPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.enderecoPac = :enderecoPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByNumEndPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.numEndPac = :numEndPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByBairroPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.bairroPac = :bairroPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByMunicipioPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.municipioPac = :municipioPac"),
//    @NamedQuery(name = "AgendaexaMaster.findByUfPac", query = "SELECT a FROM AgendaexaMaster a WHERE a.ufPac = :ufPac"),
    @NamedQuery(name = "AgendaexaMaster.findByNomeUni", query = "SELECT a FROM AgendaexaMaster a WHERE a.nomeUni = :nomeUni")})
public class AgendaexaMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_AGENDAEXA_MASTER")
    private Integer codAgendaexaMaster;
    @Column(name = "NOME_PROF")
    private String nomeProf;
    @Column(name = "NOME_PAC")
    private String nomePac;
    @Column(name = "SEXO_PAC")
    private Character sexoPac;
    @Column(name = "DT_NASC_PAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtNascPac;
    @Column(name = "SUS_PAC")
    private String susPac;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESO_PAC")
    private Float pesoPac;
    @Column(name = "ALTURA_PAC")
    private Float alturaPac;
    @Column(name = "DUM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dum;
    @Column(name = "GESTANTE")
    private Boolean gestante;
    @Column(name = "RECEM_NASCIDO")
    private Boolean recemNascido;
    @Column(name = "EXT_INT")
    private String extInt;
    @Column(name = "COD_LAB")
    private Integer codLab;
    @Column(name = "COD_COL")
    private Integer codCol;
    @Column(name = "DATA_EXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataExa;
    @Column(name = "DATA_HORA_COLETA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraColeta;
    @Column(name = "COD_ALA")
    private Integer codAla;
    @Column(name = "COD_QUARTO")
    private Integer codQuarto;
    @Column(name = "COD_LEITO")
    private Integer codLeito;
    @Column(name = "CNES_INTERNACAO")
    private Integer cnesInternacao;
    @Column(name = "CNES_EXECUTANTE")
    private Integer cnesExecutante;
    @Column(name = "CNES_UNI_LOGADA")
    private Integer cnesUniLogada;
    @Column(name = "COLETA_TOTAL")
    private Boolean coletaTotal;
    @Column(name = "URGENCIA")
    private Boolean urgencia;
    @Column(name = "PROTOCOLO_AGE")
    private Integer protocoloAge;
    @Column(name = "MAQUINA_AGENDO")
    private String maquinaAgendo;
    @Column(name = "DATA_HORA_AGENDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraAgendo;
    @Column(name = "PERMITI_NOVA_COLETA")
    private Boolean permitiNovaColeta;
    @Column(name = "ALA")
    private String ala;
    @Column(name = "QUARTO")
    private String quarto;
    @Column(name = "LEITO")
    private String leito;
    @Lob
    @Column(name = "INFO_AUX")
    private String infoAux;
    @Lob
    @Column(name = "OBSERVACAO")
    private String observacao;
    @Column(name = "COD_CONV")
    private Integer codConv;
    @Column(name = "NOME_CONV")
    private String nomeConv;
    @Lob
    @Column(name = "HD")
    private String hd;
    @Column(name = "COD_CID")
    private Integer codCid;
    @Column(name = "DESC_CID")
    private String descCid;
    @Column(name = "DESCR_UNISOLICITANTE")
    private String descrUnisolicitante;
    @Column(name = "NLICENCA")
    private String nlicenca;
    @Column(name = "RG_PAC")
    private String rgPac;
    @Column(name = "CPF_PAC")
    private String cpfPac;
    @Column(name = "NOME_RESP")
    private String nomeResp;
    @Column(name = "DDD_FONE")
    private String dddFone;
    @Column(name = "FONE_PAC")
    private String fonePac;
    @Column(name = "DDD_CEL")
    private String dddCel;
    @Column(name = "CEL_PAC")
    private String celPac;
    @Column(name = "COD_DOM_PAC")
    private Integer codDomPac;
    @Column(name = "ENDERECO_PAC")
    private String enderecoPac;
    @Column(name = "NUM_END_PAC")
    private String numEndPac;
    @Column(name = "BAIRRO_PAC")
    private String bairroPac;
    @Column(name = "MUNICIPIO_PAC")
    private String municipioPac;
    @Column(name = "UF_PAC")
    private String ufPac;
    @Column(name = "NOME_UNI")
    private String nomeUni;
    @Column(name = "RETORNO_LAB")
    private String retornoLab;
    
    
//    @OneToMany(mappedBy = "codAgendaexaMaster", fetch = FetchType.EAGER)
//    private List<AgendaexaColeta> agendaexaColetaList;
//    @JoinColumn(name = "COD_INTERN", referencedColumnName = "COD_INTERN")
//    @ManyToOne(fetch = FetchType.EAGER)
//    private Internacao codIntern;
//    @JoinColumn(name = "COD_PRO", referencedColumnName = "COD_PRO")
//    @ManyToOne(fetch = FetchType.EAGER)
//    private Pacientes codPro;
//    @JoinColumn(name = "COD_PROF", referencedColumnName = "COD_PROF")
//    @ManyToOne(fetch = FetchType.EAGER)
//    private Profissionais codProf;
//    @JoinColumn(name = "COD_UNISOLICITANTE", referencedColumnName = "COD_UNISOLICITANTE")
//    @ManyToOne(fetch = FetchType.EAGER)
//    private UnidadeSolicitante codUnisolicitante;
//    @JoinColumn(name = "COD_USU_AGENDO", referencedColumnName = "COD_USU")
//    @ManyToOne(fetch = FetchType.EAGER)
//    private Usuarios codUsuAgendo;
//    @OneToMany(mappedBy = "codAgendaexaMaster", fetch = FetchType.EAGER)
//    private List<Agendaexa> agendaexaList;

    public AgendaexaMaster() {
    }

    public AgendaexaMaster(Integer codAgendaexaMaster) {
        this.codAgendaexaMaster = codAgendaexaMaster;
    }

    public Integer getCodAgendaexaMaster() {
        return codAgendaexaMaster;
    }

    public void setCodAgendaexaMaster(Integer codAgendaexaMaster) {
        this.codAgendaexaMaster = codAgendaexaMaster;
    }

    public String getNomeProf() {
        return nomeProf;
    }

    public void setNomeProf(String nomeProf) {
        this.nomeProf = nomeProf;
    }

    public String getNomePac() {
        return nomePac;
    }

    public void setNomePac(String nomePac) {
        this.nomePac = nomePac;
    }

    public Character getSexoPac() {
        return sexoPac;
    }

    public void setSexoPac(Character sexoPac) {
        this.sexoPac = sexoPac;
    }

    public Date getDtNascPac() {
        return dtNascPac;
    }

    public void setDtNascPac(Date dtNascPac) {
        this.dtNascPac = dtNascPac;
    }

    public String getSusPac() {
        return susPac;
    }

    public void setSusPac(String susPac) {
        this.susPac = susPac;
    }

    public Float getPesoPac() {
        return pesoPac;
    }

    public void setPesoPac(Float pesoPac) {
        this.pesoPac = pesoPac;
    }

    public Float getAlturaPac() {
        return alturaPac;
    }

    public void setAlturaPac(Float alturaPac) {
        this.alturaPac = alturaPac;
    }

    public Date getDum() {
        return dum;
    }

    public void setDum(Date dum) {
        this.dum = dum;
    }

    public Boolean getGestante() {
        return gestante;
    }

    public void setGestante(Boolean gestante) {
        this.gestante = gestante;
    }

    public Boolean getRecemNascido() {
        return recemNascido;
    }

    public void setRecemNascido(Boolean recemNascido) {
        this.recemNascido = recemNascido;
    }

    public String getExtInt() {
        return extInt;
    }

    public void setExtInt(String extInt) {
        this.extInt = extInt;
    }

    public Integer getCodLab() {
        return codLab;
    }

    public void setCodLab(Integer codLab) {
        this.codLab = codLab;
    }

    public Integer getCodCol() {
        return codCol;
    }

    public void setCodCol(Integer codCol) {
        this.codCol = codCol;
    }

    public Date getDataExa() {
        return dataExa;
    }

    public void setDataExa(Date dataExa) {
        this.dataExa = dataExa;
    }

    public Date getDataHoraColeta() {
        return dataHoraColeta;
    }

    public void setDataHoraColeta(Date dataHoraColeta) {
        this.dataHoraColeta = dataHoraColeta;
    }

    public Integer getCodAla() {
        return codAla;
    }

    public void setCodAla(Integer codAla) {
        this.codAla = codAla;
    }

    public Integer getCodQuarto() {
        return codQuarto;
    }

    public void setCodQuarto(Integer codQuarto) {
        this.codQuarto = codQuarto;
    }

    public Integer getCodLeito() {
        return codLeito;
    }

    public void setCodLeito(Integer codLeito) {
        this.codLeito = codLeito;
    }

    public Integer getCnesInternacao() {
        return cnesInternacao;
    }

    public void setCnesInternacao(Integer cnesInternacao) {
        this.cnesInternacao = cnesInternacao;
    }

    public Integer getCnesExecutante() {
        return cnesExecutante;
    }

    public void setCnesExecutante(Integer cnesExecutante) {
        this.cnesExecutante = cnesExecutante;
    }

    public Integer getCnesUniLogada() {
        return cnesUniLogada;
    }

    public void setCnesUniLogada(Integer cnesUniLogada) {
        this.cnesUniLogada = cnesUniLogada;
    }

    public Boolean getColetaTotal() {
        return coletaTotal;
    }

    public void setColetaTotal(Boolean coletaTotal) {
        this.coletaTotal = coletaTotal;
    }

    public Boolean getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(Boolean urgencia) {
        this.urgencia = urgencia;
    }

    public Integer getProtocoloAge() {
        return protocoloAge;
    }

    public void setProtocoloAge(Integer protocoloAge) {
        this.protocoloAge = protocoloAge;
    }

    public String getMaquinaAgendo() {
        return maquinaAgendo;
    }

    public void setMaquinaAgendo(String maquinaAgendo) {
        this.maquinaAgendo = maquinaAgendo;
    }

    public Date getDataHoraAgendo() {
        return dataHoraAgendo;
    }

    public void setDataHoraAgendo(Date dataHoraAgendo) {
        this.dataHoraAgendo = dataHoraAgendo;
    }

    public Boolean getPermitiNovaColeta() {
        return permitiNovaColeta;
    }

    public void setPermitiNovaColeta(Boolean permitiNovaColeta) {
        this.permitiNovaColeta = permitiNovaColeta;
    }

    public String getAla() {
        return ala;
    }

    public void setAla(String ala) {
        this.ala = ala;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public String getLeito() {
        return leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }

    public String getInfoAux() {
        return infoAux;
    }

    public void setInfoAux(String infoAux) {
        this.infoAux = infoAux;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Integer getCodConv() {
        return codConv;
    }

    public void setCodConv(Integer codConv) {
        this.codConv = codConv;
    }

    public String getNomeConv() {
        return nomeConv;
    }

    public void setNomeConv(String nomeConv) {
        this.nomeConv = nomeConv;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public Integer getCodCid() {
        return codCid;
    }

    public void setCodCid(Integer codCid) {
        this.codCid = codCid;
    }

    public String getDescCid() {
        return descCid;
    }

    public void setDescCid(String descCid) {
        this.descCid = descCid;
    }

    public String getDescrUnisolicitante() {
        return descrUnisolicitante;
    }

    public void setDescrUnisolicitante(String descrUnisolicitante) {
        this.descrUnisolicitante = descrUnisolicitante;
    }

    public String getNlicenca() {
        return nlicenca;
    }

    public void setNlicenca(String nlicenca) {
        this.nlicenca = nlicenca;
    }

    public String getRgPac() {
        return rgPac;
    }

    public void setRgPac(String rgPac) {
        this.rgPac = rgPac;
    }

    public String getCpfPac() {
        return cpfPac;
    }

    public void setCpfPac(String cpfPac) {
        this.cpfPac = cpfPac;
    }

    public String getNomeResp() {
        return nomeResp;
    }

    public void setNomeResp(String nomeResp) {
        this.nomeResp = nomeResp;
    }

    public String getDddFone() {
        return dddFone;
    }

    public void setDddFone(String dddFone) {
        this.dddFone = dddFone;
    }

    public String getFonePac() {
        return fonePac;
    }

    public void setFonePac(String fonePac) {
        this.fonePac = fonePac;
    }

    public String getDddCel() {
        return dddCel;
    }

    public void setDddCel(String dddCel) {
        this.dddCel = dddCel;
    }

    public String getCelPac() {
        return celPac;
    }

    public void setCelPac(String celPac) {
        this.celPac = celPac;
    }

    public Integer getCodDomPac() {
        return codDomPac;
    }

    public void setCodDomPac(Integer codDomPac) {
        this.codDomPac = codDomPac;
    }

    public String getEnderecoPac() {
        return enderecoPac;
    }

    public void setEnderecoPac(String enderecoPac) {
        this.enderecoPac = enderecoPac;
    }

    public String getNumEndPac() {
        return numEndPac;
    }

    public void setNumEndPac(String numEndPac) {
        this.numEndPac = numEndPac;
    }

    public String getBairroPac() {
        return bairroPac;
    }

    public void setBairroPac(String bairroPac) {
        this.bairroPac = bairroPac;
    }

    public String getMunicipioPac() {
        return municipioPac;
    }

    public void setMunicipioPac(String municipioPac) {
        this.municipioPac = municipioPac;
    }

    public String getUfPac() {
        return ufPac;
    }

    public void setUfPac(String ufPac) {
        this.ufPac = ufPac;
    }

    public String getNomeUni() {
        return nomeUni;
    }

    public String getRetornoLab() {
        return retornoLab;
    }

    public void setRetornoLab(String retornoLab) {
        this.retornoLab = retornoLab;
    }
    
    
//
//    public void setNomeUni(String nomeUni) {
//        this.nomeUni = nomeUni;
//    }
//
//    @XmlTransient
//    public List<AgendaexaColeta> getAgendaexaColetaList() {
//        return agendaexaColetaList;
//    }
//
//    public void setAgendaexaColetaList(List<AgendaexaColeta> agendaexaColetaList) {
//        this.agendaexaColetaList = agendaexaColetaList;
//    }
//
//    public Internacao getCodIntern() {
//        return codIntern;
//    }
//
//    public void setCodIntern(Internacao codIntern) {
//        this.codIntern = codIntern;
//    }
//
//    public Pacientes getCodPro() {
//        return codPro;
//    }
//
//    public void setCodPro(Pacientes codPro) {
//        this.codPro = codPro;
//    }
//
//    public Profissionais getCodProf() {
//        return codProf;
//    }
//
//    public void setCodProf(Profissionais codProf) {
//        this.codProf = codProf;
//    }
//
//    public UnidadeSolicitante getCodUnisolicitante() {
//        return codUnisolicitante;
//    }
//
//    public void setCodUnisolicitante(UnidadeSolicitante codUnisolicitante) {
//        this.codUnisolicitante = codUnisolicitante;
//    }
//
//    public Usuarios getCodUsuAgendo() {
//        return codUsuAgendo;
//    }
//
//    public void setCodUsuAgendo(Usuarios codUsuAgendo) {
//        this.codUsuAgendo = codUsuAgendo;
//    }
//
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
        hash += (codAgendaexaMaster != null ? codAgendaexaMaster.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AgendaexaMaster)) {
            return false;
        }
        AgendaexaMaster other = (AgendaexaMaster) object;
        if ((this.codAgendaexaMaster == null && other.codAgendaexaMaster != null) || (this.codAgendaexaMaster != null && !this.codAgendaexaMaster.equals(other.codAgendaexaMaster))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.AgendaexaMaster[ codAgendaexaMaster=" + codAgendaexaMaster + " ]";
    }
    
}
