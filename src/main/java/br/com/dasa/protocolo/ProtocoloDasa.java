/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dasa.protocolo;

import br.com.focus.objetos.Laboratorio;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author Marcos Naves
 */
public class ProtocoloDasa implements Serializable{
    
    public void realizaIntegracao(Laboratorio laboratorio){
        
        ProtocoloDasaDao dasaDao = new ProtocoloDasaDao();
        
        //Buscar as informações;
        List<Solicitacao> listSolicitacao = dasaDao.buscaInformacaoLaboratorio(laboratorio.getCodLab());
                
        
        
        //Tratar as informações
        //Transformar em XML
        //Enviar para CL
        //Tratar o retorno
        //Marcar como enviado
        
        
    }
    
}
