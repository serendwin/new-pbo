package com.manusia.aktris.aktor;

import java.util.Scanner;
import com.manusia.Agensi;

public class Pemeran extends Agensi 
{

    public Pemeran(String nama, String kewarganegaraan, String ttlLahir,
                   String ttlDebut, int masaTrainee, String posisi,
                   String drama, String movie, String Album, String penghargaan) 
    {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee,
              drama, movie, penghargaan, posisi, Album);
    }

    @Override
    public void tampilkanAktris() 
    {
        System.out.println("=================================================================");
        System.out.println("======================   BIODATA AKTRIS   =======================");
        System.out.println("=================================================================");
        System.out.println("Nama             : " + nama);
        System.out.println("Kewarganegaraan  : " + kewarganegaraan);
        System.out.println("Tanggal Lahir    : " + ttlLahir);
        System.out.println("Debut            : " + ttlDebut);
        System.out.println("Drama            : " + listDrama);
        System.out.println("Movie            : " + listMovie);
        System.out.println("Penghargaan      : " + penghargaan);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void tampilkanAktor() 
    {
        System.out.println("=================================================================");
        System.out.println("=======================   BIODATA AKTOR   =======================");
        System.out.println("=================================================================");
        System.out.println("Nama             : " + nama);
        System.out.println("Kewarganegaraan  : " + kewarganegaraan);
        System.out.println("Tanggal Lahir    : " + ttlLahir);
        System.out.println("Debut            : " + ttlDebut);
        System.out.println("Drama            : " + listDrama);
        System.out.println("Movie            : " + listMovie);
        System.out.println("Penghargaan      : " + penghargaan);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void infoEventaktor() 
    {
        System.out.println("=================================================================");
        System.out.println("======================  INFO EVENT & PRICELIST  =================");
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
    public void inputTiketaktor(Scanner input) 
    {
        input.nextLine();
        System.out.println("=================================================================");
        System.out.println("===================  PEMBELIAN TIKET FANMEETING =================");
        System.out.println("=================================================================");
        System.out.println("Aktor        : " + nama);
        System.out.println("Event        : " + event);
        System.out.print("Kategori      : ");
        this.kategori = input.nextLine();
        this.harga = tentukanHargaAktor(this.kategori);

        System.out.println("Harga         : Rp " + this.harga);
        System.out.print("Masukkan jumlah tiket : ");
        this.qty = input.nextInt();
        this.total = this.harga * this.qty;
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void cetakTiketaktor() 
    {
        System.out.println("=================================================================");
        System.out.println("======================  CETAK TIKET FANMEETING  =================");
        System.out.println("=================================================================");
        System.out.println("Aktor         : " + this.nama);
        System.out.println("Event         : " + this.event);
        System.out.println("Kategori      : " + this.kategori);
        System.out.println("Harga/Tiket   : Rp " + this.harga);
        System.out.println("Jumlah Tiket  : " + this.qty);
        System.out.println("Total Harga   : Rp " + this.total);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void leeminho() 
    {
        System.out.println("Anda telah berhasil membeli tiket fanmeeting Lee Minho!");
        System.out.println();
    }

    @Override
    public void dongwook() 
    {
        System.out.println("Anda telah berhasil membeli tiket fanmeeting Lee Dongwook!");
        System.out.println();
    }

    @Override
    public void infoEventaktris() 
    {
        System.out.println("=================================================================");
        System.out.println("====================  INFO EVENT & PRICELIST  ===================");
        System.out.println("=================================================================");
        System.out.println("Aktris         : " + nama);
        System.out.println("Event          : " + event);
        System.out.println("Lokasi         : " + lokasi);
        System.out.println("Tanggal        : " + tanggal);
        System.out.println("------------------------  KATEGORI TIKET  -----------------------");
        System.out.println("VVIP           : Rp " + tentukanHargaAktris("VVIP"));
        System.out.println("VIP            : Rp " + tentukanHargaAktris("VIP"));
        System.out.println("REGULAR        : Rp " + tentukanHargaAktris("REGULAR"));
        System.out.println("BALCONY        : Rp " + tentukanHargaAktris("BALCONY"));
        System.out.println("=================================================================");
    }

    @Override
    public void inputTiketaktris(Scanner input) 
    {
        input.nextLine();
        System.out.println("=================================================================");
        System.out.println("===================  PEMBELIAN TIKET FANMEETING =================");
        System.out.println("=================================================================");
        System.out.println("Aktris        : " + nama);
        System.out.println("Event         : " + event);
        System.out.print("Kategori      : ");
        this.kategori = input.nextLine();
        this.harga = tentukanHargaAktris(this.kategori);
        System.out.println("Harga     : Rp " + this.harga);
        System.out.print("Masukkan jumlah tiket : ");
        this.qty = input.nextInt();
        this.total = this.harga * this.qty;
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void cetakTiketaktris() 
    {
        System.out.println("=================================================================");
        System.out.println("======================  CETAK TIKET FANMEETING  =================");
        System.out.println("=================================================================");
        System.out.println("Aktris       : " + this.nama);
        System.out.println("Event        : " + this.event);
        System.out.println("Kategori     : " + this.kategori);
        System.out.println("Harga/Tiket  : Rp " + this.harga);
        System.out.println("Jumlah Tiket : " + this.qty);
        System.out.println("Total Harga  : Rp " + this.total);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void jiwon() 
    {
        System.out.println("Anda telah berhasil membeli tiket fanmeeting Kim Jiwoon-!");
        System.out.println();
    }

    @Override
    public void shinhye() 
    {
        System.out.println("Anda telah berhasil membeli tiket fanmeeting Park Shin-Hye-!");
        System.out.println();
    }


    private double tentukanHargaAktris(String kategori) 
    {
        switch (kategori.toUpperCase()) 
        {
            case "VVIP": return 2500000;
            case "VIP": return 1500000;
            case "REGULAR": return 800000;
            case "BALCONY": return 500000;
            default:
                System.out.println("Kategori '" + kategori + "' tidak tersedia.");
                return 0;
        }
    }

    private double tentukanHargaAktor(String kategori) 
    {
        switch (kategori.toUpperCase()) 
        {
            case "VVIP": return 3000000;
            case "VIP": return 2500000;
            case "REGULAR": return 900000;
            case "BALCONY": return 600000;
            default: 
                System.out.println("Kategori  " + kategori + "  tidak tersedia. Harga default digunakan.");
                return 0;
        }
    }

public void hitungKekayaan(double pendapatanDrama, double pendapatanMovie, 
                           double pendapatanEvent, double pendapatanPenghargaan)
{
    double totalKekayaan = pendapatanDrama + pendapatanMovie + pendapatanEvent + pendapatanPenghargaan;

    System.out.println("====================================================");
    System.out.println("==================  TOTAL KEKAYAAN  =================");
    System.out.println("====================================================");
    System.out.println("Nama                 : " + nama);
    System.out.println("Pendapatan Drama     : Rp " + pendapatanDrama);
    System.out.println("Pendapatan Movie     : Rp " + pendapatanMovie);
    System.out.println("Pendapatan Event     : Rp " + pendapatanEvent);
    System.out.println("Pendapatan Award     : Rp " + pendapatanPenghargaan);
    System.out.println("----------------------------------------------------");
    System.out.println("Total Kekayaan       : Rp " + totalKekayaan);
    System.out.println("====================================================");
    System.out.println();
}

public void tampilkanListKarya() 
{
    System.out.println("====================================================");
    System.out.println("===================  LIST KARYA  ===================");
    System.out.println("====================================================");
    System.out.println("Nama Pemeran  : " + nama);
    System.out.println("----------------------------------------------------");
    System.out.println("Daftar Drama  : " + listDrama);
    System.out.println("Daftar Film   : " + listMovie);
    System.out.println("====================================================");
    System.out.println();
}
}