/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Marcos Naves
 */
@Entity
@Table(name = "AGENDAEXA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Agendaexa.findAll", query = "SELECT a FROM Agendaexa a"),
    @NamedQuery(name = "Agendaexa.findByCodAgeExa", query = "SELECT a FROM Agendaexa a WHERE a.codAgeExa = :codAgeExa"),
    @NamedQuery(name = "Agendaexa.findByExtInt", query = "SELECT a FROM Agendaexa a WHERE a.extInt = :extInt"),
    @NamedQuery(name = "Agendaexa.findByDataCol", query = "SELECT a FROM Agendaexa a WHERE a.dataCol = :dataCol"),
    @NamedQuery(name = "Agendaexa.findByDataExa", query = "SELECT a FROM Agendaexa a WHERE a.dataExa = :dataExa"),
    @NamedQuery(name = "Agendaexa.findByDataChe", query = "SELECT a FROM Agendaexa a WHERE a.dataChe = :dataChe"),
    @NamedQuery(name = "Agendaexa.findByDataRet", query = "SELECT a FROM Agendaexa a WHERE a.dataRet = :dataRet"),
    @NamedQuery(name = "Agendaexa.findByStatus", query = "SELECT a FROM Agendaexa a WHERE a.status = :status"),
    @NamedQuery(name = "Agendaexa.findByNum", query = "SELECT a FROM Agendaexa a WHERE a.num = :num"),
    @NamedQuery(name = "Agendaexa.findByCodSubExa", query = "SELECT a FROM Agendaexa a WHERE a.codSubExa = :codSubExa"),
    @NamedQuery(name = "Agendaexa.findByHoraExa", query = "SELECT a FROM Agendaexa a WHERE a.horaExa = :horaExa"),
    @NamedQuery(name = "Agendaexa.findByNomeExame", query = "SELECT a FROM Agendaexa a WHERE a.nomeExame = :nomeExame"),
    @NamedQuery(name = "Agendaexa.findByValor", query = "SELECT a FROM Agendaexa a WHERE a.valor = :valor"),
    @NamedQuery(name = "Agendaexa.findByAgendadata", query = "SELECT a FROM Agendaexa a WHERE a.agendadata = :agendadata"),
    @NamedQuery(name = "Agendaexa.findByDataResultado", query = "SELECT a FROM Agendaexa a WHERE a.dataResultado = :dataResultado"),
    @NamedQuery(name = "Agendaexa.findByNomeentregou", query = "SELECT a FROM Agendaexa a WHERE a.nomeentregou = :nomeentregou"),
    @NamedQuery(name = "Agendaexa.findByLaudado", query = "SELECT a FROM Agendaexa a WHERE a.laudado = :laudado"),
    @NamedQuery(name = "Agendaexa.findByCodUni", query = "SELECT a FROM Agendaexa a WHERE a.codUni = :codUni"),
    @NamedQuery(name = "Agendaexa.findByUrgencia", query = "SELECT a FROM Agendaexa a WHERE a.urgencia = :urgencia"),
    @NamedQuery(name = "Agendaexa.findByDataEntrega", query = "SELECT a FROM Agendaexa a WHERE a.dataEntrega = :dataEntrega"),
    @NamedQuery(name = "Agendaexa.findByCodUsuagendo", query = "SELECT a FROM Agendaexa a WHERE a.codUsuagendo = :codUsuagendo"),
    @NamedQuery(name = "Agendaexa.findByCodUsurealizo", query = "SELECT a FROM Agendaexa a WHERE a.codUsurealizo = :codUsurealizo"),
    @NamedQuery(name = "Agendaexa.findByCodUsucancelo", query = "SELECT a FROM Agendaexa a WHERE a.codUsucancelo = :codUsucancelo"),
    @NamedQuery(name = "Agendaexa.findByCodAmostraexa", query = "SELECT a FROM Agendaexa a WHERE a.codAmostraexa = :codAmostraexa"),
    @NamedQuery(name = "Agendaexa.findByNomePac", query = "SELECT a FROM Agendaexa a WHERE a.nomePac = :nomePac"),
    @NamedQuery(name = "Agendaexa.findBySexoPac", query = "SELECT a FROM Agendaexa a WHERE a.sexoPac = :sexoPac"),
    @NamedQuery(name = "Agendaexa.findByDtnascPac", query = "SELECT a FROM Agendaexa a WHERE a.dtnascPac = :dtnascPac"),
    @NamedQuery(name = "Agendaexa.findByStatusDisponivel", query = "SELECT a FROM Agendaexa a WHERE a.statusDisponivel = :statusDisponivel"),
    @NamedQuery(name = "Agendaexa.findByProtocoloAge", query = "SELECT a FROM Agendaexa a WHERE a.protocoloAge = :protocoloAge"),
    @NamedQuery(name = "Agendaexa.findByEnderecoResultado", query = "SELECT a FROM Agendaexa a WHERE a.enderecoResultado = :enderecoResultado"),
    @NamedQuery(name = "Agendaexa.findByDescrMaterial", query = "SELECT a FROM Agendaexa a WHERE a.descrMaterial = :descrMaterial"),
    @NamedQuery(name = "Agendaexa.findByVolume", query = "SELECT a FROM Agendaexa a WHERE a.volume = :volume"),
    @NamedQuery(name = "Agendaexa.findByTempo", query = "SELECT a FROM Agendaexa a WHERE a.tempo = :tempo"),
    @NamedQuery(name = "Agendaexa.findByCodProfRealizou", query = "SELECT a FROM Agendaexa a WHERE a.codProfRealizou = :codProfRealizou"),
    @NamedQuery(name = "Agendaexa.findByCodProfEntregou", query = "SELECT a FROM Agendaexa a WHERE a.codProfEntregou = :codProfEntregou"),
    @NamedQuery(name = "Agendaexa.findByEnviadoLab", query = "SELECT a FROM Agendaexa a WHERE a.enviadoLab = :enviadoLab"),
    @NamedQuery(name = "Agendaexa.findByRetornoLabErro", query = "SELECT a FROM Agendaexa a WHERE a.retornoLabErro = :retornoLabErro")})
