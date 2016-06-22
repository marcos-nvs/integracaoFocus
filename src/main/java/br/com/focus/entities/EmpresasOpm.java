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
import javax.persistence.Lob;
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
@Table(name = "EMPRESAS_OPM")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EmpresasOpm.findAll", query = "SELECT e FROM EmpresasOpm e"),
    @NamedQuery(name = "EmpresasOpm.findByCodEmpresa", query = "SELECT e FROM EmpresasOpm e WHERE e.codEmpresa = :codEmpresa"),
    @NamedQuery(name = "EmpresasOpm.findByCodUni", query = "SELECT e FROM EmpresasOpm e WHERE e.codUni = :codUni"),
    @NamedQuery(name = "EmpresasOpm.findByNome", query = "SELECT e FROM EmpresasOpm e WHERE e.nome = :nome"),
    @NamedQuery(name = "EmpresasOpm.findByRazaoSocial", query = "SELECT e FROM EmpresasOpm e WHERE e.razaoSocial = :razaoSocial"),
    @NamedQuery(name = "EmpresasOpm.findByCnpj", query = "SELECT e FROM EmpresasOpm e WHERE e.cnpj = :cnpj"),
    @NamedQuery(name = "EmpresasOpm.findByEndereco", query = "SELECT e FROM EmpresasOpm e WHERE e.endereco = :endereco"),
    @NamedQuery(name = "EmpresasOpm.findByNum", query = "SELECT e FROM EmpresasOpm e WHERE e.num = :num"),
    @NamedQuery(name = "EmpresasOpm.findByComplemento", query = "SELECT e FROM EmpresasOpm e WHERE e.complemento = :complemento"),
    @NamedQuery(name = "EmpresasOpm.findByBairro", query = "SELECT e FROM EmpresasOpm e WHERE e.bairro = :bairro"),
    @NamedQuery(name = "EmpresasOpm.findByCep", query = "SELECT e FROM EmpresasOpm e WHERE e.cep = :cep"),
    @NamedQuery(name = "EmpresasOpm.findByCodibge", query = "SELECT e FROM EmpresasOpm e WHERE e.codibge = :codibge"),
    @NamedQuery(name = "EmpresasOpm.findByFone", query = "SELECT e FROM EmpresasOpm e WHERE e.fone = :fone"),
    @NamedQuery(name = "EmpresasOpm.findByFax", query = "SELECT e FROM EmpresasOpm e WHERE e.fax = :fax"),
    @NamedQuery(name = "EmpresasOpm.findByEmail", query = "SELECT e FROM EmpresasOpm e WHERE e.email = :email")})
public class EmpresasOpm implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_EMPRESA")
    private Integer codEmpresa;
    @Column(name = "COD_UNI")
    private Integer codUni;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "RAZAO_SOCIAL")
    private String razaoSocial;
    @Column(name = "CNPJ")
    private String cnpj;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "NUM")
    private String num;
    @Column(name = "COMPLEMENTO")
    private String complemento;
    @Column(name = "BAIRRO")
    private String bairro;
    @Column(name = "CEP")
    private String cep;
    @Column(name = "CODIBGE")
    private String codibge;
    @Column(name = "FONE")
    private String fone;
    @Column(name = "FAX")
    private String fax;
    @Column(name = "EMAIL")
    private String email;
    @Lob
    @Column(name = "OBS")
    private String obs;
    @OneToMany(mappedBy = "codEmpresaOpm", fetch = FetchType.EAGER)
    private List<Bpaitens> bpaitensList;

    public EmpresasOpm() {
    }

    public EmpresasOpm(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public Integer getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(Integer codEmpresa) {
        this.codEmpresa = codEmpresa;
    }

    public Integer getCodUni() {
        return codUni;
    }

    public void setCodUni(Integer codUni) {
        this.codUni = codUni;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCodibge() {
        return codibge;
    }

    public void setCodibge(String codibge) {
        this.codibge = codibge;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
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
        hash += (codEmpresa != null ? codEmpresa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EmpresasOpm)) {
            return false;
        }
        EmpresasOpm other = (EmpresasOpm) object;
        if ((this.codEmpresa == null && other.codEmpresa != null) || (this.codEmpresa != null && !this.codEmpresa.equals(other.codEmpresa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.EmpresasOpm[ codEmpresa=" + codEmpresa + " ]";
    }
    
}
