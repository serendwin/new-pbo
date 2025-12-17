package com.manusia.aktris.aktor;

public class Firstlead extends Pemeran 
{
    public String PosisiPoster;
    public String Highlight;
    public String FokusCerita;
    public String namapresscon;
    public String Tv;

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
            String film
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
                film
        );

        this.PosisiPoster = "-";
        this.Highlight = "-";
        this.FokusCerita = "-";
        this.namapresscon = "-";
        this.Tv = "-";
    }

    public void setPosterPosition() {
        System.out.println("=================================================");
        System.out.println("              FIRST LEAD POSITION               ");
        System.out.println("=================================================");
        System.out.println("Posisi Poster : Tengah");
        System.out.println("Highlight     : Nama paling besar");
        System.out.println("Fokus Cerita  : Karakter utama");
        System.out.println("=================================================");
        System.out.println();
    }

    public void attendPressTour() {
        System.out.println("=================================================");
        System.out.println("               PRESS TOUR ACTIVITY              ");
        System.out.println("=================================================");
        System.out.println("Aktivitas :");
        System.out.println("• Wawancara TV nasional");
        System.out.println("• Podcast eksklusif");
        System.out.println("• Meet & Greet di 5 kota besar");
        System.out.println("=================================================");
        System.out.println();
    }
}
