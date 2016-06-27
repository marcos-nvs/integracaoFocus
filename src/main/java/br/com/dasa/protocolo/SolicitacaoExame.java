/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dasa.protocolo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Marcos Naves
 */
public class SolicitacaoExame implements Serializable{
    
    private String usuario;
    private String senha;
    private String test;
    private String codRequisicao;
    private String codPedido;
    private String dataCadastro;
    private String peso;
    private String altura;
    private String dum;
    private String gestante;
    private String rn;
    private String quarto;
    private String leito;
    private String infoAux;
    private String obs;
    private String codConvenio;
    private String hd;
    private String cid;
    private String codLocal;
    private String descLocal;
    private String localColeta;
    private String matricula;
    private Solicitante solicitante;
    private Paciente paciente;
    private List<Exame> listaExames;

    public SolicitacaoExame() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTest() {
        return test;
    }

    public void setTest(String test) {
        this.test = test;
    }

    public String getCodRequisicao() {
        return codRequisicao;
    }

    public void setCodRequisicao(String codRequisicao) {
        this.codRequisicao = codRequisicao;
    }

    public String getCodPedido() {
        return codPedido;
    }

    public void setCodPedido(String codPedido) {
        this.codPedido = codPedido;
    }

    public String getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(String dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getDum() {
        return dum;
    }

    public void setDum(String dum) {
        this.dum = dum;
    }

    public String getGestante() {
        return gestante;
    }

    public void setGestante(String gestante) {
        this.gestante = gestante;
    }

    public String getRn() {
        return rn;
    }

    public void setRn(String rn) {
        this.rn = rn;
    }

    public String getQuarto() {
        return quarto;
    }

    public void setQuarto(String quarto) {
        this.quarto = quarto;
    }

    public String getLeito() {
        return leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }

    public String getInfoAux() {
        return infoAux;
    }

    public void setInfoAux(String infoAux) {
        this.infoAux = infoAux;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getCodConvenio() {
        return codConvenio;
    }

    public void setCodConvenio(String codConvenio) {
        this.codConvenio = codConvenio;
    }

    public String getHd() {
        return hd;
    }

    public void setHd(String hd) {
        this.hd = hd;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getCodLocal() {
        return codLocal;
    }

    public void setCodLocal(String codLocal) {
        this.codLocal = codLocal;
    }

    public String getDescLocal() {
        return descLocal;
    }

    public void setDescLocal(String descLocal) {
        this.descLocal = descLocal;
    }

    public String getLocalColeta() {
        return localColeta;
    }

    public void setLocalColeta(String localColeta) {
        this.localColeta = localColeta;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Solicitante getSolicitante() {
        return solicitante;
    }

    public void setSolicitante(Solicitante solicitante) {
        this.solicitante = solicitante;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<Exame> getListaExames() {
        return listaExames;
    }

    public void setListaExames(List<Exame> listaExames) {
        this.listaExames = listaExames;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + Objects.hashCode(this.usuario);
        hash = 71 * hash + Objects.hashCode(this.senha);
        hash = 71 * hash + Objects.hashCode(this.test);
        hash = 71 * hash + Objects.hashCode(this.codRequisicao);
        hash = 71 * hash + Objects.hashCode(this.codPedido);
        hash = 71 * hash + Objects.hashCode(this.dataCadastro);
        hash = 71 * hash + Objects.hashCode(this.peso);
        hash = 71 * hash + Objects.hashCode(this.altura);
        hash = 71 * hash + Objects.hashCode(this.dum);
        hash = 71 * hash + Objects.hashCode(this.gestante);
        hash = 71 * hash + Objects.hashCode(this.rn);
        hash = 71 * hash + Objects.hashCode(this.quarto);
        hash = 71 * hash + Objects.hashCode(this.leito);
        hash = 71 * hash + Objects.hashCode(this.infoAux);
        hash = 71 * hash + Objects.hashCode(this.obs);
        hash = 71 * hash + Objects.hashCode(this.codConvenio);
        hash = 71 * hash + Objects.hashCode(this.hd);
        hash = 71 * hash + Objects.hashCode(this.cid);
        hash = 71 * hash + Objects.hashCode(this.codLocal);
        hash = 71 * hash + Objects.hashCode(this.descLocal);
        hash = 71 * hash + Objects.hashCode(this.localColeta);
        hash = 71 * hash + Objects.hashCode(this.matricula);
        hash = 71 * hash + Objects.hashCode(this.solicitante);
        hash = 71 * hash + Objects.hashCode(this.paciente);
        hash = 71 * hash + Objects.hashCode(this.listaExames);
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
        final SolicitacaoExame other = (SolicitacaoExame) obj;
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.test, other.test)) {
            return false;
        }
        if (!Objects.equals(this.codRequisicao, other.codRequisicao)) {
            return false;
        }
        if (!Objects.equals(this.codPedido, other.codPedido)) {
            return false;
        }
        if (!Objects.equals(this.dataCadastro, other.dataCadastro)) {
            return false;
        }
        if (!Objects.equals(this.peso, other.peso)) {
            return false;
        }
        if (!Objects.equals(this.altura, other.altura)) {
            return false;
        }
        if (!Objects.equals(this.dum, other.dum)) {
            return false;
        }
        if (!Objects.equals(this.gestante, other.gestante)) {
            return false;
        }
        if (!Objects.equals(this.rn, other.rn)) {
            return false;
        }
        if (!Objects.equals(this.quarto, other.quarto)) {
            return false;
        }
        if (!Objects.equals(this.leito, other.leito)) {
            return false;
        }
        if (!Objects.equals(this.infoAux, other.infoAux)) {
            return false;
        }
        if (!Objects.equals(this.obs, other.obs)) {
            return false;
        }
        if (!Objects.equals(this.codConvenio, other.codConvenio)) {
            return false;
        }
        if (!Objects.equals(this.hd, other.hd)) {
            return false;
        }
        if (!Objects.equals(this.cid, other.cid)) {
            return false;
        }
        if (!Objects.equals(this.codLocal, other.codLocal)) {
            return false;
        }
        if (!Objects.equals(this.descLocal, other.descLocal)) {
            return false;
        }
        if (!Objects.equals(this.localColeta, other.localColeta)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.solicitante, other.solicitante)) {
            return false;
        }
        if (!Objects.equals(this.paciente, other.paciente)) {
            return false;
        }
        if (!Objects.equals(this.listaExames, other.listaExames)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ProtocoloCientificalab{" + "usuario=" + usuario + ", senha=" + senha + ", test=" + test + ", codRequisicao=" + codRequisicao + ", codPedido=" + codPedido + ", dataCadastro=" + dataCadastro + ", peso=" + peso + ", altura=" + altura + ", dum=" + dum + ", gestante=" + gestante + ", rn=" + rn + ", quarto=" + quarto + ", leito=" + leito + ", infoAux=" + infoAux + ", obs=" + obs + ", codConvenio=" + codConvenio + ", hd=" + hd + ", cid=" + cid + ", codLocal=" + codLocal + ", descLocal=" + descLocal + ", localColeta=" + localColeta + ", matricula=" + matricula + ", solicitante=" + solicitante + ", paciente=" + paciente + ", listaExames=" + listaExames + '}';
    }
    
}
