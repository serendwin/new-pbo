package com.manusia;

import java.util.Scanner;

public class Agensi {

    protected String nama;
    protected String kewarganegaraan;
    protected String ttlLahir;
    protected String ttlDebut;
    protected int masaTrainee;

    protected String listDrama;
    protected String listMovie;
    protected String album;
    protected String penghargaan;
    protected String posisi;


    public Agensi(
            String nama,
            String kewarganegaraan,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String listDrama,
            String listMovie,
            String album,
            String penghargaan,
            String posisi
    ) {
        this.nama = nama;
        this.kewarganegaraan = kewarganegaraan;
        this.ttlLahir = ttlLahir;
        this.ttlDebut = ttlDebut;
        this.masaTrainee = masaTrainee;

        this.listDrama = listDrama;
        this.listMovie = listMovie;
        this.album = album;
        this.penghargaan = penghargaan;
        this.posisi = posisi;
    }

    public void tampilkanAktor() {}
    public void tampilkanAktris() {}
    public void tampilkanbiodatagroupidol() {}
    public void tampilkanbiodatamemberNCTDream() {}
    public void tampilkanbiodatamemberDAY6() {}

    public void infoEventaktor() {}
    public void inputTiketaktor(Scanner in) {}
    public void cetakTiketaktor() {}

    public void infoEventaktris() {}
    public void inputTiketaktris(Scanner in) {}
    public void cetakTiketaktris() {}

    public void infoEventidol() {}
    public void inputTiketidol(Scanner in) {}
    public void cetakTiketidol() {}

    public void leeminho() {}
    public void dongwook() {}
    public void jiwon() {}
    public void shinhye() {}
}