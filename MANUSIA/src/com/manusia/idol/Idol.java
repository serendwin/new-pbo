package com.manusia.idol;

import com.manusia.Agensi;
import java.util.Scanner;

public class Idol extends Agensi {

    public String event;
    public String eventName;
    public String eventType;
    public String lokasi;
    public String tanggal;
    public String album;

    protected String kategori;
    protected String section;
    protected double harga;
    protected int qty;
    protected double total;

    public Idol(
            String nama,
            String kewarganegaraan,
            String gender,
            String ttlLahir,
            String ttlDebut,
            int masaTrainee,
            String posisi,
            String penghargaan,
            String album,
            String event,
            String eventName,
            String eventType,       
            String lokasi,
            String tanggal         
    ) {

        super(
            nama,
            kewarganegaraan,
            gender,
            ttlLahir,
            ttlDebut,
            masaTrainee,
            penghargaan,
            posisi
        );

        this.album = album;
        this.event = event;
        this.eventName = eventName;
        this.eventType = eventType;
        this.lokasi = lokasi;
        this.tanggal = tanggal;
    }

    /* Biodata */

    /* Biodata Group*/

    @Override
    public void tampilkanbiodatagrup() 
    {
        System.out.println("=================================================================");
        System.out.println("========================  BIODATA GROUP  ========================");
        System.out.println("=================================================================");
        System.out.println("Group Boyband   : " + nama);
        System.out.println("Debut           : " + ttlDebut);
        System.out.println("Album Terakhir  : " + album);
        System.out.println("Penghargaan     : " + penghargaan);
         System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void tampilkanbiodatamemberNCTDream() {

        System.out.println("=================================================================");
        System.out.println("====================  BIODATA MEMBER NCT DREAM  =================");
        System.out.println("=================================================================");
        System.out.println("Nama            : " + nama);
        System.out.println("Gender          : " + gender);
        System.out.println("Tanggal Lahir   : " + ttlLahir);
        System.out.println("Kewarganegaraan : " + kewarganegaraan);
        System.out.println("Masa Trainee    : " + masaTrainee);
        System.out.println("Posisi          : " + posisi);
        System.out.println("=================================================================");
        System.out.println();        
    }

    @Override
    public void tampilkanbiodatamemberDAY6() {
        System.out.println("=================================================================");
        System.out.println("======================  BIODATA MEMBER DAY6  ====================");
        System.out.println("=================================================================");
        System.out.println("Nama            : " + nama);
        System.out.println("Gender          : " + gender);
        System.out.println("Tanggal Lahir   : " + ttlLahir);
        System.out.println("Kewarganegaraan : " + kewarganegaraan);
        System.out.println("Masa Trainee    : " + masaTrainee);
        System.out.println("Posisi          : " + posisi);
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void tampilkanbiodatasoloist() {
        System.out.println("=================================================================");
        System.out.println("=======================  BIODATA SOLOIST  =======================");
        System.out.println("=================================================================");
        System.out.println("Nama            : " + nama);
        System.out.println("Gender          : " + gender);
        System.out.println("Tanggal Lahir   : " + ttlLahir);
        System.out.println("Kewarganegaraan : " + kewarganegaraan);
        System.out.println("Masa Trainee    : " + masaTrainee);
        System.out.println("=================================================================");
        System.out.println();
    }

    /* Ticketing */

    /* Ticketing Group*/

    @Override
    public void infoEventgrup() 
    {
        String type = eventType.toUpperCase().trim();
        System.out.println("=================================================================");
        System.out.println("======================== INFO EVENT IDOL ========================");
        System.out.println("=================================================================");
        System.out.println("Idol         : " + nama);
        System.out.println("Event        : " + eventName);
        System.out.println("Jenis Event  : " + type);
        System.out.println("Lokasi       : " + lokasi);
        System.out.println("Tanggal      : " + tanggal);
        if (type.equals("KONSER")) 
        {
            System.out.println("-------------------- KATEGORI & SECTION -------------------");
            System.out.println("VVIP (A/B)     : Rp 3.000.000 / 2.700.000");
            System.out.println("VIP  (A/B/C)   : Rp 1.800.000 / 1.500.000 / 1.300.000");
            System.out.println("REGULAR (A/B)  : Rp 900.000 / 800.000");
            System.out.println("BALCONY LEFT   : Rp 600.000");
            System.out.println("BALCONY RIGHT  : Rp 550.000");
        } 
        else if (type.equals("FANMEETING"))
        {
            System.out.println("---------------- KATEGORI TIKET FANMEETING ----------------");
            System.out.println("HI-TOUCH  : Rp 2.000.000");
            System.out.println("PHOTO OP  : Rp 1.200.000");
            System.out.println("SIGNING   : Rp 900.000");
            System.out.println("REGULAR   : Rp 500.000");
        }
        else
        {
            System.out.println("Jenis event tidak dikenali.");
        }
        System.out.println("=================================================================");
    }

    @Override
    public void inputTiketgrup(Scanner input) 
    {
        String type = eventType.toUpperCase().trim();
        input.nextLine();
        System.out.println("=================================================================");
        System.out.println("======================== PEMBELIAN TIKET ========================");
        System.out.println("=================================================================");
        System.out.println("Event : " + eventName + " (" + type + ")");
        System.out.print("Kategori Tiket : ");
        kategori = input.nextLine().toUpperCase().trim();
        if (type.equals("KONSER")) 
        {
            System.out.print("Section (A/B/C/LEFT/RIGHT) : ");
            section = input.nextLine().toUpperCase().trim();
        } 
        else 
        {
            section = "-";
        }
        harga = tentukanHargagroup(type, kategori, section);
        System.out.println("Harga Tiket : Rp " + harga);
        System.out.print("Jumlah Tiket : ");
        if (!input.hasNextInt()) 
        {
            System.out.println("Jumlah tiket harus angka! default = 1");
            qty = 1;
        } 
        else 
        {
            qty = input.nextInt();
            if (qty <= 0) qty = 1;
        }
        total = harga * qty;
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void cetakTiketgrup() 
    {
        String type = eventType.toUpperCase().trim();
        System.out.println("=================================================================");
        System.out.println("========================== CETAK TIKET ==========================");
        System.out.println("=================================================================");
        System.out.println("Nama        : " + nama);
        System.out.println("Event       : " + eventName);
        System.out.println("Jenis       : " + type);
        System.out.println("Kategori    : " + kategori);
        if (type.equals("KONSER")) 
        {
            System.out.println("Section     : " + section);
        }
        System.out.println("Harga/Tiket : Rp " + harga);
        System.out.println("Jumlah      : " + qty);
        System.out.println("Total Harga : Rp " + total);
        System.out.println("=================================================================");
        System.out.println();
    }

    private double tentukanHargagroup(String eventType, String kategori, String section) 
    {
        kategori = kategori.toUpperCase();
        section = section.toUpperCase();
        eventType = eventType.toUpperCase();
        if (eventType.equals("FANMEETING")) 
        {
            switch (kategori) 
            {
                case "HI-TOUCH": return 2000000;
                case "PHOTO OP": return 1200000;
                case "SIGNING":  return 900000;
                case "REGULAR":  return 500000;
                default:
                    System.out.println("Kategori tidak dikenal, harga REGULAR digunakan.");
                    return 500000;
            }
        }   
        switch (kategori) 
        {
            case "VVIP":
                if (section.equals("A")) return 3000000;
                if (section.equals("B")) return 2700000;
                return 2500000;

            case "VIP":
                if (section.equals("A")) return 1800000;
                if (section.equals("B")) return 1500000;
                if (section.equals("C")) return 1300000;
                return 1500000;

            case "REGULAR":
                if (section.equals("A")) return 900000;
                if (section.equals("B")) return 800000;
                return 800000;

            case "BALCONY":
                if (section.equals("LEFT")) return 600000;
                if (section.equals("RIGHT")) return 550000;
                return 500000;

            default:
                System.out.println("Kategori tidak dikenal, harga REGULAR digunakan.");
                return 800000;
        }
    }

    /* Ticketing Soloist*/

    @Override
    public void infoEventsoloist() 
    {
        String type = eventType.toUpperCase().trim();
        System.out.println("=================================================================");
        System.out.println("====================== INFO EVENT SOLOIST =======================");
        System.out.println("=================================================================");
        System.out.println("Soloist      : " + nama);
        System.out.println("Event        : " + eventName);
        System.out.println("Jenis Event  : " + type);
        System.out.println("Lokasi       : " + lokasi);
        System.out.println("Tanggal      : " + tanggal);
        if (type.equals("INTIMATE CONCERT")) 
        {
            System.out.println("--------------- KATEGORI TIKET KONSER ----------------");
            System.out.println("VIP           : Rp 1.800.000");
            System.out.println("REGULAR       : Rp 1.000.000");
            System.out.println("BALCONY       : Rp 700.000");
        } 
        else if (type.equals("SHOWCASE")) 
        {
            System.out.println("--------------- KATEGORI TIKET SHOWCASE ---------------");
            System.out.println("STANDING      : Rp 600.000");
            System.out.println("SEATED        : Rp 450.000");
        } 
        else if (type.equals("FANMEETING")) 
        {
            System.out.println("------------ KATEGORI TIKET FANMEETING ----------------");
            System.out.println("HI-TOUCH      : Rp 1.500.000");
            System.out.println("PHOTO OP      : Rp 1.000.000");
            System.out.println("SIGNING       : Rp 800.000");
            System.out.println("REGULAR       : Rp 400.000");
        } 
        else 
        {
            System.out.println("Jenis event tidak dikenali.");
        }
        System.out.println("=================================================================");
    }
    
    @Override
    public void inputTiketsoloist(Scanner input) 
    {
        input.nextLine();
        System.out.println("=================================================================");
        System.out.println("======================== PEMBELIAN TIKET ========================");
        System.out.println("=================================================================");
        System.out.println("Event : " + eventName + " (" + eventType + ")");
        System.out.print("Kategori Tiket : ");
        kategori = input.nextLine().toUpperCase();
        if (eventType.equals("INTIMATE CONCERT")) 
        {
            section = "-";
        }
        else if (eventType.equals("SHOWCASE")) 
        {
            section = "-";
        }
        else 
        {
            section = "-";
        }
        harga = tentukanHargasoloist(eventType, kategori, section);
        System.out.println("Harga Tiket : Rp " + harga);

        System.out.print("Jumlah Tiket : ");
        if (!input.hasNextInt()) 
        {
            System.out.println("Jumlah tiket harus angka! default = 1");
            qty = 1;
        } 
        else 
        {
            qty = input.nextInt();
            if (qty <= 0) qty = 1;
        }
        total = harga * qty;
        System.out.println("=================================================================");
        System.out.println();
    }

    @Override
    public void cetakTiketsoloist() 
    {
        String type = eventType.toUpperCase().trim();
        System.out.println("=================================================================");
        System.out.println("========================== CETAK TIKET ==========================");
        System.out.println("=================================================================");
        System.out.println("Nama        : " + nama);
        System.out.println("Event       : " + eventName);
        System.out.println("Jenis       : " + type);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Harga Tiket : Rp " + harga);
        System.out.println("Jumlah      : " + qty);
        System.out.println("Total Harga : Rp " + total);
        System.out.println("=================================================================");
        System.out.println();
    }

    private double tentukanHargasoloist(String eventType, String kategori, String section) 
    {
    kategori = kategori.toUpperCase();
    eventType = eventType.toUpperCase();
    if (eventType.equals("FANMEETING")) 
    {
        switch (kategori) 
        {
            case "HI-TOUCH": return 1500000;
            case "PHOTO OP": return 1000000;
            case "SIGNING":  return 800000;
            case "REGULAR":  return 400000;
            default:
                System.out.println("Kategori tidak dikenal, harga REGULAR digunakan.");
                return 400000;
        }
    }
    if (eventType.equals("INTIMATE CONCERT")) 
    {
        switch (kategori) 
        {
            case "VIP":     return 1800000;
            case "REGULAR": return 1000000;
            case "BALCONY": return 700000;
            default:
                System.out.println("Kategori tidak dikenal, harga REGULAR digunakan.");
                return 1000000;
        }
    }
    if (eventType.equals("SHOWCASE")) 
    {
        switch (kategori) 
        {
            case "STANDING": return 600000;
            case "SEATED":   return 450000;
            default:
                System.out.println("Kategori tidak dikenal, harga SEATED digunakan.");
                return 450000;
        }
    }
    System.out.println("Jenis event tidak dikenali, harga 0 digunakan.");
    return 0;
    }

    /* Album */

    /* Album Group*/

    public void pricelistAlbumNCT() 
    {
        System.out.println("=================================================================");
        System.out.println("================== PRICELIST ALBUM NCT DREAM ====================");
        System.out.println("=================================================================");
        System.out.println("GLITCH MODE     : Rp 300000");
        System.out.println("HOT SAUCE       : Rp 250000");
        System.out.println("HELLO FUTURE    : Rp 280000");
        System.out.println("ISTJ            : Rp 350000");
        System.out.println("WE BOOM         : Rp 270000");
        System.out.println("=================================================================");
        System.out.println();
    }

    public void pricelistAlbumDAY6() 
    {
        System.out.println("=================================================================");
        System.out.println("===================== PRICELIST ALBUM DAY6 ======================");
        System.out.println("=================================================================");
        System.out.println("FOUREVER           : Rp 280000");
        System.out.println("THE BOOK OF US     : Rp 320000");
        System.out.println("MOONRISE           : Rp 260000");
        System.out.println("ENTROPY            : Rp 300000");
        System.out.println("NEGENTROPY         : Rp 340000");
        System.out.println("=================================================================");
        System.out.println();
    }


    public void belialbumnct(Scanner input) 
    {
        input.nextLine();
        System.out.println("=================================================================");
        System.out.println("==================  PEMBELIAN ALBUM NCT DREAM  ==================");
        System.out.println("=================================================================");
        System.out.println("Idol                    : " + nama);
        System.out.print("Nama Album             : ");
        this.album = input.nextLine();
        this.harga = tentukanHargaAlbum(this.album);
        System.out.println("Harga                   : Rp " + this.harga);
        System.out.print("Masukkan jumlah Album   : ");
        qty = input.nextInt();
        total = qty * harga;
        System.out.println("=================================================================");
        System.out.println();
    }

    public void belialbumday6(Scanner input) 
    {
        input.nextLine();
        System.out.println("=================================================================");
        System.out.println("=====================  PEMBELIAN ALBUM DAY6  ====================");
        System.out.println("=================================================================");
        System.out.println("Idol                   : " + nama);
        System.out.print("Nama Album            : ");
        this.album = input.nextLine();
        this.harga = tentukanHargaAlbum(this.album);
        System.out.println("Harga                  : Rp " + this.harga);
        System.out.print("Masukkan jumlah Album : ");
        qty = input.nextInt();
        total = qty * harga;
        System.out.println("=================================================================");
        System.out.println();
    }
    
    private double tentukanHargaAlbum(String album) 
    {
        switch (album.toUpperCase().trim()) 
        {
            case "GLITCH MODE": return 300000;
            case "HOT SAUCE": return 250000;
            case "HELLO FUTURE": return 280000;
            case "ISTJ": return 350000;
            case "WE BOOM": return 270000;

            case "FOUREVER": return 280000;
            case "THE BOOK OF US": return 320000;
            case "MOONRISE": return 260000;
            case "ENTROPY": return 300000;
            case "NEGENTROPY": return 340000;

            default:
                System.out.println("Album tidak terdaftar!");
                return 0;
        }
    }

    public void cetakStrukgrup() 
    {
        System.out.println("=================================================================");
        System.out.println("========================= STRUK PEMBELIAN =======================");
        System.out.println("=================================================================");
        System.out.println("Grup         : " + nama);
        System.out.println("Album        : " + album);
        System.out.println("Harga Satuan : Rp " + harga);
        System.out.println("Jumlah       : " + qty);
        System.out.println("Total Bayar  : Rp " + total);
         System.out.println("=================================================================");
        System.out.println("Terima kasih atas pembelian Anda ");
        System.out.println();
    }

    /* Album Soloist*/

    public void pricelistAlbumIU() 
    {
        System.out.println("=================================================================");
        System.out.println("======================= PRICELIST ALBUM IU ======================");
        System.out.println("=================================================================");
        System.out.println("PALETTE        : Rp 350000");
        System.out.println("LOVE POEM      : Rp 380000");
        System.out.println("LILAC          : Rp 400000");
        System.out.println("MODERN TIMES   : Rp 330000");
        System.out.println("CHAT-SHIRE     : Rp 300000");
        System.out.println("=================================================================");
        System.out.println();
    }

    public void pricelistAlbumPaulKim() 
    {
        System.out.println("=================================================================");
        System.out.println("==================== PRICELIST ALBUM PAUL KIM ===================");
        System.out.println("=================================================================");
        System.out.println("ME             : Rp 300000");
        System.out.println("STAR           : Rp 330000");
        System.out.println("HEART          : Rp 360000");
        System.out.println("HER            : Rp 310000");
        System.out.println("BUTTERFLY      : Rp 290000");
        System.out.println("=================================================================");
        System.out.println();
    }


    public void belialbumIU(Scanner input) {
    input.nextLine();
    System.out.println("=================================================================");
    System.out.println("=====================  PEMBELIAN ALBUM IU  ======================");
    System.out.println("=================================================================");
    System.out.println("Soloist                : " + nama);
    System.out.print("Nama Album            : ");
    this.album = input.nextLine();
    this.harga = tentukanHargaAlbumIU(this.album);
    System.out.println("Harga                  : Rp " + this.harga);
    System.out.print("Masukkan jumlah Album : ");
    qty = input.nextInt();
    total = qty * harga;
    System.out.println("=================================================================");
    }

    public void belialbumPaulKim(Scanner input) {
    input.nextLine();
    System.out.println("=================================================================");
    System.out.println("==================  PEMBELIAN ALBUM PAUL KIM  ===================");
    System.out.println("=================================================================");
    System.out.println("Soloist                 : " + nama);
    System.out.print("Nama Album              : ");
    this.album = input.nextLine();
    this.harga = tentukanHargaAlbumPaulKim(this.album);
    System.out.println("Harga                   : Rp " + this.harga);
    System.out.print("Masukkan jumlah Album   : ");
    qty = input.nextInt();
    total = qty * harga;
    System.out.println("=================================================================");
    }

    private double tentukanHargaAlbumIU(String album) 
    {
        switch (album.toUpperCase().trim()) {
            case "PALETTE": return 350000;
            case "LOVE POEM": return 380000;
            case "LILAC": return 400000;
            case "MODERN TIMES": return 330000;
            case "CHAT-SHIRE": return 300000;
            default:
                System.out.println("Album IU tidak terdaftar!");
                return 0;
        }
    }

    private double tentukanHargaAlbumPaulKim(String album) 
    {
        switch (album.toUpperCase().trim()) {
            case "ME": return 300000;
            case "STAR": return 330000;
            case "HEART": return 360000;
            case "HER": return 310000;
            case "BUTTERFLY": return 290000;
            default:
                System.out.println("Album Paul Kim tidak terdaftar!");
                return 0;
        }
    }

    public void cetakStruksoloist() 
    {
    System.out.println("=================================================================");
    System.out.println("======================== STRUK PEMBELIAN ========================");
    System.out.println("=================================================================");
    System.out.println("Soloist      : " + nama);
    System.out.println("Album        : " + album);
    System.out.println("Harga Satuan : Rp " + harga);
    System.out.println("Jumlah       : " + qty);
    System.out.println("Total Bayar  : Rp " + total);
    System.out.println("=================================================================");
    System.out.println("Terima kasih atas pembelian Anda ");
    System.out.println();
    }

    @Override
    public void berhasilmemesanTiket() 
    {
        System.out.println("=================================================================");
        System.out.println("                SELAMAT! ANDA BERHASIL MEMBELI TIKET!    ");
        System.out.println("=================================================================");
        System.out.println();
    }

    public void jadwalComeback() {}
}
