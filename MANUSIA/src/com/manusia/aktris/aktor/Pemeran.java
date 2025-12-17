package com.manusia.aktris.aktor;

import java.util.Scanner;
import com.manusia.Agensi;

public class Pemeran extends Agensi 
{
    public String event;
    public String lokasi;
    public String tanggal;

    protected String kategori;
    protected String section;
    protected double harga;
    protected int qty;
    protected double total;
    protected String film;
    protected String drama;
    
    public Pemeran(
            String nama,
            String kewarganegaraan,
            String gender,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String posisi,
            String drama,
            String film,
            String penghargaan,
            String event,
            String lokasi,
            String tanggal
    ) {
          super(
            nama,
            kewarganegaraan,
            gender,
            ttlLahir,
            ttlDebut,
            masaTrainee,
            penghargaan,
            posisi
        );

        this.event = "-";
        this.lokasi = "-";
        this.tanggal = "-";
        this.harga = tentukanHargaAktor(kategori);
        this.harga = tentukanHargaAktris(kategori);
    }

    @Override
    public void tampilkanAktris() {
        System.out.println("=================================================================");
        System.out.println("======================   BIODATA AKTRIS   =======================");
        System.out.println("=================================================================");
        System.out.println("Nama             : " + nama);
        System.out.println("Gender           : " + gender);
        System.out.println("Kewarganegaraan  : " + kewarganegaraan);
        System.out.println("Tanggal Lahir    : " + ttlLahir);
        System.out.println("Debut            : " + ttlDebut);
        System.out.println("Drama            : " + drama);
        System.out.println("Film             : " + film);
        System.out.println("Penghargaan      : " + penghargaan);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void tampilkanAktor() {
        System.out.println("=================================================================");
        System.out.println("=======================   BIODATA AKTOR   =======================");
        System.out.println("=================================================================");
        System.out.println("Nama             : " + nama);
        System.out.println("Gender           : " + gender);
        System.out.println("Kewarganegaraan  : " + kewarganegaraan);
        System.out.println("Tanggal Lahir    : " + ttlLahir);
        System.out.println("Debut            : " + ttlDebut);
        System.out.println("Drama            : " + drama);
        System.out.println("Film             : " + film);
        System.out.println("Penghargaan      : " + penghargaan);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void infoEventaktor() {
        System.out.println("=================================================================");
        System.out.println("======================  INFO EVENT AKTOR  =======================");
        System.out.println("=================================================================");
        System.out.println("Aktor          : " + nama);
        System.out.println("Event          : " + event);
        System.out.println("Lokasi         : " + lokasi);
        System.out.println("Tanggal        : " + tanggal);
        System.out.println("----------------------  KATEGORI TIKET  -------------------------");
        System.out.println("VVIP           : Rp " + tentukanHargaAktor("VVIP"));
        System.out.println("VIP            : Rp " + tentukanHargaAktor("VIP"));
        System.out.println("REGULAR        : Rp " + tentukanHargaAktor("REGULAR"));
        System.out.println("BALCONY        : Rp " + tentukanHargaAktor("BALCONY"));
        System.out.println("=================================================================");
    }

    @Override
    public void inputTiketaktor(Scanner input) {
        input.nextLine();
        System.out.println("=================================================================");
        System.out.println("===================  PEMBELIAN TIKET FANMEETING =================");
        System.out.println("=================================================================");
        System.out.println("Aktor         : " + nama);
        System.out.println("Event         : " + event);
        System.out.print("Kategori Tiket: ");
        
        kategori = input.nextLine();
        harga = tentukanHargaAktor(kategori);

        System.out.println("Harga/Tiket   : Rp " + harga);

        System.out.print("Jumlah Tiket  : ");
        qty = input.nextInt();

        total = harga * qty;
        System.out.println("=================================================================");
        System.out.println();
    }


    @Override
    public void cetakTiketaktor() {
        System.out.println("====================== STRUK TIKET AKTOR ========================");
        System.out.println("Aktor    : " + nama);
        System.out.println("Event    : " + event);
        System.out.println("Kategori : " + kategori);
        System.out.println("Jumlah   : " + qty);
        System.out.println("Total    : Rp " + total);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void leeminho() {
        System.out.println("Tiket fanmeeting Lee Min-ho berhasil dipesan!");
        System.out.println();
    }

    @Override
    public void dongwook() {
        System.out.println("Tiket fanmeeting Lee Dong-wook berhasil dipesan!");
        System.out.println();
    }

    @Override
    public void infoEventaktris() {
        System.out.println("=================================================================");
        System.out.println("======================  INFO EVENT AKTRIS  ======================");
        System.out.println("=================================================================");
        System.out.println("Aktris         : " + nama);
        System.out.println("Event          : " + event);
        System.out.println("Lokasi         : " + lokasi);
        System.out.println("Tanggal        : " + tanggal);
        System.out.println("----------------------  KATEGORI TIKET  -------------------------");
        System.out.println("VVIP           : Rp " + tentukanHargaAktris("VVIP"));
        System.out.println("VIP            : Rp " + tentukanHargaAktris("VIP"));
        System.out.println("REGULAR        : Rp " + tentukanHargaAktris("REGULAR"));
        System.out.println("BALCONY        : Rp " + tentukanHargaAktris("BALCONY"));
        System.out.println("=================================================================");
    }

    @Override
    public void inputTiketaktris(Scanner input) {
        input.nextLine();
        System.out.println("=================================================================");
        System.out.println("===================  PEMBELIAN TIKET FANMEETING =================");
        System.out.println("=================================================================");
        System.out.println("Aktris        : " + nama);
        System.out.println("Event         : " + event);
        System.out.print("Kategori Tiket: ");
        
        kategori = input.nextLine();
        harga = tentukanHargaAktris(kategori);

        System.out.println("Harga/Tiket   : Rp " + harga);

        System.out.print("Jumlah Tiket  : ");
        qty = input.nextInt();

        total = harga * qty;
        System.out.println("=================================================================");
        System.out.println();
    }


    @Override
    public void cetakTiketaktris() {
        System.out.println("====================== STRUK TIKET AKTRIS =======================");
        System.out.println("Aktris   : " + nama);
        System.out.println("Event    : " + event);
        System.out.println("Kategori : " + kategori);
        System.out.println("Jumlah   : " + qty);
        System.out.println("Total    : Rp " + total);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void jiwon() {
        System.out.println("Tiket fanmeeting Kim Ji-won berhasil dipesan!");
        System.out.println();
    }

    @Override
    public void shinhye() {
        System.out.println("Tiket fanmeeting Park Shin-hye berhasil dipesan!");
        System.out.println();
    }

    private double tentukanHargaAktor(String kategori) {
        switch (kategori.toUpperCase()) {
            case "VVIP": return 3000000;
            case "VIP": return 2500000;
            case "REGULAR": return 900000;
            case "BALCONY": return 600000;
            default: 
                System.out.println("Kategori  " + kategori + "  tidak tersedia. Harga default digunakan.");
                return 0;
        }
    }

    private double tentukanHargaAktris(String kategori) {
        switch (kategori.toUpperCase()) {
            case "VVIP": return 2500000;
            case "VIP": return 1500000;
            case "REGULAR": return 800000;
            case "BALCONY": return 500000;
            default: 
                System.out.println("Kategori  " + kategori + "  tidak tersedia. Harga default digunakan.");
                return 0;
        }
    }

    public void tampilkandrama() {
        System.out.println("=================================================");
        System.out.println("                 DRAMA POPULER                  ");
        System.out.println("=================================================");
        System.out.println("Nama Artis : " + nama);
        System.out.println("Drama      : " + drama);
        System.out.println("Peran      : " + posisi);
        System.out.println("=================================================");
        System.out.println();
    }

    public void tampilkanFilm() {
        System.out.println("=================================================");
        System.out.println("                  FILM POPULER                  ");
        System.out.println("=================================================");
        System.out.println("Nama Artis : " + nama);
        System.out.println("Film       : " + film);
        System.out.println("Peran      : " + posisi);
        System.out.println("=================================================");
        System.out.println();
    }


}