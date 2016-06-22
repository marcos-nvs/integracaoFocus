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
@Table(name = "RUBRICA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Rubrica.findAll", query = "SELECT r FROM Rubrica r"),
    @NamedQuery(name = "Rubrica.findByCodRubrica", query = "SELECT r FROM Rubrica r WHERE r.codRubrica = :codRubrica"),
    @NamedQuery(name = "Rubrica.findByNome", query = "SELECT r FROM Rubrica r WHERE r.nome = :nome")})
public class Rubrica implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_RUBRICA")
    private String codRubrica;
    @Column(name = "NOME")
    private String nome;
    @OneToMany(mappedBy = "codRubrica", fetch = FetchType.EAGER)
    private List<ProcedimentoUnif> procedimentoUnifList;

    public Rubrica() {
    }

    public Rubrica(String codRubrica) {
        this.codRubrica = codRubrica;
    }

    public String getCodRubrica() {
        return codRubrica;
    }

    public void setCodRubrica(String codRubrica) {
        this.codRubrica = codRubrica;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public List<ProcedimentoUnif> getProcedimentoUnifList() {
        return procedimentoUnifList;
    }

    public void setProcedimentoUnifList(List<ProcedimentoUnif> procedimentoUnifList) {
        this.procedimentoUnifList = procedimentoUnifList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codRubrica != null ? codRubrica.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Rubrica)) {
            return false;
        }
        Rubrica other = (Rubrica) object;
        if ((this.codRubrica == null && other.codRubrica != null) || (this.codRubrica != null && !this.codRubrica.equals(other.codRubrica))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Rubrica[ codRubrica=" + codRubrica + " ]";
    }
    
}
