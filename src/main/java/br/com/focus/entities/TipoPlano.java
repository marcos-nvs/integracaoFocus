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
@Table(name = "TIPO_PLANO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoPlano.findAll", query = "SELECT t FROM TipoPlano t"),
    @NamedQuery(name = "TipoPlano.findByCodTipoPlano", query = "SELECT t FROM TipoPlano t WHERE t.codTipoPlano = :codTipoPlano"),
    @NamedQuery(name = "TipoPlano.findByNome", query = "SELECT t FROM TipoPlano t WHERE t.nome = :nome")})
public class TipoPlano implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_TIPO_PLANO")
    private Integer codTipoPlano;
    @Column(name = "NOME")
    private String nome;
    @OneToMany(mappedBy = "codTipoPlano", fetch = FetchType.EAGER)
    private List<Pacientes> pacientesList;
    @JoinColumn(name = "COD_CONV", referencedColumnName = "COD_CONV")
    @ManyToOne(optional = false, fetch = FetchType.EAGER)
    private Convenio codConv;
    @OneToMany(mappedBy = "codTipoPlano", fetch = FetchType.EAGER)
    private List<Internacao> internacaoList;

    public TipoPlano() {
    }

    public TipoPlano(Integer codTipoPlano) {
        this.codTipoPlano = codTipoPlano;
    }

    public Integer getCodTipoPlano() {
        return codTipoPlano;
    }

    public void setCodTipoPlano(Integer codTipoPlano) {
        this.codTipoPlano = codTipoPlano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<Pacientes> getPacientesList() {
        return pacientesList;
    }

    public void setPacientesList(List<Pacientes> pacientesList) {
        this.pacientesList = pacientesList;
    }

    public Convenio getCodConv() {
        return codConv;
    }

    public void setCodConv(Convenio codConv) {
        this.codConv = codConv;
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
        hash += (codTipoPlano != null ? codTipoPlano.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoPlano)) {
            return false;
        }
        TipoPlano other = (TipoPlano) object;
        if ((this.codTipoPlano == null && other.codTipoPlano != null) || (this.codTipoPlano != null && !this.codTipoPlano.equals(other.codTipoPlano))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.TipoPlano[ codTipoPlano=" + codTipoPlano + " ]";
    }
    
}
