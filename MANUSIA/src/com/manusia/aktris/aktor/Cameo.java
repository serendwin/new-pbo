package com.manusia.aktris.aktor;

public class Cameo extends Pemeran 
{
    private int totalPeranPendukung;
    private String jenisPeran;

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
                penghargaan
        );

        this.totalPeranPendukung = totalPeranPendukung;
        this.jenisPeran = jenisPeran;
    }

    public void appearBriefly() {
        System.out.println("Muncul di satu scene selama 2 menit lalu menghilang dari cerita.");
    }

    public void deliverPlotTwist() {
        System.out.println("Datang -> Kasih info rahasia ke Lead -> Langsung pergi/menghilang.");
    }

    // optional tapi rapi
    public int getTotalPeranPendukung() {
        return totalPeranPendukung;
    }

    public String getJenisPeran() {
        return jenisPeran;
    }
}
