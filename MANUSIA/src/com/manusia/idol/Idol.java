package com.manusia.idol;

import com.manusia.Agensi;
import java.util.Scanner;

public class Idol extends Agensi {

    public String event;
    public String eventName;
    public String eventType;
    public String lokasi;
    public String tanggal;

    protected String kategori;
    protected String section;
    protected double harga;
    protected int qty;
    protected double total;
    protected String film;
    protected String drama;

    public Idol(
            String nama,
            String kewarganegaraan,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String posisi,
            String drama,
            String movie,
            String album,
            String penghargaan
    ) {

        super(
            nama,
            kewarganegaraan,
            ttlLahir,
            ttlDebut,
            masaTrainee,
            drama,
            movie,
            album,
            penghargaan,
            posisi
        );

        this.event = "-";
        this.eventName = "-";
        this.eventType = "-";
        this.lokasi = "-";
        this.tanggal = "-";
    }

    // ================= BIODATA =================
    @Override
    public void tampilkanbiodatagroupidol() {
        System.out.println("===========================================================");
        System.out.println("=====================  BIODATA GROUP  =====================");
        System.out.println("===========================================================");
        System.out.println("Group Boyband   : " + nama);
        System.out.println("Debut           : " + ttlDebut);
        System.out.println("Album Terakhir  : " + album);
        System.out.println("Penghargaan     : " + penghargaan);
        System.out.println("===========================================================");
        System.out.println();
    }

    @Override
    public void tampilkanbiodatamemberNCTDream() {
        System.out.println("==================================================================================");
        System.out.println("============================  BIODATA MEMBER NCT DREAM  ==========================");
        System.out.println("==================================================================================");
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + ttlLahir);
        System.out.println("Kewarganegaraan : " + kewarganegaraan);
        System.out.println("Masa Trainee    : " + masaTrainee);
        System.out.println("Posisi          : " + posisi);
        System.out.println("==================================================================================");
        System.out.println();
    }

    @Override
    public void tampilkanbiodatamemberDAY6() {
        System.out.println("===========================================================");
        System.out.println("===================  BIODATA MEMBER DAY6  =================");
        System.out.println("===========================================================");
        System.out.println("Nama            : " + nama);
        System.out.println("Tanggal Lahir   : " + ttlLahir);
        System.out.println("Kewarganegaraan : " + kewarganegaraan);
        System.out.println("Masa Trainee    : " + masaTrainee);
        System.out.println("Posisi          : " + posisi);
        System.out.println("===========================================================");
        System.out.println();
    }

    // ================= EVENT =================
    @Override
    public void infoEventidol() {
        System.out.println("=============== INFO EVENT IDOL =================");
        System.out.println("Idol       : " + nama);
        System.out.println("Event      : " + eventName);
        System.out.println("Jenis      : " + eventType);
        System.out.println("Lokasi     : " + lokasi);
        System.out.println("Tanggal    : " + tanggal);
        System.out.println("================================================");
    }

    // ================= PRICELIST =================
    public void pricelistAlbumNCT() {
        System.out.println("=========== PRICELIST ALBUM NCT DREAM ===========");
        System.out.println("GLITCH MODE  : Rp 300000");
        System.out.println("HOT SAUCE    : Rp 250000");
        System.out.println("================================================");
    }

    public void pricelistAlbumDAY6() {
        System.out.println("============= PRICELIST ALBUM DAY6 =============");
        System.out.println("FOUREVER        : Rp 280000");
        System.out.println("THE BOOK OF US  : Rp 320000");
        System.out.println("================================================");
    }

    public void belialbumnct(Scanner input) {
        input.nextLine();
        System.out.println("===========================================================");
        System.out.println("===============  PEMBELIAN ALBUM NCT DREAM  ===============");
        System.out.println("===========================================================");
        System.out.println("Idol    : " + nama);
        System.out.print("Nama Album    : ");
        this.album = input.nextLine();
        this.harga = tentukanHargaAlbum(this.album); // ✅ FIX
        System.out.println("Harga     : Rp " + this.harga);
        System.out.print("Masukkan jumlah Album : ");
        qty = input.nextInt();
        total = qty * harga;
        System.out.println("===========================================================");
        System.out.println();
        System.out.println("Anda telat membeli album ini, Terimakasih <3");
        System.out.println();
    }

    public void belialbumday6(Scanner input) {
        input.nextLine();
        System.out.println("===========================================================");
        System.out.println("==================  PEMBELIAN ALBUM DAY6  =================");
        System.out.println("===========================================================");
        System.out.println("Idol    : " + nama);
        System.out.print("Nama Album    : ");
        this.album = input.nextLine();
        this.harga = tentukanHargaAlbum(this.album);
        System.out.println("Harga     : Rp " + this.harga);
        System.out.print("Masukkan jumlah Album : ");
        qty = input.nextInt();
        total = qty * harga;
        System.out.println("===========================================================");
        System.out.println();
        System.out.println("Anda telat membeli album ini, Terimakasih <3");
        System.out.println();
    }

    public void cetakStruk() {
        System.out.println("================ STRUK PEMBELIAN ================");
        System.out.println("Idol   : " + nama);
        System.out.println("Album  : " + album); 
        System.out.println("Harga  : Rp " + harga);
        System.out.println("Jumlah : " + qty);
        System.out.println("Total  : Rp " + total);
        System.out.println("================================================");
    }

    // ================= HELPER =================
    private double tentukanHargaAlbum(String album) {
        switch (album.toUpperCase()) {
            case "GLITCH MODE": return 300000;
            case "HOT SAUCE": return 250000;
            case "FOUREVER": return 280000;
            case "THE BOOK OF US": return 320000;
            default:
                System.out.println("Album tidak terdaftar!");
                return 0;
        }
    }

    public void jadwalComeback() {}
}
