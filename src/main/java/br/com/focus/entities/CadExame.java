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
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
@Table(name = "CAD_EXAME")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CadExame.findAll", query = "SELECT c FROM CadExame c"),
    @NamedQuery(name = "CadExame.findByCodExame", query = "SELECT c FROM CadExame c WHERE c.codExame = :codExame"),
    @NamedQuery(name = "CadExame.findByCodSus", query = "SELECT c FROM CadExame c WHERE c.codSus = :codSus"),
    @NamedQuery(name = "CadExame.findByDescricao", query = "SELECT c FROM CadExame c WHERE c.descricao = :descricao"),
    @NamedQuery(name = "CadExame.findByPrazoEntrega", query = "SELECT c FROM CadExame c WHERE c.prazoEntrega = :prazoEntrega"),
    @NamedQuery(name = "CadExame.findBySexo", query = "SELECT c FROM CadExame c WHERE c.sexo = :sexo"),
    @NamedQuery(name = "CadExame.findByAntibiograma", query = "SELECT c FROM CadExame c WHERE c.antibiograma = :antibiograma"),
    @NamedQuery(name = "CadExame.findByInterfaceado", query = "SELECT c FROM CadExame c WHERE c.interfaceado = :interfaceado"),
    @NamedQuery(name = "CadExame.findByPadrao", query = "SELECT c FROM CadExame c WHERE c.padrao = :padrao")})
public class CadExame implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_EXAME")
    private Integer codExame;
    @Column(name = "COD_SUS")
    private String codSus;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "PRAZO_ENTREGA")
    private Integer prazoEntrega;
    @Column(name = "SEXO")
    private String sexo;
    @Column(name = "ANTIBIOGRAMA")
    private Boolean antibiograma;
    @Column(name = "INTERFACEADO")
    private Boolean interfaceado;
    @Lob
    @Column(name = "ORIENTA_PAC_EXAME")
    private String orientaPacExame;
    @Column(name = "PADRAO")
    private String padrao;
    @ManyToMany(mappedBy = "cadExameList", fetch = FetchType.EAGER)
    private List<EquipamentoExa> equipamentoExaList;
    @JoinTable(name = "EXAME_MATERIAL", joinColumns = {
        @JoinColumn(name = "COD_EXAME", referencedColumnName = "COD_EXAME")}, inverseJoinColumns = {
        @JoinColumn(name = "COD_MATERIAL", referencedColumnName = "COD_MATERIAL")})
    @ManyToMany(fetch = FetchType.EAGER)
    private List<MaterialExa> materialExaList;
    @JoinColumn(name = "COD_FAMILIAEXAME", referencedColumnName = "COD_FAMILIAEXAME")
    @ManyToOne(fetch = FetchType.EAGER)
    private FamiliaExame codFamiliaexame;
    @OneToMany(mappedBy = "codExame", fetch = FetchType.EAGER)
    private List<Cotasexalab> cotasexalabList;

    public CadExame() {
    }

    public CadExame(Integer codExame) {
        this.codExame = codExame;
    }

    public Integer getCodExame() {
        return codExame;
    }

    public void setCodExame(Integer codExame) {
        this.codExame = codExame;
    }

    public String getCodSus() {
        return codSus;
    }

    public void setCodSus(String codSus) {
        this.codSus = codSus;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getPrazoEntrega() {
        return prazoEntrega;
    }

    public void setPrazoEntrega(Integer prazoEntrega) {
        this.prazoEntrega = prazoEntrega;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Boolean getAntibiograma() {
        return antibiograma;
    }

    public void setAntibiograma(Boolean antibiograma) {
        this.antibiograma = antibiograma;
    }

    public Boolean getInterfaceado() {
        return interfaceado;
    }

    public void setInterfaceado(Boolean interfaceado) {
        this.interfaceado = interfaceado;
    }

    public String getOrientaPacExame() {
        return orientaPacExame;
    }

    public void setOrientaPacExame(String orientaPacExame) {
        this.orientaPacExame = orientaPacExame;
    }

    public String getPadrao() {
        return padrao;
    }

    public void setPadrao(String padrao) {
        this.padrao = padrao;
    }

    @XmlTransient
    public List<EquipamentoExa> getEquipamentoExaList() {
        return equipamentoExaList;
    }

    public void setEquipamentoExaList(List<EquipamentoExa> equipamentoExaList) {
        this.equipamentoExaList = equipamentoExaList;
    }

    @XmlTransient
    public List<MaterialExa> getMaterialExaList() {
        return materialExaList;
    }

    public void setMaterialExaList(List<MaterialExa> materialExaList) {
        this.materialExaList = materialExaList;
    }

    public FamiliaExame getCodFamiliaexame() {
        return codFamiliaexame;
    }

    public void setCodFamiliaexame(FamiliaExame codFamiliaexame) {
        this.codFamiliaexame = codFamiliaexame;
    }

    @XmlTransient
    public List<Cotasexalab> getCotasexalabList() {
        return cotasexalabList;
    }

    public void setCotasexalabList(List<Cotasexalab> cotasexalabList) {
        this.cotasexalabList = cotasexalabList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codExame != null ? codExame.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CadExame)) {
            return false;
        }
        CadExame other = (CadExame) object;
        if ((this.codExame == null && other.codExame != null) || (this.codExame != null && !this.codExame.equals(other.codExame))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.CadExame[ codExame=" + codExame + " ]";
    }
    
}
