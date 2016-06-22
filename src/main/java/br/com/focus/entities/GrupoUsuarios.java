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
@Table(name = "GRUPO_USUARIOS")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GrupoUsuarios.findAll", query = "SELECT g FROM GrupoUsuarios g"),
    @NamedQuery(name = "GrupoUsuarios.findByCodGrupoUsu", query = "SELECT g FROM GrupoUsuarios g WHERE g.codGrupoUsu = :codGrupoUsu"),
    @NamedQuery(name = "GrupoUsuarios.findByNome", query = "SELECT g FROM GrupoUsuarios g WHERE g.nome = :nome"),
    @NamedQuery(name = "GrupoUsuarios.findBySistema", query = "SELECT g FROM GrupoUsuarios g WHERE g.sistema = :sistema")})
public class GrupoUsuarios implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_GRUPO_USU")
    private Integer codGrupoUsu;
    @Basic(optional = false)
    @Column(name = "NOME")
    private String nome;
    @Column(name = "SISTEMA")
    private Character sistema;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "codGrupoUsu", fetch = FetchType.EAGER)
    private List<Usuarios> usuariosList;

    public GrupoUsuarios() {
    }

    public GrupoUsuarios(Integer codGrupoUsu) {
        this.codGrupoUsu = codGrupoUsu;
    }

    public GrupoUsuarios(Integer codGrupoUsu, String nome) {
        this.codGrupoUsu = codGrupoUsu;
        this.nome = nome;
    }

    public Integer getCodGrupoUsu() {
        return codGrupoUsu;
    }

    public void setCodGrupoUsu(Integer codGrupoUsu) {
        this.codGrupoUsu = codGrupoUsu;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Character getSistema() {
        return sistema;
    }

    public void setSistema(Character sistema) {
        this.sistema = sistema;
    }

    @XmlTransient
    public List<Usuarios> getUsuariosList() {
        return usuariosList;
    }

    public void setUsuariosList(List<Usuarios> usuariosList) {
        this.usuariosList = usuariosList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codGrupoUsu != null ? codGrupoUsu.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GrupoUsuarios)) {
            return false;
        }
        GrupoUsuarios other = (GrupoUsuarios) object;
        if ((this.codGrupoUsu == null && other.codGrupoUsu != null) || (this.codGrupoUsu != null && !this.codGrupoUsu.equals(other.codGrupoUsu))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.GrupoUsuarios[ codGrupoUsu=" + codGrupoUsu + " ]";
    }
    
}
