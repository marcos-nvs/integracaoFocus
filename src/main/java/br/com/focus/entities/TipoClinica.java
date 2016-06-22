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
@Table(name = "TIPO_CLINICA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoClinica.findAll", query = "SELECT t FROM TipoClinica t"),
    @NamedQuery(name = "TipoClinica.findByCodClin", query = "SELECT t FROM TipoClinica t WHERE t.codClin = :codClin"),
    @NamedQuery(name = "TipoClinica.findByCodigo", query = "SELECT t FROM TipoClinica t WHERE t.codigo = :codigo"),
    @NamedQuery(name = "TipoClinica.findByClinica", query = "SELECT t FROM TipoClinica t WHERE t.clinica = :clinica")})
public class TipoClinica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_CLIN")
    private Integer codClin;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "CLINICA")
    private String clinica;
    @OneToMany(mappedBy = "codClin", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList;

    public TipoClinica() {
    }

    public TipoClinica(Integer codClin) {
        this.codClin = codClin;
    }

    public Integer getCodClin() {
        return codClin;
    }

    public void setCodClin(Integer codClin) {
        this.codClin = codClin;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getClinica() {
        return clinica;
    }

    public void setClinica(String clinica) {
        this.clinica = clinica;
    }

    @XmlTransient
    public List<Internacao> getInternacaoList() {
        return internacaoList;
    }

    public void setInternacaoList(List<Internacao> internacaoList) {
        this.internacaoList = internacaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codClin != null ? codClin.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoClinica)) {
            return false;
        }
        TipoClinica other = (TipoClinica) object;
        if ((this.codClin == null && other.codClin != null) || (this.codClin != null && !this.codClin.equals(other.codClin))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.TipoClinica[ codClin=" + codClin + " ]";
    }
    
}
