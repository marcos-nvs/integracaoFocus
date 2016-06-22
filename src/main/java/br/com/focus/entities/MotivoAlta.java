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
@Table(name = "MOTIVO_ALTA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MotivoAlta.findAll", query = "SELECT m FROM MotivoAlta m"),
    @NamedQuery(name = "MotivoAlta.findByCodMotivoAlta", query = "SELECT m FROM MotivoAlta m WHERE m.codMotivoAlta = :codMotivoAlta"),
    @NamedQuery(name = "MotivoAlta.findByNomeMotivo", query = "SELECT m FROM MotivoAlta m WHERE m.nomeMotivo = :nomeMotivo"),
    @NamedQuery(name = "MotivoAlta.findByCodigoAlta", query = "SELECT m FROM MotivoAlta m WHERE m.codigoAlta = :codigoAlta"),
    @NamedQuery(name = "MotivoAlta.findByTipo", query = "SELECT m FROM MotivoAlta m WHERE m.tipo = :tipo")})
public class MotivoAlta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_MOTIVO_ALTA")
    private Integer codMotivoAlta;
    @Column(name = "NOME_MOTIVO")
    private String nomeMotivo;
    @Column(name = "CODIGO_ALTA")
    private String codigoAlta;
    @Column(name = "TIPO")
    private Character tipo;
    @OneToMany(mappedBy = "codMotivoAlta", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList;

    public MotivoAlta() {
    }

    public MotivoAlta(Integer codMotivoAlta) {
        this.codMotivoAlta = codMotivoAlta;
    }

    public Integer getCodMotivoAlta() {
        return codMotivoAlta;
    }

    public void setCodMotivoAlta(Integer codMotivoAlta) {
        this.codMotivoAlta = codMotivoAlta;
    }

    public String getNomeMotivo() {
        return nomeMotivo;
    }

    public void setNomeMotivo(String nomeMotivo) {
        this.nomeMotivo = nomeMotivo;
    }

    public String getCodigoAlta() {
        return codigoAlta;
    }

    public void setCodigoAlta(String codigoAlta) {
        this.codigoAlta = codigoAlta;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
        this.tipo = tipo;
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
        hash += (codMotivoAlta != null ? codMotivoAlta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof MotivoAlta)) {
            return false;
        }
        MotivoAlta other = (MotivoAlta) object;
        if ((this.codMotivoAlta == null && other.codMotivoAlta != null) || (this.codMotivoAlta != null && !this.codMotivoAlta.equals(other.codMotivoAlta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.MotivoAlta[ codMotivoAlta=" + codMotivoAlta + " ]";
    }
    
}
