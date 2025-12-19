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
                "-", "-", "-",
                "Malaikat Kematian",
                "4 menit",
                "Datang tiba-tiba membantu tokoh utama",
                "Memberikan peringatan penting",
                "Mengubah arah cerita"
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
                "-", "-", "-",
                "CEO Muda",
                "5 menit",
                "Muncul di rapat penting perusahaan",
                "Mengungkap fakta tersembunyi",
                "Membalikkan kekuasaan"
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
                "10 Mei 2026",
                "Tengah Poster",
                "Adegan ikonik episode akhir",
                "Perjalanan raja lintas dunia",
                "Lee Min-ho Global Presscon",
                "SBS"
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
                "25 Mei 2026",
                "Tengah Poster",
                "Adegan operasi paling emosional",
                "Kehidupan & pengorbanan",
                "Doctors Press Conference",
                "SBS"
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
                "LILAC (2021)",
                "Gaya akustik sederhana",
                "Konsep elegan & mature",
                "Transformasi musikal yang emosional",
                "Perjalanan Emosi & Kedewasaan",
                "Vokal live dengan sentuhan cinematic"
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
                "Star (2018)",
                "Ballad minimalis",
                "Ballad orchestral",
                "Pendalaman emosi lewat lirik",
                "Cinta & Kehilangan",
                "Penampilan vokal penuh perasaan"
        );


        boolean kembaliutama = false;
        while (!kembaliutama) 
        {
            System.out.println("______________________________________________________________________");
            System.out.println("=====Hello My Dear, Welcome to Our House, MihuMihu Entertaintment!====");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("Choose Your Fighter Baby:");
            System.out.println("----------------------------------------------------------------------");
            System.out.println("1. Lee Minho");
            System.out.println("2. Lee Dongwook");
            System.out.println("3. Park Shinhye");
            System.out.println("4. Kim Jiwon");
            System.out.println("5. NCT DREAM");
            System.out.println("6. DAY6");
            System.out.println("7. IU");
            System.out.println("8. Paul Kim");
            System.out.println("9. Exit");
            System.out.println("----------------------------------------------------------------------");
            System.out.print("Pilih menu : ");
            int menuUtama = input.nextInt();
            System.out.println();
            switch (menuUtama) 
            {
                case 1: 
                    boolean kembalileeminho = false;
                    while (!kembalileeminho) 
                    {
                        System.out.println("=================================================================");
                        System.out.println("========================  MENU LEE MINHO  =======================");
                        System.out.println("=================================================================");
                        System.out.println("1. Lihat Biodata");
                        System.out.println("2. Info Event dan Pembelian Tiket");
                        System.out.println("3. Kegiatan Ter Up to Date");                        
                        System.out.println("4. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------------");
                        System.out.print("Pilih Menu : ");
                        int menuutamaminho = input.nextInt();
                        System.out.println();
                        switch (menuutamaminho)
                        {
                            case 1:
                                leeminho.tampilkanAktor();
                                break;

                            case 2:
                                leeminho.infoEventaktor();
                                System.out.println("1. Beli Tiket");
                                System.out.println("2. Kembali");
                                System.out.print("Pilih : ");
                                int tiketminho = input.nextInt();
                                System.out.println();
                                if (tiketminho == 1) 
                                {
                                    leeminho.inputTiketaktor(input);
                                    leeminho.cetakTiketaktor();
                                    leeminho.berhasilmemesanTiket();
                                } 
                                else 
                                {
                                    System.out.println("Anda membatalkan pembelian.");
                                    System.out.println();
                                }
                                break;

                            case 3:
                                System.out.println("=================================================");
                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                System.out.println("=================================================");
                                System.out.println("1. Poster Position");
                                System.out.println("2. Touring Presscon Schedule");
                                System.out.println("3. Kembali");
                                System.out.println("-------------------------------------------------");
                                System.out.print("Pilih Kegiatan : ");
                                int kegiatanminho = input.nextInt();
                                System.out.println();
                                switch (kegiatanminho) 
                                {
                                    case 1:
                                    firstminho.setPosterPosition();
                                    break;

                                    case 2:
                                    firstminho.attendPressTour();
                                    break;

                                    case 3:
                                    System.out.println("Kamu kembali ke menu sebelumnya");
                                    break;

                                    default:
                                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                    System.out.println();
                                    
                                }
                                break;

                            case 4:
                                kembalileeminho = true;
                                System.out.println("Kamu kembali ke menu");                                
                                System.out.println();
                                break;

                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                System.out.println();
                                break;
                        }
                    }
                    break;

                case 2:
                    boolean kembalileedongwook = false;
                    while (!kembalileedongwook) 
                    {
                        System.out.println("=================================================================");
                        System.out.println("========================  MENU LEE DONGWOOK =====================");
                        System.out.println("=================================================================");
                        System.out.println("1. Lihat Biodata");
                        System.out.println("2. Info Event dan Pembelian Tiket");
                        System.out.println("3. Kegiatan Ter Up to Date");                        
                        System.out.println("4. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------------");
                        System.out.print("Pilih Menu : ");
                        int menuutamadongwook = input.nextInt();
                        System.out.println();
                        switch (menuutamadongwook)
                        {
                            case 1:
                                leedongwook.tampilkanAktor();
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
                                    leedongwook.berhasilmemesanTiket();
                                } 
                                else 
                                {
                                    System.out.println("Anda membatalkan pembelian.");
                                    System.out.println();
                                }
                                break;

                            case 3:
                                System.out.println("=================================================");
                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                System.out.println("=================================================");
                                System.out.println("1. Partisipasi sebagai Cameo");
                                System.out.println("2. Deliver Plot Twist");
                                System.out.println("3. Kembali");
                                System.out.println("-------------------------------------------------");
                                System.out.print("Pilih Kegiatan : ");
                                int kegiatandongwook = input.nextInt();
                                System.out.println();
                                switch (kegiatandongwook) 
                                {
                                    case 1:
                                    cameodongwook.appearBriefly();
                                    break;

                                    case 2:
                                    cameodongwook.deliverPlotTwist();
                                    break;

                                    case 3:
                                    System.out.println("Kamu kembali ke menu sebelumnya");
                                    break;

                                    default:
                                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                    System.out.println();
                                    
                                }
                                break;
                            case 4:
                                kembalileedongwook = true;
                                System.out.println("Kamu kembali ke menu");
                                System.out.println();
                                break;

                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                System.out.println();
                                break;
                        }
             
                    }
                    break;
                
                case 3:
                    boolean kembalishinhye = false;
                    while (!kembalishinhye) 
                    {
                        System.out.println("=================================================================");
                        System.out.println("========================  MENU PARK SHINHYE =====================");
                        System.out.println("=================================================================");
                        System.out.println("1. Lihat Biodata");
                        System.out.println("2. Info Event dan Pembelian Tiket");
                        System.out.println("3. Kegiatan Ter Up to Date");                        
                        System.out.println("4. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------------");
                        System.out.print("Pilih Menu : ");
                        int menuutamashinhye = input.nextInt();
                        System.out.println();
                        switch (menuutamashinhye)
                        {
                            case 1:
                                parkshinhye.tampilkanAktris();
                                break;

                            case 2:
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
                                    parkshinhye.berhasilmemesanTiket();
                                } 
                                else 
                                {
                                    System.out.println("Anda membatalkan pembelian.");
                                    System.out.println();
                                }
                                break;

                            case 3:
                                System.out.println("=================================================");
                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                System.out.println("=================================================");
                                System.out.println("1. Poster Position");
                                System.out.println("2. Touring Presscon Schedule");
                                System.out.println("3. Kembali");
                                System.out.println("-------------------------------------------------");
                                System.out.print("Pilih Kegiatan : ");
                                int kegiatanshinhye = input.nextInt();
                                System.out.println();
                                switch (kegiatanshinhye) 
                                {
                                    case 1:
                                    firstshinhye.setPosterPosition();
                                    break;

                                    case 2:
                                    firstshinhye.attendPressTour();
                                    break;

                                    case 3:
                                    System.out.println("Kamu kembali ke menu sebelumnya");
                                    break;

                                    default:
                                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                    System.out.println();
                                    
                                }                                
                                break;

                            case 4:
                                kembalishinhye = true;
                                System.out.println("Kamu kembali ke menu");                                
                                System.out.println();
                                break;

                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                System.out.println();
                                break;
                        }
                    }
                    break;

                case 4:
                    boolean kembalijiwon = false;
                    while (!kembalijiwon) 
                    {
                        System.out.println("=================================================================");
                        System.out.println("========================= MENU KIM JIWON ========================");
                        System.out.println("=================================================================");
                        System.out.println("1. Lihat Biodata");
                        System.out.println("2. Info Event dan Pembelian Tiket");
                        System.out.println("3. Kegiatan Ter Up to Date");                        
                        System.out.println("4. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------------");
                        System.out.print("Pilih Menu : ");
                        int menuutamajiwon = input.nextInt();
                        System.out.println();
                        switch (menuutamajiwon)
                        {
                            case 1:
                                kimjiwon.tampilkanAktris();
                                break;

                            case 2:
                                kimjiwon.infoEventaktris();
                                System.out.println("1. Beli Tiket");
                                System.out.println("2. Kembali");
                                System.out.print("Pilih : ");
                                int tiketlajiwon = input.nextInt();
                                System.out.println();
                                if (tiketlajiwon == 1) 
                                {
                                    kimjiwon.inputTiketaktris(input);
                                    kimjiwon.cetakTiketaktris();
                                    kimjiwon.berhasilmemesanTiket();
                                } 
                                else 
                                {
                                    System.out.println("Anda membatalkan pembelian.");
                                    System.out.println();
                                }
                                break;

                            case 3:
                                System.out.println("=================================================");
                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                System.out.println("=================================================");
                                System.out.println("1. Partisipasi sebagai Cameo");
                                System.out.println("2. Deliver Plot Twist");
                                System.out.println("3. Kembali");
                                System.out.println("-------------------------------------------------");
                                System.out.print("Pilih Kegiatan : ");
                                int kegiatanjiwon = input.nextInt();
                                System.out.println();
                                switch (kegiatanjiwon) 
                                {
                                    case 1:
                                    cameojiwon.appearBriefly();
                                    break;

                                    case 2:
                                    cameojiwon.deliverPlotTwist();
                                    break;

                                    case 3:
                                    System.out.println("Kamu kembali ke menu sebelumnya");
                                    break;

                                    default:
                                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                    System.out.println();        
                                }
                                break;

                            case 4:
                                kembalijiwon = true;
                                System.out.println("Kamu kembali ke menu");                                
                                System.out.println();
                                break;

                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                System.out.println();
                                break;
                        }
                    }
                    break;

                case 5:
                    boolean kembalinct = false;
                    while (!kembalinct) 
                    {
                        System.out.println("=================================================================");
                        System.out.println("=========================  MENU NCT DREAM =======================");
                        System.out.println("=================================================================");
                        System.out.println("1. Lihat Biodata");
                        System.out.println("2. Info Event dan Pembelian Tiket");
                        System.out.println("3. Pembelian Album");
                        System.out.println("4. Kegiatan Ter Up to Date");                        
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------------");
                        System.out.print("Pilih Menu : ");
                        int menuutamanct = input.nextInt();
                        System.out.println();
                        switch (menuutamanct)
                        {
                            case 1:
                                System.out.println("===========================================================");
                                System.out.println("==================== BIODATA NCT DREAM ====================");
                                System.out.println("===========================================================");
                                System.out.println("1. Biodata Group");
                                System.out.println("2. Biodata Per-member");
                                System.out.println("3. Keluar");
                                System.out.println("-----------------------------------------------------------");
                                System.out.print("Pilih Menu : ");
                                int menubiodataNCT = input.nextInt();
                                System.out.println();
                                switch (menubiodataNCT) 
                                {
                                    case 1:
                                        nctdream.tampilkanbiodatagroupidol();
                                        break;

                                    case 2:
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

                                        case 8 : 
                                            System.out.println("Anda telah keluar dari fitur ini");
                                            System.out.println();
                                            break;

                                        default : 
                                            System.out.println("Pilihan index tidak valid. Silakan coba lagi.");
                                            System.out.println();
                                            break;
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Kamu kembali ke menu sebelumnya");
                                        System.out.println();
                                        break;

                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                        System.out.println();
                                        break;
                                }                                
                                break;

                            case 2:
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
                                            nctdream.berhasilmemesanTiket();
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
                                            nctdream.berhasilmemesanTiket();
                                        } 
                                        else 
                                        {
                                            System.out.println("Anda membatalkan pembelian.");
                                            System.out.println();
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Kamu kembali ke menu sebelumnya");
                                        System.out.println();
                                        break;

                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                        System.out.println();
                                        break;
                                }
                                break;

                            case 3:
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
                                    nctdream.berhasilmemesanTiket();
                                } 
                                else 
                                {
                                    System.out.println("Anda membatalkan pembelian.");
                                    System.out.println();
                                }
                                break;

                            case 4:
                                System.out.println("=================================================");
                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                System.out.println("=================================================");
                                System.out.println("1. Jadwal Comeback");
                                System.out.println("2. Line Distribution");
                                System.out.println("3. Fan Chant");
                                System.out.println("4. Kembali");
                                System.out.println("-------------------------------------------------");
                                System.out.print("Pilih : ");
                                int kegiatanupdatenct = input.nextInt();
                                System.out.println();
                                switch (kegiatanupdatenct)
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

                            case 5:
                                kembalinct = true;
                                System.out.println("Kamu kembali ke menu");
                                System.out.println();
                                break;

                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");  
                                System.out.println();
                            
                        } 
                    }
                    break;

                case 6:
                    boolean kembaliday6 = false;
                    while (!kembaliday6) 
                    {
                        System.out.println("=================================================================");
                        System.out.println("=========================  MENU DAY6 ===========================");
                        System.out.println("=================================================================");
                        System.out.println("1. Lihat Biodata");
                        System.out.println("2. Info Event dan Pembelian Tiket");
                        System.out.println("3. Pembelian Album");
                        System.out.println("4. Kegiatan Ter Up to Date");                        
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------------");
                        System.out.print("Pilih Menu : ");
                        int menuutamaday6 = input.nextInt();
                        switch (menuutamaday6)
                        {
                            case 1:
                                System.out.println("===========================================================");
                                System.out.println("==================== BIODATA DAY6 ========================");
                                System.out.println("===========================================================");
                                System.out.println("1. Biodata Group");
                                System.out.println("2. Biodata Per-member");
                                System.out.println("3. Keluar");
                                System.out.println("-----------------------------------------------------------");
                                System.out.print("Pilih Menu : ");
                                int menubiodataDAY6 = input.nextInt();
                                System.out.println();
                                switch (menubiodataDAY6) 
                                {
                                    case 1:
                                        day6.tampilkanbiodatagroupidol();
                                        break;

                                    case 2:
                                        System.out.println("===========================================================");
                                        System.out.println("================== BIODATA MEMBER DAY6 ====================");
                                        System.out.println("===========================================================");
                                        System.out.println("1. Sungjin");
                                        System.out.println("2. Young K");
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
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Kamu kembali ke menu sebelumnya");
                                        System.out.println();
                                        break;

                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                        System.out.println();
                                        break;
                                }
                                break;

                            case 2:
                                System.out.println("===========================================================");
                                System.out.println("==================  TICKETING DAY6  ======================");
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
                                            day6.berhasilmemesanTiket();
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
                                            day6.berhasilmemesanTiket();
                                        } 
                                        else 
                                        {
                                            System.out.println("Anda membatalkan pembelian.");
                                            System.out.println();
                                        }
                                        break;

                                    case 3:
                                        System.out.println("Kamu kembali ke menu sebelumnya");
                                        System.out.println();
                                        break;

                                    default:
                                        System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                        System.out.println();
                                        break;
                                }
                                break;

                            case 3:
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
                                    day6.berhasilmemesanTiket();
                                } 
                                else 
                                {
                                    System.out.println("Anda membatalkan pembelian.");
                                    System.out.println();
                                }
                                break;

                            case 4:
                                System.out.println("=================================================");
                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                System.out.println("=================================================");
                                System.out.println("1. Jadwal Comeback");
                                System.out.println("2. Line Distribution");
                                System.out.println("3. Fan Chant");
                                System.out.println("4. Kembali");
                                System.out.println("-------------------------------------------------");
                                System.out.print("Pilih : ");
                                int kegiatanupdateday6 = input.nextInt();
                                System.out.println();
                                switch (kegiatanupdateday6)
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
                                break;

                            case 5:
                                kembaliday6 = true;
                                System.out.println("Kamu kembali ke menu");
                                System.out.println();
                                break;

                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                System.out.println();
                                break;
                        } 
                    }
                    break;

                case 7:
                    boolean keluariu = false;
                    while (!keluariu) 
                    {
                        System.out.println("=================================================================");
                        System.out.println("=========================  MENU IU ===========================");
                        System.out.println("=================================================================");
                        System.out.println("1. Lihat Biodata");
                        System.out.println("2. Info Event dan Pembelian Tiket");
                        System.out.println("3. Pembelian Album");
                        System.out.println("4. Kegiatan Ter Up to Date");                        
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------------");
                        System.out.print("Pilih Menu : ");
                        int menuutamaiu = input.nextInt(); 
                        switch (menuutamaiu)
                        {
                            case 1:
                                iu.tampilkanbiodatasoloist();
                                break;

                            case 2:
                                System.out.println("===========================================================");
                                System.out.println("=====================  TICKETING IU  ======================");
                                System.out.println("===========================================================");
                                System.out.println("1. Konser");
                                System.out.println("2. Fanmeeting");
                                System.out.println("3. Showcase");
                                System.out.println("4. Kembali");
                                System.out.println("-----------------------------------------------------------");
                                System.out.print("Pilih : ");
                                int eventiu = input.nextInt();
                                System.out.println();
                                switch (eventiu)
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

                            case 3:
                                soloiu.pricelistAlbumIU();  
                                System.out.println("1. Beli Album");
                                System.out.println("2. Kembali");
                                System.out.print("Pilih : ");
                                int albumiu = input.nextInt();
                                System.out.println();
                                if (albumiu == 1) 
                                {
                                    iu.belialbumIU(input);
                                    iu.cetakStruk();
                                    iu.berhasilmemesanTiket();
                                } 
                                else 
                                {
                                    System.out.println("Anda membatalkan pembelian.");
                                    System.out.println();
                                }
                                break;

                            case 4:
                                System.out.println("=================================================");
                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                System.out.println("=================================================");
                                System.out.println("1. Jadwal Comeback");
                                System.out.println("2. Transisi Gaya Personal");
                                System.out.println("3. Monologue Terbaru");
                                System.out.println("4. Kembali");
                                System.out.println("-------------------------------------------------");
                                System.out.print("Pilih : ");
                                int kegiatanupdateiu = input.nextInt();
                                System.out.println();
                                switch (kegiatanupdateiu)
                                {
                                    case 1:
                                        soloiu.jadwalComeback();
                                        break;

                                    case 2:
                                        soloiu.transisiGayaPersonal();
                                        break;

                                    case 3:
                                        soloiu.monologuePerformance("Perjalanan Emosi & Kedewasaan");
                                        break;

                                    case 4:
                                        System.out.println("Anda telah keluar dari fitur ini");
                                        break;

                                    default:
                                    System.out.println("Menu tidak tersedia!");
                                }
                                break;

                            case 5:
                                keluariu = true;
                                System.out.println("Kamu kembali ke menu");
                                System.out.println(); 
                                break;

                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                System.out.println();
                                break;
                        }
                    }
                    break;
                    
                case 8:   
                    boolean kembalipaulkim = false;
                    while (!kembalipaulkim)
                    {
                        System.out.println("=================================================================");
                        System.out.println("========================= MENU PAUL KIM =========================");
                        System.out.println("=================================================================");
                        System.out.println("1. Lihat Biodata");
                        System.out.println("2. Info Event dan Pembelian Tiket");
                        System.out.println("3. Pembelian Album");
                        System.out.println("4. Kegiatan Ter Up to Date");                        
                        System.out.println("5. Kembali ke Menu Utama");
                        System.out.println("-----------------------------------------------------------------");
                        System.out.print("Pilih Menu : ");
                        int menuutamapaulkim = input.nextInt(); 
                        switch (menuutamapaulkim)
                        {
                            case 1:
                                paulkim.tampilkanbiodatasoloist();
                                break;

                            case 2:
                                System.out.println("===========================================================");
                                System.out.println("==================  TICKETING PAUL KIM  ===================");
                                System.out.println("===========================================================");
                                System.out.println("1. Konser");
                                System.out.println("2. Fanmeeting");
                                System.out.println("3. Showcase");
                                System.out.println("4. Kembali");
                                System.out.println("-----------------------------------------------------------");
                                System.out.print("Pilih : ");
                                int eventpaulkim = input.nextInt();
                                System.out.println();
                                switch (eventpaulkim)
                                {
                                    case 1:
                                        paulkim.infoEventsoloist();
                                        System.out.println("1. Beli Tiket");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int tiketsoloistpaulkimKonser = input.nextInt();
                                        System.out.println();
                                        if (tiketsoloistpaulkimKonser == 1) 
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
                                        paulkim.infoEventsoloist();
                                        System.out.println("1. Beli Tiket");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int tiketsoloistpaulkimShowcase = input.nextInt();
                                        System.out.println();
                                        if (tiketsoloistpaulkimShowcase == 1) 
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
                                        paulkim.infoEventsoloist();
                                        System.out.println("1. Beli Tiket");
                                        System.out.println("2. Kembali");
                                        System.out.print("Pilih : ");
                                        int tiketsoloistpaulkimFanmeeting = input.nextInt();
                                        System.out.println();
                                        if (tiketsoloistpaulkimFanmeeting == 1) 
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
                                paulkim.pricelistAlbumPaulKim();  
                                System.out.println("1. Beli Album");
                                System.out.println("2. Kembali");
                                System.out.print("Pilih : ");
                                int albumpaulkim = input.nextInt();
                                System.out.println();
                                if (albumpaulkim == 1) 
                                {
                                    paulkim.belialbumPaulKim(input);
                                    paulkim.cetakStruk();
                                    paulkim.berhasilmemesanTiket();
                                } 
                                else 
                                {
                                    System.out.println("Anda membatalkan pembelian.");
                                    System.out.println();
                                }
                                break;

                            case 4:
                                System.out.println("=================================================");
                                System.out.println("============== KEGIATAN UP TO DATE ==============");
                                System.out.println("=================================================");
                                System.out.println("1. Jadwal Comeback");
                                System.out.println("2. Transisi Gaya Personal");
                                System.out.println("3. Monologue Terbaru");
                                System.out.println("4. Kembali");
                                System.out.println("-------------------------------------------------");
                                System.out.print("Pilih : ");
                                int kegiatanupdatepaulkim = input.nextInt();
                                System.out.println();
                                switch (kegiatanupdatepaulkim)
                                {
                                    case 1:
                                        solopaulkim.jadwalComeback();
                                        break;

                                    case 2:
                                        solopaulkim.transisiGayaPersonal();
                                        break;

                                    case 3:
                                        solopaulkim.monologuePerformance("Perjalanan Emosi & Kedewasaan");
                                        break;

                                    case 4:
                                        System.out.println("Anda telah keluar dari fitur ini");
                                        break;

                                    default:
                                    System.out.println("Menu tidak tersedia!");
                                }
                                break;
                                
                            case 5:
                                kembalipaulkim = true;
                                System.out.println("Kamu kembali ke menu");
                                System.out.println(); 
                                break;

                            default:
                                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                                System.out.println();
                                break;
                        }
                    }

                

            }
        }  

        input.close();
    }
}
