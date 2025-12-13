package com.manusia.aktris.aktor;

import java.util.Scanner;
import com.manusia.Agensi;

public class Pemeran extends Agensi {

    protected String film;

    public Pemeran(
            String nama,
            String kewarganegaraan,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String posisi,
            String drama,
            String movie,
            String album,
            String penghargaan,
            String kategori,   // ⬅️ PENTING
            String film
    ) {
        super(
                nama,
                kewarganegaraan,
                ttlLahir,
                ttlDebut,
                masaTrainee,
                drama,        // listDrama
                movie,        // listMovie
                album,
                penghargaan,
                posisi,
                kategori      // ⬅️ dikirim ke Agensi
        );

        this.film = film;
    }




    // ================= BIODATA =================
    @Override
    public void tampilkanAktris() {
        System.out.println("=================================================================");
        System.out.println("======================   BIODATA AKTRIS   =======================");
        System.out.println("=================================================================");
        System.out.println("Nama             : " + nama);
        System.out.println("Kewarganegaraan  : " + kewarganegaraan);
        System.out.println("Tanggal Lahir    : " + ttlLahir);
        System.out.println("Debut            : " + ttlDebut);
        System.out.println("Drama            : " + listDrama);
        System.out.println("Movie            : " + listMovie);
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
        System.out.println("Kewarganegaraan  : " + kewarganegaraan);
        System.out.println("Tanggal Lahir    : " + ttlLahir);
        System.out.println("Debut            : " + ttlDebut);
        System.out.println("Drama            : " + listDrama);
        System.out.println("Movie            : " + listMovie);
        System.out.println("Film             : " + film);
        System.out.println("Penghargaan      : " + penghargaan);
        System.out.println("=================================================================");
        System.out.println();
    }

    // ================= EVENT AKTOR =================
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
        System.out.println("VVIP           : Rp " + tentukanHarga("VVIP"));
        System.out.println("VIP            : Rp " + tentukanHarga("VIP"));
        System.out.println("REGULAR        : Rp " + tentukanHarga("REGULAR"));
        System.out.println("BALCONY        : Rp " + tentukanHarga("BALCONY"));
        System.out.println("=================================================================");
    }

    @Override
    public void inputTiketaktor(Scanner input) {
        input.nextLine();
        System.out.print("Kategori Tiket : ");
        kategori = input.nextLine();
        harga = tentukanHarga(kategori);
        System.out.print("Jumlah Tiket  : ");
        qty = input.nextInt();
        total = harga * qty;
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

    // ================= EVENT AKTRIS =================
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
        System.out.println("VVIP           : Rp " + tentukanHarga("VVIP"));
        System.out.println("VIP            : Rp " + tentukanHarga("VIP"));
        System.out.println("REGULAR        : Rp " + tentukanHarga("REGULAR"));
        System.out.println("BALCONY        : Rp " + tentukanHarga("BALCONY"));
        System.out.println("=================================================================");
    }

    @Override
    public void inputTiketaktris(Scanner input) {
        input.nextLine();
        System.out.print("Kategori Tiket : ");
        kategori = input.nextLine();
        harga = tentukanHarga(kategori);
        System.out.print("Jumlah Tiket  : ");
        qty = input.nextInt();
        total = harga * qty;
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

    // ================= TAMBAHAN =================
    public void tampilkandrama() {
        System.out.println("Drama populer : " + listDrama);
    }

    public void tampilkanFilm() {
        System.out.println("Film populer  : " + film);
    }
}