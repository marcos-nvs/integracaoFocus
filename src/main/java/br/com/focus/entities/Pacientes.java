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
 * @author F12684146896
 */
@Entity
@Table(name = "PACIENTES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pacientes.findAll", query = "SELECT p FROM Pacientes p"),
    @NamedQuery(name = "Pacientes.findByCodPro", query = "SELECT p FROM Pacientes p WHERE p.codPro = :codPro"),
    @NamedQuery(name = "Pacientes.findByDtmatric", query = "SELECT p FROM Pacientes p WHERE p.dtmatric = :dtmatric"),
    @NamedQuery(name = "Pacientes.findByDtmoradia", query = "SELECT p FROM Pacientes p WHERE p.dtmoradia = :dtmoradia"),
    @NamedQuery(name = "Pacientes.findByObsEsc", query = "SELECT p FROM Pacientes p WHERE p.obsEsc = :obsEsc"),
    @NamedQuery(name = "Pacientes.findByRh", query = "SELECT p FROM Pacientes p WHERE p.rh = :rh"),
    @NamedQuery(name = "Pacientes.findByGrupo", query = "SELECT p FROM Pacientes p WHERE p.grupo = :grupo"),
    @NamedQuery(name = "Pacientes.findByCodUni", query = "SELECT p FROM Pacientes p WHERE p.codUni = :codUni"),
    @NamedQuery(name = "Pacientes.findByConsultaok", query = "SELECT p FROM Pacientes p WHERE p.consultaok = :consultaok"),
    @NamedQuery(name = "Pacientes.findByConsultanok", query = "SELECT p FROM Pacientes p WHERE p.consultanok = :consultanok"),
    @NamedQuery(name = "Pacientes.findByUconsulta", query = "SELECT p FROM Pacientes p WHERE p.uconsulta = :uconsulta"),
    @NamedQuery(name = "Pacientes.findByResponsavel", query = "SELECT p FROM Pacientes p WHERE p.responsavel = :responsavel"),
    @NamedQuery(name = "Pacientes.findByCodfamilia", query = "SELECT p FROM Pacientes p WHERE p.codfamilia = :codfamilia"),
    @NamedQuery(name = "Pacientes.findByPesonasc", query = "SELECT p FROM Pacientes p WHERE p.pesonasc = :pesonasc"),
    @NamedQuery(name = "Pacientes.findByAlturanasc", query = "SELECT p FROM Pacientes p WHERE p.alturanasc = :alturanasc"),
    @NamedQuery(name = "Pacientes.findByHoranasc", query = "SELECT p FROM Pacientes p WHERE p.horanasc = :horanasc"),
    @NamedQuery(name = "Pacientes.findByPerimetro", query = "SELECT p FROM Pacientes p WHERE p.perimetro = :perimetro"),
    @NamedQuery(name = "Pacientes.findByApgar", query = "SELECT p FROM Pacientes p WHERE p.apgar = :apgar"),
    @NamedQuery(name = "Pacientes.findByAlterado", query = "SELECT p FROM Pacientes p WHERE p.alterado = :alterado"),
    @NamedQuery(name = "Pacientes.findByNumsprot", query = "SELECT p FROM Pacientes p WHERE p.numsprot = :numsprot"),
    @NamedQuery(name = "Pacientes.findByAntigo", query = "SELECT p FROM Pacientes p WHERE p.antigo = :antigo"),
    @NamedQuery(name = "Pacientes.findByUniUltconsulta", query = "SELECT p FROM Pacientes p WHERE p.uniUltconsulta = :uniUltconsulta"),
    @NamedQuery(name = "Pacientes.findByUltProf", query = "SELECT p FROM Pacientes p WHERE p.ultProf = :ultProf"),
    @NamedQuery(name = "Pacientes.findByDoadorsangue", query = "SELECT p FROM Pacientes p WHERE p.doadorsangue = :doadorsangue"),
    @NamedQuery(name = "Pacientes.findByDtUltalt", query = "SELECT p FROM Pacientes p WHERE p.dtUltalt = :dtUltalt"),
    @NamedQuery(name = "Pacientes.findByCodOdonto", query = "SELECT p FROM Pacientes p WHERE p.codOdonto = :codOdonto"),
    @NamedQuery(name = "Pacientes.findByQuadra", query = "SELECT p FROM Pacientes p WHERE p.quadra = :quadra"),
    @NamedQuery(name = "Pacientes.findByLocProntuario", query = "SELECT p FROM Pacientes p WHERE p.locProntuario = :locProntuario"),
    @NamedQuery(name = "Pacientes.findByAtivo", query = "SELECT p FROM Pacientes p WHERE p.ativo = :ativo"),
    @NamedQuery(name = "Pacientes.findByCodCidadao", query = "SELECT p FROM Pacientes p WHERE p.codCidadao = :codCidadao"),
    @NamedQuery(name = "Pacientes.findByNimpetiqtermica", query = "SELECT p FROM Pacientes p WHERE p.nimpetiqtermica = :nimpetiqtermica"),
    @NamedQuery(name = "Pacientes.findByHipertenso", query = "SELECT p FROM Pacientes p WHERE p.hipertenso = :hipertenso"),
    @NamedQuery(name = "Pacientes.findByDiabetico", query = "SELECT p FROM Pacientes p WHERE p.diabetico = :diabetico"),
    @NamedQuery(name = "Pacientes.findByCodUniorigem", query = "SELECT p FROM Pacientes p WHERE p.codUniorigem = :codUniorigem"),
    @NamedQuery(name = "Pacientes.findByCodAme", query = "SELECT p FROM Pacientes p WHERE p.codAme = :codAme"),
    @NamedQuery(name = "Pacientes.findByApgar1", query = "SELECT p FROM Pacientes p WHERE p.apgar1 = :apgar1"),
    @NamedQuery(name = "Pacientes.findByTemFichaGerada", query = "SELECT p FROM Pacientes p WHERE p.temFichaGerada = :temFichaGerada"),
    @NamedQuery(name = "Pacientes.findByCancer", query = "SELECT p FROM Pacientes p WHERE p.cancer = :cancer"),
    @NamedQuery(name = "Pacientes.findByPneumopatia", query = "SELECT p FROM Pacientes p WHERE p.pneumopatia = :pneumopatia"),
    @NamedQuery(name = "Pacientes.findByTransplantado", query = "SELECT p FROM Pacientes p WHERE p.transplantado = :transplantado"),
    @NamedQuery(name = "Pacientes.findByAlergia", query = "SELECT p FROM Pacientes p WHERE p.alergia = :alergia"),
    @NamedQuery(name = "Pacientes.findByOutrasComorbidades", query = "SELECT p FROM Pacientes p WHERE p.outrasComorbidades = :outrasComorbidades"),
    @NamedQuery(name = "Pacientes.findByTipoSangue", query = "SELECT p FROM Pacientes p WHERE p.tipoSangue = :tipoSangue"),
    @NamedQuery(name = "Pacientes.findByGestante", query = "SELECT p FROM Pacientes p WHERE p.gestante = :gestante"),
    @NamedQuery(name = "Pacientes.findByDtprevistanasc", query = "SELECT p FROM Pacientes p WHERE p.dtprevistanasc = :dtprevistanasc")})
