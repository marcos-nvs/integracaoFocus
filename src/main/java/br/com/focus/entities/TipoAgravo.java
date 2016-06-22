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
@Table(name = "TIPO_AGRAVO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoAgravo.findAll", query = "SELECT t FROM TipoAgravo t"),
    @NamedQuery(name = "TipoAgravo.findByCodTipoAgravo", query = "SELECT t FROM TipoAgravo t WHERE t.codTipoAgravo = :codTipoAgravo"),
    @NamedQuery(name = "TipoAgravo.findByDescricao", query = "SELECT t FROM TipoAgravo t WHERE t.descricao = :descricao"),
    @NamedQuery(name = "TipoAgravo.findByIdentificador", query = "SELECT t FROM TipoAgravo t WHERE t.identificador = :identificador")})
public class TipoAgravo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_TIPO_AGRAVO")
    private Integer codTipoAgravo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "IDENTIFICADOR")
    private String identificador;
    @OneToMany(mappedBy = "agravo", fetch = FetchType.EAGER)
    private List<Cid> cidList;

    public TipoAgravo() {
    }

    public TipoAgravo(Integer codTipoAgravo) {
        this.codTipoAgravo = codTipoAgravo;
    }

    public Integer getCodTipoAgravo() {
        return codTipoAgravo;
    }

    public void setCodTipoAgravo(Integer codTipoAgravo) {
        this.codTipoAgravo = codTipoAgravo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    @XmlTransient
    public List<Cid> getCidList() {
        return cidList;
    }

    public void setCidList(List<Cid> cidList) {
        this.cidList = cidList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codTipoAgravo != null ? codTipoAgravo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoAgravo)) {
            return false;
        }
        TipoAgravo other = (TipoAgravo) object;
        if ((this.codTipoAgravo == null && other.codTipoAgravo != null) || (this.codTipoAgravo != null && !this.codTipoAgravo.equals(other.codTipoAgravo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.TipoAgravo[ codTipoAgravo=" + codTipoAgravo + " ]";
    }
    
}
