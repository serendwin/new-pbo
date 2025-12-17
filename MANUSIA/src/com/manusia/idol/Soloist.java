package com.manusia.idol;

public class Soloist extends Idol {

    public String gayaAwal;
    public String gayaAkhir;
    public String deskripsi;
    public String penampilan;
    
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
        this.gayaAwal = "-";
        this.gayaAkhir = "-";
        this.deskripsi = "-";
        this.penampilan = "-";
    }

    @Override
    public void jadwalComeback() 
    {
        System.out.println("========= INFORMASI COMEBACK GROUP =========");
        System.out.println("Group : " + nama);
        System.out.println("MV    : 18.00 KST");
        System.out.println("============================================");
    }

public void transisiGayaPersonal() {
    System.out.println("=================================================");
    System.out.println("          TRANSISI GAYA PERSONAL                ");
    System.out.println("=================================================");
    System.out.println("Nama        : " + nama);
    System.out.println("Gaya Awal   : " + gayaAwal);
    System.out.println("Gaya Akhir  : " + gayaAkhir);
    System.out.println("Deskripsi   :" + deskripsi);
    System.out.println("=================================================");
    System.out.println();
}

public void monologuePerformance(String tema) {
    System.out.println("=================================================");
    System.out.println("           MONOLOGUE PERFORMANCE                ");
    System.out.println("=================================================");
    System.out.println("Pemeran     : " + nama);
    System.out.println("Tema        : " + tema);
    System.out.println("Penampilan  :" + penampilan);
    System.out.println("=================================================");
    System.out.println();
}

}

