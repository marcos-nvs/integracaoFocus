/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ln.hibernate.utils;

/**
 *
 * @author Marcos Naves
 */
public class StaticQuery {

    public static String cientificalab
            = "SELECT AM.COD_AGENDAEXA_MASTER, \n"
            + "       AM.DATA_EXA,             \n"
            + "       AM.PESO_PAC,             \n"
            + "       AM.ALTURA_PAC,           \n"
            + "       AM.DUM,                  \n"
            + "       AM.GESTANTE,             \n"
            + "       AM.RECEM_NASCIDO,        \n"
            + "       AM.QUARTO,               \n"
            + "       AM.LEITO,                \n"
            + "       AM.INFO_AUX,             \n"
            + "       AM.OBSERVACAO,           \n"
            + "       AM.COD_CONV,             \n"
            + "       AM.HD,                   \n"
            + "       AM.COD_CID,              \n"
            + "       AM.CNES_UNI_LOGADA,      \n"
            + "       AM.NOME_UNI,             \n"
            + "       '' as LOCALCOLETA,        \n"
            + "       '' as MATRICULA,         \n"
            + "       AM.COD_PROF,             \n"
            + "       P.NOME,                  \n"
            + "       'SP' as UF, -- VERIIFCAR \n"
            + "       AM.COD_PRO,              \n"
            + "       AM.NOME_PAC,             \n"
            + "       AM.DT_NASC_PAC,          \n"
            + "       AM.RG_PAC,               \n"
            + "       AM.CPF_PAC,                \n"
            + "       AM.SEXO_PAC,             \n"
            + "       AM.SUS_PAC,              \n"
            + "       AM.NOME_RESP,            \n"
            + "       AM.DDD_FONE +' '+ AM.FONE_PAC as TEL,     \n"
            + "       AM.DDD_CEL +' '+ AM.CEL_PAC as CEL,           \n"
            + "       AM.ENDERECO_PAC,         \n"
            + "       AM.UF_PAC,                 \n"
            + "       AM.MUNICIPIO_PAC,             \n"
            + "       AM.NUM_END_PAC,             \n"
            + "       '' as OBS,                \n"
            + "       '' as CEP,                \n"
            + "       AM.BAIRRO_PAC,             \n"
            + "       AE.COD_SUB_EXA,          \n"
            + "       CE.DESCRICAO,     \n"
            + "       AE.COD_MATERIAL,\n"
            + "       AE.DESCR_MATERIAL,  \n"
            + "       '' as NUMEROAMOSTRA,      \n"
            + "       AM.URGENCIA,             \n"
            + "       AE.VOLUME,             \n"
            + "       AE.TEMPO,              \n"
            + "       'N' as IMAGEM,             \n"
            + "       '' as ORDEMINTEGRACAO    "
            + "  FROM SAUDE.DBO.AGENDAEXA_MASTER AM   \n"
            + "  INNER JOIN SAUDE.DBO.AGENDAEXA AE ON AE.COD_AGENDAEXA_MASTER = AM.COD_AGENDAEXA_MASTER \n"
            + "  LEFT JOIN FOCUS.DBO.W_PACIENTES WP ON AE.COD_PRO = WP.COD_PRO \n"
            + "  LEFT JOIN SAUDE.DBO.PROFISSIONAIS P ON AE.COD_PROF = P.COD_PROF   \n"
            + "  LEFT JOIN SAUDE.DBO.CAD_EXAME CE ON AE.COD_SUB_EXA = CE.COD_EXAME   \n"
            + "WHERE AE.ENVIADO_LAB IS NULL \n"
            + "  AND AE.STATUS = 'A' \n"
            + "  AND AE.COD_LAB = :codLab";

}
