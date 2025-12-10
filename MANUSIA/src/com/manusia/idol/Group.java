package com.manusia.idol;

public class Group extends Idol {

    private int JmlMember;
    private String[] namaMember;
    private String albumTerbaru;
    private String judulLagu;

    public Group(String nama, String kewarganegaraan, String ttlLahir,
                     String ttlDebut, int masaTrainee, String posisi,
                     String drama, String movie, String Album, String penghargaan,
                     int jumlahMember, String[] memberNames) {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee,
                posisi, drama, movie, Album, penghargaan);
        this.JmlMember = JmlMember;
        this.namaMember = namaMember; }

    public void jadwalComebackGroup() {
        System.out.println("==============================================");
        System.out.println("           INFORMASI COMEBACK GROUP           ");
        System.out.println("==============================================");
        System.out.println("Group     : " + nama);
        System.out.println("Title     : " + albumTerbaru);
        System.out.println("Members   : " + JmlMember);
        System.out.println("MV Release: 6 PM KST");
        System.out.println("==============================================");}

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