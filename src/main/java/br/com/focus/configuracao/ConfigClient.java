/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.focus.configuracao;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author Marcos Naves
 */
public class ConfigClient implements Serializable{
    
    private int minimumLoopTime;
    private int maxmumLoopTime;
    
    private int maxmumOldFileDays = 90;
    private int maxmumOldFileDaysLogs = 30;
    
    private String smbDomain ;
    private String smbUser ;
    private String smbPassword ;
    
    
    private String nameDirIn;
    private String nameDirReturn;
    
    private String pathRoot;
    private String nameDirBackUpOkay;
    private String nameDirBackUpError;
    
    private String strDbName ;

    private Long maxSize;
    private String termination ;
    
    private String usuario;
    private String senha;
    private String teste;
    
    private String codLaboratorio;
    
    private String urlBanco;
    private String usernameBanco;
    private String passwordBanco;
    
    private String imagemIcon;

    public ConfigClient() {
    }

    public ConfigClient(int minimumLoopTime, int maxmumLoopTime, String smbDomain, String smbUser, String smbPassword, String nameDirIn, 
            String nameDirReturn, String pathRoot, String nameDirBackUpOkay, String nameDirBackUpError, String strDbName, Long maxSize, 
            String termination, String urlWebService,int daysBack,int maxmumOldFileDaysLogs, String usuario, String senha, String codLaboratorio,
            String teste, String urlBanco, String usernameBanco, String passwordBanco, String imagemIcon) {

        if(minimumLoopTime  == 0){
           this.minimumLoopTime = 5000; 
        }else{
            this.minimumLoopTime = minimumLoopTime;
        }
        if(maxmumLoopTime == 0){
            this.maxmumLoopTime =  100000;
        }else{
            this.maxmumLoopTime = maxmumLoopTime;
        }
        
        if(strDbName == null){
            this.strDbName = "SQLSERVER";
        }else{
            this.strDbName = strDbName;
        }
        
        this.smbDomain = smbDomain;
        this.smbUser = smbUser;
        this.smbPassword = smbPassword;
        this.nameDirIn = nameDirIn;
        this.nameDirReturn = nameDirReturn;
        this.pathRoot = pathRoot;
        this.nameDirBackUpOkay = nameDirBackUpOkay;
        this.nameDirBackUpError = nameDirBackUpError;
        this.maxSize = maxSize;
        this.termination = termination;

        if(termination == null){
           this.termination = ".txt"; 
        }else{
            this.termination = termination;
        }
        
        this.maxmumOldFileDays = daysBack;
        this.maxmumOldFileDaysLogs = maxmumOldFileDaysLogs;
        
        this.usuario = usuario;
        this.senha = senha;
        this.codLaboratorio = codLaboratorio;
        this.teste = "N";
        this.urlBanco = urlBanco;
        this.usernameBanco = usernameBanco;
        this.passwordBanco = passwordBanco;
        this.imagemIcon = imagemIcon;
        
    }

    public int getMinimumLoopTime() {
        return minimumLoopTime;
    }

    public void setMinimumLoopTime(int minimumLoopTime) {
        this.minimumLoopTime = minimumLoopTime;
    }

    public int getMaxmumLoopTime() {
        return maxmumLoopTime;
    }

    public void setMaxmumLoopTime(int maxmumLoopTime) {
        this.maxmumLoopTime = maxmumLoopTime;
    }

    public int getMaxmumOldFileDays() {
        return maxmumOldFileDays;
    }

    public void setMaxmumOldFileDays(int maxmumOldFileDays) {
        this.maxmumOldFileDays = maxmumOldFileDays;
    }

    public int getMaxmumOldFileDaysLogs() {
        return maxmumOldFileDaysLogs;
    }

    public void setMaxmumOldFileDaysLogs(int maxmumOldFileDaysLogs) {
        this.maxmumOldFileDaysLogs = maxmumOldFileDaysLogs;
    }

    public String getSmbDomain() {
        return smbDomain;
    }

    public void setSmbDomain(String smbDomain) {
        this.smbDomain = smbDomain;
    }

    public String getSmbUser() {
        return smbUser;
    }

    public void setSmbUser(String smbUser) {
        this.smbUser = smbUser;
    }

    public String getSmbPassword() {
        return smbPassword;
    }

    public void setSmbPassword(String smbPassword) {
        this.smbPassword = smbPassword;
    }

    public String getNameDirIn() {
        return nameDirIn;
    }

    public void setNameDirIn(String nameDirIn) {
        this.nameDirIn = nameDirIn;
    }

    public String getNameDirReturn() {
        return nameDirReturn;
    }

    public void setNameDirReturn(String nameDirReturn) {
        this.nameDirReturn = nameDirReturn;
    }

    public String getPathRoot() {
        return pathRoot;
    }

    public void setPathRoot(String pathRoot) {
        this.pathRoot = pathRoot;
    }

    public String getNameDirBackUpOkay() {
        return nameDirBackUpOkay;
    }

    public void setNameDirBackUpOkay(String nameDirBackUpOkay) {
        this.nameDirBackUpOkay = nameDirBackUpOkay;
    }

    public String getNameDirBackUpError() {
        return nameDirBackUpError;
    }

    public void setNameDirBackUpError(String nameDirBackUpError) {
        this.nameDirBackUpError = nameDirBackUpError;
    }