public class Pacientes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_PRO")
    private String codPro;
    @Column(name = "DTMATRIC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmatric;
    @Column(name = "DTMORADIA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtmoradia;
    @Lob
    @Column(name = "OBS")
    private String obs;
    @Column(name = "OBS_ESC")
    private String obsEsc;
    @Column(name = "RH")
    private String rh;
    @Column(name = "GRUPO")
    private String grupo;
    @Column(name = "COD_UNI")
    private Integer codUni;
    @Column(name = "CONSULTAOK")
    private Integer consultaok;
    @Column(name = "CONSULTANOK")
    private Integer consultanok;
    @Column(name = "UCONSULTA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date uconsulta;
    @Column(name = "RESPONSAVEL")
    private String responsavel;
    @Column(name = "CODFAMILIA")
    private String codfamilia;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "PESONASC")
    private Float pesonasc;
    @Column(name = "ALTURANASC")
    private Float alturanasc;
    @Column(name = "HORANASC")
    private String horanasc;
    @Lob
    @Column(name = "OBSNASC")
    private String obsnasc;
    @Column(name = "PERIMETRO")
    private Float perimetro;
    @Column(name = "APGAR")
    private String apgar;
    @Lob
    @Column(name = "SOCIAL")
    private String social;
    @Lob
    @Column(name = "HISTORICO")
    private String historico;
    @Column(name = "ALTERADO")
    private String alterado;
    @Column(name = "NUMSPROT")
    private String numsprot;
    @Column(name = "ANTIGO")
    private String antigo;
    @Column(name = "UNI_ULTCONSULTA")
    private Integer uniUltconsulta;
    @Column(name = "ULT_PROF")
    private Integer ultProf;
    @Column(name = "DOADORSANGUE")
    private Character doadorsangue;
    @Column(name = "DT_ULTALT")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtUltalt;
    @Column(name = "COD_ODONTO")
    private String codOdonto;
    @Column(name = "QUADRA")
    private String quadra;
    @Column(name = "LOC_PRONTUARIO")
    private String locProntuario;
    @Column(name = "ATIVO")
    private Boolean ativo;
    @Column(name = "COD_CIDADAO")
    private Integer codCidadao;
    @Column(name = "NIMPETIQTERMICA")
    private Integer nimpetiqtermica;
    @Column(name = "HIPERTENSO")
    private Boolean hipertenso;
    @Column(name = "DIABETICO")
    private Boolean diabetico;
    @Column(name = "COD_UNIORIGEM")
    private Integer codUniorigem;
    @Column(name = "COD_AME")
    private Integer codAme;
    @Column(name = "APGAR1")
    private String apgar1;
    @Column(name = "TEM_FICHA_GERADA")
    private Boolean temFichaGerada;
    @Column(name = "CANCER")
    private Boolean cancer;
    @Column(name = "PNEUMOPATIA")
    private Boolean pneumopatia;
    @Column(name = "TRANSPLANTADO")
    private Boolean transplantado;
    @Column(name = "ALERGIA")
    private Boolean alergia;
    @Column(name = "OUTRAS_COMORBIDADES")
    private Boolean outrasComorbidades;
    @Lob
    @Column(name = "ANTECED_PESSOAL")
    private String antecedPessoal;
    @Column(name = "TIPO_SANGUE")
    private String tipoSangue;
    @Column(name = "GESTANTE")
    private Boolean gestante;
    @Column(name = "DTPREVISTANASC")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dtprevistanasc;
    @JoinColumn(name = "COD_CONV", referencedColumnName = "COD_CONV")
    @ManyToOne(fetch = FetchType.EAGER)
    private Convenio codConv;
    @JoinColumn(name = "COD_TIPO_PLANO", referencedColumnName = "COD_TIPO_PLANO")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoPlano codTipoPlano;
    @JoinColumn(name = "COD_PAR", referencedColumnName = "COD_PAR")
    @ManyToOne(fetch = FetchType.EAGER)
    private Tipoparto codPar;
//    @OneToMany(mappedBy = "codPro", fetch = FetchType.EAGER)
//    private List<Internacao> internacaoList;
//    @OneToMany(mappedBy = "codPro", fetch = FetchType.EAGER)
//    private List<AgendaexaMaster> agendaexaMasterList;
//    @OneToMany(mappedBy = "codPro", fetch = FetchType.EAGER)
//    private List<Agendaexa> agendaexaList;

    public Pacientes() {
    }

    public Pacientes(String codPro) {
        this.codPro = codPro;
    }

    public String getCodPro() {
        return codPro;
    }

    public void setCodPro(String codPro) {
        this.codPro = codPro;
    }

    public Date getDtmatric() {
        return dtmatric;
    }

    public void setDtmatric(Date dtmatric) {
        this.dtmatric = dtmatric;
    }

    public Date getDtmoradia() {
        return dtmoradia;
    }

    public void setDtmoradia(Date dtmoradia) {
        this.dtmoradia = dtmoradia;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getObsEsc() {
        return obsEsc;
    }

    public void setObsEsc(String obsEsc) {
        this.obsEsc = obsEsc;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public Integer getCodUni() {
        return codUni;
    }

    public void setCodUni(Integer codUni) {
        this.codUni = codUni;
    }

    public Integer getConsultaok() {
        return consultaok;
    }

    public void setConsultaok(Integer consultaok) {
        this.consultaok = consultaok;
    }

    public Integer getConsultanok() {
        return consultanok;
    }

    public void setConsultanok(Integer consultanok) {
        this.consultanok = consultanok;
    }

    public Date getUconsulta() {
        return uconsulta;
    }

    public void setUconsulta(Date uconsulta) {
        this.uconsulta = uconsulta;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getCodfamilia() {
        return codfamilia;
    }

    public void setCodfamilia(String codfamilia) {
        this.codfamilia = codfamilia;
    }

    public Float getPesonasc() {
        return pesonasc;
    }

    public void setPesonasc(Float pesonasc) {
        this.pesonasc = pesonasc;
    }

    public Float getAlturanasc() {
        return alturanasc;
    }

    public void setAlturanasc(Float alturanasc) {
        this.alturanasc = alturanasc;
    }

    public String getHoranasc() {
        return horanasc;
    }

    public void setHoranasc(String horanasc) {
        this.horanasc = horanasc;
    }

    public String getObsnasc() {
        return obsnasc;
    }

    public void setObsnasc(String obsnasc) {
        this.obsnasc = obsnasc;
    }

    public Float getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(Float perimetro) {
        this.perimetro = perimetro;
    }

    public String getApgar() {
        return apgar;
    }

    public void setApgar(String apgar) {
        this.apgar = apgar;
    }

    public String getSocial() {
        return social;
    }

    public void setSocial(String social) {
        this.social = social;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

    public String getAlterado() {
        return alterado;
    }

    public void setAlterado(String alterado) {
        this.alterado = alterado;
    }

    public String getNumsprot() {
        return numsprot;
    }

    public void setNumsprot(String numsprot) {
        this.numsprot = numsprot;
    }

    public String getAntigo() {
        return antigo;
    }

    public void setAntigo(String antigo) {
        this.antigo = antigo;
    }

    public Integer getUniUltconsulta() {
        return uniUltconsulta;
    }

    public void setUniUltconsulta(Integer uniUltconsulta) {
        this.uniUltconsulta = uniUltconsulta;
    }

    public Integer getUltProf() {
        return ultProf;
    }

    public void setUltProf(Integer ultProf) {
        this.ultProf = ultProf;
    }

    public Character getDoadorsangue() {
        return doadorsangue;
    }

    public void setDoadorsangue(Character doadorsangue) {
        this.doadorsangue = doadorsangue;
    }

    public Date getDtUltalt() {
        return dtUltalt;
    }

    public void setDtUltalt(Date dtUltalt) {
        this.dtUltalt = dtUltalt;
    }

    public String getCodOdonto() {
        return codOdonto;
    }

    public void setCodOdonto(String codOdonto) {
        this.codOdonto = codOdonto;
    }

    public String getQuadra() {
        return quadra;
    }

    public void setQuadra(String quadra) {
        this.quadra = quadra;
    }

    public String getLocProntuario() {
        return locProntuario;
    }

    public void setLocProntuario(String locProntuario) {
        this.locProntuario = locProntuario;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public Integer getCodCidadao() {
        return codCidadao;
    }

    public void setCodCidadao(Integer codCidadao) {
        this.codCidadao = codCidadao;
    }

    public Integer getNimpetiqtermica() {
        return nimpetiqtermica;
    }

    public void setNimpetiqtermica(Integer nimpetiqtermica) {
        this.nimpetiqtermica = nimpetiqtermica;
    }

    public Boolean getHipertenso() {
        return hipertenso;
    }

    public void setHipertenso(Boolean hipertenso) {
        this.hipertenso = hipertenso;
    }

    public Boolean getDiabetico() {
        return diabetico;
    }

    public void setDiabetico(Boolean diabetico) {
        this.diabetico = diabetico;
    }

    public Integer getCodUniorigem() {
        return codUniorigem;
    }

    public void setCodUniorigem(Integer codUniorigem) {
        this.codUniorigem = codUniorigem;
    }

    public Integer getCodAme() {
        return codAme;
    }

    public void setCodAme(Integer codAme) {
        this.codAme = codAme;
    }

    public String getApgar1() {
        return apgar1;
    }

    public void setApgar1(String apgar1) {
        this.apgar1 = apgar1;
    }

    public Boolean getTemFichaGerada() {
        return temFichaGerada;
    }

    public void setTemFichaGerada(Boolean temFichaGerada) {
        this.temFichaGerada = temFichaGerada;
    }

    public Boolean getCancer() {
        return cancer;
    }

    public void setCancer(Boolean cancer) {
        this.cancer = cancer;
    }

    public Boolean getPneumopatia() {
        return pneumopatia;
    }

    public void setPneumopatia(Boolean pneumopatia) {
        this.pneumopatia = pneumopatia;
    }

    public Boolean getTransplantado() {
        return transplantado;
    }

    public void setTransplantado(Boolean transplantado) {
        this.transplantado = transplantado;
    }

    public Boolean getAlergia() {
        return alergia;
    }

    public void setAlergia(Boolean alergia) {
        this.alergia = alergia;
    }

    public Boolean getOutrasComorbidades() {
        return outrasComorbidades;
    }

    public void setOutrasComorbidades(Boolean outrasComorbidades) {
        this.outrasComorbidades = outrasComorbidades;
    }

    public String getAntecedPessoal() {
        return antecedPessoal;
    }

    public void setAntecedPessoal(String antecedPessoal) {
        this.antecedPessoal = antecedPessoal;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public Boolean getGestante() {
        return gestante;
    }

    public void setGestante(Boolean gestante) {
        this.gestante = gestante;
    }

    public Date getDtprevistanasc() {
        return dtprevistanasc;
    }

    public void setDtprevistanasc(Date dtprevistanasc) {
        this.dtprevistanasc = dtprevistanasc;
    }

    public Convenio getCodConv() {
        return codConv;
    }

    public void setCodConv(Convenio codConv) {
        this.codConv = codConv;
    }

    public TipoPlano getCodTipoPlano() {
        return codTipoPlano;
    }

    public void setCodTipoPlano(TipoPlano codTipoPlano) {
        this.codTipoPlano = codTipoPlano;
    }

    public Tipoparto getCodPar() {
        return codPar;
    }

    public void setCodPar(Tipoparto codPar) {
        this.codPar = codPar;
    }

//    @XmlTransient
//    public List<Internacao> getInternacaoList() {
//        return internacaoList;
//    }
//
//    public void setInternacaoList(List<Internacao> internacaoList) {
//        this.internacaoList = internacaoList;
//    }

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
        hash += (codPro != null ? codPro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pacientes)) {
            return false;
        }
        Pacientes other = (Pacientes) object;
        if ((this.codPro == null && other.codPro != null) || (this.codPro != null && !this.codPro.equals(other.codPro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Pacientes[ codPro=" + codPro + " ]";
    }
    
}
