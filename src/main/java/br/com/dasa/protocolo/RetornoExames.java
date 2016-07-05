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
public class RetornoExames implements Serializable {

    private String  EXA_CODIGO;
    private String  EXA_CODIGO_DEPARA;
    private String EXA_SEQUENCIA;
    private String EXA_URGENTE;
    private String EXA_UNIDADE;
    private String EXA_UNIDADE_EX;
    private String EXA_SETOR;
    private String EXA_AMOSTRA;
    private String EXA_METODO;
    private String EXA_MATERIAL;
    private String EXA_MATERIAL_DESC;
    private String  EXA_VALOR;
    private String EXA_DTPREVISAO;  

    public RetornoExames() {
    }

    public String getEXA_CODIGO() {
        return EXA_CODIGO;
    }

    public void setEXA_CODIGO(String EXA_CODIGO) {
        this.EXA_CODIGO = EXA_CODIGO;
    }

    public String getEXA_CODIGO_DEPARA() {
        return EXA_CODIGO_DEPARA;
    }

    public void setEXA_CODIGO_DEPARA(String EXA_CODIGO_DEPARA) {
        this.EXA_CODIGO_DEPARA = EXA_CODIGO_DEPARA;
    }

    public String getEXA_SEQUENCIA() {
        return EXA_SEQUENCIA;
    }

    public void setEXA_SEQUENCIA(String EXA_SEQUENCIA) {
        this.EXA_SEQUENCIA = EXA_SEQUENCIA;
    }

    public String getEXA_URGENTE() {
        return EXA_URGENTE;
    }

    public void setEXA_URGENTE(String EXA_URGENTE) {
        this.EXA_URGENTE = EXA_URGENTE;
    }

    public String getEXA_UNIDADE() {
        return EXA_UNIDADE;
    }

    public void setEXA_UNIDADE(String EXA_UNIDADE) {
        this.EXA_UNIDADE = EXA_UNIDADE;
    }

    public String getEXA_UNIDADE_EX() {
        return EXA_UNIDADE_EX;
    }

    public void setEXA_UNIDADE_EX(String EXA_UNIDADE_EX) {
        this.EXA_UNIDADE_EX = EXA_UNIDADE_EX;
    }

    public String getEXA_SETOR() {
        return EXA_SETOR;
    }

    public void setEXA_SETOR(String EXA_SETOR) {
        this.EXA_SETOR = EXA_SETOR;
    }

    public String getEXA_AMOSTRA() {
        return EXA_AMOSTRA;
    }

    public void setEXA_AMOSTRA(String EXA_AMOSTRA) {
        this.EXA_AMOSTRA = EXA_AMOSTRA;
    }

    public String getEXA_METODO() {
        return EXA_METODO;
    }

    public void setEXA_METODO(String EXA_METODO) {
        this.EXA_METODO = EXA_METODO;
    }

    public String getEXA_MATERIAL() {
        return EXA_MATERIAL;
    }

    public void setEXA_MATERIAL(String EXA_MATERIAL) {
        this.EXA_MATERIAL = EXA_MATERIAL;
    }

    public String getEXA_MATERIAL_DESC() {
        return EXA_MATERIAL_DESC;
    }

    public void setEXA_MATERIAL_DESC(String EXA_MATERIAL_DESC) {
        this.EXA_MATERIAL_DESC = EXA_MATERIAL_DESC;
    }

    public String getEXA_VALOR() {
        return EXA_VALOR;
    }

    public void setEXA_VALOR(String EXA_VALOR) {
        this.EXA_VALOR = EXA_VALOR;
    }

    public String getEXA_DTPREVISAO() {
        return EXA_DTPREVISAO;
    }

    public void setEXA_DTPREVISAO(String EXA_DTPREVISAO) {
        this.EXA_DTPREVISAO = EXA_DTPREVISAO;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.EXA_CODIGO);
        hash = 79 * hash + Objects.hashCode(this.EXA_CODIGO_DEPARA);
        hash = 79 * hash + Objects.hashCode(this.EXA_SEQUENCIA);
        hash = 79 * hash + Objects.hashCode(this.EXA_URGENTE);
        hash = 79 * hash + Objects.hashCode(this.EXA_UNIDADE);
        hash = 79 * hash + Objects.hashCode(this.EXA_UNIDADE_EX);
        hash = 79 * hash + Objects.hashCode(this.EXA_SETOR);
        hash = 79 * hash + Objects.hashCode(this.EXA_AMOSTRA);
        hash = 79 * hash + Objects.hashCode(this.EXA_METODO);
        hash = 79 * hash + Objects.hashCode(this.EXA_MATERIAL);
        hash = 79 * hash + Objects.hashCode(this.EXA_MATERIAL_DESC);
        hash = 79 * hash + Objects.hashCode(this.EXA_VALOR);
        hash = 79 * hash + Objects.hashCode(this.EXA_DTPREVISAO);
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
        final RetornoExames other = (RetornoExames) obj;
        if (!Objects.equals(this.EXA_CODIGO, other.EXA_CODIGO)) {
            return false;
        }
        if (!Objects.equals(this.EXA_CODIGO_DEPARA, other.EXA_CODIGO_DEPARA)) {
            return false;
        }
        if (!Objects.equals(this.EXA_SEQUENCIA, other.EXA_SEQUENCIA)) {
            return false;
        }
        if (!Objects.equals(this.EXA_URGENTE, other.EXA_URGENTE)) {
            return false;
        }
        if (!Objects.equals(this.EXA_UNIDADE, other.EXA_UNIDADE)) {
            return false;
        }
        if (!Objects.equals(this.EXA_UNIDADE_EX, other.EXA_UNIDADE_EX)) {
            return false;
        }
        if (!Objects.equals(this.EXA_SETOR, other.EXA_SETOR)) {
            return false;
        }
        if (!Objects.equals(this.EXA_AMOSTRA, other.EXA_AMOSTRA)) {
            return false;
        }
        if (!Objects.equals(this.EXA_METODO, other.EXA_METODO)) {
            return false;
        }
        if (!Objects.equals(this.EXA_MATERIAL, other.EXA_MATERIAL)) {
            return false;
        }
        if (!Objects.equals(this.EXA_MATERIAL_DESC, other.EXA_MATERIAL_DESC)) {
            return false;
        }
        if (!Objects.equals(this.EXA_VALOR, other.EXA_VALOR)) {
            return false;
        }
        if (!Objects.equals(this.EXA_DTPREVISAO, other.EXA_DTPREVISAO)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RetornoExames{" + "EXA_CODIGO=" + EXA_CODIGO + ", EXA_CODIGO_DEPARA=" + EXA_CODIGO_DEPARA + ", EXA_SEQUENCIA=" + EXA_SEQUENCIA + ", EXA_URGENTE=" + EXA_URGENTE + ", EXA_UNIDADE=" + EXA_UNIDADE + ", EXA_UNIDADE_EX=" + EXA_UNIDADE_EX + ", EXA_SETOR=" + EXA_SETOR + ", EXA_AMOSTRA=" + EXA_AMOSTRA + ", EXA_METODO=" + EXA_METODO + ", EXA_MATERIAL=" + EXA_MATERIAL + ", EXA_MATERIAL_DESC=" + EXA_MATERIAL_DESC + ", EXA_VALOR=" + EXA_VALOR + ", EXA_DTPREVISAO=" + EXA_DTPREVISAO + '}';
    }

}
