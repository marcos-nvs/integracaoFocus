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
@Table(name = "PROCEDIMENTO_UNIF")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcedimentoUnif.findAll", query = "SELECT p FROM ProcedimentoUnif p"),
    @NamedQuery(name = "ProcedimentoUnif.findByCodProcunif", query = "SELECT p FROM ProcedimentoUnif p WHERE p.codProcunif = :codProcunif"),
    @NamedQuery(name = "ProcedimentoUnif.findByNome", query = "SELECT p FROM ProcedimentoUnif p WHERE p.nome = :nome"),
    @NamedQuery(name = "ProcedimentoUnif.findByCodGrupo", query = "SELECT p FROM ProcedimentoUnif p WHERE p.codGrupo = :codGrupo"),
    @NamedQuery(name = "ProcedimentoUnif.findByCodSubgru", query = "SELECT p FROM ProcedimentoUnif p WHERE p.codSubgru = :codSubgru"),
    @NamedQuery(name = "ProcedimentoUnif.findByCodForma", query = "SELECT p FROM ProcedimentoUnif p WHERE p.codForma = :codForma"),
    @NamedQuery(name = "ProcedimentoUnif.findByCodOrigem", query = "SELECT p FROM ProcedimentoUnif p WHERE p.codOrigem = :codOrigem"),
    @NamedQuery(name = "ProcedimentoUnif.findByCodPesq1", query = "SELECT p FROM ProcedimentoUnif p WHERE p.codPesq1 = :codPesq1"),
    @NamedQuery(name = "ProcedimentoUnif.findByCodPesq2", query = "SELECT p FROM ProcedimentoUnif p WHERE p.codPesq2 = :codPesq2"),
    @NamedQuery(name = "ProcedimentoUnif.findByModAtendi", query = "SELECT p FROM ProcedimentoUnif p WHERE p.modAtendi = :modAtendi"),
    @NamedQuery(name = "ProcedimentoUnif.findByComplexida", query = "SELECT p FROM ProcedimentoUnif p WHERE p.complexida = :complexida"),
    @NamedQuery(name = "ProcedimentoUnif.findByExigeAuto", query = "SELECT p FROM ProcedimentoUnif p WHERE p.exigeAuto = :exigeAuto"),
    @NamedQuery(name = "ProcedimentoUnif.findByDiasPerma", query = "SELECT p FROM ProcedimentoUnif p WHERE p.diasPerma = :diasPerma"),
    @NamedQuery(name = "ProcedimentoUnif.findByAdmTratC", query = "SELECT p FROM ProcedimentoUnif p WHERE p.admTratC = :admTratC"),
    @NamedQuery(name = "ProcedimentoUnif.findByPtosAto", query = "SELECT p FROM ProcedimentoUnif p WHERE p.ptosAto = :ptosAto"),
    @NamedQuery(name = "ProcedimentoUnif.findByQtdeMaxim", query = "SELECT p FROM ProcedimentoUnif p WHERE p.qtdeMaxim = :qtdeMaxim"),
    @NamedQuery(name = "ProcedimentoUnif.findByAdmAneste", query = "SELECT p FROM ProcedimentoUnif p WHERE p.admAneste = :admAneste"),
    @NamedQuery(name = "ProcedimentoUnif.findByVlrSa", query = "SELECT p FROM ProcedimentoUnif p WHERE p.vlrSa = :vlrSa"),
    @NamedQuery(name = "ProcedimentoUnif.findByVlrSh", query = "SELECT p FROM ProcedimentoUnif p WHERE p.vlrSh = :vlrSh"),
    @NamedQuery(name = "ProcedimentoUnif.findByVlrSp", query = "SELECT p FROM ProcedimentoUnif p WHERE p.vlrSp = :vlrSp"),
    @NamedQuery(name = "ProcedimentoUnif.findByVlrSadt", query = "SELECT p FROM ProcedimentoUnif p WHERE p.vlrSadt = :vlrSadt"),
    @NamedQuery(name = "ProcedimentoUnif.findByVlrToth", query = "SELECT p FROM ProcedimentoUnif p WHERE p.vlrToth = :vlrToth"),
    @NamedQuery(name = "ProcedimentoUnif.findByVlrTota", query = "SELECT p FROM ProcedimentoUnif p WHERE p.vlrTota = :vlrTota"),
    @NamedQuery(name = "ProcedimentoUnif.findByNumPortI", query = "SELECT p FROM ProcedimentoUnif p WHERE p.numPortI = :numPortI"),
    @NamedQuery(name = "ProcedimentoUnif.findByDtVigIni", query = "SELECT p FROM ProcedimentoUnif p WHERE p.dtVigIni = :dtVigIni"),
    @NamedQuery(name = "ProcedimentoUnif.findByNumPortF", query = "SELECT p FROM ProcedimentoUnif p WHERE p.numPortF = :numPortF"),
    @NamedQuery(name = "ProcedimentoUnif.findByDtVigFim", query = "SELECT p FROM ProcedimentoUnif p WHERE p.dtVigFim = :dtVigFim"),
    @NamedQuery(name = "ProcedimentoUnif.findByIdadeMin", query = "SELECT p FROM ProcedimentoUnif p WHERE p.idadeMin = :idadeMin"),
    @NamedQuery(name = "ProcedimentoUnif.findByIdadeMax", query = "SELECT p FROM ProcedimentoUnif p WHERE p.idadeMax = :idadeMax"),
    @NamedQuery(name = "ProcedimentoUnif.findByTpFinanci", query = "SELECT p FROM ProcedimentoUnif p WHERE p.tpFinanci = :tpFinanci"),
    @NamedQuery(name = "ProcedimentoUnif.findByEspecial", query = "SELECT p FROM ProcedimentoUnif p WHERE p.especial = :especial"),
    @NamedQuery(name = "ProcedimentoUnif.findByUsuarioIn", query = "SELECT p FROM ProcedimentoUnif p WHERE p.usuarioIn = :usuarioIn"),
    @NamedQuery(name = "ProcedimentoUnif.findByDatahoraI", query = "SELECT p FROM ProcedimentoUnif p WHERE p.datahoraI = :datahoraI"),
    @NamedQuery(name = "ProcedimentoUnif.findByUsuarioAl", query = "SELECT p FROM ProcedimentoUnif p WHERE p.usuarioAl = :usuarioAl"),
    @NamedQuery(name = "ProcedimentoUnif.findByDatahoraA", query = "SELECT p FROM ProcedimentoUnif p WHERE p.datahoraA = :datahoraA"),
    @NamedQuery(name = "ProcedimentoUnif.findBySexo", query = "SELECT p FROM ProcedimentoUnif p WHERE p.sexo = :sexo"),
    @NamedQuery(name = "ProcedimentoUnif.findByPermanenci", query = "SELECT p FROM ProcedimentoUnif p WHERE p.permanenci = :permanenci"),
    @NamedQuery(name = "ProcedimentoUnif.findByDescricao", query = "SELECT p FROM ProcedimentoUnif p WHERE p.descricao = :descricao"),
    @NamedQuery(name = "ProcedimentoUnif.findByCnrac", query = "SELECT p FROM ProcedimentoUnif p WHERE p.cnrac = :cnrac"),
    @NamedQuery(name = "ProcedimentoUnif.findByCodproc", query = "SELECT p FROM ProcedimentoUnif p WHERE p.codproc = :codproc"),
    @NamedQuery(name = "ProcedimentoUnif.findByUrgencia", query = "SELECT p FROM ProcedimentoUnif p WHERE p.urgencia = :urgencia"),
    @NamedQuery(name = "ProcedimentoUnif.findByValidaIda", query = "SELECT p FROM ProcedimentoUnif p WHERE p.validaIda = :validaIda"),
    @NamedQuery(name = "ProcedimentoUnif.findByCodigo", query = "SELECT p FROM ProcedimentoUnif p WHERE p.codigo = :codigo"),
    @NamedQuery(name = "ProcedimentoUnif.findById", query = "SELECT p FROM ProcedimentoUnif p WHERE p.id = :id"),
    @NamedQuery(name = "ProcedimentoUnif.findByDtCompetencia", query = "SELECT p FROM ProcedimentoUnif p WHERE p.dtCompetencia = :dtCompetencia"),
    @NamedQuery(name = "ProcedimentoUnif.findByQtTempoPermanencia", query = "SELECT p FROM ProcedimentoUnif p WHERE p.qtTempoPermanencia = :qtTempoPermanencia")})
