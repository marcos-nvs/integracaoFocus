/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.dasa.protocolo;

import br.com.focus.entities.Agendaexa;
import br.com.focus.entities.AgendaexaMaster;
import br.com.focus.objetos.Laboratorio;
import br.com.focus.view.TelaIntegracao;
import br.com.ln.hibernate.utils.SessionHelper;
import br.com.wservice.LoteExamesXmlReceiver;
import br.com.wservice.LoteExamesXmlReceiver_Service;
import com.thoughtworks.xstream.XStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
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

                if (!mapSolicitacaoExame.containsKey(pedido)) {
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

            Iterator it = mapSolicitacaoExame.entrySet().iterator();

            while (it.hasNext()) {
                Map.Entry<String, Object> pair = (Map.Entry) it.next();

                Solicitacao solicitacao = (Solicitacao) pair.getValue();

                String xml = montaXml(solicitacao);

                TelaIntegracao.incluiMensagem("Enviando a solicitação : " + solicitacao.getCodPedido() + " do(a) Paciente : " 
                        + solicitacao.getPaciente().getNome());

                System.out.println("XML : " + xml);

                String retorno = envioXmlDasa(xml);

                resultadoIntegracao(solicitacao, retorno);
            }
            mapSolicitacaoExame.clear();
//
        } else {
            TelaIntegracao.incluiMensagem("Não há informações a serem enviadas!!");
        }

    }

    private String montaXml(Solicitacao solicitacao) {

        XStream xstream = new XStream();

        xstream.alias("SOLICITACAO", Solicitacao.class);
        xstream.aliasField("USUARIO", Solicitacao.class, "usuario");
        xstream.aliasField("SENHA", Solicitacao.class, "senha");
        xstream.aliasField("TEST", Solicitacao.class, "test");
        xstream.aliasField("COD_REQUISICAO", Solicitacao.class, "codRequisicao");
        xstream.aliasField("COD_PEDIDO", Solicitacao.class, "codPedido");
        xstream.aliasField("DATA_CADASTRO", Solicitacao.class, "dataCadastro");
        xstream.aliasField("PESO", Solicitacao.class, "peso");
        xstream.aliasField("ALTURA", Solicitacao.class, "altura");
        xstream.aliasField("GESTANTE", Solicitacao.class, "gestante");
        xstream.aliasField("RN", Solicitacao.class, "rn");
        xstream.aliasField("QUARTO", Solicitacao.class, "quarto");
        xstream.aliasField("LEITO", Solicitacao.class, "leito");
        xstream.aliasField("INFO_AUX", Solicitacao.class, "infoAux");
        xstream.aliasField("COD_CONVENIO", Solicitacao.class, "codConvenio");
        xstream.aliasField("COD_LOCAL", Solicitacao.class, "codLocal");
        xstream.aliasField("DESC_LOCAL", Solicitacao.class, "descLocal");
        xstream.aliasField("SISTEMA", Solicitacao.class, "sisStCodigo");
        xstream.aliasField("LOCAL_COLETA", Solicitacao.class, "localColeta");
        xstream.aliasField("MATRICULA", Solicitacao.class, "matricula");

        xstream.aliasField("PACIENTE", Solicitacao.class, "paciente");
        xstream.aliasField("PRONTUARIO", Paciente.class, "prontuario");
        xstream.aliasField("NOME", Paciente.class, "nome");
        xstream.aliasField("NASCIMENTO", Paciente.class, "nascimento");
        xstream.aliasField("SEXO", Paciente.class, "sexo");
        xstream.aliasField("CARTAO_SUS", Paciente.class, "cartaoSus");
        xstream.aliasField("TEL", Paciente.class, "tel");
        xstream.aliasField("CEL", Paciente.class, "cel");

        xstream.aliasField("SOLICITANTE", Solicitacao.class, "solicitante");
        xstream.aliasField("REGISTRO", Solicitante.class, "registro");
        xstream.aliasField("REGISTRO_TIPO", Solicitante.class, "registroTipo");
        xstream.aliasField("UF", Solicitante.class, "uf");
        xstream.aliasField("NOME", Solicitante.class, "nome");

        xstream.aliasField("EXAMES", Solicitacao.class, "listaExames");

        xstream.aliasType("EXAME", Exame.class);

        xstream.aliasField("COD_EXAME", Exame.class, "codExame");
        xstream.aliasField("DESC_EXAME", Exame.class, "descExame");
        xstream.aliasField("COD_MATERIAL", Exame.class, "codMaterial");
        xstream.aliasField("DESC_MATERIAL", Exame.class, "descMaterial");
        xstream.aliasField("NUMERO_AMOSTRA", Exame.class, "numeroAmostra");
        xstream.aliasField("URGENTE", Exame.class, "urgente");
        xstream.aliasField("VOLUME", Exame.class, "volume");
        xstream.aliasField("TEMPO", Exame.class, "tempo");
        xstream.aliasField("IMAGEM", Exame.class, "imagem");
        xstream.aliasField("ORDEM_INTEGRACAO", Exame.class, "ordemIntegracao");
        xstream.aliasField("MATERIAL_COLETADO", Exame.class, "materialColetado");

        String xml = xstream.toXML(solicitacao);
        return xml;
    }

    private String envioXmlDasa(String xml) {

        try {
            LoteExamesXmlReceiver_Service service = new LoteExamesXmlReceiver_Service();
            LoteExamesXmlReceiver portLoteExamesXmlReceiver = service.getLoteExamesXmlReceiverPort();

            return portLoteExamesXmlReceiver.solicitacaoExames(xml);
        } catch (Exception xcp) {
            TelaIntegracao.incluiMensagem("Ocorreu um problema no envio da integração : " + xcp.getMessage());
            return null;
        }

    }

    private void resultadoIntegracao(Solicitacao solicitacao, String retorno) {

        RetornoIntegracao retornoIntegracao = montaObjRetorno(retorno);

        System.out.println("XmlRetorno :" + retornoIntegracao.toString());

        List<AgendaexaMaster> listaAgendaexaMaster = SessionHelper.getAgendaExaMaster(new Integer(solicitacao.getCodPedido()));

        if (listaAgendaexaMaster != null && !listaAgendaexaMaster.isEmpty()) {
            for (AgendaexaMaster agendaexaMaster : listaAgendaexaMaster) {

                if (retornoIntegracao.getSTATUS().equals("SUCESS")) {
                    TelaIntegracao.incluiMensagem("Solicitação enviada com sucesso ao destino!!!");
                    
                    if (retornoIntegracao.getLISTA_EXAMES() != null && !retornoIntegracao.getLISTA_EXAMES().isEmpty()){
//                        for (RetornoExames retornoExame : retornoIntegracao.getLISTA_EXAMES()){
//                            Agendaexa agendaExa = SessionHelper.getAgendaExa(solicitacao.getListaExames().);
//                        }
                    }
                    if (retornoIntegracao.getLISTA_ERRORS() != null && !retornoIntegracao.getLISTA_ERRORS().isEmpty()){
                        agendaexaMaster.setRetornoLab(retornoIntegracao.getMSG());
                    }
                    if (retornoIntegracao.getLISTA_FATALS() != null && !retornoIntegracao.getLISTA_FATALS().isEmpty()){
                        agendaexaMaster.setRetornoLab(retornoIntegracao.getMSG());
                    }
                    if (retornoIntegracao.getLISTA_WARNINGS() != null && !retornoIntegracao.getLISTA_WARNINGS().isEmpty()){
                        agendaexaMaster.setRetornoLab(retornoIntegracao.getMSG());
                    }

                    TelaIntegracao.incluiMensagem(retornoIntegracao.getMSG());
                    
                } else {
                    TelaIntegracao.incluiMensagem("Solicitação enviada e retornou com falhas!!!");
                    TelaIntegracao.incluiMensagem(retornoIntegracao.getMSG());
                }
            }
        } else {
            TelaIntegracao.incluiMensagem("Problemas em marcar a solicitação enviada");
        }
    }

    private RetornoIntegracao montaObjRetorno(String retorno) {

        XStream xstream = new XStream();

        xstream.alias("br.com.wservice.XmlRetorno", RetornoIntegracao.class);
        xstream.aliasField("requisicaoIntegracao", RetornoIntegracao.class, "br.com.wservice.XmlRetorno");
        xstream.aliasField("listaExames", RetornoExames.class, "LISTA_EXAMES");

        return (RetornoIntegracao) xstream.fromXML(retorno);
    }

}

//        public File schemaValidator(String strUrl, String xml, XmlRetorno xmlRetorno) throws IOException, SAXException, Exception {
//        File temp = null;
//        try {
//            URL schemaFile = new URL(strUrl);
//            temp = createFileTempByOsType(xml);
//            Source xmlFile = new StreamSource(temp);
//            SchemaFactory schemaFactory = SchemaFactory
//                    .newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            Schema schema = schemaFactory.newSchema(schemaFile);
//            Validator validator = schema.newValidator();
//            validator.validate(xmlFile);
//        } catch (IOException xcp) {
//            xmlRetorno.getLISTA_FATALS().add("IOException ...   " + xcp.getMessage());
//            throw xcp;
//        } catch (SAXException xcp) {
//            xmlRetorno.getLISTA_FATALS().add("Formatacao do xml errada   " + xcp.getMessage());
//            throw xcp;
//        } finally {
//            return temp;
//        }
//    }

