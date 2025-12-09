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
    protected String Album;
    protected String penghargaan;
    protected String posisi;
 
    protected String event;
    protected String eventName;
    protected String eventType;
    protected String lokasi;
    protected String tanggal;

    protected String kategori;
    protected String section;
    protected double harga;
    protected int qty;
    protected double total;

    public Agensi(String nama, String kewarganegaraan, String ttlLahir,
            String ttlDebut, int masaTrainee,
            String listDrama, String listMovie, String Album, String penghargaan,
            String posisi) 
    {
        this.nama = nama;
        this.kewarganegaraan = kewarganegaraan;
        this.ttlLahir = ttlLahir;
        this.ttlDebut = ttlDebut;
        this.masaTrainee = masaTrainee;

        this.Album = Album;
        this.listDrama = listDrama;
        this.listMovie = listMovie;
        this.penghargaan = penghargaan;
        this.posisi = posisi;

        this.event = "-";
        this.eventName = "-";
        this.eventType = "-";
        this.lokasi = "-";
        this.tanggal = "-";
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
