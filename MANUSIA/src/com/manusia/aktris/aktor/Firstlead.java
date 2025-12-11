package com.manusia.aktris.aktor;

public class Firstlead extends Pemeran 
{
    int totalPeranUtama;
    double ratingTertinggi;
    String peranLeadTerkenal;


    public Firstlead(
            String nama, String kewarganegaraan, String ttlLahir,
            String ttlDebut, int masaTrainee, String posisi,
            String drama, String movie, String album, String penghargaan,
            int totalPeranUtama, double ratingTertinggi, String peranLeadTerkenal


            
    ) {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee,
                drama, movie, penghargaan, posisi, album);

        this.totalPeranUtama = totalPeranUtama;
        this.ratingTertinggi = ratingTertinggi;
        this.peranLeadTerkenal = peranLeadTerkenal;
    }

    public double hitungPopularitasLead() {
        return (ratingTertinggi * 2) + (totalPeranUtama * 1.5);
    }

    public boolean cekPeranIkonik() {
        String[] ikon = {
                "Cha Eun Sang", "Yoon Se Ri", "Do Bong Soon",
                "Cheon Song Yi", "Dokter Yoo Hye Jung",
                "Kim Shin", "Moon Gang Tae"
        };

        for (String i : ikon) {
            if (peranLeadTerkenal.equalsIgnoreCase(i)) {
                return true;
            }
        }
        return false;
    }
    public void tampilkanAnalisisLead() {

        double skor = hitungPopularitasLead();
        boolean ikonik = cekPeranIkonik();

        System.out.println("=====================================================");
        System.out.println("              ANALISIS POPULARITAS LEAD              ");
        System.out.println("=====================================================");
        System.out.printf("%-22s : %s", "Nama", this.nama);
        System.out.printf("%-22s : %d", "Total Peran Utama", totalPeranUtama);
        System.out.printf("%-22s : %.1f", "Rating Tertinggi", ratingTertinggi);
        System.out.printf("%-22s : %s", "Peran Terkenal", peranLeadTerkenal);
        System.out.printf("%-22s : %.2f", "Skor Popularitas", skor);
        System.out.printf("%-22s : %s", "Status Peran",
                ikonik ? "Ikonik (Sangat Terkenal)" : "Biasa / Tidak Ikonik");
        System.out.println("=====================================================");
    }
    public void tampilkanDataLead() {
        System.out.println("==============================================");
        System.out.println("                 DATA FIRST LEAD              ");
        System.out.println("==============================================");
        System.out.printf("%-20s : %s", "Nama", nama);
        System.out.printf("%-20s : %d", "Total Peran Utama", totalPeranUtama);
        System.out.printf("%-20s : %.1f", "Rating Tertinggi", ratingTertinggi);
        System.out.printf("%-20s : %.2f", "Skor Popularitas", hitungPopularitasLead());
        System.out.println("==============================================");
    }
}