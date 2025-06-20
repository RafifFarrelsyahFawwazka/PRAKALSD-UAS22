public class RiwayatTransaksi22 {
    private TransaksiLayanan22[] transaksi;
    private int front, rear, size;

    public RiwayatTransaksi22(int kapasitas) {
        transaksi = new TransaksiLayanan22[kapasitas];
        front = 0;
        rear = -1;
        size = 0;
    }

    public void tambahTransaksi(TransaksiLayanan22 t) {
        if (size < transaksi.length) {
            rear = (rear + 1) % transaksi.length;
            transaksi[rear] = t;
            size++;
        } else {
            System.out.println("Riwayat penuh, tidak bisa menambahkan transaksi baru.");
        }
    }

    public void tampilkanRiwayat() {
        System.out.println("-- Riwayat Transaksi --");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % transaksi.length;
            transaksi[index].tampilkanTransaksi();
        }
    }

    public int hitungTotalPendapatan() {
        int total = 0;
        for (int i = 0; i < size; i++) {
            int index = (front + i) % transaksi.length;
            total += transaksi[index].biaya;
        }
        return total;
    }
}
