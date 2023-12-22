import java.util.Scanner;

public class App {
    public static void main(String[] args)  {
        Jeroan jeroan = new Jeroan();
        Scanner input = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Selamat datang di penginapan Nusantara Nature Stay");
        System.out.println("==================================================");
        Boolean lanjut = true;
        while (lanjut) {
            TampilkanMenu();
            System.out.print("Pilih menu: ");
            String option = input.nextLine();
            switch (option) {
                case "1":
                    jeroan.lihatDaftarKamar();
                    break;
                case "2":
                    jeroan.Sewa();
                    lanjut = false;
                    break;
                case "3":
                    System.out.println("=====================================");
                    System.out.println("Sampai jumpa, silakan datang kembali");
                    System.out.println("=====================================");                    
                    lanjut = false;
                    break;
                default:
                    System.out.println("Pilihan tidak tersedia");
                    lanjut = false;
                    break;
            }
        System.out.println(" ");
        }

    }
    public static void TampilkanMenu(){
        System.out.println("1. List kamar");
        System.out.println("2. Pemesanan");
        System.out.println("3. Keluar");
    }

}
