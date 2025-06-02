public class QueueTransaksi {
    TransaksiLayanan[] transaksiArray;
    int front, rear, size, max;

    public QueueTransaksi(int max) {
        this.max = max;
        transaksiArray = new TransaksiLayanan[max];
        front = rear = size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public void enqueue(TransaksiLayanan transaksi) {
        if (isFull()) {
            System.out.println("Riwayat transaksi penuh.");
            return;
        }
        transaksiArray[rear] = transaksi;
        rear = (rear + 1) % max;
        size++;
        System.out.println(">> Transaksi berhasil dicatat.");
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Riwayat transaksi kosong.");
            return;
        }
        System.out.println("-- Riwayat Transaksi Layanan --");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % max;
            transaksiArray[index].tampilkanTransaksi();
            System.out.println();
        }
    }
}
