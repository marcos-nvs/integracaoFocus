/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dasa.protocolo;

import br.com.focus.utils.DateManipulador;
import br.com.focus.view.TelaIntegracao;
import br.com.ln.hibernate.utils.SessionHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Marcos Naves
 */
public class ProtocoloDasaDao implements Serializable {

    public List<Solicitacao> buscaInformacaoLaboratorio(Integer codLab) {

        List<Solicitacao> listSolicitacao = null;

        List<Object> listaObj = SessionHelper.getInformacaoLab(codLab);

        if (listaObj != null && !listaObj.isEmpty()) {
            TelaIntegracao.incluiMensagem("Quantidade de informações - " + listaObj.size());

            for (Object object : listaObj) {
                Object[] tupla = (Object[]) object;

                Solicitacao solicitacao = new Solicitacao();

                solicitacao.setUsuario(TelaIntegracao.configClient.getUsuario());
                solicitacao.setSenha(TelaIntegracao.configClient.getSenha());

                solicitacao.setCodPedido(((Integer) tupla[0]).toString());
                solicitacao.setDataCadastro(DateManipulador.formatDateToPattern("dd/MM/yyyy", (Date) tupla[1]));
                solicitacao.setPeso((String) tupla[2]);
                solicitacao.setAltura((String) tupla[3]);
                solicitacao.setDum((String) tupla[4]);
                solicitacao.setGestante((String) tupla[5]);
                solicitacao.setRn((String) tupla[6]);
                solicitacao.setQuarto((String) tupla[7]);
                solicitacao.setLeito((String) tupla[8]);
                solicitacao.setInfoAux((String) tupla[9]);
                solicitacao.setObs((String) tupla[10]);
                solicitacao.setCodConvenio((String) tupla[11]);
                solicitacao.setHd((String) tupla[12]);
                solicitacao.setCid((String) tupla[13]);

                if (tupla[14] != null) {
                    solicitacao.setCodLocal(((Integer) tupla[14]).toString());
                }
                solicitacao.setDescLocal((String) tupla[15]);
                solicitacao.setLocalColeta((String) tupla[16]);
                solicitacao.setMatricula((String) tupla[17]);

                Solicitante solicitante = buildSolicitante(tupla);
                solicitacao.setSolicitante(solicitante);
                Paciente paciente = buildPaciente(tupla);
                solicitacao.setPaciente(paciente);

                List<Exame> listaExame = new ArrayList<>();
                listaExame.add(buildListExame(tupla));
                solicitacao.setListaExames(listaExame);
            }
        } else {
            TelaIntegracao.incluiMensagem("Não há informações para serem enviadas!!");
        }
        return listSolicitacao;
    }

    private Solicitante buildSolicitante(Object[] tupla) {

        Solicitante solicitante = new Solicitante();

        solicitante.setRegistro(((Integer) tupla[18]).toString());
        solicitante.setRegistroTipo("1");
        solicitante.setNome((String) tupla[19]);
        solicitante.setUf((String) tupla[20]);

        return solicitante;
    }

    private Paciente buildPaciente(Object[] tupla) {

        Paciente paciente = new Paciente();

        paciente.setProntuario((String) tupla[21]);
        paciente.setNome((String) tupla[22]);
        paciente.setNascimento(DateManipulador.formatDateToPattern("dd/MM/yyyy", (Date) tupla[23]));
        paciente.setRg((String) tupla[24]);
        paciente.setCpf((String) tupla[25]);
        paciente.setSexo(((Character) tupla[26]).toString());
        paciente.setCartaoSus((String) tupla[27]);
        paciente.setNomeResp((String) tupla[28]);
        paciente.setTel((String) tupla[29]);
        paciente.setCel((String) tupla[30]);

        Endereco endereco = buildEndereco(tupla);

        paciente.setEndereco(endereco);

        return paciente;
    }

    private Endereco buildEndereco(Object[] tupla) {

        Endereco endereco = new Endereco();

        endereco.setLogradouro((String) tupla[31]);
        endereco.setUf((String) tupla[32]);
        endereco.setCidade((String) tupla[33]);
        endereco.setNumero((String) tupla[34]);
        endereco.setComplemento((String) tupla[35]);
        endereco.setCep((String) tupla[36]);
        endereco.setBairro((String) tupla[37]);

        return endereco;

    }

    private Exame buildListExame(Object[] tupla) {

        Exame exame = new Exame();

        exame.setCodExame(((Integer) tupla[38]).toString());
        exame.setDescExame((String) tupla[39]);
        exame.setCodMaterial((String) tupla[40]);
        exame.setDescMaterial((String) tupla[41]);
        exame.setNumeroAmostra((String) tupla[42]);

        boolean bUrgente = (boolean) tupla[43];

        if (bUrgente) {
            exame.setUrgente("S");
        } else {
            exame.setUrgente("N");
        }
        exame.setVolume((String) tupla[44]);
        exame.setTempo((String) tupla[45]);
        exame.setImagem((String) tupla[46]);
        exame.setOrdemIntegracao((String) tupla[47]);
        exame.setMaterialColetado("S");

        return exame;
    }

}
