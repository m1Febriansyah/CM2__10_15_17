public class QueueKlinik {
    Node head, tail;
    int size;

    public QueueKlinik() {
        head=null;
        tail=null;
        size=0;
    }
    public boolean isEmpty() {
        return head==null;
    }
    public void enqueue(int nomor, String nama) {
        Node newNode=new Node(null, nomor, nama, null);
        if (isEmpty()) {
            head=tail=newNode;
        } else {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        size++;
    }
    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong!");
        } else {
            System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
            head=head.next;
            if (head != null) {
                head.prev=null;
            } else {
                tail=null;
            }
            size--;
        }
    }
    public void print() {
        Node current=head;
        while (current != null) {
            current=current.next;
        }
        System.out.println("Sisa pasien dalam antrian: " + size);
    }
    public int getSize() {
        return size;
    }
}
