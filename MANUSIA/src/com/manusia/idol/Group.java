package com.manusia.idol;

public class Group extends Idol 
{
    private int jumlahMember;
    private String[] namaMember;
    private String judulLagu;

    public Group(
            String nama,
            String kewarganegaraan,
            String gender,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String posisi,
            String penghargaan,
            String album,
            int jumlahMember,
            String[] memberNames,
            String judulLagu
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

        this.jumlahMember = jumlahMember;
        this.namaMember = memberNames;
        this.judulLagu = judulLagu;
    }

    @Override
    public void jadwalComeback() 
    {
        System.out.println("=================================================================");
        System.out.println("==================== INFORMASI COMEBACK GROUP ===================");
        System.out.println("=================================================================");
        System.out.println("Group          : " + nama);
        System.out.println("Nama Album     : " + album);
        System.out.println("MV          : 18.00 KST");
        System.out.println("=================================================================");
        System.out.println();
    }

    public void bagiLineDistribution() 
    {
        System.out.println("=================================================================");
        System.out.println("======================= LINE DISTRIBUTION =======================");
        System.out.println("================================================================="); 
        System.out.println("Song : " + judulLagu);       
        double part = 100.0 / jumlahMember;
        for (String m : namaMember) {
            System.out.println(m + " : " + String.format("%.1f", part) + "%");
        }
        System.out.println("=================================================================");
        System.out.println();
    }

    public void fanChantday6() 
    {
        System.out.println("=================================================================");
        System.out.println("============================ FANCHANT ===========================");
        System.out.println("=================================================================");                
        System.out.println("Song : " + judulLagu);
        System.out.print("Fanchant: ");
        for (String m : namaMember) 
        {
            System.out.print(m.toUpperCase() + "!");
            System.out.println();
        }
        System.out.println("DAY6 SARANGHAE <3");
        System.out.println("=================================================================");
        System.out.println();
    }

        public void fanChantnct() 
    {
        System.out.println("=================================================================");
        System.out.println("============================ FANCHANT ===========================");
        System.out.println("=================================================================");                
        System.out.println("Song : " + judulLagu);
        System.out.print("Fanchant: ");
        for (String m : namaMember) 
        {
            System.out.print(m.toUpperCase() + "!");
            System.out.println();
        }
        System.out.println("NCT DREAM YONGWONHEE <3");
        System.out.println("=================================================================");
        System.out.println();
    }
}
