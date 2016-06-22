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
import javax.persistence.Lob;
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
@Table(name = "LOTE_FATURA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "LoteFatura.findAll", query = "SELECT l FROM LoteFatura l"),
    @NamedQuery(name = "LoteFatura.findByCodLoteFatura", query = "SELECT l FROM LoteFatura l WHERE l.codLoteFatura = :codLoteFatura"),
    @NamedQuery(name = "LoteFatura.findByStatusL", query = "SELECT l FROM LoteFatura l WHERE l.statusL = :statusL"),
    @NamedQuery(name = "LoteFatura.findByDataGerou", query = "SELECT l FROM LoteFatura l WHERE l.dataGerou = :dataGerou"),
    @NamedQuery(name = "LoteFatura.findByCodUsuGerou", query = "SELECT l FROM LoteFatura l WHERE l.codUsuGerou = :codUsuGerou"),
    @NamedQuery(name = "LoteFatura.findByMaqGerou", query = "SELECT l FROM LoteFatura l WHERE l.maqGerou = :maqGerou"),
    @NamedQuery(name = "LoteFatura.findByDataEnviou", query = "SELECT l FROM LoteFatura l WHERE l.dataEnviou = :dataEnviou"),
    @NamedQuery(name = "LoteFatura.findByCodUsuEnviou", query = "SELECT l FROM LoteFatura l WHERE l.codUsuEnviou = :codUsuEnviou"),
    @NamedQuery(name = "LoteFatura.findByMaqEnviou", query = "SELECT l FROM LoteFatura l WHERE l.maqEnviou = :maqEnviou"),
    @NamedQuery(name = "LoteFatura.findByDataFaturou", query = "SELECT l FROM LoteFatura l WHERE l.dataFaturou = :dataFaturou"),
    @NamedQuery(name = "LoteFatura.findByCodUsuFaturou", query = "SELECT l FROM LoteFatura l WHERE l.codUsuFaturou = :codUsuFaturou"),
    @NamedQuery(name = "LoteFatura.findByMaqFaturou", query = "SELECT l FROM LoteFatura l WHERE l.maqFaturou = :maqFaturou"),
    @NamedQuery(name = "LoteFatura.findByDataCancelou", query = "SELECT l FROM LoteFatura l WHERE l.dataCancelou = :dataCancelou"),
    @NamedQuery(name = "LoteFatura.findByCodUsuCancelou", query = "SELECT l FROM LoteFatura l WHERE l.codUsuCancelou = :codUsuCancelou"),
    @NamedQuery(name = "LoteFatura.findByMaqCancelou", query = "SELECT l FROM LoteFatura l WHERE l.maqCancelou = :maqCancelou"),
    @NamedQuery(name = "LoteFatura.findByGrupoUniL", query = "SELECT l FROM LoteFatura l WHERE l.grupoUniL = :grupoUniL"),
    @NamedQuery(name = "LoteFatura.findByMesano", query = "SELECT l FROM LoteFatura l WHERE l.mesano = :mesano"),
    @NamedQuery(name = "LoteFatura.findByTemA", query = "SELECT l FROM LoteFatura l WHERE l.temA = :temA"),
    @NamedQuery(name = "LoteFatura.findByTemO", query = "SELECT l FROM LoteFatura l WHERE l.temO = :temO"),
    @NamedQuery(name = "LoteFatura.findByTemM", query = "SELECT l FROM LoteFatura l WHERE l.temM = :temM")})