    public String getStrDbName() {
        return strDbName;
    }

    public void setStrDbName(String strDbName) {
        this.strDbName = strDbName;
    }

    public Long getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(Long maxSize) {
        this.maxSize = maxSize;
    }

    public String getTermination() {
        return termination;
    }

    public void setTermination(String termination) {
        this.termination = termination;
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

    public String getCodLaboratorio() {
        return codLaboratorio;
    }

    public void setCodLaboratorio(String codLaboratorio) {
        this.codLaboratorio = codLaboratorio;
    }

    public String getTeste() {
        return teste;
    }

    public void setTeste(String teste) {
        this.teste = teste;
    }

    public String getUrlBanco() {
        return urlBanco;
    }

    public void setUrlBanco(String urlBanco) {
        this.urlBanco = urlBanco;
    }

    public String getUsernameBanco() {
        return usernameBanco;
    }

    public void setUsernameBanco(String usernameBanco) {
        this.usernameBanco = usernameBanco;
    }

    public String getPasswordBanco() {
        return passwordBanco;
    }

    public void setPasswordBanco(String passwordBanco) {
        this.passwordBanco = passwordBanco;
    }

    public String getImagemIcon() {
        return imagemIcon;
    }

    public void setImagemIcon(String imagemIcon) {
        this.imagemIcon = imagemIcon;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.minimumLoopTime;
        hash = 71 * hash + this.maxmumLoopTime;
        hash = 71 * hash + this.maxmumOldFileDays;
        hash = 71 * hash + this.maxmumOldFileDaysLogs;
        hash = 71 * hash + Objects.hashCode(this.smbDomain);
        hash = 71 * hash + Objects.hashCode(this.smbUser);
        hash = 71 * hash + Objects.hashCode(this.smbPassword);
        hash = 71 * hash + Objects.hashCode(this.nameDirIn);
        hash = 71 * hash + Objects.hashCode(this.nameDirReturn);
        hash = 71 * hash + Objects.hashCode(this.pathRoot);
        hash = 71 * hash + Objects.hashCode(this.nameDirBackUpOkay);
        hash = 71 * hash + Objects.hashCode(this.nameDirBackUpError);
        hash = 71 * hash + Objects.hashCode(this.strDbName);
        hash = 71 * hash + Objects.hashCode(this.maxSize);
        hash = 71 * hash + Objects.hashCode(this.termination);
        hash = 71 * hash + Objects.hashCode(this.usuario);
        hash = 71 * hash + Objects.hashCode(this.senha);
        hash = 71 * hash + Objects.hashCode(this.teste);
        hash = 71 * hash + Objects.hashCode(this.codLaboratorio);
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
        final ConfigClient other = (ConfigClient) obj;
        if (this.minimumLoopTime != other.minimumLoopTime) {
            return false;
        }
        if (this.maxmumLoopTime != other.maxmumLoopTime) {
            return false;
        }
        if (this.maxmumOldFileDays != other.maxmumOldFileDays) {
            return false;
        }
        if (this.maxmumOldFileDaysLogs != other.maxmumOldFileDaysLogs) {
            return false;
        }
        if (!Objects.equals(this.smbDomain, other.smbDomain)) {
            return false;
        }
        if (!Objects.equals(this.smbUser, other.smbUser)) {
            return false;
        }
        if (!Objects.equals(this.smbPassword, other.smbPassword)) {
            return false;
        }
        if (!Objects.equals(this.nameDirIn, other.nameDirIn)) {
            return false;
        }
        if (!Objects.equals(this.nameDirReturn, other.nameDirReturn)) {
            return false;
        }
        if (!Objects.equals(this.pathRoot, other.pathRoot)) {
            return false;
        }
        if (!Objects.equals(this.nameDirBackUpOkay, other.nameDirBackUpOkay)) {
            return false;
        }
        if (!Objects.equals(this.nameDirBackUpError, other.nameDirBackUpError)) {
            return false;
        }
        if (!Objects.equals(this.strDbName, other.strDbName)) {
            return false;
        }
        if (!Objects.equals(this.termination, other.termination)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.teste, other.teste)) {
            return false;
        }
        if (!Objects.equals(this.codLaboratorio, other.codLaboratorio)) {
            return false;
        }
        if (!Objects.equals(this.maxSize, other.maxSize)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ConfigClient{" + "minimumLoopTime=" + minimumLoopTime + ", maxmumLoopTime=" + maxmumLoopTime + ", maxmumOldFileDays=" + maxmumOldFileDays + ", maxmumOldFileDaysLogs=" + maxmumOldFileDaysLogs + ", smbDomain=" + smbDomain + ", smbUser=" + smbUser + ", smbPassword=" + smbPassword + ", nameDirIn=" + nameDirIn + ", nameDirReturn=" + nameDirReturn + ", pathRoot=" + pathRoot + ", nameDirBackUpOkay=" + nameDirBackUpOkay + ", nameDirBackUpError=" + nameDirBackUpError + ", strDbName=" + strDbName + ", maxSize=" + maxSize + ", termination=" + termination + ", usuario=" + usuario + ", senha=" + senha + ", teste=" + teste + ", codLaboratorio=" + codLaboratorio + '}';
    }
    
}
