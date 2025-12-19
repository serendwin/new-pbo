package com.manusia.idol;

public class Soloist extends Idol {

    public String gayaAwal;
    public String gayaAkhir;
    public String deskripsi;
    public String tema;
    public String penampilan;
    
    public Soloist(
            String nama,
            String kewarganegaraan,
            String gender,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String posisi,
            String penghargaan,
            String album,
            String gayaAwal,
            String gayaAkhir,
            String deskripsi,
            String tema,
            String penampilan
    ) {
        super(
                nama,
                kewarganegaraan,
                gender,
                ttlLahir,
                ttlDebut,
                masaTrainee,
                posisi,
                penghargaan,
                album,
                "-",   
                "-", 
                "-", 
                "-",    
                "-"    
        );

        this.gayaAwal = gayaAwal;
        this.gayaAkhir = gayaAkhir;
        this.deskripsi = deskripsi;
        this.tema = tema;
        this.penampilan = penampilan;
    }

    @Override
    public void jadwalComeback() 
    {
        System.out.println("===========================================================");
        System.out.println("=============== INFORMASI COMEBACK SOLOIST ================");
        System.out.println("===========================================================");
         System.out.println("Soloist : " + nama);
        System.out.println("MV      : 18.00 KST");
       System.out.println("===========================================================");
    }

    public void transisiGayaPersonal() 
    {
        System.out.println("===========================================================");
        System.out.println("=========== INFORMASI TRANSISI GAYA PERSONAL ==============");
        System.out.println("===========================================================");
        System.out.println("Nama        : " + nama);
        System.out.println("Gaya Awal   : " + gayaAwal);
        System.out.println("Gaya Akhir  : " + gayaAkhir);
        System.out.println("Deskripsi   : " + deskripsi);
        System.out.println("===========================================================");
        System.out.println();
    }

    public void monologuePerformance(String tema) 
    {
        System.out.println("===========================================================");
        System.out.println("=========== INFORMASI MONOLOGUE PERFORMANCE ===============");
        System.out.println("===========================================================");
        System.out.println("Soloist    : " + nama);
        System.out.println("Tema       : " + tema);
        System.out.println("Penampilan : " + penampilan);
        System.out.println("===========================================================");
        System.out.println();
    }
}