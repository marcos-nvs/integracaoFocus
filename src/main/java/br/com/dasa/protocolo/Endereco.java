/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dasa.protocolo;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Marcos Naves
 */
public class Endereco implements Serializable{
    
    private String logradouro;
    private String uf;
    private String cidade;
    private String numero;
    private String complemento;
    private String obs;
    private String cep;
    private String bairro;

    public Endereco() {
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.logradouro);
        hash = 53 * hash + Objects.hashCode(this.uf);
        hash = 53 * hash + Objects.hashCode(this.cidade);
        hash = 53 * hash + Objects.hashCode(this.numero);
        hash = 53 * hash + Objects.hashCode(this.complemento);
        hash = 53 * hash + Objects.hashCode(this.obs);
        hash = 53 * hash + Objects.hashCode(this.cep);
        hash = 53 * hash + Objects.hashCode(this.bairro);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        if (!Objects.equals(this.logradouro, other.logradouro)) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        if (!Objects.equals(this.cidade, other.cidade)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.complemento, other.complemento)) {
            return false;
        }
        if (!Objects.equals(this.obs, other.obs)) {
            return false;
        }
        if (!Objects.equals(this.cep, other.cep)) {
            return false;
        }
        if (!Objects.equals(this.bairro, other.bairro)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", uf=" + uf + ", cidade=" + cidade + ", numero=" + numero + ", complemento=" + complemento + ", obs=" + obs + ", cep=" + cep + ", bairro=" + bairro + '}';
    }
    
}
