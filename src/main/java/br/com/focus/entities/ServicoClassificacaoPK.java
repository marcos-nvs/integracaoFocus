/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author F12684146896
 */
@Embeddable
public class ServicoClassificacaoPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "COD_SER")
    private int codSer;
    @Basic(optional = false)
    @Column(name = "COD_CLASSIFICACAO")
    private String codClassificacao;

    public ServicoClassificacaoPK() {
    }

    public ServicoClassificacaoPK(int codSer, String codClassificacao) {
        this.codSer = codSer;
        this.codClassificacao = codClassificacao;
    }

    public int getCodSer() {
        return codSer;
    }

    public void setCodSer(int codSer) {
        this.codSer = codSer;
    }

    public String getCodClassificacao() {
        return codClassificacao;
    }

    public void setCodClassificacao(String codClassificacao) {
        this.codClassificacao = codClassificacao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) codSer;
        hash += (codClassificacao != null ? codClassificacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ServicoClassificacaoPK)) {
            return false;
        }
        ServicoClassificacaoPK other = (ServicoClassificacaoPK) object;
        if (this.codSer != other.codSer) {
            return false;
        }
        if ((this.codClassificacao == null && other.codClassificacao != null) || (this.codClassificacao != null && !this.codClassificacao.equals(other.codClassificacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.focus.entities.ServicoClassificacaoPK[ codSer=" + codSer + ", codClassificacao=" + codClassificacao + " ]";
    }
    
}
