package com.example.eqiposfutbol;

public class Equipos {

    private String mnameTeam;
    private String mcityTeam;
    private String mliga;
    private int mranking;
    private int mantiguedad;
    private int mfotoEstadio;
    private int mfotoLogo;
    private int mfotoEquipo;

    public int getFotoEquipo() {
        return this.mfotoEquipo;
    }

    public void setFotoEquipo(int mfotoEquipo) {
        this.mfotoEquipo = mfotoEquipo;
    }

    public int getFotoEstadio() {
        return this.mfotoEstadio;
    }

    public void setFotoEstadio(int fotoEstadio) {
        this.mfotoEstadio = fotoEstadio;
    }

    public int getFotoLogo() {
        return this.mfotoLogo;
    }

    public void setFotoLogo(int fotoLogo) {
        this.mfotoLogo = fotoLogo;
    }

    public String getNameTeam() {
        return this.mnameTeam;
    }

    public void setNameTeam(String mnameTeam) {
        this.mnameTeam = mnameTeam;
    }

    public String getCityTeam() {
        return this.mcityTeam;
    }

    public void setCityTeam(String mcityTeam) {
        this.mcityTeam = mcityTeam;
    }

    public String getLiga() {
        return this.mliga;
    }

    public void setLiga(String mliga) {
        this.mliga = mliga;
    }

    public int getRanking() {
        return this.mranking;
    }

    public void setRanking(int mranking) {
        this.mranking = mranking;
    }

    public int getAntiguedad() {
        return this.mantiguedad;
    }

    public void setAntiguedad(int mantiguedad) {
        this.mantiguedad = mantiguedad;
    }

    public Equipos(String mnameTeam, String mcityTeam, String mliga, int mranking, int mantiguedad, int mfotoEstadio,int mfotoLogo , int mfotoEquipo) {
        this.mnameTeam = mnameTeam;
        this.mcityTeam = mcityTeam;
        this.mliga = mliga;
        this.mranking = mranking;
        this.mantiguedad = mantiguedad;
        this.mfotoEstadio = mfotoEstadio;
        this.mfotoLogo = mfotoLogo;
        this.mfotoEquipo = mfotoEquipo;

    }
}
