package com.manusia;

import java.util.Scanner;
import com.manusia.aktris.aktor.Firstlead;
import com.manusia.aktris.aktor.Cameo;
import com.manusia.aktris.aktor.Pemeran;
import com.manusia.idol.Idol;
import com.manusia.idol.Soloist;
import com.manusia.idol.Group;

public class MainApp 
{
    public static void main(String[] args) 
    {

        Scanner input = new Scanner(System.in);

        /** Aktor - Aktris */

        /* Cameo */
        Cameo cameominho = new Cameo(
                "Lee Min-ho",
                "Korea Selatan",
                "Laki-laki",
                "22 Juni 1987",
                "2006",
                2,
                "Aktor",
                "The King: Eternal Monarch",
                "Gangnam Blues",
                "Baeksang Arts Awards",
                "-", "-", "-"
        );

        Cameo cameodongwook = new Cameo(
                "Lee Dong-wook",
                "Korea Selatan",
                "Laki-laki",
                "6 November 1981",
                "1999",
                3,
                "Aktor",
                "Goblin",
                "Single in Seoul",
                "SBS Drama Awards",
                "-", "-", "-"
        );

        Cameo cameoshinhye = new Cameo(
                "Park Shin-hye",
                "Korea Selatan",
                "Perempuan",
                "18 Februari 1990",
                "2003",
                2,
                "Aktris",
                "Doctors",
                "Alive",
                "SBS Drama Awards",
                "-", "-", "-"
        );        

        Cameo cameojiwon = new Cameo(
                "Kim Ji-won",
                "Korea Selatan",
                "Perempuan",
                "19 Oktober 1992",
                "2010",
                2,
                "Aktris",
                "Queen of Tears",
                "The Chronicles",
                "Baeksang Arts Awards",
                "-", "-", "-"
        );

        /* First Lead */ 

        Firstlead firstminho = new Firstlead(
                "Lee Min-ho",
                "Korea Selatan",
                "Laki-laki",
                "22 Juni 1987",
                "2006",
                2,
                "Aktor",
                "The Heirs, The King: Eternal Monarch",
                "Gangnam Blues",
                "Baeksang Arts Awards",
                "Lee Min-ho Fanmeeting 2026",
                "Jakarta Convention Center",
                "10 Mei 2026"
        );

        Firstlead firstdongwook = new Firstlead(
                "Lee Dong-wook",
                "Korea Selatan",
                "Laki-laki",
                "6 November 1981",
                "1999",
                3,
                "Aktor",
                "Tale of the Nine Tailed",
                "Single in Seoul",
                "SBS Drama Awards",
                "Lee Dong-wook Fanmeeting 2026",
                "Istora Senayan",
                "18 Mei 2026"
        );

        Firstlead firstshinhye = new Firstlead(
                "Park Shin-hye",
                "Korea Selatan",
                "Perempuan",
                "18 Februari 1990",
                "2003",
                2,
                "Aktris",
                "Doctors",
                "Alive",
                "SBS Drama Awards",
                "Park Shin-hye Fanmeeting 2026",
                "Balai Kartini",
                "25 Mei 2026"
        );

        Firstlead firstjiwon = new Firstlead(
                "Kim Ji-won",
                "Korea Selatan",
                "Perempuan",
                "19 Oktober 1992",
                "2010",
                2,
                "Aktris",
                "Queen of Tears",
                "The Chronicles",
                "Baeksang Arts Awards",
                "Kim Ji-won Fanmeeting 2026",
                "The Kasablanka Hall",
                "30 Mei 2026"
        );

        /* Pemeran */

        Pemeran leeminho = new Pemeran(
            "Lee Min-ho",
            "Korea Selatan",
            "Laki-laki",
            "22 Juni 1987",
            "2006",
            2,
            "Aktor",
            "The Heirs",
            "Gangnam Blues",
            "Baeksang Arts Awards",
            "Lee Min-ho Fanmeeting 2026",
            "JCC",
            "10 Mei 2026"
        );

        Pemeran leedongwook = new Pemeran(
            "Lee Dong-wook",
            "Korea Selatan",
            "Laki-laki",
            "6 November 1981",
            "1999",
            3,
            "Aktor",
            "Goblin",
            "Single in Seoul",
            "SBS Drama Awards",
            "Lee Dong-wook Fanmeeting 2026",
            "Istora Senayan",
            "18 Mei 2026"
        );

        Pemeran parkshinhye = new Pemeran(
            "Park Shin-hye",
            "Korea Selatan",
            "Perempuan",
            "18 Februari 1990",
            "2003",
            2,
            "Aktris",
            "Doctors",
            "Alive",
            "SBS Drama Awards",
            "Park Shin-hye Fanmeeting 2026",
            "Balai Kartini",
            "25 Mei 2026"
        );

        Pemeran kimjiwon = new Pemeran(
            "Kim Ji-won",
            "Korea Selatan",
            "Perempuan",
            "19 Oktober 1992",
            "2010",
            2,
            "Aktris",
            "Queen of Tears",
            "The Chronicles",
            "Baeksang Arts Awards",
            "Kim Ji-won Fanmeeting 2026",
            "The Kasablanka Hall",
            "30 Mei 2026"
        );

        /** Idol */

        Idol nctdream = new Idol(
                "NCT DREAM",
                "Korea Selatan",
                "Boygroup",
                "-",
                "2016",
                0,
                "Boygroup",
                "Daesang, Bonsang",
                "GLITCH MODE",
                "-", "-", "-", "-", "-"
        );
        Idol day6 = new Idol(
                "DAY6",
                "Korea Selatan",
                "Band",
                "-",
                "2015",
                0,
                "Band",
                "Best Band",
                "The Book of Us: Negentropy",
                "-", "-", "-", "-", "-"
        );

        Idol mark = new Idol(
            "Mark",
            "Korea Selatan / Kanada",
            "Laki-laki",
            "2 Agustus 1999",
            "2016",
            5,
            "Leader, Main Rapper, Main Dancer, Sub Vocalist",
            "Seoul Music Awards - Bonsang",
            "Reload (2020)",
            "-", "-", "-", "-", "-"
        );

        Idol renjun = new Idol(
            "Renjun",
            "Tiongkok",
            "Laki-laki",
            "23 Maret 2000",
            "2016",
            4,
            "Main Vocalist, Main Dancer",
            "Seoul Music Awards - Bonsang",
            "Reload (2020)",
            "-", "-", "-", "-", "-"
        );

        Idol jeno = new Idol(
            "Jeno",
            "Korea Selatan",
            "Laki-laki",
            "23 April 2000",
            "2016",
            5,
            "Main Rapper, Main Dancer, Sub Vocalist, Visual",
            "Seoul Music Awards - Bonsang",
            "Reload (2020)",
            "-", "-", "-", "-", "-"
        );

        Idol haechan = new Idol(
            "Haechan",
            "Korea Selatan",
            "Laki-laki",
            "6 Juni 2000",
            "2016",
            3,
            "Main Vocalist",
            "Seoul Music Awards - Bonsang",
            "Reload (2020)",
            "-", "-", "-", "-", "-"
        );

        Idol jaemin = new Idol(
            "Jaemin",
            "Korea Selatan",
            "Laki-laki",
            "13 Agustus 2000",
            "2016",
            5,
            "Main Dancer, Sub Rapper, Sub Vocalist, Visual, Center",
            "Seoul Music Awards - Bonsang",
            "Reload (2020)",
            "-", "-", "-", "-", "-"
        );

        Idol chenle = new Idol(
            "Chenle",
            "Tiongkok",
            "Laki-laki",
            "22 November 2001",
            "2016",
            1,
            "Main Vocalist",
            "Seoul Music Awards - Bonsang",
            "Reload (2020)",
            "-", "-", "-", "-", "-"
        );

        Idol jisung = new Idol(
            "Jisung",
            "Korea Selatan",
            "Laki-laki",
            "5 Februari 2002",
            "2016",
            5,
            "Main Dancer, Sub Rapper, Sub Vocalist, Maknae",
            "Seoul Music Awards - Bonsang",
            "Reload (2020)",
            "-", "-", "-", "-", "-"
        );

        Idol sungjin = new Idol(
            "Sungjin",
            "Korea Selatan",
            "Laki-laki",
            "16 Januari 1993",
            "2015",
            2,
            "Leader, Main Vocalist, Rhythm Guitarist",
            "Golden Disc Award - Best Band",
            "The Book of Us: Negentropy (2021)",
            "-", "-", "-", "-", "-"
        );

        Idol youngk = new Idol(
            "Young K",
            "Korea Selatan",
            "Laki-laki",
            "19 Desember 1993",
            "2015",
            2,
            "Bassist, Main Rapper, Main Vocalist",
            "Golden Disc Award - Best Band",
            "The Book of Us: Negentropy (2021)",
            "-", "-", "-", "-", "-"
        );

        Idol wonpil = new Idol(
            "Wonpil",
            "Korea Selatan",
            "Laki-laki",
            "28 April 1994",
            "2015",
            2,
            "Keyboardist, Main Vocalist, Visual",
            "Golden Disc Award - Best Band",
            "The Book of Us: Negentropy (2021)",
            "-", "-", "-", "-", "-"
        );

        Idol dowoon = new Idol(
            "Dowoon",
            "Korea Selatan",
            "Laki-laki",
            "25 Agustus 1995",
            "2015",
            2,
            "Drummer, Maknae, Vocalist",
            "Golden Disc Award - Best Band",
            "The Book of Us: Negentropy (2021)",
            "-", "-", "-", "-", "-"
        );

        Idol iu = new Idol(
            "IU",
            "Korea Selatan",
            "Perempuan",
            "16 Mei 1993",
            "2008",
            1,
            "Soloist, Vocalist, Songwriter",
            "Melon Music Awards, Baeksang Arts Awards",
            "LILAC (2021)",
            "-", "-", "-", "-", "-"
        );

        Idol paulkim = new Idol(
            "Paul Kim",
            "Korea Selatan",
            "Laki-laki",
            "11 Februari 1988",
            "2014",
            3,
            "Soloist, Vocalist",
            "Melon Music Awards, Seoul Music Awards",
            "Star (2018)",
            "-", "-", "-", "-", "-"
        );

        /* Group*/

        String[] memberNctDream = {
            "Mark",
            "Renjun",
            "Jeno",
            "Haechan",
            "Jaemin",
            "Chenle",
            "Jisung"
        };

        Group grupnct = new Group(
            "NCT DREAM",
            "Korea Selatan",
            "Laki-laki",
            "-",
            "2016",
            3,
            "Boy Group",
            "Seoul Music Awards - Bonsang",
            "Reload (2020)",
            7,
            memberNctDream,
            "Ridin'"
        );

        String[] memberDay6 = {
            "Sungjin",
            "Young K",
            "Wonpil",
            "Dowoon"
        };

        Group grupday6 = new Group(
            "DAY6",
            "Korea Selatan",
            "Laki-laki",
            "-",
            "2015", 
            2,
            "Band",
            "Golden Disc Award - Best Band",
            "The Book of Us: Negentropy (2021)",
            4,
            memberDay6,
            "You Make Me"
        );

        /* Soloist */

        Soloist soloiu = new Soloist(
            "IU",
            "Korea Selatan",
            "Perempuan",
            "16 Mei 1993",
            "2008",
            3,
            "Soloist, Vocalist, Actress",
            "Melon Music Awards, Baeksang Arts Awards",
            "LILAC (2021)"
        );

        Soloist solopaulkim = new Soloist(
            "Paul Kim",
            "Korea Selatan",
            "Laki-laki",
            "11 Februari 1988",
            "2014",
            4,
            "Soloist, Ballad Singer",
            "Melon Music Awards, Gaon Chart Music Awards",
            "Star (2018)"
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
