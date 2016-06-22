/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author F12684146896
 */
@Entity
@Table(name = "LABEXA")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Labexa.findAll", query = "SELECT l FROM Labexa l"),
    @NamedQuery(name = "Labexa.findByCodLab", query = "SELECT l FROM Labexa l WHERE l.codLab = :codLab"),
    @NamedQuery(name = "Labexa.findByNome", query = "SELECT l FROM Labexa l WHERE l.nome = :nome"),
    @NamedQuery(name = "Labexa.findByTelefone", query = "SELECT l FROM Labexa l WHERE l.telefone = :telefone"),
    @NamedQuery(name = "Labexa.findByCidade", query = "SELECT l FROM Labexa l WHERE l.cidade = :cidade"),
    @NamedQuery(name = "Labexa.findByEndereco", query = "SELECT l FROM Labexa l WHERE l.endereco = :endereco"),
    @NamedQuery(name = "Labexa.findByResponsavel", query = "SELECT l FROM Labexa l WHERE l.responsavel = :responsavel"),
    @NamedQuery(name = "Labexa.findByTipoCV", query = "SELECT l FROM Labexa l WHERE l.tipoCV = :tipoCV"),
    @NamedQuery(name = "Labexa.findByValortotal", query = "SELECT l FROM Labexa l WHERE l.valortotal = :valortotal"),
    @NamedQuery(name = "Labexa.findByAtivo", query = "SELECT l FROM Labexa l WHERE l.ativo = :ativo"),
    @NamedQuery(name = "Labexa.findByNomeUsuUsando", query = "SELECT l FROM Labexa l WHERE l.nomeUsuUsando = :nomeUsuUsando"),
    @NamedQuery(name = "Labexa.findByMaqUsando", query = "SELECT l FROM Labexa l WHERE l.maqUsando = :maqUsando"),
    @NamedQuery(name = "Labexa.findByDataUsando", query = "SELECT l FROM Labexa l WHERE l.dataUsando = :dataUsando")})
public class Labexa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_LAB")
    private Integer codLab;
    @Column(name = "NOME")
    private String nome;
    @Column(name = "TELEFONE")
    private String telefone;
    @Column(name = "CIDADE")
    private String cidade;
    @Column(name = "ENDERECO")
    private String endereco;
    @Column(name = "RESPONSAVEL")
    private String responsavel;
    @Column(name = "TIPO_C_V")
    private Character tipoCV;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALORTOTAL")
    private Float valortotal;
    @Column(name = "ATIVO")
    private Boolean ativo;
    @Column(name = "NOME_USU_USANDO")
    private String nomeUsuUsando;
    @Column(name = "MAQ_USANDO")
    private String maqUsando;
    @Column(name = "DATA_USANDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUsando;
    @JoinColumn(name = "COD_USU_USANDO", referencedColumnName = "COD_USU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios codUsuUsando;
    @OneToMany(mappedBy = "codLab", fetch = FetchType.EAGER)
    private List<Cotasexalab> cotasexalabList;
    @OneToMany(mappedBy = "codLab", fetch = FetchType.EAGER)
    private List<Agendaexa> agendaexaList;

    public Labexa() {
    }

    public Labexa(Integer codLab) {
        this.codLab = codLab;
    }

    public Integer getCodLab() {
        return codLab;
    }

    public void setCodLab(Integer codLab) {
        this.codLab = codLab;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Character getTipoCV() {
        return tipoCV;
    }

    public void setTipoCV(Character tipoCV) {
        this.tipoCV = tipoCV;
    }

    public Float getValortotal() {
        return valortotal;
    }

    public void setValortotal(Float valortotal) {
        this.valortotal = valortotal;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getNomeUsuUsando() {
        return nomeUsuUsando;
    }

    public void setNomeUsuUsando(String nomeUsuUsando) {
        this.nomeUsuUsando = nomeUsuUsando;
    }

    public String getMaqUsando() {
        return maqUsando;
    }

    public void setMaqUsando(String maqUsando) {
        this.maqUsando = maqUsando;
    }

    public Date getDataUsando() {
        return dataUsando;
    }

    public void setDataUsando(Date dataUsando) {
        this.dataUsando = dataUsando;
    }

    public Usuarios getCodUsuUsando() {
        return codUsuUsando;
    }

    public void setCodUsuUsando(Usuarios codUsuUsando) {
        this.codUsuUsando = codUsuUsando;
    }

    @XmlTransient
    public List<Cotasexalab> getCotasexalabList() {
        return cotasexalabList;
    }

    public void setCotasexalabList(List<Cotasexalab> cotasexalabList) {
        this.cotasexalabList = cotasexalabList;
    }

    @XmlTransient
    public List<Agendaexa> getAgendaexaList() {
        return agendaexaList;
    }

    public void setAgendaexaList(List<Agendaexa> agendaexaList) {
        this.agendaexaList = agendaexaList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codLab != null ? codLab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Labexa)) {
            return false;
        }
        Labexa other = (Labexa) object;
        if ((this.codLab == null && other.codLab != null) || (this.codLab != null && !this.codLab.equals(other.codLab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Labexa[ codLab=" + codLab + " ]";
    }
    
}
