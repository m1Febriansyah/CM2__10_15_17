import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QueueKlinik antrian = new QueueKlinik(10);
        QueueTransaksi riwayat = new QueueTransaksi(20);

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
                    Pasien dilayani = antrian.Dequeue();
                    if (dilayani != null) {
                        System.out.println("Pasien " + dilayani.nama + " dipanggil");
                        System.out.print("ID Dokter: ");
                        String idDokter = scanner.nextLine();
                        System.out.print("Nama Dokter: ");
                        String namaDokter = scanner.nextLine();
                        Dokter dokter = new Dokter(idDokter, namaDokter);

                        System.out.print("Durasi layanan (jam): ");
                        int durasi = scanner.nextInt();
                        scanner.nextLine();

                        TransaksiLayanan t = new TransaksiLayanan(dilayani, dokter, durasi);
                        riwayat.enqueue(t);

                        System.out.println(">> Transaksi layanan berhasil dicatat:");
                        // t.tampilkanTransaksi();
                    }
                    break;
                case 4:
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.getSize());
                    break;
                case 5:
                    riwayat.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }

        }
    }
}