public class LoteFatura implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_LOTE_FATURA")
    private Integer codLoteFatura;
    @Column(name = "STATUS_L")
    private Character statusL;
    @Column(name = "DATA_GEROU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataGerou;
    @Column(name = "COD_USU_GEROU")
    private Integer codUsuGerou;
    @Column(name = "MAQ_GEROU")
    private String maqGerou;
    @Column(name = "DATA_ENVIOU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataEnviou;
    @Column(name = "COD_USU_ENVIOU")
    private Integer codUsuEnviou;
    @Column(name = "MAQ_ENVIOU")
    private String maqEnviou;
    @Column(name = "DATA_FATUROU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataFaturou;
    @Column(name = "COD_USU_FATUROU")
    private Integer codUsuFaturou;
    @Column(name = "MAQ_FATUROU")
    private String maqFaturou;
    @Column(name = "DATA_CANCELOU")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCancelou;
    @Column(name = "COD_USU_CANCELOU")
    private Integer codUsuCancelou;
    @Column(name = "MAQ_CANCELOU")
    private String maqCancelou;
    @Column(name = "GRUPO_UNI_L")
    private String grupoUniL;
    @Column(name = "MESANO")
    private String mesano;
    @Column(name = "TEM_A")
    private Boolean temA;
    @Column(name = "TEM_O")
    private Boolean temO;
    @Column(name = "TEM_M")
    private Boolean temM;
    @Lob
    @Column(name = "MOTIVO_C")
    private String motivoC;
    @OneToMany(mappedBy = "codLoteFatura", fetch = FetchType.EAGER)
    private List<Bpaitens> bpaitensList;

    public LoteFatura() {
    }

    public LoteFatura(Integer codLoteFatura) {
        this.codLoteFatura = codLoteFatura;
    }

    public Integer getCodLoteFatura() {
        return codLoteFatura;
    }

    public void setCodLoteFatura(Integer codLoteFatura) {
        this.codLoteFatura = codLoteFatura;
    }

    public Character getStatusL() {
        return statusL;
    }

    public void setStatusL(Character statusL) {
        this.statusL = statusL;
    }

    public Date getDataGerou() {
        return dataGerou;
    }

    public void setDataGerou(Date dataGerou) {
        this.dataGerou = dataGerou;
    }

    public Integer getCodUsuGerou() {
        return codUsuGerou;
    }

    public void setCodUsuGerou(Integer codUsuGerou) {
        this.codUsuGerou = codUsuGerou;
    }

    public String getMaqGerou() {
        return maqGerou;
    }

    public void setMaqGerou(String maqGerou) {
        this.maqGerou = maqGerou;
    }

    public Date getDataEnviou() {
        return dataEnviou;
    }

    public void setDataEnviou(Date dataEnviou) {
        this.dataEnviou = dataEnviou;
    }

    public Integer getCodUsuEnviou() {
        return codUsuEnviou;
    }

    public void setCodUsuEnviou(Integer codUsuEnviou) {
        this.codUsuEnviou = codUsuEnviou;
    }

    public String getMaqEnviou() {
        return maqEnviou;
    }

    public void setMaqEnviou(String maqEnviou) {
        this.maqEnviou = maqEnviou;
    }

    public Date getDataFaturou() {
        return dataFaturou;
    }

    public void setDataFaturou(Date dataFaturou) {
        this.dataFaturou = dataFaturou;
    }

    public Integer getCodUsuFaturou() {
        return codUsuFaturou;
    }

    public void setCodUsuFaturou(Integer codUsuFaturou) {
        this.codUsuFaturou = codUsuFaturou;
    }

    public String getMaqFaturou() {
        return maqFaturou;
    }

    public void setMaqFaturou(String maqFaturou) {
        this.maqFaturou = maqFaturou;
    }

    public Date getDataCancelou() {
        return dataCancelou;
    }

    public void setDataCancelou(Date dataCancelou) {
        this.dataCancelou = dataCancelou;
    }

    public Integer getCodUsuCancelou() {
        return codUsuCancelou;
    }

    public void setCodUsuCancelou(Integer codUsuCancelou) {
        this.codUsuCancelou = codUsuCancelou;
    }

    public String getMaqCancelou() {
        return maqCancelou;
    }

    public void setMaqCancelou(String maqCancelou) {
        this.maqCancelou = maqCancelou;
    }

    public String getGrupoUniL() {
        return grupoUniL;
    }

    public void setGrupoUniL(String grupoUniL) {
        this.grupoUniL = grupoUniL;
    }

    public String getMesano() {
        return mesano;
    }

    public void setMesano(String mesano) {
        this.mesano = mesano;
    }

    public Boolean getTemA() {
        return temA;
    }

    public void setTemA(Boolean temA) {
        this.temA = temA;
    }

    public Boolean getTemO() {
        return temO;
    }

    public void setTemO(Boolean temO) {
        this.temO = temO;
    }

    public Boolean getTemM() {
        return temM;
    }

    public void setTemM(Boolean temM) {
        this.temM = temM;
    }

    public String getMotivoC() {
        return motivoC;
    }

    public void setMotivoC(String motivoC) {
        this.motivoC = motivoC;
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
        hash += (codLoteFatura != null ? codLoteFatura.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof LoteFatura)) {
            return false;
        }
        LoteFatura other = (LoteFatura) object;
        if ((this.codLoteFatura == null && other.codLoteFatura != null) || (this.codLoteFatura != null && !this.codLoteFatura.equals(other.codLoteFatura))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.LoteFatura[ codLoteFatura=" + codLoteFatura + " ]";
    }
    
}
