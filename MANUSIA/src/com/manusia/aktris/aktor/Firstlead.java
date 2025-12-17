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
        System.out.println("Posisi Poster   :" + PosisiPoster);
        System.out.println("Highlight       :" + Highlight);
        System.out.println("Fokus Cerita    :" + FokusCerita);
        System.out.println("=================================================");
        System.out.println();
    }

    public void attendPressTour() {
        System.out.println("=================================================");
        System.out.println("               PRESS TOUR ACTIVITY              ");
        System.out.println("=================================================");
        System.out.println("Nama Presscon   :" + namapresscon);
        System.out.println("Nama TV         :" + Tv);
        System.out.println("• Podcast eksklusif");
        System.out.println("• Meet & Greet di 5 kota besar");
        System.out.println("=================================================");
        System.out.println();
    }
}
