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

    // ✅ Constructor FIX
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
            String posisi,
            String kategori
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
        this.kategori = kategori;

        this.event = "-";
        this.eventName = "-";
        this.eventType = "-";
        this.lokasi = "-";
        this.tanggal = "-";

        // ✅ aman sekarang
        this.harga = tentukanHarga(kategori);
    }

    // ✅ METHOD PENENTUAN HARGA
    protected double tentukanHarga(String kategori) {
        if (kategori == null) return 0;

        switch (kategori.toLowerCase()) {
            case "aktor":
                return 500_000;
            case "aktris":
                return 450_000;
            case "idol":
                return 750_000;
            default:
                return 0;
        }
    }

    // =======================
    // Method placeholder
    // =======================
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