/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.configuracao;

//import br.com.focus.integradorfocus.Launcher;
import br.com.focus.utils.DateManipulador;
import br.com.focus.utils.SimpleDateFormatsSamples;
import br.com.focus.view.TelaIntegracao;
import br.com.ln.hibernate.utils.SessionHelper;
import com.thoughtworks.xstream.XStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Marcos Naves
 */
public class CriaArquivo {

    public static ConfigClient constroiArquivoXML() throws IOException {

        XStream stream = new XStream();
        ConfigClient configClient;

        File file = new File((new File("")).getAbsoluteFile().getAbsolutePath() + "/config_client.xml");

        System.out.println("Arquivo : " + file.getCanonicalPath());

        if (!file.isFile()) {
            System.out.println("Arquivo de configuração não existe.");
            configClient = new ConfigClient(2000, 10000, "", "", "",
                    (new File("")).getAbsoluteFile().getAbsolutePath() + "/DIR_ENTRADA",
                    (new File("")).getAbsoluteFile().getAbsolutePath() + "/DIR_RETORNO",
                    (new File("")).getAbsoluteFile().getAbsolutePath() + "/",
                    "DIR_BACKUPOKAY",
                    "DIR_BACKUPERRO",
                    "SQLSERVER",
                    2L, "", "", 90, 30, "", "", "","N");

            gravaArquivo(configClient.getPathRoot() + "config_client.xml", stream.toXML(configClient));
            configuraDiretorioSistema(configClient);
            System.out.println("O arquivo config_client.xml foi criado no caminho ' " + configClient.getPathRoot() + " '.  Configure a restart a aplicacao .....");
            System.exit(0);
        } else {
//            Launcher.logOneMoreLine(3, "Arquivo de configuração já existe");
            stream.alias("ConfigClient", ConfigClient.class);
            configClient = (ConfigClient) stream.fromXML(leArquivo(file.getCanonicalPath()));

            if (!(new File(configClient.getPathRoot())).isDirectory()) {
                System.out.println("Caminho do PathRoot  invalido ....' " + configClient.getPathRoot() + " '");
                System.exit(0);
            }
        }

        return configClient;
    }

    public static boolean gravaArquivo(String nomeArquivo, String conteudoArquivo) {

        boolean save = false;
        BufferedWriter bw;

        try {
            bw = new BufferedWriter(new FileWriter(nomeArquivo), 256 * 1024);
            try {
                bw.write(conteudoArquivo);
                save = true;
            } catch (IOException ex) {
//                Launcher.logOneMoreLine(1, "Ocorreu um erro na criação do arquivo " + ex.getMessage());
            } finally {
                bw.close();
            }
        } catch (IOException ex) {
//            Launcher.logOneMoreLine(1, "Ocorreu um erro na criação do arquivo " + ex.getMessage());
        }
        return save;
    }

    public static void configuraDiretorioSistema(ConfigClient configClient) {

        File confDirs;

        if (!(new File(configClient.getNameDirIn()).isDirectory())) {
            confDirs = new File(configClient.getNameDirIn());
            confDirs.mkdirs();
        }

        if (!(new File(configClient.getNameDirReturn()).isDirectory())) {
            confDirs = new File(configClient.getNameDirReturn());
            confDirs.mkdirs();
        }

        if (!(new File(configClient.getPathRoot() + configClient.getNameDirBackUpOkay() + "/").isDirectory())) {
            confDirs = new File(configClient.getPathRoot() + configClient.getNameDirBackUpOkay() + "/");
            confDirs.mkdirs();
        }

        if (!(new File(configClient.getPathRoot() + configClient.getNameDirBackUpError() + "/").isDirectory())) {
            confDirs = new File(configClient.getPathRoot() + configClient.getNameDirBackUpError() + "/");
            confDirs.mkdirs();
        }

        if (!(new File(configClient.getPathRoot() + "/logs").isDirectory())) {
            confDirs = new File(configClient.getPathRoot() + "/logs");
            confDirs.mkdirs();
        }
    }

    public static String leArquivo(String nomeArquivo) {

        BufferedReader br;
        StringBuilder sb = new StringBuilder();

        try {
            br = new BufferedReader(new FileReader(nomeArquivo), 256 * 1024);
            try {
                String s;

                while ((s = br.readLine()) != null) {
                    sb.append(s).append("\n");
                }

            } catch (IOException ex) {
//                Launcher.logOneMoreLine(1, "Ocorreu um erro na abertura do arquivo " + ex.getMessage());
            } finally {
                br.close();
            }
        } catch (IOException ex) {
//            Launcher.logOneMoreLine(1, "Ocorreu um erro na abertura do arquivo " + ex.getMessage());
        }
        return sb.toString();
    }
    
    public static void gravaLog() {

        File file = new File((new File("")).getAbsoluteFile().getAbsolutePath() + "/logs/integrador_" 
                + DateManipulador.formatDateToPattern("yyyy-MM-dd", SessionHelper.getDateDbSqlServer()) +".log");

        if (!file.isFile()) {
            gravaArquivo(file.getAbsolutePath(), TelaIntegracao.taMensagem.getText());
        } else {
            String texto = leArquivo(file.getAbsolutePath());
            gravaArquivo(file.getAbsolutePath(), texto + TelaIntegracao.taMensagem.getText());
        }
    }
    
}
