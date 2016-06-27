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
public class Solicitante implements Serializable {
    
    private String registro;
    private String registroTipo;
    private String nome;
    private String uf;

    public Solicitante() {
    }

    public String getRegistro() {
        return registro;
    }

    public void setRegistro(String registro) {
        this.registro = registro;
    }

    public String getRegistroTipo() {
        return registroTipo;
    }

    public void setRegistroTipo(String registroTipo) {
        this.registroTipo = registroTipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.registro);
        hash = 53 * hash + Objects.hashCode(this.registroTipo);
        hash = 53 * hash + Objects.hashCode(this.nome);
        hash = 53 * hash + Objects.hashCode(this.uf);
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
        final Solicitante other = (Solicitante) obj;
        if (!Objects.equals(this.registro, other.registro)) {
            return false;
        }
        if (!Objects.equals(this.registroTipo, other.registroTipo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.uf, other.uf)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Solicitante{" + "registro=" + registro + ", registroTipo=" + registroTipo + ", nome=" + nome + ", uf=" + uf + '}';
    }

}
