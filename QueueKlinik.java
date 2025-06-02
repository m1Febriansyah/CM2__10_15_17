public class QueueKlinik {
    Node front, rear;
    int size=0, max;

    public QueueKlinik(int max) {
        this.max=max;
        front=rear=null;
    }
    public boolean IsEmpty() {
        return front==null;
    }
    public boolean IsFull() {
        return size==max;
    }
    public void Enqueue(Pasien psn) {
        if (IsFull()) {
            System.out.println("Antrian penuh.");
            return;
        }
        Node ndInput=new Node(psn);
        if (IsEmpty()) {
            front=rear=ndInput;
        } else {
            rear.next=ndInput;
            rear=ndInput;
        }
        size++;
        System.out.println(">> Pasien masuk ke dalam antrian.");
    }
    public Pasien Dequeue() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return null;
        }
        Pasien psn=front.data;
        front=front.next;
        if (front==null) {
            rear=null;
        }
        size--;
        return psn;
    }
    public void print() {
        if (IsEmpty()) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("-- Antrian Pasien --");
        System.out.println("Antrian Pasien: ");
        Node temp=front;
        while (temp!=null) {
            temp.data.tampilkanInformasi();
            temp=temp.next;
        }
    }
    public int getSize() {
        return size;
    }
}
