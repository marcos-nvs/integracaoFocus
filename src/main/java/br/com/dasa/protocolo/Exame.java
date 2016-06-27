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
public class Exame implements Serializable{
    
    private String codExame;
    private String descExame;
    private String codMaterial;
    private String descMaterial;
    private String numeroAmostra;
    private String urgente;
    private String volume;
    private String tempo;
    private String imagem;
    private String ordemIntegracao;
    private String materialColetado;

    public Exame() {
    }

    public String getCodExame() {
        return codExame;
    }

    public void setCodExame(String codExame) {
        this.codExame = codExame;
    }

    public String getDescExame() {
        return descExame;
    }

    public void setDescExame(String descExame) {
        this.descExame = descExame;
    }

    public String getCodMaterial() {
        return codMaterial;
    }

    public void setCodMaterial(String codMaterial) {
        this.codMaterial = codMaterial;
    }

    public String getDescMaterial() {
        return descMaterial;
    }

    public void setDescMaterial(String descMaterial) {
        this.descMaterial = descMaterial;
    }

    public String getNumeroAmostra() {
        return numeroAmostra;
    }

    public void setNumeroAmostra(String numeroAmostra) {
        this.numeroAmostra = numeroAmostra;
    }

    public String getUrgente() {
        return urgente;
    }

    public void setUrgente(String urgente) {
        this.urgente = urgente;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getTempo() {
        return tempo;
    }

    public void setTempo(String tempo) {
        this.tempo = tempo;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getOrdemIntegracao() {
        return ordemIntegracao;
    }

    public void setOrdemIntegracao(String ordemIntegracao) {
        this.ordemIntegracao = ordemIntegracao;
    }

    public String getMaterialColetado() {
        return materialColetado;
    }

    public void setMaterialColetado(String materialColetado) {
        this.materialColetado = materialColetado;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.codExame);
        hash = 17 * hash + Objects.hashCode(this.descExame);
        hash = 17 * hash + Objects.hashCode(this.codMaterial);
        hash = 17 * hash + Objects.hashCode(this.descMaterial);
        hash = 17 * hash + Objects.hashCode(this.numeroAmostra);
        hash = 17 * hash + Objects.hashCode(this.urgente);
        hash = 17 * hash + Objects.hashCode(this.volume);
        hash = 17 * hash + Objects.hashCode(this.tempo);
        hash = 17 * hash + Objects.hashCode(this.imagem);
        hash = 17 * hash + Objects.hashCode(this.ordemIntegracao);
        hash = 17 * hash + Objects.hashCode(this.materialColetado);
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
        final Exame other = (Exame) obj;
        if (!Objects.equals(this.codExame, other.codExame)) {
            return false;
        }
        if (!Objects.equals(this.descExame, other.descExame)) {
            return false;
        }
        if (!Objects.equals(this.codMaterial, other.codMaterial)) {
            return false;
        }
        if (!Objects.equals(this.descMaterial, other.descMaterial)) {
            return false;
        }
        if (!Objects.equals(this.numeroAmostra, other.numeroAmostra)) {
            return false;
        }
        if (!Objects.equals(this.urgente, other.urgente)) {
            return false;
        }
        if (!Objects.equals(this.volume, other.volume)) {
            return false;
        }
        if (!Objects.equals(this.tempo, other.tempo)) {
            return false;
        }
        if (!Objects.equals(this.imagem, other.imagem)) {
            return false;
        }
        if (!Objects.equals(this.ordemIntegracao, other.ordemIntegracao)) {
            return false;
        }
        if (!Objects.equals(this.materialColetado, other.materialColetado)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Exame{" + "codExame=" + codExame + ", descExame=" + descExame + ", codMaterial=" + codMaterial + ", descMaterial=" + descMaterial + ", numeroAmostra=" + numeroAmostra + ", urgente=" + urgente + ", volume=" + volume + ", tempo=" + tempo + ", imagem=" + imagem + ", ordemIntegracao=" + ordemIntegracao + ", materialColetado=" + materialColetado + '}';
    }
    
}