public class Agendaexa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_AGE_EXA")
    private Integer codAgeExa;
    @Column(name = "EXT_INT")
    private String extInt;
    @Column(name = "DATA_COL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCol;
    @Column(name = "DATA_EXA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataExa;
    @Column(name = "DATA_CHE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataChe;
    @Column(name = "DATA_RET")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataRet;
    @Column(name = "STATUS")
    private String status;
    @Column(name = "Num")
    private Integer num;
    @Column(name = "COD_SUB_EXA")
    private Integer codSubExa;
    @Column(name = "HORA_EXA")
    private String horaExa;
    @Column(name = "NOME_EXAME")
    private String nomeExame;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Float valor;
    @Column(name = "AGENDADATA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date agendadata;
    @Lob
    @Column(name = "OBSERVACOES")
    private String observacoes;
    @Column(name = "DATA_RESULTADO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataResultado;
    @Column(name = "NOMEENTREGOU")
    private String nomeentregou;
    @Column(name = "LAUDADO")
    private Boolean laudado;
    @Column(name = "COD_UNI")
    private Integer codUni;
    @Column(name = "URGENCIA")
    private Boolean urgencia;
    @Column(name = "DATA_ENTREGA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEntrega;
    @Column(name = "COD_USUAGENDO")
    private Integer codUsuagendo;
    @Column(name = "COD_USUREALIZO")
    private Integer codUsurealizo;
    @Column(name = "COD_USUCANCELO")
    private Integer codUsucancelo;
    @Column(name = "COD_AMOSTRAEXA")
    private Integer codAmostraexa;
    @Column(name = "NOME_PAC")
    private String nomePac;
    @Column(name = "SEXO_PAC")
    private Character sexoPac;
    @Column(name = "DTNASC_PAC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtnascPac;
    @Column(name = "STATUS_DISPONIVEL")
    private Boolean statusDisponivel;
    @Column(name = "PROTOCOLO_AGE")
    private Integer protocoloAge;
    @Column(name = "ENDERECO_RESULTADO")
    private String enderecoResultado;
    @Column(name = "DESCR_MATERIAL")
    private String descrMaterial;
    @Column(name = "VOLUME")
    private String volume;
    @Column(name = "TEMPO")
    private Integer tempo;
    @Column(name = "COD_PROF_REALIZOU")
    private Integer codProfRealizou;
    @Column(name = "COD_PROF_ENTREGOU")
    private Integer codProfEntregou;
    @Column(name = "ENVIADO_LAB")
    private String enviadoLab;
    @Column(name = "RETORNO_LAB_ERRO")
    private String retornoLabErro;
    @JoinColumn(name = "COD_EQUIPAMENTO", referencedColumnName = "COD_EQUIPAMENTO")
    @ManyToOne(fetch = FetchType.EAGER)
    private EquipamentoExa codEquipamento;
    @JoinColumn(name = "COD_AGEEXA_COLETA", referencedColumnName = "COD_AGEEXA_COLETA")
    @ManyToOne(fetch = FetchType.EAGER)
    private AgendaexaColeta codAgeexaColeta;
    @JoinColumn(name = "COD_AGENDAEXA_MASTER", referencedColumnName = "COD_AGENDAEXA_MASTER")
    @ManyToOne(fetch = FetchType.EAGER)
    private AgendaexaMaster codAgendaexaMaster;
    @JoinColumn(name = "COD_BPAITEN", referencedColumnName = "COD_BPAITEN")
    @ManyToOne(fetch = FetchType.EAGER)
    private Bpaitens codBpaiten;
    @JoinColumn(name = "COD_PROCED", referencedColumnName = "COD_PROCED")
    @ManyToOne(fetch = FetchType.EAGER)
    private Procedimentos codProced;
    @JoinColumn(name = "COD_COL", referencedColumnName = "COD_COL")
    @ManyToOne(fetch = FetchType.EAGER)
    private Coletaexa codCol;
    @JoinColumn(name = "COD_COTA_EXA_LAB_UNI", referencedColumnName = "COD_COTA_EXA_LAB_UNI")
    @ManyToOne(fetch = FetchType.EAGER)
    private CotasExaLabUni codCotaExaLabUni;
    @JoinColumn(name = "COD_COTASEXALAB", referencedColumnName = "COD_COTASEXALAB")
    @ManyToOne(fetch = FetchType.EAGER)
    private Cotasexalab codCotasexalab;
    @JoinColumn(name = "COD_EXA", referencedColumnName = "COD_EXA")
    @ManyToOne(fetch = FetchType.EAGER)
    private Grupoexa codExa;
    @JoinColumn(name = "COD_UNISOLICITANTE", referencedColumnName = "COD_UNISOLICITANTE")
    @ManyToOne(fetch = FetchType.EAGER)
    private UnidadeSolicitante codUnisolicitante;
    @JoinColumn(name = "COD_LAB", referencedColumnName = "COD_LAB")
    @ManyToOne(fetch = FetchType.EAGER)
    private Labexa codLab;
    @JoinColumn(name = "COD_PROF", referencedColumnName = "COD_PROF")
    @ManyToOne(fetch = FetchType.EAGER)
    private Profissionais codProf;
    @JoinColumn(name = "COD_MATERIAL", referencedColumnName = "COD_MATERIAL")
    @ManyToOne(fetch = FetchType.EAGER)
    private MaterialExa codMaterial;
    @JoinColumn(name = "COD_USU", referencedColumnName = "COD_USU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios codUsu;
    @JoinColumn(name = "COD_PRO", referencedColumnName = "COD_PRO")
    @ManyToOne(fetch = FetchType.EAGER)
    private Pacientes codPro;

    public Agendaexa() {
    }

    public Agendaexa(Integer codAgeExa) {
        this.codAgeExa = codAgeExa;
    }

    public Integer getCodAgeExa() {
        return codAgeExa;
    }

    public void setCodAgeExa(Integer codAgeExa) {
        this.codAgeExa = codAgeExa;
    }

    public String getExtInt() {
        return extInt;
    }

    public void setExtInt(String extInt) {
        this.extInt = extInt;
    }

    public Date getDataCol() {
        return dataCol;
    }

    public void setDataCol(Date dataCol) {
        this.dataCol = dataCol;
    }

    public Date getDataExa() {
        return dataExa;
    }

    public void setDataExa(Date dataExa) {
        this.dataExa = dataExa;
    }

    public Date getDataChe() {
        return dataChe;
    }

    public void setDataChe(Date dataChe) {
        this.dataChe = dataChe;
    }

    public Date getDataRet() {
        return dataRet;
    }

    public void setDataRet(Date dataRet) {
        this.dataRet = dataRet;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getCodSubExa() {
        return codSubExa;
    }

    public void setCodSubExa(Integer codSubExa) {
        this.codSubExa = codSubExa;
    }

    public String getHoraExa() {
        return horaExa;
    }

    public void setHoraExa(String horaExa) {
        this.horaExa = horaExa;
    }

    public String getNomeExame() {
        return nomeExame;
    }

    public void setNomeExame(String nomeExame) {
        this.nomeExame = nomeExame;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Date getAgendadata() {
        return agendadata;
    }

    public void setAgendadata(Date agendadata) {
        this.agendadata = agendadata;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public Date getDataResultado() {
        return dataResultado;
    }

    public void setDataResultado(Date dataResultado) {
        this.dataResultado = dataResultado;
    }

    public String getNomeentregou() {
        return nomeentregou;
    }

    public void setNomeentregou(String nomeentregou) {
        this.nomeentregou = nomeentregou;
    }

    public Boolean getLaudado() {
        return laudado;
    }

    public void setLaudado(Boolean laudado) {
        this.laudado = laudado;
    }

    public Integer getCodUni() {
        return codUni;
    }

    public void setCodUni(Integer codUni) {
        this.codUni = codUni;
    }

    public Boolean getUrgencia() {
        return urgencia;
    }

    public void setUrgencia(Boolean urgencia) {
        this.urgencia = urgencia;
    }

    public Date getDataEntrega() {
        return dataEntrega;
    }

    public void setDataEntrega(Date dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public Integer getCodUsuagendo() {
        return codUsuagendo;
    }

    public void setCodUsuagendo(Integer codUsuagendo) {
        this.codUsuagendo = codUsuagendo;
    }

    public Integer getCodUsurealizo() {
        return codUsurealizo;
    }

    public void setCodUsurealizo(Integer codUsurealizo) {
        this.codUsurealizo = codUsurealizo;
    }

    public Integer getCodUsucancelo() {
        return codUsucancelo;
    }

    public void setCodUsucancelo(Integer codUsucancelo) {
        this.codUsucancelo = codUsucancelo;
    }

    public Integer getCodAmostraexa() {
        return codAmostraexa;
    }

    public void setCodAmostraexa(Integer codAmostraexa) {
        this.codAmostraexa = codAmostraexa;
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

    public Date getDtnascPac() {
        return dtnascPac;
    }

    public void setDtnascPac(Date dtnascPac) {
        this.dtnascPac = dtnascPac;
    }

    public Boolean getStatusDisponivel() {
        return statusDisponivel;
    }

    public void setStatusDisponivel(Boolean statusDisponivel) {
        this.statusDisponivel = statusDisponivel;
    }

    public Integer getProtocoloAge() {
        return protocoloAge;
    }

    public void setProtocoloAge(Integer protocoloAge) {
        this.protocoloAge = protocoloAge;
    }

    public String getEnderecoResultado() {
        return enderecoResultado;
    }

    public void setEnderecoResultado(String enderecoResultado) {
        this.enderecoResultado = enderecoResultado;
    }

    public String getDescrMaterial() {
        return descrMaterial;
    }

    public void setDescrMaterial(String descrMaterial) {
        this.descrMaterial = descrMaterial;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public Integer getTempo() {
        return tempo;
    }

    public void setTempo(Integer tempo) {
        this.tempo = tempo;
    }

    public Integer getCodProfRealizou() {
        return codProfRealizou;
    }

    public void setCodProfRealizou(Integer codProfRealizou) {
        this.codProfRealizou = codProfRealizou;
    }

    public Integer getCodProfEntregou() {
        return codProfEntregou;
    }

    public void setCodProfEntregou(Integer codProfEntregou) {
        this.codProfEntregou = codProfEntregou;
    }

    public String getEnviadoLab() {
        return enviadoLab;
    }

    public void setEnviadoLab(String enviadoLab) {
        this.enviadoLab = enviadoLab;
    }

    public String getRetornoLabErro() {
        return retornoLabErro;
    }

    public void setRetornoLabErro(String retornoLabErro) {
        this.retornoLabErro = retornoLabErro;
    }

    public EquipamentoExa getCodEquipamento() {
        return codEquipamento;
    }

    public void setCodEquipamento(EquipamentoExa codEquipamento) {
        this.codEquipamento = codEquipamento;
    }

    public AgendaexaColeta getCodAgeexaColeta() {
        return codAgeexaColeta;
    }

    public void setCodAgeexaColeta(AgendaexaColeta codAgeexaColeta) {
        this.codAgeexaColeta = codAgeexaColeta;
    }

    public AgendaexaMaster getCodAgendaexaMaster() {
        return codAgendaexaMaster;
    }

    public void setCodAgendaexaMaster(AgendaexaMaster codAgendaexaMaster) {
        this.codAgendaexaMaster = codAgendaexaMaster;
    }

    public Bpaitens getCodBpaiten() {
        return codBpaiten;
    }

    public void setCodBpaiten(Bpaitens codBpaiten) {
        this.codBpaiten = codBpaiten;
    }

    public Procedimentos getCodProced() {
        return codProced;
    }

    public void setCodProced(Procedimentos codProced) {
        this.codProced = codProced;
    }

    public Coletaexa getCodCol() {
        return codCol;
    }

    public void setCodCol(Coletaexa codCol) {
        this.codCol = codCol;
    }

    public CotasExaLabUni getCodCotaExaLabUni() {
        return codCotaExaLabUni;
    }

    public void setCodCotaExaLabUni(CotasExaLabUni codCotaExaLabUni) {
        this.codCotaExaLabUni = codCotaExaLabUni;
    }

    public Cotasexalab getCodCotasexalab() {
        return codCotasexalab;
    }

    public void setCodCotasexalab(Cotasexalab codCotasexalab) {
        this.codCotasexalab = codCotasexalab;
    }

    public Grupoexa getCodExa() {
        return codExa;
    }

    public void setCodExa(Grupoexa codExa) {
        this.codExa = codExa;
    }

    public UnidadeSolicitante getCodUnisolicitante() {
        return codUnisolicitante;
    }

    public void setCodUnisolicitante(UnidadeSolicitante codUnisolicitante) {
        this.codUnisolicitante = codUnisolicitante;
    }

    public Labexa getCodLab() {
        return codLab;
    }

    public void setCodLab(Labexa codLab) {
        this.codLab = codLab;
    }

    public Profissionais getCodProf() {
        return codProf;
    }

    public void setCodProf(Profissionais codProf) {
        this.codProf = codProf;
    }

    public MaterialExa getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(MaterialExa codMaterial) {
        this.codMaterial = codMaterial;
    }

    public Usuarios getCodUsu() {
        return codUsu;
    }

    public void setCodUsu(Usuarios codUsu) {
        this.codUsu = codUsu;
    }

    public Pacientes getCodPro() {
        return codPro;
    }

    public void setCodPro(Pacientes codPro) {
        this.codPro = codPro;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAgeExa != null ? codAgeExa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Agendaexa)) {
            return false;
        }
        Agendaexa other = (Agendaexa) object;
        if ((this.codAgeExa == null && other.codAgeExa != null) || (this.codAgeExa != null && !this.codAgeExa.equals(other.codAgeExa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Agendaexa[ codAgeExa=" + codAgeExa + " ]";
    }
    
}
