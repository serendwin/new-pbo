package com.manusia.aktris.aktor;

public class Cameo extends Pemeran 
{
    public String namaperancameo; 
    public String durasi;
    public String deskripsi;
    public String DetailAksi;
    public String AksiUtama;

    public Cameo(
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
        super(nama, kewarganegaraan, gender, ttlLahir, ttlDebut, masaTrainee, posisi,
              drama, film, penghargaan, event, lokasi, tanggal);

        this.namaperancameo = nama;
        this.durasi = "-";
        this.deskripsi = "-";  
        this.DetailAksi = "-"; 
        this.AksiUtama = "-";
    }

    public void appearBriefly() {
        System.out.println("=================================================");
        System.out.println("                CAMEO APPEARANCE                ");
        System.out.println("=================================================");
        System.out.println("Nama Artis      : " + nama);
        System.out.println("Drama           : " + drama);
        System.out.println("Nama Pemeran    : " + namaperancameo);
        System.out.println("Durasi          : " + durasi);
        System.out.println("Deskripsi       : " + deskripsi);
        System.out.println("=================================================");
        System.out.println();
    }

    public void deliverPlotTwist() {
        System.out.println("=================================================");
        System.out.println("                PLOT TWIST MOMENT               ");
        System.out.println("=================================================");
        System.out.println("Nama Artis      : " + nama);
        System.out.println("Nama Pemeran    : " + namaperancameo);
        System.out.println("Aksi Utama      : " + AksiUtama);
        System.out.println("Detail Aksi     : " + DetailAksi);
        System.out.println("=================================================");
        System.out.println();
    }
}
