/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dasa.protocolo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Marcos Naves
 */
public class RetornoIntegracao implements Serializable {

    private String REQUISICAO;
    private String REQUISICAOALT;
    private String STATUS;
    private Date DATA_RETORNO;
    private String MSG;
    private List<String> LISTA_WARNINGS = new ArrayList<>();
    private List<String> LISTA_ERRORS = new ArrayList<>();
    private List<String> LISTA_FATALS = new ArrayList<>();
    private List<RetornoExames> LISTA_EXAMES = new ArrayList<>();

    public RetornoIntegracao() {
    }

    public String getREQUISICAO() {
        return REQUISICAO;
    }

    public void setREQUISICAO(String REQUISICAO) {
        this.REQUISICAO = REQUISICAO;
    }

    public String getREQUISICAOALT() {
        return REQUISICAOALT;
    }

    public void setREQUISICAOALT(String REQUISICAOALT) {
        this.REQUISICAOALT = REQUISICAOALT;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public Date getDATA_RETORNO() {
        return DATA_RETORNO;
    }

    public void setDATA_RETORNO(Date DATA_RETORNO) {
        this.DATA_RETORNO = DATA_RETORNO;
    }

    public String getMSG() {
        return MSG;
    }

    public void setMSG(String MSG) {
        this.MSG = MSG;
    }

    public List<String> getLISTA_WARNINGS() {
        return LISTA_WARNINGS;
    }

    public void setLISTA_WARNINGS(List<String> LISTA_WARNINGS) {
        this.LISTA_WARNINGS = LISTA_WARNINGS;
    }

    public List<String> getLISTA_ERRORS() {
        return LISTA_ERRORS;
    }

    public void setLISTA_ERRORS(List<String> LISTA_ERRORS) {
        this.LISTA_ERRORS = LISTA_ERRORS;
    }

    public List<String> getLISTA_FATALS() {
        return LISTA_FATALS;
    }

    public void setLISTA_FATALS(List<String> LISTA_FATALS) {
        this.LISTA_FATALS = LISTA_FATALS;
    }

    public List<RetornoExames> getLISTA_EXAMES() {
        return LISTA_EXAMES;
    }

    public void setLISTA_EXAMES(List<RetornoExames> LISTA_EXAMES) {
        this.LISTA_EXAMES = LISTA_EXAMES;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.REQUISICAO);
        hash = 83 * hash + Objects.hashCode(this.REQUISICAOALT);
        hash = 83 * hash + Objects.hashCode(this.STATUS);
        hash = 83 * hash + Objects.hashCode(this.DATA_RETORNO);
        hash = 83 * hash + Objects.hashCode(this.MSG);
        hash = 83 * hash + Objects.hashCode(this.LISTA_WARNINGS);
        hash = 83 * hash + Objects.hashCode(this.LISTA_ERRORS);
        hash = 83 * hash + Objects.hashCode(this.LISTA_FATALS);
        hash = 83 * hash + Objects.hashCode(this.LISTA_EXAMES);
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
        final RetornoIntegracao other = (RetornoIntegracao) obj;
        if (!Objects.equals(this.REQUISICAO, other.REQUISICAO)) {
            return false;
        }
        if (!Objects.equals(this.REQUISICAOALT, other.REQUISICAOALT)) {
            return false;
        }
        if (!Objects.equals(this.STATUS, other.STATUS)) {
            return false;
        }
        if (!Objects.equals(this.MSG, other.MSG)) {
            return false;
        }
        if (!Objects.equals(this.DATA_RETORNO, other.DATA_RETORNO)) {
            return false;
        }
        if (!Objects.equals(this.LISTA_WARNINGS, other.LISTA_WARNINGS)) {
            return false;
        }
        if (!Objects.equals(this.LISTA_ERRORS, other.LISTA_ERRORS)) {
            return false;
        }
        if (!Objects.equals(this.LISTA_FATALS, other.LISTA_FATALS)) {
            return false;
        }
        if (!Objects.equals(this.LISTA_EXAMES, other.LISTA_EXAMES)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "RetornoIntegracao{" + "REQUISICAO=" + REQUISICAO + ", REQUISICAOALT=" + REQUISICAOALT + ", STATUS=" + STATUS + ", DATA_RETORNO=" + DATA_RETORNO + ", MSG=" + MSG + ", LISTA_WARNINGS=" + LISTA_WARNINGS + ", LISTA_ERRORS=" + LISTA_ERRORS + ", LISTA_FATALS=" + LISTA_FATALS + ", LISTA_EXAMES=" + LISTA_EXAMES + '}';
    }

}
