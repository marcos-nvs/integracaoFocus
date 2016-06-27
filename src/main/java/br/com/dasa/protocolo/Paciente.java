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
public class Paciente implements Serializable {
    
    private String prontuario;
    private String nome;
    private String nascimento;
    private String rg;
    private String cpf;
    private String sexo;
    private String cartaoSus;
    private String nomeResp;
    private String tel;
    private String cel;
    private Endereco endereco;

    public Paciente() {
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public String getNomeResp() {
        return nomeResp;
    }

    public void setNomeResp(String nomeResp) {
        this.nomeResp = nomeResp;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCel() {
        return cel;
    }

    public void setCel(String cel) {
        this.cel = cel;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 11 * hash + Objects.hashCode(this.prontuario);
        hash = 11 * hash + Objects.hashCode(this.nome);
        hash = 11 * hash + Objects.hashCode(this.nascimento);
        hash = 11 * hash + Objects.hashCode(this.rg);
        hash = 11 * hash + Objects.hashCode(this.cpf);
        hash = 11 * hash + Objects.hashCode(this.sexo);
        hash = 11 * hash + Objects.hashCode(this.cartaoSus);
        hash = 11 * hash + Objects.hashCode(this.nomeResp);
        hash = 11 * hash + Objects.hashCode(this.tel);
        hash = 11 * hash + Objects.hashCode(this.cel);
        hash = 11 * hash + Objects.hashCode(this.endereco);
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
        final Paciente other = (Paciente) obj;
        if (!Objects.equals(this.prontuario, other.prontuario)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.nascimento, other.nascimento)) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.cartaoSus, other.cartaoSus)) {
            return false;
        }
        if (!Objects.equals(this.nomeResp, other.nomeResp)) {
            return false;
        }
        if (!Objects.equals(this.tel, other.tel)) {
            return false;
        }
        if (!Objects.equals(this.cel, other.cel)) {
            return false;
        }
        if (!Objects.equals(this.endereco, other.endereco)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Paciente{" + "prontuario=" + prontuario + ", nome=" + nome + ", nascimento=" + nascimento + ", rg=" + rg + ", cpf=" + cpf + ", sexo=" + sexo + ", cartaoSus=" + cartaoSus + ", nomeResp=" + nomeResp + ", tel=" + tel + ", cel=" + cel + ", endereco=" + endereco + '}';
    }
}
