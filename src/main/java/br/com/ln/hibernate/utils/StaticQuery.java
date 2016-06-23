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

    public static String cientificalab = "SELECT AM.COD_AGENDAEXA_MASTER, \n"
            + "       AM.COD_PRO,        \n"
            + "       AM.SUS_PAC,        \n"
            + "       AM.NOME_PAC,       \n"
            + "       AM.DT_NASC_PAC,    \n"
            + "       AM.SEXO_PAC,       \n"
            + "       AM.COD_PROF,       \n"
            + "       P.NOME,            \n"
            + "       AM.PESO_PAC,       \n"
            + "       AM.ALTURA_PAC,     \n"
            + "       AM.LEITO,          \n"
            + "       AM.QUARTO,         \n"
            + "       AM.DUM,            \n"
            + "       AM.GESTANTE,       \n"
            + "       AM.HD,             \n"
            + "       AM.NOME_RESP,      \n"
            + "       AM.RECEM_NASCIDO,  \n"
            + "       AM.RG_PAC,         \n"
            + "       AM.URGENCIA,       \n"
            + "       AM.CNES_UNI_LOGADA,\n"
            + "       AM.NOME_UNI,       \n"
            + "       WP.COD_PRO AS PRONTUARIO,       \n"
            + "       AE.COD_SUB_EXA,    \n"
            + "       getdate() as Data  \n"
            + "  FROM SAUDE.DBO.AGENDAEXA_MASTER AM   \n"
            + "  INNER JOIN SAUDE.DBO.AGENDAEXA AE ON AE.COD_AGENDAEXA_MASTER = AM.COD_AGENDAEXA_MASTER \n"
            + "  LEFT JOIN FOCUS.DBO.W_PACIENTES WP ON AE.COD_PRO = WP.COD_PRO \n"
            + "  LEFT JOIN SAUDE.DBO.PROFISSIONAIS P ON AE.COD_PROF = P.COD_PROF   \n"
            + "  LEFT JOIN SAUDE.DBO.CAD_EXAME CE ON AE.COD_SUB_EXA = CE.COD_EXAME   \n"
            + "WHERE AE.ENVIADO_LAB IS NULL \n"
            + "  AND AE.STATUS = 'A' \n"
            + "  AND AE.COD_LAB = 10";

}
