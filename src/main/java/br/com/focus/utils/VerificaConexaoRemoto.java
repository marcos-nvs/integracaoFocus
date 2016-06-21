/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.focus.utils;

import br.com.focus.integradorfocus.Launcher;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.UnknownHostException;

/**
 *
 * @author Marcos Naves
 */
public class VerificaConexaoRemoto {

    public static boolean verificaWebServerRemoto(String url) throws MalformedURLException {

        boolean blRetorno;

        URL u = new URL(url);

        try {
            HttpURLConnection huc = (HttpURLConnection) u.openConnection();
            huc.setRequestMethod("GET");
            huc.connect();

            if (huc.getResponseCode() == 200) {
                blRetorno = true;
            } else {
                blRetorno = false;
                Launcher.logOneMoreLine(3, "WebServer ' " + url + " ' fora do ar");
            }
            huc.disconnect();
        } catch (UnknownHostException ex) {
            blRetorno = false;
            Launcher.logOneMoreLine(3, ex.getMessage());
        } catch (IOException ex) {
            blRetorno = false;
            Launcher.logOneMoreLine(3, ex.getMessage());
        }

        return blRetorno;
    }
}
