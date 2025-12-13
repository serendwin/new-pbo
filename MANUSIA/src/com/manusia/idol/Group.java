package com.manusia.idol;

public class Group extends Idol 
{
    private int jumlahMember;
    private String[] namaMember;
    private String judulLagu;

    public Group(
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
            int jumlahMember,
            String[] memberNames,
            String albumTerbaru,
            String judulLagu
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

        this.jumlahMember = jumlahMember;
        this.namaMember = memberNames;
        this.judulLagu = judulLagu;
    }

    @Override
    public void jadwalComeback() 
    {
        System.out.println("========= INFORMASI COMEBACK GROUP =========");
        System.out.println("Group : " + nama);
        System.out.println("MV    : 18.00 KST");
        System.out.println("============================================");
    }

    public void bagiLineDistribution() 
    {
        System.out.println("==============================================");
        System.out.println("             LINE DISTRIBUTION                ");
        System.out.println("==============================================");

        double part = 100.0 / jumlahMember;
        for (String m : namaMember) {
            System.out.println(m + " : " + String.format("%.1f", part) + "%");
        }

        System.out.println("==============================================");
    }

    public void fanChant() 
    {
        System.out.println("==============================================");
        System.out.println("                 FANCHANT                     ");
        System.out.println("==============================================");
        System.out.println("Song : " + judulLagu);
        System.out.print("Fanchant: ");

        for (String m : namaMember) {
            System.out.print(m.toUpperCase() + "! ");
        }

        System.out.println("\n==============================================");
    }

}

