import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import model.*;

public class Jeroan {
    Scanner input = new Scanner(System.in);

    private HashMap<String, Kamar> kamars = new HashMap<>();
    private ArrayList<Kamar> kamarSewaList = new ArrayList<>();
    
    LocalDateTime date = LocalDateTime.now();
    DateTimeFormatter fDate = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
    
    String formatDate = date.format(fDate);
    
    public HashMap<String, Kamar> Hotel(){
        Kamar kamar1 = new Kamar();
        Kamar kamar2 = new Kamar();
        Kamar kamar3 = new Kamar();
        kamar1.setidKamar("01").setNamaKamar("Superior").sethargaSewaKamar(1200000);
        kamar2.setidKamar("02").setNamaKamar("Deluxe").sethargaSewaKamar(1500000);
        kamar3.setidKamar("03").setNamaKamar("Balcony").sethargaSewaKamar(1750000);

        kamars.put(kamar1.getidKamar(), kamar1);
        kamars.put(kamar2.getidKamar(), kamar2);
        kamars.put(kamar3.getidKamar(), kamar3);

        return kamars;

    }

    public void lihatDaftarKamar() {          
        
        System.out.println("------------------ DAFTAR HARGA KAMAR ------------------");
        
        // Memanggil metode Hotel() untuk mendapatkan HashMap dengan daftar kamar
        HashMap<String, Kamar> daftarKamar = Hotel();

        // Iterasi melalui set entry dan menampilkan daftar harga
        daftarKamar.entrySet().forEach(entry -> {
            String key = entry.getKey();
            Kamar tKamar = entry.getValue();

            System.out.println(key + ". " + tKamar.getNamaKamar() + "\t\t\t Rp. " + tKamar.gethargaSewaKamar() + " / hari");
        });

        System.out.println("--------------------------------------------------------");
        
        boolean lanjut = true;
        while (lanjut) {
            System.out.println(" ");
            TampilkanMenu();
            System.out.print("Pilih Menu: ");
            String option = input.nextLine();
            switch (option) {
                case "1":
                    Sewa();
                    lanjut = false;
                    break;
                case "2":
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    break;
            }
        }
    }


    public void Hitungannya(){
        Kamar kamar = new Kamar();
        int hargaSewaKamar = 0;
        String namaKamar = " ";


        System.out.println("---------- PILIH KAMAR YANG MAU DISEWA ----------");
        System.out.print("Masukkan kode kamar: ");
        String idKamar = input.nextLine();
        System.out.print("Masukkan waktu menginap: ");
        int waktuSewa = input.nextInt();
        
        switch (idKamar) {
            case "01":
                namaKamar = "Superior";
                hargaSewaKamar = waktuSewa * 1200000;
                break;
            case "02":
                namaKamar = "Deluxe";
                hargaSewaKamar = waktuSewa * 1500000;
                break;
            case "03":
                namaKamar = "Balcony";
                hargaSewaKamar = waktuSewa * 1750000;
                break;
            default:
                System.out.println("PIlihan tidak tersedia");
                break;
        }
        // Mengisi informasi kamar sesuai dengan pilihan
        kamar.setidKamar(idKamar).setWaktuSewa(waktuSewa).sethargaSewaKamar(hargaSewaKamar).setNamaKamar(namaKamar);

        // Menyimpan objek Kamar ke dalam ArrayList
        kamarSewaList.add(kamar);

        // Menampilkan informasi kamar di dalam metode Hitungannya()
        System.out.println("Anda memilih " + kamar.getNamaKamar());
    }


    public void TampilkanMenu(){
        System.out.println("1. Pemesanan");
        System.out.println("2. Keluar");
    }
   

    public void Sewa(){
        Scanner input = new Scanner(System.in);
        Akun user = new Akun();
        
        System.out.println("******** PEMESANAN KAMAR *********");
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();
        System.out.print("Masukkan telepon: ");
        String telepon = input.nextLine();
        Hitungannya();
        System.out.println("=================================================");

        user.setNama(nama).setTelepon(telepon);

        Penyedia penyedia = new Penyedia();

        penyedia.setNama("Nusantara Nature Stay").setAlamat("Bandung").setTelepon("123456");
    

        Invoice(user, penyedia, kamarSewaList);
        System.out.println("================================================");
        System.out.println("      Sampai jumpa, silakan datang kembali      ");
        System.out.println("================================================");
    }


   public void Invoice(Akun user, Penyedia penyedia, ArrayList<Kamar> kamarList){
        System.out.println("");
        System.out.println("");
        System.out.println(penyedia.getNama());
        System.out.println(penyedia.getAlamat());
        System.out.println(penyedia.getTelepon());
        System.out.println("------------------------------------------------");
        System.out.println("\t      " + formatDate);
        System.out.println("------------------------------------------------");
        System.out.println(">>>>>>>>>>> INVOICE PEMESANAN KAMAR <<<<<<<<<<<<");
        System.out.println("Nama Pelanggan\t\t\t: " + user.getNama() );
        System.out.println("No. Telepon\t\t\t: " + user.getTelepon() );
        System.out.println("------------------------------------------------");
        // Iterasi melalui ArrayList dan menampilkan informasi setiap kamar
        for (Kamar kamar : kamarList) {
            System.out.println("Kode Kamar\t\t\t: " + kamar.getidKamar());
            System.out.println("Tipe Kamar\t\t\t: " + kamar.getNamaKamar());
            System.out.println("Waktu Menginap\t\t\t: " + kamar.getWaktuSewa() + " hari");
            System.out.println("Total\t\t\t\t: Rp. " + kamar.gethargaSewaKamar());
        }
        System.out.println("------------------------------------------------");
    }
   
}
    
    
