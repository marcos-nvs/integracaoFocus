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
@Table(name = "COTASEXALAB")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Cotasexalab.findAll", query = "SELECT c FROM Cotasexalab c"),
    @NamedQuery(name = "Cotasexalab.findByCodCotasexalab", query = "SELECT c FROM Cotasexalab c WHERE c.codCotasexalab = :codCotasexalab"),
    @NamedQuery(name = "Cotasexalab.findByValor", query = "SELECT c FROM Cotasexalab c WHERE c.valor = :valor"),
    @NamedQuery(name = "Cotasexalab.findByQtde", query = "SELECT c FROM Cotasexalab c WHERE c.qtde = :qtde"),
    @NamedQuery(name = "Cotasexalab.findByQtdeFeita", query = "SELECT c FROM Cotasexalab c WHERE c.qtdeFeita = :qtdeFeita"),
    @NamedQuery(name = "Cotasexalab.findByMesano", query = "SELECT c FROM Cotasexalab c WHERE c.mesano = :mesano"),
    @NamedQuery(name = "Cotasexalab.findByNomeUsuUsando", query = "SELECT c FROM Cotasexalab c WHERE c.nomeUsuUsando = :nomeUsuUsando"),
    @NamedQuery(name = "Cotasexalab.findByMaqUsando", query = "SELECT c FROM Cotasexalab c WHERE c.maqUsando = :maqUsando"),
    @NamedQuery(name = "Cotasexalab.findByDataUsando", query = "SELECT c FROM Cotasexalab c WHERE c.dataUsando = :dataUsando")})
public class Cotasexalab implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "COD_COTASEXALAB")
    private Integer codCotasexalab;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "VALOR")
    private Float valor;
    @Column(name = "QTDE")
    private Integer qtde;
    @Column(name = "QTDE_FEITA")
    private Integer qtdeFeita;
    @Column(name = "MESANO")
    private String mesano;
    @Column(name = "NOME_USU_USANDO")
    private String nomeUsuUsando;
    @Column(name = "MAQ_USANDO")
    private String maqUsando;
    @Column(name = "DATA_USANDO")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUsando;
    @OneToMany(mappedBy = "codCotasexalab", fetch = FetchType.EAGER)
    private List<CotasExaLabUni> cotasExaLabUniList;
    @JoinColumn(name = "COD_EXAME", referencedColumnName = "COD_EXAME")
    @ManyToOne(fetch = FetchType.EAGER)
    private CadExame codExame;
    @JoinColumn(name = "COD_LAB", referencedColumnName = "COD_LAB")
    @ManyToOne(fetch = FetchType.EAGER)
    private Labexa codLab;
    @JoinColumn(name = "COD_USU_USANDO", referencedColumnName = "COD_USU")
    @ManyToOne(fetch = FetchType.EAGER)
    private Usuarios codUsuUsando;
//    @OneToMany(mappedBy = "codCotasexalab", fetch = FetchType.EAGER)
//    private List<Agendaexa> agendaexaList;

    public Cotasexalab() {
    }

    public Cotasexalab(Integer codCotasexalab) {
        this.codCotasexalab = codCotasexalab;
    }

    public Integer getCodCotasexalab() {
        return codCotasexalab;
    }

    public void setCodCotasexalab(Integer codCotasexalab) {
        this.codCotasexalab = codCotasexalab;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

    public Integer getQtde() {
        return qtde;
    }

    public void setQtde(Integer qtde) {
        this.qtde = qtde;
    }

    public Integer getQtdeFeita() {
        return qtdeFeita;
    }

    public void setQtdeFeita(Integer qtdeFeita) {
        this.qtdeFeita = qtdeFeita;
    }

    public String getMesano() {
        return mesano;
    }

    public void setMesano(String mesano) {
        this.mesano = mesano;
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

    @XmlTransient
    public List<CotasExaLabUni> getCotasExaLabUniList() {
        return cotasExaLabUniList;
    }

    public void setCotasExaLabUniList(List<CotasExaLabUni> cotasExaLabUniList) {
        this.cotasExaLabUniList = cotasExaLabUniList;
    }

    public CadExame getCodExame() {
        return codExame;
    }

    public void setCodExame(CadExame codExame) {
        this.codExame = codExame;
    }

    public Labexa getCodLab() {
        return codLab;
    }

    public void setCodLab(Labexa codLab) {
        this.codLab = codLab;
    }

    public Usuarios getCodUsuUsando() {
        return codUsuUsando;
    }

    public void setCodUsuUsando(Usuarios codUsuUsando) {
        this.codUsuUsando = codUsuUsando;
    }

//    @XmlTransient
//    public List<Agendaexa> getAgendaexaList() {
//        return agendaexaList;
//    }
//
//    public void setAgendaexaList(List<Agendaexa> agendaexaList) {
//        this.agendaexaList = agendaexaList;
//    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codCotasexalab != null ? codCotasexalab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cotasexalab)) {
            return false;
        }
        Cotasexalab other = (Cotasexalab) object;
        if ((this.codCotasexalab == null && other.codCotasexalab != null) || (this.codCotasexalab != null && !this.codCotasexalab.equals(other.codCotasexalab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.Cotasexalab[ codCotasexalab=" + codCotasexalab + " ]";
    }
    
}
