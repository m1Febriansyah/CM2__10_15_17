public class TransaksiLayanan {
    Pasien pasien;
    Dokter dokter;
    int durasiLayanan;
    int biaya;

    public TransaksiLayanan() {
        
    }

    TransaksiLayanan(Pasien pasien, Dokter dokter, int durasiLayanan) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.biaya = durasiLayanan * 50000;
    }

    void tampilkanTransaksi() {
        System.out.println("Pasien     : " + pasien.nama);
        System.out.println("Dokter     : " + dokter.nama + " (ID: " + dokter.idDokter + ")");
        System.out.println("Durasi     : " + durasiLayanan + " jam");
        System.out.println("Biaya      : Rp" + biaya);
    }
}
