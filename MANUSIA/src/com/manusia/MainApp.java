package com.manusia;

import java.util.Scanner;
import com.manusia.aktris.aktor.Firstlead;
import com.manusia.aktris.aktor.Cameo;
import com.manusia.aktris.aktor.Pemeran;
import com.manusia.idol.Idol;

public class MainApp 
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        /** Aktor - Aktris */

        Cameo cameominho = new Cameo(
                "Lee Min-ho",
                "Korea Selatan",
                "22 Juni 1987",
                "2006",
                2,
                "Aktor",
                "The King: Eternal Monarch",
                "Gangnam Blues",
                "-",
                "Baeksang Arts Awards",
                "Gangnam Blues"
        );

        cameominho.durasi = "± 3 Menit";
        cameominho.deskripsi = "Kemunculan misterius sebagai pria berjas hitam";
        cameominho.AksiUtama = "Memberi peringatan ke karakter utama";
        cameominho.DetailAksi = "Datang → Bicara → Menghilang";

        Firstlead firstminho = new Firstlead(
                "Lee Min-ho",
                "Korea Selatan",
                "22 Juni 1987",
                "2006",
                2,
                "Aktor",
                "The Heirs, The King: Eternal Monarch",
                "Gangnam Blues",
                "-",
                "Baeksang Arts Awards",
                "The King: Eternal Monarch"
        );

        leeMinhoLead.event = "Lee Min-ho Global Fanmeeting 2026";
        leeMinhoLead.lokasi = "Jakarta Convention Center (JCC)";
        leeMinhoLead.tanggal = "10 Mei 2026";

        Cameo leeDongwookCameo = new Cameo(
                "Lee Dong-wook",
                "Korea Selatan",
                "6 November 1981",
                "1999",
                3,
                "Aktor",
                "Goblin",
                "Single in Seoul",
                "-",
                "SBS Drama Awards",
                "Goblin"
        );

        leeDongwookCameo.durasi = "± 2 Menit";
        leeDongwookCameo.deskripsi = "Muncul sebagai pria misterius berpakaian gelap";
        leeDongwookCameo.AksiUtama = "Memberi informasi rahasia";
        leeDongwookCameo.DetailAksi = "Muncul → Senyum → Pergi";

        Firstlead leeDongwookLead = new Firstlead(
                "Lee Dong-wook",
                "Korea Selatan",
                "6 November 1981",
                "1999",
                3,
                "Aktor",
                "Tale of the Nine Tailed",
                "Single in Seoul",
                "-",
                "SBS Drama Awards",
                "Tale of the Nine Tailed"
        );

        leeDongwookLead.event = "Lee Dong-wook Fanmeeting 2026";
        leeDongwookLead.lokasi = "Istora Senayan";
        leeDongwookLead.tanggal = "18 Mei 2026";

        Cameo parkShinhyeCameo = new Cameo(
                "Park Shin-hye",
                "Korea Selatan",
                "18 Februari 1990",
                "2003",
                2,
                "Aktris",
                "Doctors",
                "Alive",
                "-",
                "SBS Drama Awards",
                "Alive"
        );

        parkShinhyeCameo.durasi = "± 2 Menit";
        parkShinhyeCameo.deskripsi = "Muncul sebagai dokter darurat";
        parkShinhyeCameo.AksiUtama = "Menyelamatkan pasien";
        parkShinhyeCameo.DetailAksi = "Datang → Bertindak → Pergi";

        Firstlead parkShinhyeLead = new Firstlead(
                "Park Shin-hye",
                "Korea Selatan",
                "18 Februari 1990",
                "2003",
                2,
                "Aktris",
                "Doctors",
                "Alive",
                "-",
                "SBS Drama Awards",
                "Doctors"
        );

        parkShinhyeLead.event = "Park Shin-hye Fanmeeting 2026";
        parkShinhyeLead.lokasi = "Balai Kartini";
        parkShinhyeLead.tanggal = "25 Mei 2026";

        Cameo kimJiwonCameo = new Cameo(
                "Kim Ji-won",
                "Korea Selatan",
                "19 Oktober 1992",
                "2010",
                2,
                "Aktris",
                "Queen of Tears",
                "The Chronicles",
                "-",
                "Baeksang Arts Awards",
                "Detective Story"
        );

        kimJiwonCameo.durasi = "± 2 Menit";
        kimJiwonCameo.deskripsi = "Kemunculan singkat penuh emosi";
        kimJiwonCameo.AksiUtama = "Mengungkap rahasia besar";
        kimJiwonCameo.DetailAksi = "Datang → Mengaku → Pergi";

        Firstlead kimJiwonLead = new Firstlead(
                "Kim Ji-won",
                "Korea Selatan",
                "19 Oktober 1992",
                "2010",
                2,
                "Aktris",
                "Queen of Tears",
                "The Chronicles",
                "-",
                "Baeksang Arts Awards",
                "Queen of Tears"
        );

        kimJiwonLead.event = "Kim Ji-won Fanmeeting 2026";
        kimJiwonLead.lokasi = "The Kasablanka Hall";
        kimJiwonLead.tanggal = "30 Mei 2026";

        /** Idol */

        Idol idol1 = new Idol(
                "NCT DREAM",
                "Korea Selatan",
                "25 Agustus 2016",
                "2016",
                7,
                "Vocalist, Rapper, Dancer",
                "-",
                "-",
                "Hot Sauce (2021)",
                "Seoul Music Awards - Bonsang"
        );

        Idol idol2 = new Idol(
                "DAY6",
                "Korea Selatan",
                "7 September 2015",
                "2015",
                2,
                "Band (Vocalist, Guitarist, Bassist, Keyboardist, Drummer)",
                "-",
                "-",
                "The Book of Us (2020)",
                "Golden Disc Award - Best Band"
        );

        // ====================== MEMBER NCT DREAM ======================
        Idol mark = new Idol(
                "Mark",
                "Korea Selatan / Kanada",
                "2 Agustus 1999",
                "2016",
                5,
                "Leader, Main Rapper, Main Dancer, Sub Vocalist",
                "-",
                "-",
                "Reload (2020)",
                "Seoul Music Awards - Bonsang"
        );

        Idol renjun = new Idol(
                "Renjun",
                "Tiongkok",
                "23 Maret 2000",
                "2016",
                4,
                "Main Vocalist, Main Dancer",
                "-",
                "-",
                "Reload (2020)",
                "Seoul Music Awards - Bonsang"
        );

        Idol jeno = new Idol(
                "Jeno",
                "Korea Selatan",
                "23 April 2000",
                "2016",
                5,
                "Main Rapper, Main Dancer, Sub Vocalist, Visual",
                "-",
                "-",
                "Reload (2020)",
                "Seoul Music Awards - Bonsang"
        );

        Idol haechan = new Idol(
                "Haechan",
                "Korea Selatan",
                "6 Juni 2000",
                "2016",
                3,
                "Main Vocalist",
                "-",
                "-",
                "Reload (2020)",
                "Seoul Music Awards - Bonsang"
        );

        Idol jaemin = new Idol(
                "Jaemin",
                "Korea Selatan",
                "13 Agustus 2000",
                "2016",
                5,
                "Main Dancer, Sub Rapper, Sub Vocalist, Visual, Center",
                "-",
                "-",
                "Reload (2020)",
                "Seoul Music Awards - Bonsang"
        );

        Idol chenle = new Idol(
                "Chenle",
                "Tiongkok",
                "22 November 2001",
                "2016",
                1,
                "Main Vocalist",
                "-",
                "-",
                "Reload (2020)",
                "Seoul Music Awards - Bonsang"
        );

        Idol jisung = new Idol(
                "Jisung",
                "Korea Selatan",
                "5 Februari 2002",
                "2016",
                5,
                "Main Dancer, Sub Rapper, Sub Vocalist, Maknae",
                "-",
                "-",
                "Reload (2020)",
                "Seoul Music Awards - Bonsang"
        );

        // ====================== MEMBER DAY6 ======================
        Idol sungjin = new Idol(
                "Sungjin",
                "Korea Selatan",
                "16 Januari 1993",
                "2015",
                2,
                "Leader, Main Vocalist, Rhythm Guitarist",
                "-",
                "-",
                "The Book of Us: Negentropy (2021)",
                "Golden Disc Award - Best Band"
        );

        Idol youngk = new Idol(
                "Young K",
                "Korea Selatan",
                "19 Desember 1993",
                "2015",
                2,
                "Bassist, Main Rapper, Main Vocalist",
                "-",
                "-",
                "The Book of Us: Negentropy (2021)",
                "Golden Disc Award - Best Band"
        );

        Idol wonpil = new Idol(
                "Wonpil",
                "Korea Selatan",
                "28 April 1994",
                "2015",
                2,
                "Keyboardist, Main Vocalist, Visual",
                "-",
                "-",
                "The Book of Us: Negentropy (2021)",
                "Golden Disc Award - Best Band"
        );

        Idol dowoon = new Idol(
                "Dowoon",
                "Korea Selatan",
                "25 Agustus 1995",
                "2015",
                2,
                "Drummer, Maknae, Vocalist",
                "-",
                "-",
                "The Book of Us: Negentropy (2021)",
                "Golden Disc Award - Best Band"
        );


        boolean kembaliutama = false;
        while (!kembaliutama) 
        {
        System.out.println("______________________________________________________________________");
        System.out.println("=====Hello My Dear, Welcome to Our House, MihuMihu Entertaintment!====");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Choose Your Fighter Baby:");
        System.out.println("----------------------------------------------------------------------");
        System.out.println("1. Pemeran Film");
        System.out.println("2. Idol");
        System.out.println("3. Keluar");
        System.out.println("----------------------------------------------------------------------");
        System.out.print("Pilih menu : ");
        int menuUtama = input.nextInt();
        System.out.println();
        switch (menuUtama)
        {
            case 1: 
                boolean kembalipemeran = false;
                while (!kembalipemeran) 
                {
                    System.out.println("=================================================================");
                    System.out.println("======================  MENU PEMERAN FILM  =====================");
                    System.out.println("=================================================================");
                    System.out.println("1. Lihat Biodata");
                    System.out.println("2. Info Event dan Pembelian Tiket");
                    System.out.println("3. Kegiatan Pemeran Film");
                    System.out.println("4. Kembali ke Menu Utama");
                    System.out.println("-----------------------------------------------------------------");   
                    System.out.print("Pilih Menu : ");
                    int menuutama = input.nextInt();
                    System.out.println();
                    switch (menuutama) 
                    {
                        case 1:  
                            System.out.println("=================================================================");
                            System.out.println("==================  PILIH BIODATA PEMERAN FILM  =================");
                            System.out.println("=================================================================");
                            System.out.println("1. Lee Min-ho");
                            System.out.println("2. Lee Dong-wook");
                            System.out.println("3. Park Shin-Hye");
                            System.out.println("4. Kim Soo-hyun");
                            System.out.println("5. Kembali");
                            System.out.println("----------------------------------------------------------------");                                
                            System.out.print("Pilih Pemeran : ");
                            int menubiodatapemeran = input.nextInt();
                            System.out.println();
                            switch (menubiodatapemeran) 
                            {
                                case 1:
                                    eventminho.tampilkanAktor();
                                    break;
                        
                                case 2:
                                    eventdongwook.tampilkanAktor();
                                    break;

                                case 3:
                                    eventshinhye.tampilkanAktris();
                                    break;
                                    
                                case 4: 
                                    eventsoohyun.tampilkanAktris();
                                    break;

                                case 5:
                                    System.out.println("Kamu kembali ke menu"); 
                                    System.out.println();
                                    break;
                                
                                default:
                                    System.out.println("Menu tidak tersedia!");
                                    System.out.println();
                            
                            break;
                            }
                        case 2:  
                            System.out.println("=================================================================");
                            System.out.println("====================  PRICELIST & INFO EVENT  ===================");
                            System.out.println("=================================================================");
                            System.out.println("1. Lee Min-ho");
                            System.out.println("2. Lee Dong-wook");
                            System.out.println("3. Park Shin-Hye");
                            System.out.println("4. Kim Soo-hyun");
                            System.out.println("5. Kembali");
                            System.out.println("----------------------------------------------------------------");                                
                            System.out.print("Pilih Pemeran : ");
                            int menutiketpemeran = input.nextInt();
                            System.out.println();
                            switch (menutiketpemeran) 
                            {
                                case 1:
                                    eventminho.infoEventaktor();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int tiketleeminho = input.nextInt();
                                    System.out.println();
                                    if (tiketleeminho == 1) 
                                    {
                                        eventminho.inputTiketaktor(input);
                                        eventminho.cetakTiketaktor();
                                        eventminho.leeminho();
                                    } 
                                    else 
                                    {
                                        System.out.println("Anda membatalkan pembelian.");
                                        System.out.println();
                                    }
                                    break;

                                case 2:
                                    eventdongwook.infoEventaktor();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int tiketdongwook = input.nextInt();
                                    System.out.println();
                                    if (tiketdongwook == 1) 
                                    {
                                        eventdongwook.inputTiketaktor(input);
                                        eventdongwook.cetakTiketaktor();
                                        eventdongwook.dongwook();
                                    } 
                                    else 
                                    {
                                        System.out.println("Anda membatalkan pembelian.");
                                        System.out.println();
                                    }
                                    break;

                                case 3:
                                    eventshinhye.infoEventaktris();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int tiketshinhye = input.nextInt();
                                    System.out.println();
                                    if (tiketshinhye == 1) 
                                    {
                                        eventshinhye.inputTiketaktris(input);
                                        eventshinhye.cetakTiketaktris();
                                        eventshinhye.shinhye();
                                    } 
                                    else 
                                    {
                                        System.out.println("Anda membatalkan pembelian.");
                                        System.out.println();
                                    }
                                    break;

                                case 4:
                                    eventsoohyun.infoEventaktor();
                                    System.out.println("1. Beli Tiket");
                                    System.out.println("2. Kembali");
                                    System.out.print("Pilih : ");
                                    int tiketsoohyun = input.nextInt();
                                    System.out.println();
                                    if (tiketsoohyun == 1) 
                                    {
                                        eventsoohyun.inputTiketaktris(input);
                                        eventsoohyun.cetakTiketaktris();
                                        eventsoohyun.jiwon();
                                    } 
                                    else 
                                    {
                                        System.out.println("Anda membatalkan pembelian.");
                                        System.out.println();
                                    }
                                    break;

                                case 5:
                                    System.out.println("Kamu kembali ke menu"); 
                                    System.out.println();
                                    break;
                                
                                default:
                                    System.out.println("Menu tidak tersedia!");
                                    System.out.println();
                            break;
                            }
                        case 3:  
                            System.out.println("=================================================================");
                            System.out.println("=====================  KEGIATAN PARA PEMERAN  ===================");
                            System.out.println("=================================================================");
                            System.out.println("1. Lee Min-ho");
                            System.out.println("2. Lee Dong-wook");
                            System.out.println("3. Park Shin-Hye");
                            System.out.println("4. Kim Soo-hyun");
                            System.out.println("5. Kembali");
                            System.out.println("----------------------------------------------------------------");                                
                            System.out.print("Pilih Pemeran : ");
                            int menukegiatanpemeran = input.nextInt();
                            System.out.println();
                            switch (menukegiatanpemeran) 
                            {
                                case 1:
                                    System.out.println("=================================================");
                                    System.out.println("==================  PILIH PERAN  ================");
                                    System.out.println("=================================================");
                                    System.out.println("1. First Lead");
                                    System.out.println("2. Cameo");
                                    System.out.println("3. Kembali");
                                    System.out.println("-------------------------------------------------");
                                    System.out.print("Pilih Peran : ");
                                    int bleeminho = input.nextInt();
                                    System.out.println();
                                    switch (bleeminho) 
                                    {
                                        case 1:
                                            firstminho.setPosterPosition();
                                            firstminho.attendPressTour();
                                            break;

                                        case 2:
                                            cameominho.appearBriefly(); 
                                            cameominho.deliverPlotTwist();
                                            break;

                                        case 3:
                                            System.out.println("Kamu kembali ke menu");
                                            System.out.println();
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                            System.out.println();
                                    break;
                                    }
                                case 2:
                                    System.out.println("=================================================");
                                    System.out.println("==================  PILIH PERAN  ================");
                                    System.out.println("=================================================");
                                    System.out.println("1. First Lead");
                                    System.out.println("2. Cameo");
                                    System.out.println("3. Kembali");
                                    System.out.println("-------------------------------------------------");
                                    System.out.print("Pilih Peran : ");
                                    int bleedongwook = input.nextInt();  
                                    System.out.println();
                                    switch (bleedongwook) 
                                    {
                                        case 1:
                                            firstdongwook.setPosterPosition();
                                            firstdongwook.attendPressTour();
                                            break;

                                        case 2:
                                            cameodongwook.appearBriefly();
                                            cameodongwook.deliverPlotTwist();
                                            break;

                                        case 3:
                                            System.out.println("Kamu kembali ke menu");
                                            System.out.println();
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                            System.out.println();
                                    break;
                                    }

                                case 3:
                                    System.out.println("=================================================");
                                    System.out.println("==================  PILIH PERAN  ================");
                                    System.out.println("=================================================");
                                    System.out.println("1. First Lead");
                                    System.out.println("2. Cameo");
                                    System.out.println("3. Kembali");
                                    System.out.println("-------------------------------------------------");
                                    System.out.print("Pilih Peran : ");
                                    int bparkshinhye = input.nextInt();  
                                    System.out.println();   
                                    switch (bparkshinhye) 
                                    {
                                        case 1:
                                            firstshinhye.setPosterPosition();
                                            firstshinhye.attendPressTour();
                                            break;

                                        case 2:
                                            cameoshinhye.appearBriefly();
                                            cameoshinhye.deliverPlotTwist();
                                            break;

                                        case 3:
                                            System.out.println("Kamu kembali ke menu");
                                            System.out.println();
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                            System.out.println();

                                    break;
                                    }
                                case 4: 
                                    System.out.println("=================================================");
                                    System.out.println("==================  PILIH PERAN  ================");
                                    System.out.println("=================================================");
                                    System.out.println("1. First Lead");
                                    System.out.println("2. Cameo");
                                    System.out.println("3. Kembali");
                                    System.out.println("-------------------------------------------------");
                                    System.out.print("Pilih Peran : ");
                                    int bkimsoohyun = input.nextInt();  
                                    System.out.println();   
                                    switch (bkimsoohyun) 
                                    {
                                        case 1:
                                            firstsoohyun.setPosterPosition();
                                            firstsoohyun.attendPressTour();
                                            break;

                                        case 2:
                                            cameosoohyun.appearBriefly();
                                            cameosoohyun.deliverPlotTwist();
                                            break;

                                        case 3:
                                            System.out.println("Kamu kembali ke menu");
                                            System.out.println();
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                            System.out.println();

                                    break;
                                    }

                                case 5:
                                    System.out.println("Kamu kembali ke menu"); 
                                    System.out.println();
                                    break;
                                
                                default:
                                    System.out.println("Menu tidak tersedia!");
                                    System.out.println();
                            
                         break;
                         }                            
                    }
                }
            break;
            

            case 2:
                boolean kembaliidol = false;
                while (!kembaliidol) 
                {
                    System.out.println("=================================================================");
                    System.out.println("==========================  MENU IDOL  ==========================");
                    System.out.println("=================================================================");
                    System.out.println("1. Group");
                    System.out.println("2. Soloist");
                    System.out.println("3. Kembali ke Menu Utama");
                    System.out.println("-----------------------------------------------------------------");   
                    System.out.print("Pilih Menu : ");
                    int menuutama = input.nextInt();
                    System.out.println();
                    switch (menuutama) 
                    {
                        case 1: 
                        System.out.println("===========================================================");
                        System.out.println("=======================  MENU IDOL  =======================");
                        System.out.println("===========================================================");
                        System.out.println("1. Lihat Biodata");
                        System.out.println("2. Pembelian Album");
                        System.out.println("3. Ticketing");
                        System.out.println("4. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------");
                        System.out.print("Pilih Menu: ");
                        int menugroup = input.nextInt();
                        System.out.println();
                        switch (menugroup) 
                        {
                            case 1:  
                                System.out.println("===========================================================");
                                System.out.println("==================== PILIH BIODATA IDOL ===================");
                                System.out.println("===========================================================");
                                System.out.println("1. NCT Dream");
                                System.out.println("2. Day6");
                                System.out.println("3. Kembali");
                                System.out.println("-----------------------------------------------------------");                            
                                System.out.print("Pilih Idol : ");
                                int menubiodatagroup = input.nextInt();
                                System.out.println();
                                switch (menubiodatagroup) 
                                {
                                    case 1:
                                        System.out.println("===========================================================");
                                        System.out.println("==================== BIODATA NCT DREAM ====================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. Biodata Group");
                                        System.out.println("2. Biodata Per-member");
                                        System.out.println("3. Keluar");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih yang ingin kamu akses biodatanya : ");
                                        int nctdream = input.nextInt();
                                        System.out.println();
                                        switch (nctdream) 
                                        {
                                            case 1 : 
                                                idol1.tampilkanbiodatagroupidol();
                                                break;
                                            
                                            case 2 :
                                                System.out.println("===========================================================");
                                                System.out.println("================= BIODATA MEMBER NCT DREAM ================");
                                                System.out.println("===========================================================");
                                                System.out.println("1. Mark");
                                                System.out.println("2. Renjun");
                                                System.out.println("3. Jeno");
                                                System.out.println("4. Haechan");
                                                System.out.println("5. Jaemin");
                                                System.out.println("6. Chenle");
                                                System.out.println("7. Jisung");
                                                System.out.println("8. Keluar");
                                                System.out.println("-----------------------------------------------------------");
                                                System.out.print("Pilih member yang ingin biodatanya kamu liat : ");
                                                int membernct = input.nextInt();
                                                System.out.println();
                                                switch (membernct) {
                                                    case 1 : 
                                                        mark.tampilkanbiodatamemberNCTDream();
                                                        break;

                                                    case 2 : 
                                                        renjun.tampilkanbiodatamemberNCTDream();
                                                        break;

                                                    case 3 : 
                                                        jeno.tampilkanbiodatamemberNCTDream();
                                                        break;

                                                    case 4 : 
                                                        haechan.tampilkanbiodatamemberNCTDream();
                                                        break;

                                                    case 5 : 
                                                        jaemin.tampilkanbiodatamemberNCTDream();
                                                        break;

                                                    case 6 : 
                                                        chenle.tampilkanbiodatamemberNCTDream();
                                                        break;

                                                    case 7 : 
                                                        jisung.tampilkanbiodatamemberNCTDream();
                                                        break;

                                                    default : 
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                }
                                        }
                                        break;

                                    case 2:
                                        System.out.println("===========================================================");
                                        System.out.println("=====================  BIODATA DAY6  ======================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. Biodata Group");
                                        System.out.println("2. Biodata Per-member");
                                        System.out.println("3. Keluar");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih yang ingin kamu akses biodatanya : ");
                                        int day6 = input.nextInt();
                                        System.out.println();
                                        switch (day6) 
                                        {
                                            case 1 : 
                                            idol2.tampilkanbiodatagroupidol();
                                            break;
                                            
                                            case 2 :
                                                System.out.println("===========================================================");
                                                System.out.println("=================  BIODATA MEMBER DAY6  ===================");
                                                System.out.println("===========================================================");
                                                System.out.println("1. Sungjin");
                                                System.out.println("2. YoungK");
                                                System.out.println("3. Wonpil");
                                                System.out.println("4. Dowoon");
                                                System.out.println("5. Keluar");
                                                System.out.println("-----------------------------------------------------------");
                                                System.out.print("Pilih member yang ingin biodatanya kamu liat : ");
                                                int memberday6 = input.nextInt();
                                                System.out.println();
                                                switch (memberday6) 
                                                {
                                                    case 1 : 
                                                        sungjin.tampilkanbiodatamemberDAY6();
                                                        break;

                                                    case 2 : 
                                                        youngk.tampilkanbiodatamemberDAY6();
                                                        break;

                                                    case 3 : 
                                                        wonpil.tampilkanbiodatamemberDAY6();
                                                        break;

                                                    case 4 : 
                                                        dowoon.tampilkanbiodatamemberDAY6();
                                                        break;

                                                    default : 
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                        System.out.println();
                                                }

                                        }
                                        break;

                                    default:
                                        System.out.println("Anda telah keluar dari fitur ini");
                                }
                                break;

                            case 2:  
                                System.out.println("===========================================================");
                                System.out.println("====================  PEMBELIAN ALBUM  ====================");
                                System.out.println("===========================================================");
                                System.out.println("1. NCT Dream");
                                System.out.println("2. Day6");
                                System.out.println("3. Kembali");
                                System.out.println("-----------------------------------------------------------");
                                System.out.print("Pilih Idol yang anda ingin beli Album nya : ");
                                int menualbum = input.nextInt();
                                System.out.println();
                                switch (menualbum) 
                                {
                                    case 1:
                                        idol1.pricelistAlbumNCT();
                                        System.out.println("1. Beli Album");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int albumnct = input.nextInt();
                                        System.out.println();
                                        if (albumnct == 1) 
                                        {
                                            idol1.beliAlbum(input);
                                            idol1.cetakStruk();
                                        } 
                                        else 
                                        {
                                            System.out.println("Anda membatalkan pembelian.");
                                            System.out.println();
                                        }
                                        break;

                                    case 2:
                                        idol2.pricelistAlbumDAY6();
                                        System.out.println("1. Beli Album");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int albumday6 = input.nextInt();
                                        System.out.println();
                                        if (albumday6 == 1) 
                                        {
                                            idol2.beliAlbum(input);
                                            idol2.cetakStruk();
                                        } 
                                        else 
                                        {
                                            System.out.println("Anda membatalkan pembelian.");
                                            System.out.println();
                                        }
                                        break;

                                    default:
                                        System.out.println("Anda telah keluar");
                                        System.out.println();
                                }
                                break;

                            case 3:
                                System.out.println("===========================================================");
                                System.out.println("=======================  TICKETING  =======================");
                                System.out.println("===========================================================");
                                System.out.println("1. NCT Dream");
                                System.out.println("2. Day6");
                                System.out.println("3. Kembali");
                                System.out.println("-----------------------------------------------------------");
                                System.out.print("Pilih : ");
                                int menutiket = input.nextInt();
                                System.out.println();
                                switch (menutiket) 
                                {
                                    case 1:
                                        System.out.println("===========================================================");
                                        System.out.println("==================  TICKETING NCT DREAM  ==================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. Konser");
                                        System.out.println("2. Fanmeeting");
                                        System.out.println("3. Kembali");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih : ");
                                        int tiketnct = input.nextInt();
                                        System.out.println();
                                        switch (tiketnct) 
                                        {
                                            case 1 : 
                                            idol1.infoEvent();
                                            System.out.println("1. Beli Tiket");
                                            System.out.println("2. Kembali");
                                            System.out.print("Pilih : ");
                                            int konsernct = input.nextInt();
                                            System.out.println();
                                            if (konsernct == 1) 
                                            {
                                                konser1.inputTiket(input);
                                                konser1.cetakTiket();
                                            } 
                                            else 
                                            {
                                                System.out.println("Anda membatalkan pembelian.");
                                                System.out.println();
                                            }
                                            break;

                                            case 2 : 
                                            fanmeet1.infoEvent();
                                            System.out.println("1. Beli Tiket");
                                            System.out.println("2. Kembali");
                                            System.out.print("Pilih : ");
                                            int fanmeetnct = input.nextInt();
                                            System.out.println();
                                            if (fanmeetnct == 1) 
                                            {
                                                fanmeet1.inputTiket(input);
                                                fanmeet1.cetakTiket();
                                            } 
                                            else 
                                            {
                                                System.out.println("Anda membatalkan pembelian.");
                                                System.out.println();
                                            }
                                            break;

                                            default:
                                                System.out.println("Anda telah keluar");
                                                System.out.println();
                                        } 
                                        break;

                                    case 2:
                                        System.out.println("===========================================================");
                                        System.out.println("====================  TICKETING DAY6  =====================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. Konser");
                                        System.out.println("2. Fanmeeting");
                                        System.out.println("3. Kembali");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih : ");
                                        int tiketday = input.nextInt();
                                        System.out.println();
                                        switch (tiketday) 
                                        {
                                            case 1 : 
                                            konser2.infoEvent();
                                            System.out.println("1. Beli Tiket");
                                            System.out.println("2. Kembali");
                                            System.out.print("Pilih : ");
                                            int konserday6 = input.nextInt();
                                            System.out.println();
                                            if (konserday6 == 1) 
                                            {
                                                konser2.inputTiket(input);
                                                konser2.cetakTiket();
                                            } 
                                            else 
                                            {
                                                System.out.println("Anda membatalkan pembelian.");
                                                System.out.println();
                                            }
                                            break;

                                            case 2 : 
                                            fanmeet2.infoEvent();
                                            System.out.println("1. Beli Tiket");
                                            System.out.println("2. Kembali");
                                            System.out.print("Pilih : ");
                                            int fanmeetday6 = input.nextInt();
                                            System.out.println();
                                            if (fanmeetday6 == 1) 
                                            {
                                                fanmeet2.inputTiket(input);
                                                fanmeet2.cetakTiket();
                                            } 
                                            else 
                                            {
                                                System.out.println("Anda membatalkan pembelian.");
                                                System.out.println();
                                            }
                                            break;

                                            default:
                                                System.out.println("Anda telah keluar");
                                                System.out.println();
                                        } 
                                        break;

                                    default:
                                        System.out.println("Anda telah keluar");
                                        System.out.println();
                                }
                                break;

                            case 4:
                                kembaliIdol = true;
                                break;

                            default:
                                System.out.println("Pilihan tidak valid!");
                                System.out.println();
                        }
                    }

                case 4:
                    System.out.println("Anda telah keluar dari program. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");

                            boolean kembaligroup = false;
                            while (!kembaligroup) 
                            {
                    
                        case 3:  
                            System.out.println("=================================================================");
                            System.out.println("=====================  KEGIATAN PARA PEMERAN  ===================");
                            System.out.println("=================================================================");
                            System.out.println("1. Lee Min-ho");
                            System.out.println("2. Lee Dong-wook");
                            System.out.println("3. Park Shin-Hye");
                            System.out.println("4. Kim Soo-hyun");
                            System.out.println("5. Kembali");
                            System.out.println("----------------------------------------------------------------");                                
                            System.out.print("Pilih Pemeran : ");
                            int menukegiatanpemeran = input.nextInt();
                            System.out.println();
                            switch (menukegiatanpemeran) 
                            {
                                case 1:
                                    System.out.println("=================================================");
                                    System.out.println("==================  PILIH PERAN  ================");
                                    System.out.println("=================================================");
                                    System.out.println("1. First Lead");
                                    System.out.println("2. Cameo");
                                    System.out.println("3. Kembali");
                                    System.out.println("-------------------------------------------------");
                                    System.out.print("Pilih Peran : ");
                                    int bleeminho = input.nextInt();
                                    System.out.println();
                                    switch (bleeminho) 
                                    {
                                        case 1:
                                            firstminho.setPosterPosition();
                                            firstminho.attendPressTour();
                                            break;

                                        case 2:
                                            cameominho.appearBriefly(); 
                                            cameominho.deliverPlotTwist();
                                            break;

                                        case 3:
                                            System.out.println("Kamu kembali ke menu");
                                            System.out.println();
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                            System.out.println();
                                    break;
                                    }
                                case 2:
                                    System.out.println("=================================================");
                                    System.out.println("==================  PILIH PERAN  ================");
                                    System.out.println("=================================================");
                                    System.out.println("1. First Lead");
                                    System.out.println("2. Cameo");
                                    System.out.println("3. Kembali");
                                    System.out.println("-------------------------------------------------");
                                    System.out.print("Pilih Peran : ");
                                    int bleedongwook = input.nextInt();  
                                    System.out.println();
                                    switch (bleedongwook) 
                                    {
                                        case 1:
                                            firstdongwook.setPosterPosition();
                                            firstdongwook.attendPressTour();
                                            break;

                                        case 2:
                                            cameodongwook.appearBriefly();
                                            cameodongwook.deliverPlotTwist();
                                            break;

                                        case 3:
                                            System.out.println("Kamu kembali ke menu");
                                            System.out.println();
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                            System.out.println();
                                    break;
                                    }

                                case 3:
                                    System.out.println("=================================================");
                                    System.out.println("==================  PILIH PERAN  ================");
                                    System.out.println("=================================================");
                                    System.out.println("1. First Lead");
                                    System.out.println("2. Cameo");
                                    System.out.println("3. Kembali");
                                    System.out.println("-------------------------------------------------");
                                    System.out.print("Pilih Peran : ");
                                    int bparkshinhye = input.nextInt();  
                                    System.out.println();   
                                    switch (bparkshinhye) 
                                    {
                                        case 1:
                                            firstshinhye.setPosterPosition();
                                            firstshinhye.attendPressTour();
                                            break;

                                        case 2:
                                            cameoshinhye.appearBriefly();
                                            cameoshinhye.deliverPlotTwist();
                                            break;

                                        case 3:
                                            System.out.println("Kamu kembali ke menu");
                                            System.out.println();
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                            System.out.println();

                                    break;
                                    }
                                case 4: 
                                    System.out.println("=================================================");
                                    System.out.println("==================  PILIH PERAN  ================");
                                    System.out.println("=================================================");
                                    System.out.println("1. First Lead");
                                    System.out.println("2. Cameo");
                                    System.out.println("3. Kembali");
                                    System.out.println("-------------------------------------------------");
                                    System.out.print("Pilih Peran : ");
                                    int bkimsoohyun = input.nextInt();  
                                    System.out.println();   
                                    switch (bkimsoohyun) 
                                    {
                                        case 1:
                                            firstsoohyun.setPosterPosition();
                                            firstsoohyun.attendPressTour();
                                            break;

                                        case 2:
                                            cameosoohyun.appearBriefly();
                                            cameosoohyun.deliverPlotTwist();
                                            break;

                                        case 3:
                                            System.out.println("Kamu kembali ke menu");
                                            System.out.println();
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                            System.out.println();

                                    break;
                                    }

                                case 5:
                                    System.out.println("Kamu kembali ke menu"); 
                                    System.out.println();
                                    break;
                                
                                default:
                                    System.out.println("Menu tidak tersedia!");
                                    System.out.println();
                            
                         break;
                         }                            
                    }
                }
            break;
            




        input.close();
        
        }

    }
}
