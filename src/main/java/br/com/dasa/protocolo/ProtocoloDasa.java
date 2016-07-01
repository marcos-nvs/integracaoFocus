/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dasa.protocolo;

import br.com.focus.objetos.Laboratorio;
import br.com.focus.view.TelaIntegracao;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Marcos Naves
 */
public class ProtocoloDasa implements Serializable {

    private Map<String, Solicitacao> mapSolicitacaoExame = new HashMap<String, Solicitacao>();

    public void realizaIntegracao(Laboratorio laboratorio) {

        ProtocoloDasaDao dasaDao = new ProtocoloDasaDao();

        //Buscar as informações;
        List<Solicitacao> listSolicitacao = dasaDao.buscaInformacaoLaboratorio(laboratorio.getCodLab());

        if (listSolicitacao != null && !listSolicitacao.isEmpty()) {
            
            for (Solicitacao solicitacao : listSolicitacao) {
                String pedido = solicitacao.getCodPedido();
                
                if (!mapSolicitacaoExame.containsKey(pedido)){
                    mapSolicitacaoExame.put(pedido, solicitacao);
                } else {
                    Solicitacao solExame = mapSolicitacaoExame.get(pedido);
                    mapSolicitacaoExame.remove(pedido);
                    List<Exame> listaExames = solExame.getListaExames();
                    listaExames.add(solicitacao.getListaExames().get(0));
                    solExame.setListaExames(listaExames);
                    mapSolicitacaoExame.put(pedido, solExame);
                }
            }
            //Transformar em XML
            //Enviar para CL
            //Tratar o retorno
            //Marcar como enviado

        } else {
            TelaIntegracao.incluiMensagem("Não há informações a serem enviadas!!");
        }

    }

}
