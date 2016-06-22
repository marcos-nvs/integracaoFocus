/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author F12684146896
 */
@Entity
@Table(name = "CID")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cid.findAll", query = "SELECT c FROM Cid c"),
    @NamedQuery(name = "Cid.findByCodCid", query = "SELECT c FROM Cid c WHERE c.codCid = :codCid"),
    @NamedQuery(name = "Cid.findByCodigo", query = "SELECT c FROM Cid c WHERE c.codigo = :codigo"),
    @NamedQuery(name = "Cid.findByDescricao", query = "SELECT c FROM Cid c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "Cid.findByOpc", query = "SELECT c FROM Cid c WHERE c.opc = :opc"),
    @NamedQuery(name = "Cid.findByCat", query = "SELECT c FROM Cid c WHERE c.cat = :cat"),
    @NamedQuery(name = "Cid.findBySubcat", query = "SELECT c FROM Cid c WHERE c.subcat = :subcat"),
    @NamedQuery(name = "Cid.findByRestrsexo", query = "SELECT c FROM Cid c WHERE c.restrsexo = :restrsexo"),
    @NamedQuery(name = "Cid.findByCamposRad", query = "SELECT c FROM Cid c WHERE c.camposRad = :camposRad"),
    @NamedQuery(name = "Cid.findByEstadio", query = "SELECT c FROM Cid c WHERE c.estadio = :estadio"),
    @NamedQuery(name = "Cid.findByRepeterad", query = "SELECT c FROM Cid c WHERE c.repeterad = :repeterad"),
    @NamedQuery(name = "Cid.findBySexo", query = "SELECT c FROM Cid c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "Cid.findByDescrEsus", query = "SELECT c FROM Cid c WHERE c.descrEsus = :descrEsus"),
    @NamedQuery(name = "Cid.findByAtivoEsus", query = "SELECT c FROM Cid c WHERE c.ativoEsus = :ativoEsus")})
public class Cid implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CID")
    private Integer codCid;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "OPC")
    private String opc;
    @Column(name = "CAT")
    private String cat;
    @Column(name = "SUBCAT")
    private String subcat;
    @Column(name = "RESTRSEXO")
    private String restrsexo;
    @Column(name = "CAMPOS_RAD")
    private String camposRad;
    @Column(name = "ESTADIO")
    private String estadio;
    @Column(name = "REPETERAD")
    private String repeterad;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "DESCR_ESUS")
    private String descrEsus;
    @Column(name = "ATIVO_ESUS")
    private Boolean ativoEsus;
    @JoinColumn(name = "AGRAVO", referencedColumnName = "COD_TIPO_AGRAVO")
    @ManyToOne(fetch = FetchType.EAGER)
    private TipoAgravo agravo;
    @OneToMany(mappedBy = "cid1", fetch = FetchType.EAGER)
    private List<Bpaitens> bpaitensList;

    public Cid() {
    }

    public Cid(Integer codCid) {
        this.codCid = codCid;
    }

    public Integer getCodCid() {
        return codCid;
    }

    public void setCodCid(Integer codCid) {
        this.codCid = codCid;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getOpc() {
        return opc;
    }

    public void setOpc(String opc) {
        this.opc = opc;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public String getSubcat() {
        return subcat;
    }

    public void setSubcat(String subcat) {
        this.subcat = subcat;
    }

    public String getRestrsexo() {
        return restrsexo;
    }

    public void setRestrsexo(String restrsexo) {
        this.restrsexo = restrsexo;
    }

    public String getCamposRad() {
        return camposRad;
    }

    public void setCamposRad(String camposRad) {
        this.camposRad = camposRad;
    }

    public String getEstadio() {
        return estadio;
    }

    public void setEstadio(String estadio) {
        this.estadio = estadio;
    }

    public String getRepeterad() {
        return repeterad;
    }

    public void setRepeterad(String repeterad) {
        this.repeterad = repeterad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getDescrEsus() {
        return descrEsus;
    }

    public void setDescrEsus(String descrEsus) {
        this.descrEsus = descrEsus;
    }

    public Boolean getAtivoEsus() {
        return ativoEsus;
    }

    public void setAtivoEsus(Boolean ativoEsus) {
        this.ativoEsus = ativoEsus;
    }

    public TipoAgravo getAgravo() {
        return agravo;
    }

    public void setAgravo(TipoAgravo agravo) {
        this.agravo = agravo;
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
        hash += (codCid != null ? codCid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cid)) {
            return false;
        }
        Cid other = (Cid) object;
        if ((this.codCid == null && other.codCid != null) || (this.codCid != null && !this.codCid.equals(other.codCid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Cid[ codCid=" + codCid + " ]";
    }
    
}
