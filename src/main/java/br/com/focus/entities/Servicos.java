/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
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
@Table(name = "SERVICOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Servicos.findAll", query = "SELECT s FROM Servicos s"),
    @NamedQuery(name = "Servicos.findByCodSer", query = "SELECT s FROM Servicos s WHERE s.codSer = :codSer"),
    @NamedQuery(name = "Servicos.findByCodigo", query = "SELECT s FROM Servicos s WHERE s.codigo = :codigo"),
    @NamedQuery(name = "Servicos.findByDescricao", query = "SELECT s FROM Servicos s WHERE s.descricao = :descricao"),
    @NamedQuery(name = "Servicos.findByCompetencia", query = "SELECT s FROM Servicos s WHERE s.competencia = :competencia")})
public class Servicos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_SER")
    private Integer codSer;
    @Column(name = "CODIGO")
    private String codigo;
    @Column(name = "DESCRICAO")
    private String descricao;
    @Column(name = "COMPETENCIA")
    private String competencia;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "servicos", fetch = FetchType.EAGER)
    private List<ServicoClassificacao> servicoClassificacaoList;

    public Servicos() {
    }

    public Servicos(Integer codSer) {
        this.codSer = codSer;
    }

    public Integer getCodSer() {
        return codSer;
    }

    public void setCodSer(Integer codSer) {
        this.codSer = codSer;
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

    public String getCompetencia() {
        return competencia;
    }

    public void setCompetencia(String competencia) {
        this.competencia = competencia;
    }

    @XmlTransient
    public List<ServicoClassificacao> getServicoClassificacaoList() {
        return servicoClassificacaoList;
    }

    public void setServicoClassificacaoList(List<ServicoClassificacao> servicoClassificacaoList) {
        this.servicoClassificacaoList = servicoClassificacaoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codSer != null ? codSer.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicos)) {
            return false;
        }
        Servicos other = (Servicos) object;
        if ((this.codSer == null && other.codSer != null) || (this.codSer != null && !this.codSer.equals(other.codSer))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Servicos[ codSer=" + codSer + " ]";
    }
    
}
