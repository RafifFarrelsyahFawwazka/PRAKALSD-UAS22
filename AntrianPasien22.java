public class AntrianPasien22 {
    Pasien22 head;
    Pasien22 tail;
    int size;

    public void tambahPasien(Pasien22 pasien) {
        if (head == null) {
            head = tail = pasien;
        } else {
            tail.next = pasien;
            tail = pasien;
        }
        size++;
    }

    public void tampilkanAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }

        Pasien22 current = head;
        for (int i = 0; i < size; i++) {
            current.tampilkanInformasi();
            System.out.println();
            current = current.next;
        }
    }

    public Pasien22 layaniPasien() {
        if (head == null) return null;

        Pasien22 pasien = head;
        head = head.next;
        size--;
        if (head == null) tail = null;
        return pasien;
    }

    public int sisaAntrian() {
        return size;
    }
}
