package com.manusia.idol;

public class Soloist extends Idol {

    public Soloist(
            String nama,
            String kewarganegaraan,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String posisi,
            String drama,
            String movie,
            String album,
            String penghargaan
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
    }

    @Override
    public void jadwalComeback() 
    {
        System.out.println("========= INFORMASI COMEBACK GROUP =========");
        System.out.println("Group : " + nama);
        System.out.println("MV    : 18.00 KST");
        System.out.println("============================================");
    }
}
