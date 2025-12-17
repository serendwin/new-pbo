package com.manusia.idol;

import com.manusia.Agensi;
import java.util.Scanner;

public class Idol extends Agensi {

    public String event;
    public String eventName;
    public String eventType;
    public String lokasi;
    public String tanggal;
    public String album;

    protected String kategori;
    protected String section;
    protected double harga;
    protected int qty;
    protected double total;

    public Idol(
            String nama,
            String kewarganegaraan,
            String gender,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String posisi,
            String penghargaan,
            String album,
            String event,
            String eventName,
            String eventType,       
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

        this.album = album;
        this.event = "-";
        this.eventName = "-";
        this.eventType = "-";
        this.lokasi = "-";
        this.tanggal = "-";
    }

    /* Biodata */

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

    /* Ticketing */

    @Override
    public void infoEventidol() {
        System.out.println("===========================================================");
        System.out.println("==================== INFO EVENT IDOL ======================");
        System.out.println("===========================================================");
        System.out.println("Idol         : " + nama);
        System.out.println("Event        : " + eventName);
        System.out.println("Jenis Event  : " + eventType);
        System.out.println("Lokasi       : " + lokasi);
        System.out.println("Tanggal      : " + tanggal);
        if (eventType.equals("KONSER")) {
            System.out.println("-------------------- KATEGORI & SECTION -------------------");
            System.out.println("VVIP (A/B)     : Rp 3.000.000 / 2.700.000");
            System.out.println("VIP  (A/B/C)   : Rp 1.800.000 / 1.500.000 / 1.300.000");
            System.out.println("REGULAR (A/B)  : Rp 900.000 / 800.000");
            System.out.println("BALCONY LEFT   : Rp 600.000");
            System.out.println("BALCONY RIGHT  : Rp 550.000");
        } else {
            System.out.println("---------------- KATEGORI TIKET FANMEETING ----------------");
            System.out.println("HI-TOUCH  : Rp 2.000.000");
            System.out.println("PHOTO OP  : Rp 1.200.000");
            System.out.println("SIGNING   : Rp 900.000");
            System.out.println("REGULAR   : Rp 500.000");
        }
        System.out.println("===========================================================");
    }

    @Override
    public void inputTiketidol(Scanner input) {
        input.nextLine();
        System.out.println("===========================================================");
        System.out.println("===================== PEMBELIAN TIKET =====================");
        System.out.println("===========================================================");
        System.out.println("Event : " + eventName + " (" + eventType + ")");

        System.out.print("Kategori Tiket : ");
        kategori = input.nextLine().toUpperCase();

        if (eventType.equals("KONSER")) {
            System.out.print("Section (A/B/C/LEFT/RIGHT) : ");
            section = input.nextLine().toUpperCase();
        } else {
            section = "-";
        }

        harga = tentukanHarga(eventType, kategori, section);
        System.out.println("Harga Tiket : Rp " + harga);

        System.out.print("Jumlah Tiket : ");
        if (!input.hasNextInt()) {
            System.out.println("Jumlah tiket harus angka! default = 1");
            qty = 1;
        } else {
            qty = input.nextInt();
            if (qty <= 0) qty = 1;
        }

        total = harga * qty;
        System.out.println("===========================================================");
        System.out.println();
    }

    @Override
    public void cetakTiketidol() {
        System.out.println("===========================================================");
        System.out.println("======================= CETAK TIKET =======================");
        System.out.println("===========================================================");
        System.out.println("Nama        : " + nama);
        System.out.println("Event       : " + eventName);
        System.out.println("Jenis       : " + eventType);
        System.out.println("Kategori    : " + kategori);

        if (eventType.equals("KONSER"))
            System.out.println("Section     : " + section);

        System.out.println("Harga/Tiket : Rp " + harga);
        System.out.println("Jumlah      : " + qty);
        System.out.println("Total Harga : Rp " + total);
        System.out.println("===========================================================");
        System.out.println();
    }

    public String toString() {
        System.out.println("===========================================================");
        return  "===================== STRUK TIKET =========================" +
                "===========================================================" +
                "Nama Idol     : " + nama + "\n" +
                "Event         : " + eventName + "\n" +
                "Jenis Event   : " + eventType + "\n" +
                "Kategori      : " + kategori + "\n" +
                "Section       : " + (eventType.equals("KONSER") ? section : "-") + "\n" +
                "Harga/Tiket   : Rp " + harga + "\n" +
                "Jumlah Tiket  : " + qty + "\n" +
                "Total Harga   : Rp " + total + "\n" +
                "===========================================================";
    }

    private double tentukanHarga(String eventType, String kategori, String section) {

        kategori = kategori.toUpperCase();
        section = section.toUpperCase();

        
        if (eventType.equals("FANMEETING")) {
            switch (kategori) {
                case "HI-TOUCH": return 2000000;
                case "PHOTO OP": return 1200000;
                case "SIGNING":  return 900000;
                case "REGULAR":  return 500000;
                default:
                    System.out.println("Kategori tidak dikenal, harga REGULAR digunakan.");
                    return 500000;
            }
        }

        
        switch (kategori) {
            case "VVIP":
                if (section.equals("A")) return 3000000;
                if (section.equals("B")) return 2700000;
                return 2500000;

            case "VIP":
                if (section.equals("A")) return 1800000;
                if (section.equals("B")) return 1500000;
                if (section.equals("C")) return 1300000;
                return 1500000;

            case "REGULAR":
                if (section.equals("A")) return 900000;
                if (section.equals("B")) return 800000;
                return 800000;

            case "BALCONY":
                if (section.equals("LEFT")) return 600000;
                if (section.equals("RIGHT")) return 550000;
                return 500000;

            default:
                System.out.println("Kategori tidak dikenal, harga REGULAR digunakan.");
                return 800000;
        }
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
