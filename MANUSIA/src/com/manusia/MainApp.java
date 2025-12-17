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
                "NCT DREAM Fanmeeting 2026", 
                "-", 
                "FANMEETING", 
                "Balai Kartini", 
                "15 Januari 2026"
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
                "-", 
                "Day6 Fanmeeting 2026", 
                "FANMEETING", 
                "JCC", 
                "27 Januari 2026"
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
            "NCT DREAM WORLD TOUR", 
            "NCT DREAM The Dream Show 3", 
            "Konser", 
            "GBK Stadium", 
            "10 Agustus 2026"
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
            "NCT DREAM WORLD TOUR", 
            "NCT DREAM The Dream Show 3", 
            "Konser", 
            "GBK Stadium", 
            "10 Agustus 2026"
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
            "NCT DREAM WORLD TOUR", 
            "NCT DREAM The Dream Show 3", 
            "Konser", 
            "GBK Stadium", 
            "10 Agustus 2026"
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
            "NCT DREAM WORLD TOUR", 
            "NCT DREAM The Dream Show 3", 
            "Konser", 
            "GBK Stadium", 
            "10 Agustus 2026"
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
            "NCT DREAM WORLD TOUR", 
            "NCT DREAM The Dream Show 3", 
            "Konser", 
            "GBK Stadium", 
            "10 Agustus 2026"
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
             "NCT DREAM WORLD TOUR", 
            "NCT DREAM The Dream Show 3", 
            "Konser", 
            "GBK Stadium", 
            "10 Agustus 2026"
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
             "NCT DREAM WORLD TOUR", 
            "NCT DREAM The Dream Show 3", 
            "Konser", 
            "GBK Stadium", 
            "10 Agustus 2026"
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
            "DAY6 WORLD TOUR", 
            "DAY6 Gravity Tour", 
            "Konser", 
            "ICE BSD Hall", 
            "15 september 2026"
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
            "DAY6 WORLD TOUR", 
            "DAY6 Gravity Tour", 
            "Konser", 
            "ICE BSD Hall", 
            "15 september 2026"
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
            "DAY6 WORLD TOUR", 
            "DAY6 Gravity Tour", 
            "Konser", 
            "ICE BSD Hall", 
            "15 september 2026"
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
            "DAY6 WORLD TOUR", 
            "DAY6 Gravity Tour", 
            "Konser", 
            "ICE BSD Hall", 
            "15 september 2026"
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
            "IU FANMEETING", 
            "IU Lve Poem Fanmeeting", 
            "FANMEETING", 
            "Balai Kartini", 
            "21 Juni 2026"
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
            "PAUL KIM LIVE TOUR", 
            "Paul Kim One More Time Concert", 
            "Konser", 
            "The kasablanka Hall", 
            "30 Juli 2026"
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
                        System.out.println("=======================  MENU PEMERAN FILM  =====================");
                        System.out.println("=================================================================");
                        System.out.println("1. Aktris");
                        System.out.println("2. Aktor");
                        System.out.println("3. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------------");
                        System.out.print("Pilih Menu : ");
                        int menuutamapemeran = input.nextInt();
                        System.out.println();
                        switch (menuutamapemeran) 
                        {
                            case 1: 
                                boolean kembaliAktris = false;
                                while (!kembaliAktris) 
                                {
                                    System.out.println("=================================================================");
                                    System.out.println("=========================  MENU AKTRIS ==========================");
                                    System.out.println("=================================================================");
                                    System.out.println("1. Lihat Biodata");
                                    System.out.println("2. Info Event dan Pembelian Tiket");
                                    System.out.println("3. Kegiatan Ter Up to Date");
                                    System.out.println("4. Kembali");
                                    System.out.println("-----------------------------------------------------------------");
                                    System.out.print("Pilih Menu : ");
                                    int menuaktris = input.nextInt();
                                    System.out.println();
                                    switch (menuaktris) 
                                    {
                                        case 1: 
                                            System.out.println("=================================================================");
                                            System.out.println("==================  PILIH BIODATA PEMERAN FILM  =================");
                                            System.out.println("=================================================================");
                                            System.out.println("1. Park Shin-Hye");
                                            System.out.println("2. Kim Ji-won");
                                            System.out.println("3. Kembali");
                                            System.out.println("----------------------------------------------------------------");
                                            System.out.print("Pilih Pemeran : ");
                                            int menubiodataaktris = input.nextInt();
                                            System.out.println();
                                            switch (menubiodataaktris) 
                                            {
                                                case 1:
                                                    parkshinhye.tampilkanAktris();
                                                    break;
                                                case 2:
                                                    kimjiwon.tampilkanAktris();
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("Menu tidak tersedia!");
                                            }
                                            break;

                                        case 2: 
                                            System.out.println("=================================================================");
                                            System.out.println("====================  PRICELIST & INFO EVENT  ===================");
                                            System.out.println("=================================================================");
                                            System.out.println("1. Park Shin-Hye");
                                            System.out.println("2. Kim Ji-won");
                                            System.out.println("3. Kembali");
                                            System.out.println("----------------------------------------------------------------");
                                            System.out.print("Pilih Pemeran : ");
                                            int menutiketaktris = input.nextInt();
                                            System.out.println();
                                            switch (menutiketaktris) 
                                            {
                                                case 1:
                                                    parkshinhye.infoEventaktris();
                                                    System.out.println("1. Beli Tiket");
                                                    System.out.println("2. Kembali");
                                                    System.out.print("Pilih : ");
                                                    int tiketshinhye = input.nextInt();
                                                    System.out.println();
                                                    if (tiketshinhye == 1) 
                                                    {
                                                        parkshinhye.inputTiketaktris(input);
                                                        parkshinhye.cetakTiketaktris();
                                                        parkshinhye.shinhye();
                                                    } 
                                                    else 
                                                    {
                                                        System.out.println("Anda membatalkan pembelian.");
                                                        System.out.println();
                                                    }
                                                    break;

                                                case 2:
                                                    kimjiwon.infoEventaktor();
                                                    System.out.println("1. Beli Tiket");
                                                    System.out.println("2. Kembali");   
                                                    System.out.print("Pilih : ");
                                                    int tiketjiwon = input.nextInt();
                                                    System.out.println();
                                                    if (tiketjiwon == 1) 
                                                    {
                                                        kimjiwon.inputTiketaktris(input);
                                                        kimjiwon.cetakTiketaktris();
                                                        kimjiwon.jiwon();
                                                    } 
                                                    else 
                                                    {
                                                        System.out.println("Anda membatalkan pembelian.");
                                                        System.out.println();
                                                    }
                                                    break;

                                                case 3:
                                                    System.out.println("Kamu kembali ke menu");
                                                    System.out.println();
                                                    break;

                                                default:
                                                    System.out.println("Menu tidak tersedia!");
                                                    System.out.println();
                                            }
                                            break;

                                        case 3:
                                            System.out.println("=================================================================");
                                            System.out.println("=====================  KEGIATAN PARA PEMERAN  ===================");
                                            System.out.println("=================================================================");
                                            System.out.println("1. Park Shin-Hye");
                                            System.out.println("2. Kim Soo-hyun");
                                            System.out.println("3. Kembali");
                                            System.out.println("----------------------------------------------------------------");                                
                                            System.out.print("Pilih Pemeran : ");
                                            int menukegiatanpemeranaktris = input.nextInt();
                                            System.out.println();
                                            switch (menukegiatanpemeranaktris)   
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
                                                    int shinhye = input.nextInt();
                                                    System.out.println();
                                                    switch (shinhye) 
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
                                                    }
                                                    break;

                                                case 2:
                                                    System.out.println("=================================================");
                                                    System.out.println("==================  PILIH PERAN  ================");
                                                    System.out.println("=================================================");
                                                    System.out.println("1. First Lead");
                                                    System.out.println("2. Cameo");
                                                    System.out.println("3. Kembali");
                                                    System.out.println("-------------------------------------------------");
                                                    System.out.print("Pilih Peran : ");
                                                    int jiwon = input.nextInt();
                                                    System.out.println();
                                                    switch (jiwon) 
                                                    {
                                                        case 1:
                                                            firstjiwon.setPosterPosition();
                                                            firstjiwon.attendPressTour();
                                                            break;

                                                        case 2:
                                                            cameojiwon.appearBriefly();
                                                            cameojiwon.deliverPlotTwist();
                                                            break;

                                                        case 3:
                                                            System.out.println("Kamu kembali ke menu");
                                                            System.out.println();
                                                            break;

                                                        default:
                                                            System.out.println("Menu tidak tersedia!");
                                                            System.out.println();
                                                    }
                                                    break;

                                                case 3:
                                                        System.out.println("Kamu kembali ke menu");
                                                        System.out.println();
                                                    break;

                                                default:
                                                    System.out.println("Menu tidak tersedia!");
                                                    System.out.println();
                                            }
                                            break;
                                            
                                        case 4:
                                            kembaliAktris = true;
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                    }
                                }
                                break;

                            case 2:
                                boolean kembaliAktor = false;
                                while (!kembaliAktor) 
                                {
                                    System.out.println("=================================================================");
                                    System.out.println("==========================  MENU AKTOR ==========================");
                                    System.out.println("=================================================================");
                                    System.out.println("1. Lihat Biodata");
                                    System.out.println("2. Info Event dan Pembelian Tiket");
                                    System.out.println("3. Kegiatan Ter Up to Date");
                                    System.out.println("4. Kembali");
                                    System.out.println("-----------------------------------------------------------------");
                                    System.out.print("Pilih Menu : ");
                                    int menuaktris = input.nextInt();
                                    System.out.println();
                                    switch (menuaktris) 
                                    {
                                        case 1: 
                                            System.out.println("=================================================================");
                                            System.out.println("==================  PILIH BIODATA PEMERAN FILM  =================");
                                            System.out.println("=================================================================");
                                            System.out.println("1. Lee Min-ho");
                                            System.out.println("2. Lee Dong-wook");
                                            System.out.println("3. Kembali");
                                            System.out.println("----------------------------------------------------------------");
                                            System.out.print("Pilih Pemeran : ");
                                            int menubiodataaktor = input.nextInt();
                                            System.out.println();
                                            switch (menubiodataaktor) 
                                            {
                                                case 1:
                                                    leeminho.tampilkanAktor();
                                                    break;
                                                case 2:
                                                    leedongwook.tampilkanAktor();
                                                    break;
                                                case 3:
                                                    break;
                                                default:
                                                    System.out.println("Menu tidak tersedia!");
                                            }
                                            break;

                                        case 2: 
                                            System.out.println("=================================================================");
                                            System.out.println("====================  PRICELIST & INFO EVENT  ===================");
                                            System.out.println("=================================================================");
                                            System.out.println("1. Lee Min-ho");
                                            System.out.println("2. Lee Dong-wook");
                                            System.out.println("3. Kembali");
                                            System.out.println("----------------------------------------------------------------");
                                            System.out.print("Pilih Pemeran : ");
                                            int menutiketaktor = input.nextInt();
                                            System.out.println();
                                            switch (menutiketaktor) 
                                            {
                                                case 1:
                                                    parkshinhye.infoEventaktor();
                                                    System.out.println("1. Beli Tiket");
                                                    System.out.println("2. Kembali");
                                                    System.out.print("Pilih : ");
                                                    int tiketminho = input.nextInt();
                                                    System.out.println();
                                                    if (tiketminho == 1) 
                                                    {
                                                        leeminho.inputTiketaktor(input);
                                                        leeminho.cetakTiketaktor();
                                                        leeminho.leeminho();
                                                    } 
                                                    else 
                                                    {
                                                        System.out.println("Anda membatalkan pembelian.");
                                                        System.out.println();
                                                    }
                                                    break;

                                                case 2:
                                                    leedongwook.infoEventaktor();
                                                    System.out.println("1. Beli Tiket");
                                                    System.out.println("2. Kembali");   
                                                    System.out.print("Pilih : ");
                                                    int tiketdongwook = input.nextInt();
                                                    System.out.println();
                                                    if (tiketdongwook == 1) 
                                                    {
                                                        leedongwook.inputTiketaktor(input);
                                                        leedongwook.cetakTiketaktor();
                                                        leedongwook.dongwook();
                                                    } 
                                                    else 
                                                    {
                                                        System.out.println("Anda membatalkan pembelian.");
                                                        System.out.println();
                                                    }
                                                    break;

                                                case 3:
                                                    System.out.println("Kamu kembali ke menu");
                                                    System.out.println();
                                                    break;

                                                default:
                                                    System.out.println("Menu tidak tersedia!");
                                                    System.out.println();
                                            }
                                            break;

                                        case 3:
                                            System.out.println("=================================================================");
                                            System.out.println("=====================  KEGIATAN PARA PEMERAN  ===================");
                                            System.out.println("=================================================================");
                                            System.out.println("1. Lee Min-ho");
                                            System.out.println("2. Lee Dong-wook");
                                            System.out.println("3. Kembali");
                                            System.out.println("----------------------------------------------------------------");                                
                                            System.out.print("Pilih Pemeran : ");
                                            int menukegiatanpemeranaktor = input.nextInt();
                                            System.out.println();
                                            switch (menukegiatanpemeranaktor)   
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
                                                    int minho = input.nextInt();
                                                    System.out.println();
                                                    switch (minho) 
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
                                                    }
                                                    break;

                                                case 2:
                                                    System.out.println("=================================================");
                                                    System.out.println("==================  PILIH PERAN  ================");
                                                    System.out.println("=================================================");
                                                    System.out.println("1. First Lead");
                                                    System.out.println("2. Cameo");
                                                    System.out.println("3. Kembali");
                                                    System.out.println("-------------------------------------------------");
                                                    System.out.print("Pilih Peran : ");
                                                    int dongwook = input.nextInt();
                                                    System.out.println();
                                                    switch (dongwook) 
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
                                                    }
                                                    break;

                                                case 3:
                                                        System.out.println("Kamu kembali ke menu");
                                                        System.out.println();
                                                    break;

                                                default:
                                                    System.out.println("Menu tidak tersedia!");
                                                    System.out.println();
                                            }
                                            break;
                                            
                                        case 4:
                                            kembaliAktor = true;
                                            break;

                                        default:
                                            System.out.println("Menu tidak tersedia!");
                                    }
                                }
                                break;

                            case 3:
                                kembalipemeran = true;
                                break;

                            default:
                                System.out.println("Menu tidak tersedia!");
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
                        int menuutamaidol = input.nextInt();
                        System.out.println();
                        switch (menuutamaidol) 
                        {
                            case 1: 
                                System.out.println("===========================================================");
                                System.out.println("=======================  MENU GROUP  ======================");
                                System.out.println("===========================================================");
                                System.out.println("1. Lihat Biodata");
                                System.out.println("2. Pembelian Album");
                                System.out.println("3. Ticketing");
                                System.out.println("4. Kegiatan Ter Up to Date");
                                System.out.println("5. Kembali ke Menu Utama");
                                System.out.println("-----------------------------------------------------------");
                                System.out.print("Pilih Menu: ");
                                int menugroup = input.nextInt();
                                System.out.println();
                                switch (menugroup) 
                                {
                                    case 1:  
                                        System.out.println("===========================================================");
                                        System.out.println("====================== PILIH BIODATA ======================");
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
                                                int biodatanctdream = input.nextInt();
                                                System.out.println();
                                                switch (biodatanctdream) 
                                                {
                                                    case 1 : 
                                                        nctdream.tampilkanbiodatagroupidol();
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
                                                        switch (membernct) 
                                                        {
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
                                                        break;
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
                                                int biodataday6 = input.nextInt();
                                                System.out.println();
                                                switch (biodataday6) 
                                                {
                                                    case 1 : 
                                                    day6.tampilkanbiodatagroupidol();
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
                                                nctdream.pricelistAlbumNCT();
                                                System.out.println("1. Beli Album");
                                                System.out.println("2. Kembali");
                                                System.out.print("Pilih : ");
                                                int albumnct = input.nextInt();
                                                System.out.println();
                                                if (albumnct == 1) 
                                                {
                                                    nctdream.belialbumnct(input);
                                                    nctdream.cetakStruk();
                                                } 
                                                else 
                                                {
                                                    System.out.println("Anda membatalkan pembelian.");
                                                    System.out.println();
                                                }
                                                break;

                                            case 2:
                                                day6.pricelistAlbumDAY6();
                                                System.out.println("1. Beli Album");
                                                System.out.println("2. Kembali");
                                                System.out.print("Pilih : ");
                                                int albumday6 = input.nextInt();
                                                System.out.println();
                                                if (albumday6 == 1) 
                                                {
                                                    day6.belialbumday6(input);
                                                    day6.cetakStruk();
                                                } 
                                                else 
                                                {
                                                    System.out.println("Anda membatalkan pembelian.");
                                                    System.out.println();
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Anda telah keluar");
                                                System.out.println();
                                                break;

                                            default:
                                                System.out.println("Tidak ada menu yang dipilih");
                                                System.out.println();
                                        }
                                        break;

                                    case 3:
                                        System.out.println("===========================================================");
                                        System.out.println("========================  TICKETING  ======================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. NCT Dream");
                                        System.out.println("2. Day6");
                                        System.out.println("3. Kembali");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih : ");
                                        int menutiketgroup = input.nextInt();
                                        System.out.println();
                                        switch (menutiketgroup) 
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
                                                int eventnct = input.nextInt();
                                                System.out.println();
                                                switch (eventnct)
                                                {
                                                    case 1:
                                                        nctdream.infoEventidol();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketnctkonser = input.nextInt();
                                                        System.out.println();
                                                        if (tiketnctkonser == 1) 
                                                        {
                                                            nctdream.inputTiketidol(input);
                                                            nctdream.cetakTiketidol();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;

                                                    case 2:
                                                        nctdream.infoEventidol();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketnctfanmeeting = input.nextInt();
                                                        System.out.println();
                                                        if (tiketnctfanmeeting == 1) 
                                                        {
                                                            nctdream.inputTiketidol(input);
                                                            nctdream.cetakTiketidol();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;

                                                    case 3  :
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                        System.out.println();
                                                        break;

                                                    default :
                                                        System.out.println("Menu tidak tersedia!");
                                                }
                                                break;
                                            case 2:
                                                System.out.println("===========================================================");
                                                System.out.println("===================  TICKETING DAY6  ======================");
                                                System.out.println("===========================================================");
                                                System.out.println("1. Konser");
                                                System.out.println("2. Fanmeeting");
                                                System.out.println("3. Kembali");
                                                System.out.println("-----------------------------------------------------------");
                                                System.out.print("Pilih : ");
                                                int eventday6 = input.nextInt();
                                                System.out.println();
                                                switch (eventday6)
                                                {
                                                    case 1:
                                                        day6.infoEventidol();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketday6konser = input.nextInt();
                                                        System.out.println();
                                                        if (tiketday6konser == 1) 
                                                        {
                                                            day6.inputTiketidol(input);
                                                            day6.cetakTiketidol();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;

                                                    case 2:
                                                        day6.infoEventidol();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketday6fanmeeting = input.nextInt();
                                                        System.out.println();
                                                        if (tiketday6fanmeeting == 1) 
                                                        {
                                                            day6.inputTiketidol(input);
                                                            day6.cetakTiketidol();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;
                                                    case 3  :
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                        System.out.println();
                                                        break;

                                                    default :
                                                        System.out.println("Menu tidak tersedia!");
                                                        System.out.println();
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Anda telah keluar");
                                                System.out.println();
                                                break;

                                            default:
                                                System.out.println("Tidak ada menu yang dipilih");  
                                                System.out.println();
                                        }
                                        break; 

                                    case 4:
                                        System.out.println("===========================================================");
                                        System.out.println("========================  UP TO DATE  =====================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. NCT Dream");
                                        System.out.println("2. Day6");
                                        System.out.println("3. Kembali");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih Group : ");
                                        int detailgroup = input.nextInt();
                                        System.out.println();   
                                        switch (detailgroup) 
                                        {
                                            case 1:
                                                System.out.println("=================================================");
                                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                                System.out.println("=================================================");
                                                System.out.println("1. Jadwal Comeback");
                                                System.out.println("2. Line Distribution");
                                                System.out.println("3. Fan Chant");
                                                System.out.println("4. Kembali");
                                                System.out.println("-------------------------------------------------");
                                                System.out.print("Pilih Menu : ");
                                                int menukegiatannct = input.nextInt();
                                                System.out.println();
                                                switch (menukegiatannct)
                                                {
                                                    case 1:
                                                    grupnct.jadwalComeback();
                                                        break;

                                                    case 2:
                                                        grupnct.bagiLineDistribution();
                                                        break;

                                                    case 3:
                                                        grupnct.fanChant();
                                                        break;

                                                    case 4:
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                        break;

                                                    default:
                                                        System.out.println("Menu tidak tersedia!");
                                                }
                                                break;
                                        
                                            case 2:
                                                System.out.println("=================================================");
                                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                                System.out.println("=================================================");    
                                                System.out.println("1. Jadwal Comeback");
                                                System.out.println("2. Line Distribution");
                                                System.out.println("3. Fan Chant");
                                                System.out.println("4. Kembali");
                                                System.out.println("-------------------------------------------------");
                                                System.out.print("Pilih Menu : ");
                                                int menukegiatanday6 = input.nextInt();
                                                System.out.println();
                                                switch (menukegiatanday6)
                                                {
                                                    case 1:
                                                        grupday6.jadwalComeback();
                                                        break;

                                                    case 2:
                                                        grupday6.bagiLineDistribution();
                                                        break;

                                                    case 3:
                                                        grupday6.fanChant();
                                                        break;

                                                    case 4:
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                        break;

                                                    default:
                                                        System.out.println("Menu tidak tersedia!");
                                                }
                                            
                                            case 3:
                                                System.out.println("Anda telah keluar");
                                                System.out.println();   
                                                break;

                                            default:
                                                break;
                                        }
                                }
                                break;

                            case 2: 
                                System.out.println("===========================================================");
                                System.out.println("========================  SOLOIST  ========================");
                                System.out.println("===========================================================");
                                System.out.println("1. Lihat Biodata");
                                System.out.println("2. Pembelian Album");
                                System.out.println("3. Ticketing");
                                System.out.println("4. Kegiatan Up To Date");
                                System.out.println("5. Kembali");
                                System.out.println("-----------------------------------------------------------");
                                System.out.print("Pilih Menu : ");
                                int menusoloist = input.nextInt();
                                System.out.println();   
                                switch (menusoloist) 
                                {
                                    case 1:
                                        System.out.println("===========================================================");
                                        System.out.println("=====================  BIODATA SOLOIST  ===================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. IU");
                                        System.out.println("2. Paul Kim");
                                        System.out.println("3. Kembali");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih Soloist yang ingin kamu lihat biodatanya : ");
                                        int biodatasoloist = input.nextInt();
                                        System.out.println();
                                        switch (biodatasoloist) 
                                        {
                                            case 1 :
                                                iu.tampilkanbiodatasoloist();
                                                break;

                                            case 2 :
                                                paulkim.tampilkanbiodatasoloist();
                                                break;

                                            case 3 :
                                                System.out.println("Anda telah keluar dari fitur ini");
                                                System.out.println();
                                                break;
                                                    
                                            default :
                                                System.out.println("Anda telah keluar dari fitur ini");
                                                System.out.println();
                                        }
                                    break;

                                    case 2:
                                        System.out.println("===========================================================");
                                        System.out.println("===================  PEMBELIAN ALBUM  =====================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. IU");
                                        System.out.println("2. Paul Kim");
                                        System.out.println("3. Kembali");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih Soloist yang anda ingin beli Album nya : ");
                                        int menualbumsoloist = input.nextInt();
                                        System.out.println();
                                        switch (menualbumsoloist) 
                                        {
                                            case 1:
                                                iu.pricelistAlbumIU();
                                                System.out.println("1. Beli Album");
                                                System.out.println("2. Kembali");
                                                System.out.print("Pilih : ");
                                                int albumsoloistiu = input.nextInt();
                                                System.out.println();
                                                if (albumsoloistiu == 1) 
                                                {
                                                    iu.belialbumIU(input);
                                                    iu.cetakStruk();
                                                } 
                                                else 
                                                {
                                                    System.out.println("Anda membatalkan pembelian.");
                                                    System.out.println();
                                                }
                                                break;

                                            case 2:
                                                paulkim.pricelistAlbumPaulKim();
                                                System.out.println("1. Beli Album");
                                                System.out.println("2. Kembali");
                                                System.out.print("Pilih : ");
                                                int albumsoloistpaulkim = input.nextInt();
                                                System.out.println();
                                                if (albumsoloistpaulkim == 1) 
                                                {
                                                    paulkim.belialbumPaulKim(input);
                                                    paulkim.cetakStruk();
                                                } 
                                                else 
                                                {
                                                    System.out.println("Anda membatalkan pembelian.");
                                                    System.out.println();
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Anda telah keluar");
                                                System.out.println();
                                                break;

                                            default:
                                                System.out.println("Tidak ada menu yang dipilih");
                                                System.out.println();
                                        }
                                        break;

                                    case 3:
                                        System.out.println("===========================================================");
                                        System.out.println("===================  TICKETING SOLOIST  ===================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. IU");
                                        System.out.println("2. Paul Kim");
                                        System.out.println("3. Kembali");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih : ");
                                        int menutiketsoloist = input.nextInt();
                                        System.out.println();
                                        switch (menutiketsoloist)
                                        {
                                            case 1:
                                                System.out.println("===========================================================");
                                                System.out.println("======================  TICKETING IU  =====================");
                                                System.out.println("===========================================================");
                                                System.out.println("1. Konser");
                                                System.out.println("2. Showcase");
                                                System.out.println("3. Fanmeeting");
                                                System.out.println("4. Kembali");
                                                System.out.println("-----------------------------------------------------------");
                                                System.out.print("Pilih : ");
                                                int tiketnct = input.nextInt();
                                                System.out.println();
                                                switch (tiketnct) 
                                                {  
                                                    case 1:
                                                        iu.infoEventsoloist();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketsoloistiuKonser = input.nextInt();
                                                        System.out.println();
                                                        if (tiketsoloistiuKonser == 1) 
                                                        {
                                                            iu.inputTiketsoloist(input);
                                                            iu.cetakTiketsoloist();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;

                                                    case 2:
                                                        iu.infoEventsoloist();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketsoloistiuShowcase = input.nextInt();
                                                        System.out.println();
                                                        if (tiketsoloistiuShowcase == 1) 
                                                        {
                                                            iu.inputTiketsoloist(input);
                                                            iu.cetakTiketsoloist();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;

                                                    case 3:
                                                        iu.infoEventsoloist();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketsoloistiuFanmeeting = input.nextInt();
                                                        System.out.println();
                                                        if (tiketsoloistiuFanmeeting == 1) 
                                                        {
                                                            iu.inputTiketsoloist(input);
                                                            iu.cetakTiketsoloist();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;

                                                    case 4:
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                        System.out.println();
                                                        break;

                                                    default:
                                                        System.out.println("Menu tidak tersedia!");
                                                }                                          
                                                break;

                                            case 2:
                                                System.out.println("===========================================================");
                                                System.out.println("====================  TICKETING PAUL KIM  ==================");
                                                System.out.println("===========================================================");
                                                System.out.println("1. Konser");
                                                System.out.println("2. Showcase");
                                                System.out.println("3. Fanmeeting");
                                                System.out.println("4. Kembali");
                                                System.out.println("-----------------------------------------------------------");
                                                System.out.print("Pilih : ");
                                                int tiketpaul = input.nextInt();
                                                System.out.println();
                                                switch (tiketpaul) 
                                                {  
                                                    case 1:
                                                        paulkim.infoEventsoloist();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketsoloistpaulKonser = input.nextInt();
                                                        System.out.println();
                                                        if (tiketsoloistpaulKonser == 1) 
                                                        {
                                                            paulkim.inputTiketsoloist(input);
                                                            paulkim.cetakTiketsoloist();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;

                                                    case 2:
                                                        solopaulkim.infoEventsoloist();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketsoloistpaulShowcase = input.nextInt();
                                                        System.out.println();
                                                        if (tiketsoloistpaulShowcase == 1) 
                                                        {
                                                            paulkim.inputTiketsoloist(input);
                                                            paulkim.cetakTiketsoloist();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;

                                                    case 3:
                                                        solopaulkim.infoEventsoloist();
                                                        System.out.println("1. Beli Tiket");
                                                        System.out.println("2. Kembali");
                                                        System.out.print("Pilih : ");
                                                        int tiketsoloistpaulFanmeeting = input.nextInt();
                                                        System.out.println();
                                                        if (tiketsoloistpaulFanmeeting == 1) 
                                                        {
                                                            paulkim.inputTiketsoloist(input);
                                                            paulkim.cetakTiketsoloist();
                                                        } 
                                                        else 
                                                        {
                                                            System.out.println("Anda membatalkan pembelian.");
                                                            System.out.println();
                                                        }
                                                        break;

                                                    case 4:
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                        System.out.println();
                                                        break;

                                                    default:
                                                        System.out.println("Menu tidak tersedia!");
                                                }
                                                break;

                                            case 3:
                                                System.out.println("Kembali ke menu utama.");
                                                System.out.println();
                                                break;

                                            default:
                                                System.out.println("Pilihan tidak valid.");
                                                System.out.println();
                                        }

                                    case 4:
                                        System.out.println("===========================================================");
                                        System.out.println("========================  UP TO DATE  =====================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. IU");
                                        System.out.println("2. Paul Kim");
                                        System.out.println("3. Kembali");
                                        System.out.println("-----------------------------------------------------------");
                                        System.out.print("Pilih Soloist : ");
                                        int detailsoloist = input.nextInt();
                                        System.out.println();
                                        switch (detailsoloist) 
                                        {
                                            case 1:
                                                System.out.println("=================================================");
                                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                                System.out.println("================================================="); 
                                                System.out.println("1. Jadwal Comeback");
                                                System.out.println("2. Transisi Gaya Personal");
                                                System.out.println("3. Kembali");
                                                System.out.println("-------------------------------------------------");
                                                System.out.print("Pilih Menu : ");
                                                int menukegiatansoloist = input.nextInt();
                                                System.out.println();
                                                switch (menukegiatansoloist)
                                                {
                                                    case 1:
                                                        soloiu.jadwalComeback();
                                                        break;

                                                    case 2:
                                                        soloiu.transisiGayaPersonal();
                                                        break;

                                                    case 3:
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                        System.out.println();
                                                        break;

                                                    default:
                                                        System.out.println("Menu tidak tersedia!");
                                                        System.out.println();
                                                }
                                                break;
                                            
                                            case 2:
                                                System.out.println("=================================================");
                                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                                System.out.println("=================================================");
                                                System.out.println("1. Jadwal Comeback");
                                                System.out.println("2. Transisi Gaya Personal");
                                                System.out.println("3. Kembali");
                                                System.out.println("-------------------------------------------------");
                                                System.out.print("Pilih Menu : ");
                                                int menukegiatansoloistpaul = input.nextInt();
                                                System.out.println();
                                                switch (menukegiatansoloistpaul)
                                                {
                                                    case 1:
                                                        solopaulkim.jadwalComeback();
                                                        break;

                                                    case 2:
                                                        solopaulkim.transisiGayaPersonal();
                                                        break;

                                                    case 3:
                                                        System.out.println("Anda telah keluar dari fitur ini");
                                                        System.out.println();
                                                        break;

                                                    default:
                                                        System.out.println("Menu tidak tersedia!");
                                                }
                                                break;
                                            
                                            case 3:
                                                System.out.println("Anda telah keluar");
                                                System.out.println();
                                                break;
                                            default:
                                                System.out.println("Menu tidak tersedia!");
                                                System.out.println();
                                        }
                                        break;

                                    case 5:
                                        System.out.println("Anda telah keluar");
                                        System.out.println();
                                        break;

                                    default:
                                        System.out.println("Menu tidak tersedia!");
                                        System.out.println();
                                }
                                break;

                            case 3:
                                System.out.println("Anda telah keluar dari program.");
                                kembaliidol = true;
                                break;

                            default:
                                System.out.println("Menu tidak tersedia!");
                        }
                    }
                    break;
                
                case 3: 
                    System.out.println("Anda telah keluar dari program.");
                    kembaliutama = true;
                    break;

                default:
                    System.out.println("Menu tidak tersedia!");
            }
        }
            input.close();
    }
}  
