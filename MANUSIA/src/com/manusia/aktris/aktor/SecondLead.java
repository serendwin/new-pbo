package com.manusia.aktris.aktor;

public class SecondLead extends Pemeran {
    private int totalPeranPendukung;
    private String jenisPeran;

    public SecondLead(
            String nama, String kewarganegaraan, String ttlLahir,
            String ttlDebut, int masaTrainee, String posisi,
            String drama, String movie, String album, String penghargaan,
            int totalPeranPendukung, String jenisPeran
    ) {
        super(nama, kewarganegaraan, ttlLahir, ttlDebut, masaTrainee,
                drama, movie, penghargaan, posisi, album);

        this.totalPeranPendukung = totalPeranPendukung;
        this.jenisPeran = jenisPeran;
    }
    public String cekJenisPeranPendukung() {
        switch (jenisPeran.toLowerCase()) {
            case "komedi":
                return "Komedi (Comic Relief)";
            case "villain":
                return "Villain / Antagonis Pendukung";
            case "teman":
            case "best friend":
                return "Teman Dekat Tokoh Utama";
            case "mentor":
                return "Mentor Tokoh Utama";
            case "rival":
                return "Rival Tokoh Utama";
            default:
                return "Jenis Peran Tidak Diketahui";
        }
    }
    public double hitungDukunganCerita() {
        return totalPeranPendukung * 1.8;

    }
    public void tampilkanJenisPeranTable() {
        System.out.println("=====================================================");
        System.out.println("                JENIS PERAN PENDUKUNG               ");
        System.out.println("=====================================================");
        System.out.printf("%-25s : %s\n", "Nama", nama);
        System.out.printf("%-25s : %s\n", "Jenis Peran Input", jenisPeran);
        System.out.printf("%-25s : %s\n", "Kategori Peran", cekJenisPeranPendukung());
        System.out.println("=====================================================\n");
    }
    public void tampilkanDukunganCeritaTable() {
        System.out.println("=====================================================");
        System.out.println("                SKOR DUKUNGAN CERITA                ");
        System.out.println("=====================================================");
        System.out.printf("%-25s : %s\n", "Nama", nama);
        System.out.printf("%-25s : %d\n", "Total Peran Pendukung", totalPeranPendukung);
        System.out.printf("%-25s : %.2f\n", "Skor Dukungan Cerita", hitungDukunganCerita());
        System.out.println("=====================================================\n");
    }
}
