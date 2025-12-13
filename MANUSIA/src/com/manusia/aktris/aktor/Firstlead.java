package com.manusia.aktris.aktor;

public class Firstlead extends Pemeran {

    private String namaPemeran;
    private String peran;

    public Firstlead(
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
            String film,            // ✅ TAMBAH
            String namaPemeran,
            String peran
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
                "first lead",         // kategori
                film                 // ✅ WAJIB
        );

        this.namaPemeran = namaPemeran;
        this.peran = peran;
    }

    public void setPosterPosition() {
        System.out.println("Posisi: Tengah poster, ukuran font nama paling besar.");
    }

    public void attendPressTour() {
        System.out.println("Menghadiri wawancara TV, podcast, dan meet & greet di 5 kota.");
    }

    public String getNamaPemeran() {
        return namaPemeran;
    }

    public String getPeran() {
        return peran;
    }
}