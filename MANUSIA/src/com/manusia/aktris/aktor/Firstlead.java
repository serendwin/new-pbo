package com.manusia.aktris.aktor;

public class Firstlead extends Pemeran 
{
    public String posisiPoster;
    public String highlight;
    public String fokusCerita;
    public String namaPresscon;
    public String tv;

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
            String tanggal,
            String posisiPoster,
            String highlight,
            String fokusCerita,
            String namaPresscon,
            String tv
    ) {
        super(nama, kewarganegaraan, gender, ttlLahir, ttlDebut, masaTrainee, posisi,
              drama, film, penghargaan, event, lokasi, tanggal);

        this.posisiPoster = posisiPoster;
        this.highlight = highlight;
        this.fokusCerita = fokusCerita;
        this.namaPresscon = namaPresscon;
        this.tv = tv;
    }

    public void setPosterPosition() {
        System.out.println("=================================================================");
        System.out.println("====================== FIRST LEAD POSITION ======================");
        System.out.println("================================================================="); 
        System.out.println("Nama            :" + nama);       
        System.out.println("Posisi Poster   : " + posisiPoster);
        System.out.println("Highlight       : " + highlight);
        System.out.println("Fokus Cerita    : " + fokusCerita);
        System.out.println("=================================================================");
        System.out.println();
    }

    public void attendPressTour() {
        System.out.println("=================================================================");
        System.out.println("====================== PRESS TOUR ACTIVITY ======================");
        System.out.println("=================================================================");  
        System.out.println("Nama            :" + nama);                     
        System.out.println("Nama Presscon   : " + namaPresscon);
        System.out.println("Nama TV         : " + tv);
        System.out.println("Podcast eksklusif");
        System.out.println("Meet & Greet di 5 kota besar");
        System.out.println("=================================================================");
        System.out.println();
    }
}