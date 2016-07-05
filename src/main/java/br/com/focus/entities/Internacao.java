/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author F12684146896
 */
@Entity
@Table(name = "INTERNACAO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Internacao.findAll", query = "SELECT i FROM Internacao i"),
    @NamedQuery(name = "Internacao.findByCodIntern", query = "SELECT i FROM Internacao i WHERE i.codIntern = :codIntern"),
    @NamedQuery(name = "Internacao.findByAlta", query = "SELECT i FROM Internacao i WHERE i.alta = :alta"),
    @NamedQuery(name = "Internacao.findByPermitirVisita", query = "SELECT i FROM Internacao i WHERE i.permitirVisita = :permitirVisita"),
    @NamedQuery(name = "Internacao.findByModoRegraVisita", query = "SELECT i FROM Internacao i WHERE i.modoRegraVisita = :modoRegraVisita"),
    @NamedQuery(name = "Internacao.findByOrigem", query = "SELECT i FROM Internacao i WHERE i.origem = :origem"),
    @NamedQuery(name = "Internacao.findByLocalOrigemTransf", query = "SELECT i FROM Internacao i WHERE i.localOrigemTransf = :localOrigemTransf"),
    @NamedQuery(name = "Internacao.findByDataHoraInt", query = "SELECT i FROM Internacao i WHERE i.dataHoraInt = :dataHoraInt"),
    @NamedQuery(name = "Internacao.findByDataHoraAlta", query = "SELECT i FROM Internacao i WHERE i.dataHoraAlta = :dataHoraAlta"),
    @NamedQuery(name = "Internacao.findByTransferido", query = "SELECT i FROM Internacao i WHERE i.transferido = :transferido"),
    @NamedQuery(name = "Internacao.findByLocalDestinoTransf", query = "SELECT i FROM Internacao i WHERE i.localDestinoTransf = :localDestinoTransf"),
    @NamedQuery(name = "Internacao.findByNomeEstabSolicit", query = "SELECT i FROM Internacao i WHERE i.nomeEstabSolicit = :nomeEstabSolicit"),
    @NamedQuery(name = "Internacao.findByCnesSolicitante", query = "SELECT i FROM Internacao i WHERE i.cnesSolicitante = :cnesSolicitante"),
    @NamedQuery(name = "Internacao.findByNomeEstabExec", query = "SELECT i FROM Internacao i WHERE i.nomeEstabExec = :nomeEstabExec"),
    @NamedQuery(name = "Internacao.findByCnesExecutante", query = "SELECT i FROM Internacao i WHERE i.cnesExecutante = :cnesExecutante"),
    @NamedQuery(name = "Internacao.findByNomeRespon", query = "SELECT i FROM Internacao i WHERE i.nomeRespon = :nomeRespon"),
    @NamedQuery(name = "Internacao.findByTelContato", query = "SELECT i FROM Internacao i WHERE i.telContato = :telContato"),
    @NamedQuery(name = "Internacao.findByCidprin", query = "SELECT i FROM Internacao i WHERE i.cidprin = :cidprin"),
    @NamedQuery(name = "Internacao.findByCidsec", query = "SELECT i FROM Internacao i WHERE i.cidsec = :cidsec"),
    @NamedQuery(name = "Internacao.findByCidasso", query = "SELECT i FROM Internacao i WHERE i.cidasso = :cidasso"),
    @NamedQuery(name = "Internacao.findByCodProce", query = "SELECT i FROM Internacao i WHERE i.codProce = :codProce"),
    @NamedQuery(name = "Internacao.findByClinica", query = "SELECT i FROM Internacao i WHERE i.clinica = :clinica"),
    @NamedQuery(name = "Internacao.findByDoctip", query = "SELECT i FROM Internacao i WHERE i.doctip = :doctip"),
    @NamedQuery(name = "Internacao.findByDocprof", query = "SELECT i FROM Internacao i WHERE i.docprof = :docprof"),
    @NamedQuery(name = "Internacao.findByProfSolicit", query = "SELECT i FROM Internacao i WHERE i.profSolicit = :profSolicit"),
    @NamedQuery(name = "Internacao.findByAcidTrans", query = "SELECT i FROM Internacao i WHERE i.acidTrans = :acidTrans"),
    @NamedQuery(name = "Internacao.findByAcidTrabTip", query = "SELECT i FROM Internacao i WHERE i.acidTrabTip = :acidTrabTip"),
    @NamedQuery(name = "Internacao.findByAcidTrabTra", query = "SELECT i FROM Internacao i WHERE i.acidTrabTra = :acidTrabTra"),
    @NamedQuery(name = "Internacao.findByCnpjSeg", query = "SELECT i FROM Internacao i WHERE i.cnpjSeg = :cnpjSeg"),
    @NamedQuery(name = "Internacao.findByNumBilhete", query = "SELECT i FROM Internacao i WHERE i.numBilhete = :numBilhete"),
    @NamedQuery(name = "Internacao.findBySerie", query = "SELECT i FROM Internacao i WHERE i.serie = :serie"),
    @NamedQuery(name = "Internacao.findByCnpjEmp", query = "SELECT i FROM Internacao i WHERE i.cnpjEmp = :cnpjEmp"),
    @NamedQuery(name = "Internacao.findByCnaeEmp", query = "SELECT i FROM Internacao i WHERE i.cnaeEmp = :cnaeEmp"),
    @NamedQuery(name = "Internacao.findByCbor", query = "SELECT i FROM Internacao i WHERE i.cbor = :cbor"),
    @NamedQuery(name = "Internacao.findByVinculoPrevi", query = "SELECT i FROM Internacao i WHERE i.vinculoPrevi = :vinculoPrevi"),
    @NamedQuery(name = "Internacao.findByAutorizNome", query = "SELECT i FROM Internacao i WHERE i.autorizNome = :autorizNome"),
    @NamedQuery(name = "Internacao.findByDocAut", query = "SELECT i FROM Internacao i WHERE i.docAut = :docAut"),
    @NamedQuery(name = "Internacao.findByNDocProf", query = "SELECT i FROM Internacao i WHERE i.nDocProf = :nDocProf"),
    @NamedQuery(name = "Internacao.findByDataAut", query = "SELECT i FROM Internacao i WHERE i.dataAut = :dataAut"),
    @NamedQuery(name = "Internacao.findByCidMorte", query = "SELECT i FROM Internacao i WHERE i.cidMorte = :cidMorte"),
    @NamedQuery(name = "Internacao.findByCodModal", query = "SELECT i FROM Internacao i WHERE i.codModal = :codModal"),
    @NamedQuery(name = "Internacao.findByCodProceRealiz", query = "SELECT i FROM Internacao i WHERE i.codProceRealiz = :codProceRealiz"),
    @NamedQuery(name = "Internacao.findByMudancaProcunif", query = "SELECT i FROM Internacao i WHERE i.mudancaProcunif = :mudancaProcunif"),
    @NamedQuery(name = "Internacao.findByFoneContato", query = "SELECT i FROM Internacao i WHERE i.foneContato = :foneContato"),
    @NamedQuery(name = "Internacao.findByCodigoAlta", query = "SELECT i FROM Internacao i WHERE i.codigoAlta = :codigoAlta"),
    @NamedQuery(name = "Internacao.findByProfissaoResp", query = "SELECT i FROM Internacao i WHERE i.profissaoResp = :profissaoResp"),
    @NamedQuery(name = "Internacao.findByEnderecoResp", query = "SELECT i FROM Internacao i WHERE i.enderecoResp = :enderecoResp"),
    @NamedQuery(name = "Internacao.findByCidadeResp", query = "SELECT i FROM Internacao i WHERE i.cidadeResp = :cidadeResp"),
    @NamedQuery(name = "Internacao.findByRgResp", query = "SELECT i FROM Internacao i WHERE i.rgResp = :rgResp"),
    @NamedQuery(name = "Internacao.findByFoneResp", query = "SELECT i FROM Internacao i WHERE i.foneResp = :foneResp"),
    @NamedQuery(name = "Internacao.findByCodLaudoAIH", query = "SELECT i FROM Internacao i WHERE i.codLaudoAIH = :codLaudoAIH"),
    @NamedQuery(name = "Internacao.findByNomeContato", query = "SELECT i FROM Internacao i WHERE i.nomeContato = :nomeContato"),
    @NamedQuery(name = "Internacao.findByTotalDiaria", query = "SELECT i FROM Internacao i WHERE i.totalDiaria = :totalDiaria"),
    @NamedQuery(name = "Internacao.findByTotalMedicamentos", query = "SELECT i FROM Internacao i WHERE i.totalMedicamentos = :totalMedicamentos"),
    @NamedQuery(name = "Internacao.findByTotalMaterialhosp", query = "SELECT i FROM Internacao i WHERE i.totalMaterialhosp = :totalMaterialhosp"),
    @NamedQuery(name = "Internacao.findByTotalExames", query = "SELECT i FROM Internacao i WHERE i.totalExames = :totalExames"),
    @NamedQuery(name = "Internacao.findByTotalDespesas", query = "SELECT i FROM Internacao i WHERE i.totalDespesas = :totalDespesas"),
    @NamedQuery(name = "Internacao.findByCodUni", query = "SELECT i FROM Internacao i WHERE i.codUni = :codUni"),
    @NamedQuery(name = "Internacao.findByDocFoto", query = "SELECT i FROM Internacao i WHERE i.docFoto = :docFoto"),
    @NamedQuery(name = "Internacao.findByAtivo", query = "SELECT i FROM Internacao i WHERE i.ativo = :ativo"),
    @NamedQuery(name = "Internacao.findByUsuarioCancelou", query = "SELECT i FROM Internacao i WHERE i.usuarioCancelou = :usuarioCancelou"),
    @NamedQuery(name = "Internacao.findByDtCancelamento", query = "SELECT i FROM Internacao i WHERE i.dtCancelamento = :dtCancelamento")})
