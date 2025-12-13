package com.manusia.aktris.aktor;

public class Cameo extends Pemeran 
{
    public Cameo(
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
            String film,       
            int totalPeranPendukung,
            String jenisPeran
    ) {
        super(
                nama,
                kewarganegaraan,
                ttlLahir,
                ttlDebut,
                masaTrainee,
                posisi,
                drama,
                movie,
                album,
                penghargaan,
                "cameo",                  // kategori
                film                      // ✅ WAJIB
        );

    }

    public void appearBriefly() {
        System.out.println("Muncul di satu scene selama 2 menit lalu menghilang dari cerita.");
    }

    public void deliverPlotTwist() {
        System.out.println("Datang → Kasih info rahasia ke Lead → Langsung pergi/menghilang.");
    }
}
