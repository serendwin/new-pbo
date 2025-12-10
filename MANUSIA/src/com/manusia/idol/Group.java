package com.manusia.idol;

public class Group extends Idol {

    private String[] namaMember;
    private String judulLagu;

    public Group(String nama, String kewarganegaraan, String ttlLahir,
                     String ttlDebut, int masaTrainee, String posisi,
                     String drama, String movie, String Album, String penghargaan,
                     int JmlMember, String[] memberNames) {
       super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee,
              drama, movie, penghargaan, posisi, Album); }

    public void bagiLineDistribution() {
        System.out.println("==============================================");
        System.out.println("             LINE DISTRIBUTION                ");
        System.out.println("==============================================");
        double part = 100.0 / JmlMember;
        for (String m : namaMember) {
            System.out.println(m + " : " + String.format("%.1f", part) + "%"); }
        System.out.println("=============================================="); }

    public void fanChant() {
        System.out.println("==============================================");
        System.out.println("                 FANCHANT                     ");
        System.out.println("==============================================");
        System.out.println("Song : " + judulLagu);
        System.out.print("Fanchant: ");
        for (String m : namaMember) {
            System.out.print(m.toUpperCase() + "! "); }
        System.out.println("\n=============================================="); } }