public class Internacao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_INTERN")
    private Integer codIntern;
    @Column(name = "ALTA")
    private Boolean alta;
    @Basic(optional = false)
    @Column(name = "Permitir_Visita")
    private boolean permitirVisita;
    @Basic(optional = false)
    @Column(name = "Modo_Regra_Visita")
    private boolean modoRegraVisita;
    @Basic(optional = false)
    @Column(name = "Origem")
    private Character origem;
    @Column(name = "Local_Origem_Transf")
    private String localOrigemTransf;
    @Column(name = "Data_Hora_Int")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraInt;
    @Column(name = "Data_Hora_Alta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataHoraAlta;
    @Basic(optional = false)
    @Column(name = "Transferido")
    private boolean transferido;
    @Column(name = "Local_Destino_Transf")
    private String localDestinoTransf;
    @Column(name = "Nome_Estab_Solicit")
    private String nomeEstabSolicit;
    @Column(name = "Cnes_Solicitante")
    private String cnesSolicitante;
    @Column(name = "Nome_Estab_Exec")
    private String nomeEstabExec;
    @Column(name = "Cnes_Executante")
    private String cnesExecutante;
    @Column(name = "Nome_Respon")
    private String nomeRespon;
    @Column(name = "Tel_Contato")
    private String telContato;
    @Column(name = "Cid_prin")
    private String cidprin;
    @Column(name = "Cid_sec")
    private String cidsec;
    @Column(name = "Cid_asso")
    private String cidasso;
    @Column(name = "Cod_Proce")
    private String codProce;
    @Column(name = "Clinica")
    private String clinica;
    @Column(name = "Doc_tip")
    private Character doctip;
    @Column(name = "Doc_prof")
    private String docprof;
    @Column(name = "Prof_Solicit")
    private String profSolicit;
    @Column(name = "Acid_Trans")
    private Boolean acidTrans;
    @Column(name = "Acid_Trab_Tip")
    private Boolean acidTrabTip;
    @Column(name = "Acid_Trab_Tra")
    private Boolean acidTrabTra;
    @Column(name = "Cnpj_Seg")
    private String cnpjSeg;
    @Column(name = "Num_Bilhete")
    private String numBilhete;
    @Column(name = "Serie")
    private String serie;
    @Column(name = "Cnpj_Emp")
    private String cnpjEmp;
    @Column(name = "Cnae_Emp")
    private String cnaeEmp;
    @Column(name = "Cbor")
    private String cbor;
    @Column(name = "Vinculo_Previ")
    private Character vinculoPrevi;
    @Column(name = "Autoriz_Nome")
    private String autorizNome;
    @Column(name = "Doc_Aut")
    private Character docAut;
    @Column(name = "N_Doc_Prof")
    private String nDocProf;
    @Column(name = "Data_Aut")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataAut;
    @Column(name = "CID_MORTE")
    private String cidMorte;
    @Column(name = "COD_MODAL")
    private String codModal;
    @Column(name = "COD_PROCE_REALIZ")
    private String codProceRealiz;
    @Column(name = "MUDANCA_PROCUNIF")
    private Character mudancaProcunif;
    @Column(name = "FONE_CONTATO")
    private String foneContato;
    @Column(name = "CODIGO_ALTA")
    private String codigoAlta;
    @Column(name = "PROFISSAO_RESP")
    private String profissaoResp;
    @Column(name = "ENDERECO_RESP")
    private String enderecoResp;
    @Column(name = "CIDADE_RESP")
    private String cidadeResp;
    @Column(name = "RG_RESP")
    private String rgResp;
    @Column(name = "FONE_RESP")
    private String foneResp;
    @Column(name = "Cod_Laudo_AIH")
    private Integer codLaudoAIH;
    @Column(name = "NOME_CONTATO")
    private String nomeContato;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "TOTAL_DIARIA")
    private BigDecimal totalDiaria;
    @Column(name = "TOTAL_MEDICAMENTOS")
    private BigDecimal totalMedicamentos;
    @Column(name = "TOTAL_MATERIALHOSP")
    private BigDecimal totalMaterialhosp;
    @Column(name = "TOTAL_EXAMES")
    private BigDecimal totalExames;
    @Column(name = "TOTAL_DESPESAS")
    private BigDecimal totalDespesas;
    @Lob
    @Column(name = "MEDICAMENTOS_RECEITADOS")
    private String medicamentosReceitados;
    @Lob
    @Column(name = "RECOMENDACAO_ALTA")
    private String recomendacaoAlta;
    @Column(name = "COD_UNI")
    private Integer codUni;
    @Column(name = "DOC_FOTO")
    private Boolean docFoto;
    @Column(name = "ATIVO")
    private Boolean ativo;
    @Column(name = "USUARIO_CANCELOU")
    private Integer usuarioCancelou;
    @Column(name = "DT_CANCELAMENTO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtCancelamento;
    @JoinColumn(name = "COD_RESTRICAO_ALIMENTAR", referencedColumnName = "COD_PAC_RESTRICAO")
    @ManyToOne(fetch = FetchType.EAGER)
    private PacienteRestricaoAlimentar codRestricaoAlimentar;
    @JoinColumn(name = "Carat_Inter", referencedColumnName = "COD_CARATER")
    @ManyToOne(fetch = FetchType.EAGER)
    private CaraterAtend caratInter;
    @JoinColumn(name = "COD_MOTIVO_ALTA", referencedColumnName = "COD_MOTIVO_ALTA")
    @ManyToOne(fetch = FetchType.EAGER)
    private MotivoAlta codMotivoAlta;
    @JoinColumn(name = "COD_PRO", referencedColumnName = "COD_PRO")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pacientes codPro;
    @JoinColumn(name = "Cod_ProcUnif", referencedColumnName = "COD_PROCUNIF")
    @ManyToOne(fetch = FetchType.EAGER)
    private ProcedimentoUnif codProcUnif;
    @JoinColumn(name = "COD_TIPO_PLANO", referencedColumnName = "COD_TIPO_PLANO")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoPlano codTipoPlano;
    @JoinColumn(name = "COD_PROCUNIF_REALIZ", referencedColumnName = "COD_PROCUNIF")
    @ManyToOne(fetch = FetchType.EAGER)
    private ProcedimentoUnif codProcunifRealiz;
    @JoinColumn(name = "Cod_Prof_Auto", referencedColumnName = "COD_PROF")
    @ManyToOne(fetch = FetchType.EAGER)
    private Profissionais codProfAuto;
    @JoinColumn(name = "Cod_Tipo_Internacao", referencedColumnName = "Cod_Tipo_Internacao")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoInternacao codTipoInternacao;
    @JoinColumn(name = "Cod_Prof_Solic", referencedColumnName = "COD_PROF")
    @ManyToOne(fetch = FetchType.EAGER)
    private Profissionais codProfSolic;
    @JoinColumn(name = "COD_PROF", referencedColumnName = "COD_PROF")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Profissionais codProf;
    @JoinColumn(name = "Cod_Prof_Alta", referencedColumnName = "COD_PROF")
    @ManyToOne(fetch = FetchType.EAGER)
    private Profissionais codProfAlta;
    @JoinColumn(name = "COD_CLIN", referencedColumnName = "COD_CLIN")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoClinica codClin;
//    @OneToMany(mappedBy = "codIntern", fetch = FetchType.EAGER)
//    private List<AgendaexaMaster> agendaexaMasterList;

    public Internacao() {
    }

    public Internacao(Integer codIntern) {
        this.codIntern = codIntern;
    }

    public Internacao(Integer codIntern, boolean permitirVisita, boolean modoRegraVisita, Character origem, boolean transferido) {
        this.codIntern = codIntern;
        this.permitirVisita = permitirVisita;
        this.modoRegraVisita = modoRegraVisita;
        this.origem = origem;
        this.transferido = transferido;
    }

    public Integer getCodIntern() {
        return codIntern;
    }

    public void setCodIntern(Integer codIntern) {
        this.codIntern = codIntern;
    }

    public Boolean getAlta() {
        return alta;
    }

    public void setAlta(Boolean alta) {
        this.alta = alta;
    }

    public boolean getPermitirVisita() {
        return permitirVisita;
    }

    public void setPermitirVisita(boolean permitirVisita) {
        this.permitirVisita = permitirVisita;
    }

    public boolean getModoRegraVisita() {
        return modoRegraVisita;
    }

    public void setModoRegraVisita(boolean modoRegraVisita) {
        this.modoRegraVisita = modoRegraVisita;
    }

    public Character getOrigem() {
        return origem;
    }

    public void setOrigem(Character origem) {
        this.origem = origem;
    }

    public String getLocalOrigemTransf() {
        return localOrigemTransf;
    }

    public void setLocalOrigemTransf(String localOrigemTransf) {
        this.localOrigemTransf = localOrigemTransf;
    }

    public Date getDataHoraInt() {
        return dataHoraInt;
    }

    public void setDataHoraInt(Date dataHoraInt) {
        this.dataHoraInt = dataHoraInt;
    }

    public Date getDataHoraAlta() {
        return dataHoraAlta;
    }

    public void setDataHoraAlta(Date dataHoraAlta) {
        this.dataHoraAlta = dataHoraAlta;
    }

    public boolean getTransferido() {
        return transferido;
    }

    public void setTransferido(boolean transferido) {
        this.transferido = transferido;
    }

    public String getLocalDestinoTransf() {
        return localDestinoTransf;
    }

    public void setLocalDestinoTransf(String localDestinoTransf) {
        this.localDestinoTransf = localDestinoTransf;
    }

    public String getNomeEstabSolicit() {
        return nomeEstabSolicit;
    }

    public void setNomeEstabSolicit(String nomeEstabSolicit) {
        this.nomeEstabSolicit = nomeEstabSolicit;
    }

    public String getCnesSolicitante() {
        return cnesSolicitante;
    }

    public void setCnesSolicitante(String cnesSolicitante) {
        this.cnesSolicitante = cnesSolicitante;
    }

    public String getNomeEstabExec() {
        return nomeEstabExec;
    }

    public void setNomeEstabExec(String nomeEstabExec) {
        this.nomeEstabExec = nomeEstabExec;
    }

    public String getCnesExecutante() {
        return cnesExecutante;
    }

    public void setCnesExecutante(String cnesExecutante) {
        this.cnesExecutante = cnesExecutante;
    }

    public String getNomeRespon() {
        return nomeRespon;
    }

    public void setNomeRespon(String nomeRespon) {
        this.nomeRespon = nomeRespon;
    }

    public String getTelContato() {
        return telContato;
    }

    public void setTelContato(String telContato) {
        this.telContato = telContato;
    }

    public String getCidprin() {
        return cidprin;
    }

    public void setCidprin(String cidprin) {
        this.cidprin = cidprin;
    }

    public String getCidsec() {
        return cidsec;
    }

    public void setCidsec(String cidsec) {
        this.cidsec = cidsec;
    }

    public String getCidasso() {
        return cidasso;
    }

    public void setCidasso(String cidasso) {
        this.cidasso = cidasso;
    }

    public String getCodProce() {
        return codProce;
    }

    public void setCodProce(String codProce) {
        this.codProce = codProce;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    public Character getDoctip() {
        return doctip;
    }

    public void setDoctip(Character doctip) {
        this.doctip = doctip;
    }

    public String getDocprof() {
        return docprof;
    }

    public void setDocprof(String docprof) {
        this.docprof = docprof;
    }

    public String getProfSolicit() {
        return profSolicit;
    }

    public void setProfSolicit(String profSolicit) {
        this.profSolicit = profSolicit;
    }

    public Boolean getAcidTrans() {
        return acidTrans;
    }

    public void setAcidTrans(Boolean acidTrans) {
        this.acidTrans = acidTrans;
    }

    public Boolean getAcidTrabTip() {
        return acidTrabTip;
    }

    public void setAcidTrabTip(Boolean acidTrabTip) {
        this.acidTrabTip = acidTrabTip;
    }

    public Boolean getAcidTrabTra() {
        return acidTrabTra;
    }

    public void setAcidTrabTra(Boolean acidTrabTra) {
        this.acidTrabTra = acidTrabTra;
    }

    public String getCnpjSeg() {
        return cnpjSeg;
    }

    public void setCnpjSeg(String cnpjSeg) {
        this.cnpjSeg = cnpjSeg;
    }

    public String getNumBilhete() {
        return numBilhete;
    }

    public void setNumBilhete(String numBilhete) {
        this.numBilhete = numBilhete;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getCnpjEmp() {
        return cnpjEmp;
    }

    public void setCnpjEmp(String cnpjEmp) {
        this.cnpjEmp = cnpjEmp;
    }

    public String getCnaeEmp() {
        return cnaeEmp;
    }

    public void setCnaeEmp(String cnaeEmp) {
        this.cnaeEmp = cnaeEmp;
    }

    public String getCbor() {
        return cbor;
    }

    public void setCbor(String cbor) {
        this.cbor = cbor;
    }

    public Character getVinculoPrevi() {
        return vinculoPrevi;
    }

    public void setVinculoPrevi(Character vinculoPrevi) {
        this.vinculoPrevi = vinculoPrevi;
    }

    public String getAutorizNome() {
        return autorizNome;
    }

    public void setAutorizNome(String autorizNome) {
        this.autorizNome = autorizNome;
    }

    public Character getDocAut() {
        return docAut;
    }

    public void setDocAut(Character docAut) {
        this.docAut = docAut;
    }

    public String getNDocProf() {
        return nDocProf;
    }

    public void setNDocProf(String nDocProf) {
        this.nDocProf = nDocProf;
    }

    public Date getDataAut() {
        return dataAut;
    }

    public void setDataAut(Date dataAut) {
        this.dataAut = dataAut;
    }

    public String getCidMorte() {
        return cidMorte;
    }

    public void setCidMorte(String cidMorte) {
        this.cidMorte = cidMorte;
    }

    public String getCodModal() {
        return codModal;
    }

    public void setCodModal(String codModal) {
        this.codModal = codModal;
    }

    public String getCodProceRealiz() {
        return codProceRealiz;
    }

    public void setCodProceRealiz(String codProceRealiz) {
        this.codProceRealiz = codProceRealiz;
    }

    public Character getMudancaProcunif() {
        return mudancaProcunif;
    }

    public void setMudancaProcunif(Character mudancaProcunif) {
        this.mudancaProcunif = mudancaProcunif;
    }

    public String getFoneContato() {
        return foneContato;
    }

    public void setFoneContato(String foneContato) {
        this.foneContato = foneContato;
    }

    public String getCodigoAlta() {
        return codigoAlta;
    }

    public void setCodigoAlta(String codigoAlta) {
        this.codigoAlta = codigoAlta;
    }

    public String getProfissaoResp() {
        return profissaoResp;
    }

    public void setProfissaoResp(String profissaoResp) {
        this.profissaoResp = profissaoResp;
    }

    public String getEnderecoResp() {
        return enderecoResp;
    }

    public void setEnderecoResp(String enderecoResp) {
        this.enderecoResp = enderecoResp;
    }

    public String getCidadeResp() {
        return cidadeResp;
    }

    public void setCidadeResp(String cidadeResp) {
        this.cidadeResp = cidadeResp;
    }

    public String getRgResp() {
        return rgResp;
    }

    public void setRgResp(String rgResp) {
        this.rgResp = rgResp;
    }

    public String getFoneResp() {
        return foneResp;
    }

    public void setFoneResp(String foneResp) {
        this.foneResp = foneResp;
    }

    public Integer getCodLaudoAIH() {
        return codLaudoAIH;
    }

    public void setCodLaudoAIH(Integer codLaudoAIH) {
        this.codLaudoAIH = codLaudoAIH;
    }

    public String getNomeContato() {
        return nomeContato;
    }

    public void setNomeContato(String nomeContato) {
        this.nomeContato = nomeContato;
    }

    public BigDecimal getTotalDiaria() {
        return totalDiaria;
    }

    public void setTotalDiaria(BigDecimal totalDiaria) {
        this.totalDiaria = totalDiaria;
    }

    public BigDecimal getTotalMedicamentos() {
        return totalMedicamentos;
    }

    public void setTotalMedicamentos(BigDecimal totalMedicamentos) {
        this.totalMedicamentos = totalMedicamentos;
    }

    public BigDecimal getTotalMaterialhosp() {
        return totalMaterialhosp;
    }

    public void setTotalMaterialhosp(BigDecimal totalMaterialhosp) {
        this.totalMaterialhosp = totalMaterialhosp;
    }

    public BigDecimal getTotalExames() {
        return totalExames;
    }

    public void setTotalExames(BigDecimal totalExames) {
        this.totalExames = totalExames;
    }

    public BigDecimal getTotalDespesas() {
        return totalDespesas;
    }

    public void setTotalDespesas(BigDecimal totalDespesas) {
        this.totalDespesas = totalDespesas;
    }

    public String getMedicamentosReceitados() {
        return medicamentosReceitados;
    }

    public void setMedicamentosReceitados(String medicamentosReceitados) {
        this.medicamentosReceitados = medicamentosReceitados;
    }

    public String getRecomendacaoAlta() {
        return recomendacaoAlta;
    }

    public void setRecomendacaoAlta(String recomendacaoAlta) {
        this.recomendacaoAlta = recomendacaoAlta;
    }

    public Integer getCodUni() {
        return codUni;
    }

    public void setCodUni(Integer codUni) {
        this.codUni = codUni;
    }

    public Boolean getDocFoto() {
        return docFoto;
    }

    public void setDocFoto(Boolean docFoto) {
        this.docFoto = docFoto;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getUsuarioCancelou() {
        return usuarioCancelou;
    }

    public void setUsuarioCancelou(Integer usuarioCancelou) {
        this.usuarioCancelou = usuarioCancelou;
    }

    public Date getDtCancelamento() {
        return dtCancelamento;
    }

    public void setDtCancelamento(Date dtCancelamento) {
        this.dtCancelamento = dtCancelamento;
    }

    public PacienteRestricaoAlimentar getCodRestricaoAlimentar() {
        return codRestricaoAlimentar;
    }

    public void setCodRestricaoAlimentar(PacienteRestricaoAlimentar codRestricaoAlimentar) {
        this.codRestricaoAlimentar = codRestricaoAlimentar;
    }

    public CaraterAtend getCaratInter() {
        return caratInter;
    }

    public void setCaratInter(CaraterAtend caratInter) {
        this.caratInter = caratInter;
    }

    public MotivoAlta getCodMotivoAlta() {
        return codMotivoAlta;
    }

    public void setCodMotivoAlta(MotivoAlta codMotivoAlta) {
        this.codMotivoAlta = codMotivoAlta;
    }

    public Pacientes getCodPro() {
        return codPro;
    }

    public void setCodPro(Pacientes codPro) {
        this.codPro = codPro;
    }

    public ProcedimentoUnif getCodProcUnif() {
        return codProcUnif;
    }

    public void setCodProcUnif(ProcedimentoUnif codProcUnif) {
        this.codProcUnif = codProcUnif;
    }

    public TipoPlano getCodTipoPlano() {
        return codTipoPlano;
    }

    public void setCodTipoPlano(TipoPlano codTipoPlano) {
        this.codTipoPlano = codTipoPlano;
    }

    public ProcedimentoUnif getCodProcunifRealiz() {
        return codProcunifRealiz;
    }

    public void setCodProcunifRealiz(ProcedimentoUnif codProcunifRealiz) {
        this.codProcunifRealiz = codProcunifRealiz;
    }

    public Profissionais getCodProfAuto() {
        return codProfAuto;
    }

    public void setCodProfAuto(Profissionais codProfAuto) {
        this.codProfAuto = codProfAuto;
    }

    public TipoInternacao getCodTipoInternacao() {
        return codTipoInternacao;
    }

    public void setCodTipoInternacao(TipoInternacao codTipoInternacao) {
        this.codTipoInternacao = codTipoInternacao;
    }

    public Profissionais getCodProfSolic() {
        return codProfSolic;
    }

    public void setCodProfSolic(Profissionais codProfSolic) {
        this.codProfSolic = codProfSolic;
    }

    public Profissionais getCodProf() {
        return codProf;
    }

    public void setCodProf(Profissionais codProf) {
        this.codProf = codProf;
    }

    public Profissionais getCodProfAlta() {
        return codProfAlta;
    }

    public void setCodProfAlta(Profissionais codProfAlta) {
        this.codProfAlta = codProfAlta;
    }

    public TipoClinica getCodClin() {
        return codClin;
    }

    public void setCodClin(TipoClinica codClin) {
        this.codClin = codClin;
    }

//    @XmlTransient
//    public List<AgendaexaMaster> getAgendaexaMasterList() {
//        return agendaexaMasterList;
//    }
//
//    public void setAgendaexaMasterList(List<AgendaexaMaster> agendaexaMasterList) {
//        this.agendaexaMasterList = agendaexaMasterList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codIntern != null ? codIntern.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Internacao)) {
            return false;
        }
        Internacao other = (Internacao) object;
        if ((this.codIntern == null && other.codIntern != null) || (this.codIntern != null && !this.codIntern.equals(other.codIntern))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Internacao[ codIntern=" + codIntern + " ]";
    }
    
}
