package com.manusia;

import java.util.Scanner;

public class Agensi {

    protected String nama;
    protected String kewarganegaraan;
    protected String gender;
    protected String ttlLahir;
    protected String ttlDebut;
    protected int masaTrainee;
    protected String penghargaan;
    protected String posisi;


    public Agensi(
            String nama,
            String kewarganegaraan,
            String gender,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String penghargaan,
            String posisi
    ) {
        this.nama = nama;
        this.kewarganegaraan = kewarganegaraan;
        this.gender = gender;
        this.ttlLahir = ttlLahir;
        this.ttlDebut = ttlDebut;
        this.masaTrainee = masaTrainee;
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