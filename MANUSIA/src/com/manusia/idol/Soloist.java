package com.manusia.idol;

import java.util.Scanner;
import com.manusia.Agensi;

public class Soloist extends Agensi 
{
    private String albumSolo;

    public Soloist(String nama, String kewarganegaraan, String ttlLahir,
                   String ttlDebut, int masaTrainee, String posisi,
                   String drama, String movie, String Album, String penghargaan) 
    {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee,
              drama, movie, penghargaan, posisi, Album);

        this.albumSolo = Album;
    }

    @Override
    public void tampilkanbiodatagroupidol() 
    {
        System.out.println("===========================================================");
        System.out.println("=====================  BIODATA SOLOIST ====================");
        System.out.println("===========================================================");
        System.out.println("Nama Soloist   : " + nama);
        System.out.println("Debut          : " + ttlDebut);
        System.out.println("Album Terakhir : " + Album);
        System.out.println("Penghargaan    : " + penghargaan);
        System.out.println("===========================================================");
        System.out.println();
    }

    @Override
    public void tampilkanbiodatamemberNCTDream() {}

    @Override
    public void tampilkanbiodatamemberDAY6() {}

    @Override
    public void infoEventidol() 
    {
        System.out.println("===========================================================");
        System.out.println("==================== INFO EVENT SOLOIST ===================");
        System.out.println("===========================================================");
        System.out.println("Soloist      : " + nama);
        System.out.println("Event        : " + eventName);
        System.out.println("Jenis Event  : " + eventType);
        System.out.println("Lokasi       : " + lokasi);
        System.out.println("Tanggal      : " + tanggal);

        if (eventType.equals("KONSER")) {
            System.out.println("VVIP (A/B)     : Rp 3.200.000 / 2.900.000");
            System.out.println("VIP  (A/B/C)   : Rp 1.900.000 / 1.600.000 / 1.400.000");
            System.out.println("REGULAR (A/B)  : Rp 950.000 / 850.000");
            System.out.println("BALCONY LEFT   : Rp 650.000");
            System.out.println("BALCONY RIGHT  : Rp 600.000");
        } else {
            System.out.println("HI-TOUCH  : Rp 2.200.000");
            System.out.println("PHOTO OP  : Rp 1.300.000");
            System.out.println("SIGNING   : Rp 950.000");
            System.out.println("REGULAR   : Rp 550.000");
        }

        System.out.println("===========================================================");
    }

    @Override
    public void inputTiketidol(Scanner input) 
    {
        input.nextLine();
        System.out.println("===========================================================");
        System.out.println("===================== PEMBELIAN TIKET =====================");
        System.out.println("===========================================================");
        System.out.println("Event : " + eventName + " (" + eventType + ")");
        System.out.print("Kategori Tiket : ");
        kategori = input.nextLine().toUpperCase();

        if (eventType.equals("KONSER")) 
        {
            System.out.print("Section (A/B/C/LEFT/RIGHT) : ");
            section = input.nextLine().toUpperCase();
        } 
        else 
        {
            section = "-";
        }

        harga = tentukanHarga(eventType, kategori, section);
        System.out.println("Harga Tiket : Rp " + harga);

        System.out.print("Jumlah Tiket : ");
        if (!input.hasNextInt()) 
        {
            System.out.println("Jumlah tiket harus angka! Default = 1");
            qty = 1;
        } 
        else 
        {
            qty = input.nextInt();
            if (qty <= 0) qty = 1;
        }

        total = harga * qty;
        System.out.println("===========================================================");
        System.out.println();
    }

    @Override
    public void cetakTiketidol() 
    {
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
        

    private double tentukanHarga(String eventType, String kategori, String section) 
    {
        kategori = kategori.toUpperCase();
        section = section.toUpperCase();

        if (eventType.equals("FANMEETING")) 
        {
            switch (kategori) 
            {
                case "HI-TOUCH": return 2200000;
                case "PHOTO OP": return 1300000;
                case "SIGNING":  return 950000;
                case "REGULAR":  return 550000;
                default:
                    System.out.println("Kategori tidak dikenal, harga REGULAR digunakan.");
                    return 550000;
            }
        }

                switch (kategori) 
        {
            case "VVIP":
                if (section.equals("A")) return 3200000;
                if (section.equals("B")) return 2900000;
                return 2600000;

            case "VIP":
                if (section.equals("A")) return 1900000;
                if (section.equals("B")) return 1600000;
                if (section.equals("C")) return 1400000;
                return 1500000;
        }

        // Default jika kategori tidak cocok
        return 850000;
    }  // ← MENUTUP method tentukanHarga

}  // ← MENUTUP class Soloist