public class ProcedimentoUnif implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PROCUNIF")
    private Integer codProcunif;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "COD_GRUPO")
    private String codGrupo;
    @Column(name = "COD_SUBGRU")
    private String codSubgru;
    @Column(name = "COD_FORMA_")
    private String codForma;
    @Column(name = "COD_ORIGEM")
    private String codOrigem;
    @Column(name = "COD_PESQ_1")
    private String codPesq1;
    @Column(name = "COD_PESQ_2")
    private String codPesq2;
    @Column(name = "MOD_ATENDI")
    private String modAtendi;
    @Column(name = "COMPLEXIDA")
    private String complexida;
    @Column(name = "EXIGE_AUTO")
    private String exigeAuto;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "DIAS_PERMA")
    private Double diasPerma;
    @Column(name = "ADM_TRAT_C")
    private String admTratC;
    @Column(name = "PTOS_ATO")
    private String ptosAto;
    @Column(name = "QTDE_MAXIM")
    private Double qtdeMaxim;
    @Column(name = "ADM_ANESTE")
    private String admAneste;
    @Column(name = "VLR_SA")
    private Double vlrSa;
    @Column(name = "VLR_SH")
    private Double vlrSh;
    @Column(name = "VLR_SP")
    private Double vlrSp;
    @Column(name = "VLR_SADT")
    private Double vlrSadt;
    @Column(name = "VLR_TOTH")
    private Double vlrToth;
    @Column(name = "VLR_TOTA")
    private Double vlrTota;
    @Column(name = "NUM_PORT_I")
    private String numPortI;
    @Column(name = "DT_VIG_INI")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVigIni;
    @Column(name = "NUM_PORT_F")
    private String numPortF;
    @Column(name = "DT_VIG_FIM")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtVigFim;
    @Column(name = "IDADE_MIN")
    private Double idadeMin;
    @Column(name = "IDADE_MAX")
    private Double idadeMax;
    @Column(name = "TP_FINANCI")
    private String tpFinanci;
    @Column(name = "ESPECIAL")
    private String especial;
    @Column(name = "USUARIO_IN")
    private String usuarioIn;
    @Column(name = "DATAHORA_I")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahoraI;
    @Column(name = "USUARIO_AL")
    private String usuarioAl;
    @Column(name = "DATAHORA_A")
    @Temporal(TemporalType.TIMESTAMP)
    private Date datahoraA;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "PERMANENCI")
    private String permanenci;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "CNRAC")
    private String cnrac;
    @Column(name = "CODPROC")
    private String codproc;
    @Column(name = "URGENCIA")
    private String urgencia;
    @Column(name = "VALIDA_IDA")
    private String validaIda;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "ID")
    private Integer id;
    @Column(name = "DT_COMPETENCIA")
    private String dtCompetencia;
    @Column(name = "QT_TEMPO_PERMANENCIA")
    private Integer qtTempoPermanencia;
    @JoinColumn(name = "COD_RUBRICA", referencedColumnName = "COD_RUBRICA")
    @ManyToOne(fetch = FetchType.EAGER)
    private Rubrica codRubrica;
    @JoinColumn(name = "COD_TERMO", referencedColumnName = "COD_TERMO")
    @ManyToOne(fetch = FetchType.EAGER)
    private Termo codTermo;
    @OneToMany(mappedBy = "codProcUnif", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList;
    @OneToMany(mappedBy = "codProcunifRealiz", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList1;
    @OneToMany(mappedBy = "codProcunif", fetch = FetchType.EAGER)
    private List<Bpaitens> bpaitensList;

    public ProcedimentoUnif() {
    }

    public ProcedimentoUnif(Integer codProcunif) {
        this.codProcunif = codProcunif;
    }

    public Integer getCodProcunif() {
        return codProcunif;
    }

    public void setCodProcunif(Integer codProcunif) {
        this.codProcunif = codProcunif;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodGrupo() {
        return codGrupo;
    }

    public void setCodGrupo(String codGrupo) {
        this.codGrupo = codGrupo;
    }

    public String getCodSubgru() {
        return codSubgru;
    }

    public void setCodSubgru(String codSubgru) {
        this.codSubgru = codSubgru;
    }

    public String getCodForma() {
        return codForma;
    }

    public void setCodForma(String codForma) {
        this.codForma = codForma;
    }

    public String getCodOrigem() {
        return codOrigem;
    }

    public void setCodOrigem(String codOrigem) {
        this.codOrigem = codOrigem;
    }

    public String getCodPesq1() {
        return codPesq1;
    }

    public void setCodPesq1(String codPesq1) {
        this.codPesq1 = codPesq1;
    }

    public String getCodPesq2() {
        return codPesq2;
    }

    public void setCodPesq2(String codPesq2) {
        this.codPesq2 = codPesq2;
    }

    public String getModAtendi() {
        return modAtendi;
    }

    public void setModAtendi(String modAtendi) {
        this.modAtendi = modAtendi;
    }

    public String getComplexida() {
        return complexida;
    }

    public void setComplexida(String complexida) {
        this.complexida = complexida;
    }

    public String getExigeAuto() {
        return exigeAuto;
    }

    public void setExigeAuto(String exigeAuto) {
        this.exigeAuto = exigeAuto;
    }

    public Double getDiasPerma() {
        return diasPerma;
    }

    public void setDiasPerma(Double diasPerma) {
        this.diasPerma = diasPerma;
    }

    public String getAdmTratC() {
        return admTratC;
    }

    public void setAdmTratC(String admTratC) {
        this.admTratC = admTratC;
    }

    public String getPtosAto() {
        return ptosAto;
    }

    public void setPtosAto(String ptosAto) {
        this.ptosAto = ptosAto;
    }

    public Double getQtdeMaxim() {
        return qtdeMaxim;
    }

    public void setQtdeMaxim(Double qtdeMaxim) {
        this.qtdeMaxim = qtdeMaxim;
    }

    public String getAdmAneste() {
        return admAneste;
    }

    public void setAdmAneste(String admAneste) {
        this.admAneste = admAneste;
    }

    public Double getVlrSa() {
        return vlrSa;
    }

    public void setVlrSa(Double vlrSa) {
        this.vlrSa = vlrSa;
    }

    public Double getVlrSh() {
        return vlrSh;
    }

    public void setVlrSh(Double vlrSh) {
        this.vlrSh = vlrSh;
    }

    public Double getVlrSp() {
        return vlrSp;
    }

    public void setVlrSp(Double vlrSp) {
        this.vlrSp = vlrSp;
    }

    public Double getVlrSadt() {
        return vlrSadt;
    }

    public void setVlrSadt(Double vlrSadt) {
        this.vlrSadt = vlrSadt;
    }

    public Double getVlrToth() {
        return vlrToth;
    }

    public void setVlrToth(Double vlrToth) {
        this.vlrToth = vlrToth;
    }

    public Double getVlrTota() {
        return vlrTota;
    }

    public void setVlrTota(Double vlrTota) {
        this.vlrTota = vlrTota;
    }

    public String getNumPortI() {
        return numPortI;
    }

    public void setNumPortI(String numPortI) {
        this.numPortI = numPortI;
    }

    public Date getDtVigIni() {
        return dtVigIni;
    }

    public void setDtVigIni(Date dtVigIni) {
        this.dtVigIni = dtVigIni;
    }

    public String getNumPortF() {
        return numPortF;
    }

    public void setNumPortF(String numPortF) {
        this.numPortF = numPortF;
    }

    public Date getDtVigFim() {
        return dtVigFim;
    }

    public void setDtVigFim(Date dtVigFim) {
        this.dtVigFim = dtVigFim;
    }

    public Double getIdadeMin() {
        return idadeMin;
    }

    public void setIdadeMin(Double idadeMin) {
        this.idadeMin = idadeMin;
    }

    public Double getIdadeMax() {
        return idadeMax;
    }

    public void setIdadeMax(Double idadeMax) {
        this.idadeMax = idadeMax;
    }

    public String getTpFinanci() {
        return tpFinanci;
    }

    public void setTpFinanci(String tpFinanci) {
        this.tpFinanci = tpFinanci;
    }

    public String getEspecial() {
        return especial;
    }

    public void setEspecial(String especial) {
        this.especial = especial;
    }

    public String getUsuarioIn() {
        return usuarioIn;
    }

    public void setUsuarioIn(String usuarioIn) {
        this.usuarioIn = usuarioIn;
    }

    public Date getDatahoraI() {
        return datahoraI;
    }

    public void setDatahoraI(Date datahoraI) {
        this.datahoraI = datahoraI;
    }

    public String getUsuarioAl() {
        return usuarioAl;
    }

    public void setUsuarioAl(String usuarioAl) {
        this.usuarioAl = usuarioAl;
    }

    public Date getDatahoraA() {
        return datahoraA;
    }

    public void setDatahoraA(Date datahoraA) {
        this.datahoraA = datahoraA;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPermanenci() {
        return permanenci;
    }

    public void setPermanenci(String permanenci) {
        this.permanenci = permanenci;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCnrac() {
        return cnrac;
    }

    public void setCnrac(String cnrac) {
        this.cnrac = cnrac;
    }

    public String getCodproc() {
        return codproc;
    }

    public void setCodproc(String codproc) {
        this.codproc = codproc;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(String urgencia) {
        this.urgencia = urgencia;
    }

    public String getValidaIda() {
        return validaIda;
    }

    public void setValidaIda(String validaIda) {
        this.validaIda = validaIda;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDtCompetencia() {
        return dtCompetencia;
    }

    public void setDtCompetencia(String dtCompetencia) {
        this.dtCompetencia = dtCompetencia;
    }

    public Integer getQtTempoPermanencia() {
        return qtTempoPermanencia;
    }

    public void setQtTempoPermanencia(Integer qtTempoPermanencia) {
        this.qtTempoPermanencia = qtTempoPermanencia;
    }

    public Rubrica getCodRubrica() {
        return codRubrica;
    }

    public void setCodRubrica(Rubrica codRubrica) {
        this.codRubrica = codRubrica;
    }

    public Termo getCodTermo() {
        return codTermo;
    }

    public void setCodTermo(Termo codTermo) {
        this.codTermo = codTermo;
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
    public List<Bpaitens> getBpaitensList() {
        return bpaitensList;
    }

    public void setBpaitensList(List<Bpaitens> bpaitensList) {
        this.bpaitensList = bpaitensList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProcunif != null ? codProcunif.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcedimentoUnif)) {
            return false;
        }
        ProcedimentoUnif other = (ProcedimentoUnif) object;
        if ((this.codProcunif == null && other.codProcunif != null) || (this.codProcunif != null && !this.codProcunif.equals(other.codProcunif))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.ProcedimentoUnif[ codProcunif=" + codProcunif + " ]";
    }
    
}
