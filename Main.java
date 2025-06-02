import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TransaksiLayanan transaksi = new TransaksiLayanan();
        Scanner scanner = new Scanner(System.in);
        QueueKlinik antrian = new QueueKlinik(10);

        while (true) {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Antrian Pasien");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = scanner.nextLine();
                    System.out.print("NIK: ");
                    String nik = scanner.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = scanner.nextLine();
                    antrian.Enqueue(new Pasien(nama, nik, keluhan));
                    break;
                case 2:
                    antrian.print();
                    break;
                case 3:
                    antrian.Dequeue();
                    break;
                case 4:
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.getSize());
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        }
    }
}
