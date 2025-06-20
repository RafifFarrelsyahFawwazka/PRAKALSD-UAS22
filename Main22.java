import java.util.Scanner;
public class Main22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianPasien22 antrian = new AntrianPasien22();
        RiwayatTransaksi22 riwayat = new RiwayatTransaksi22(100);

        while (true) {
            System.out.println("\n=== SISTEM ANTRIAN KLINIK ===");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Lihat Antrian");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian Pasien");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("6. Total Pendapatan Klinik");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");

            int pilih;
            try {
                pilih = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(">> Pilihan harus berupa angka.");
                continue;
            }

            switch (pilih) {
                case 1:
                    System.out.print("Nama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("NIK: ");
                    String nik = sc.nextLine();
                    System.out.print("Keluhan: ");
                    String keluhan = sc.nextLine();
                    System.out.print("Usia: ");
                    String usia = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    String jenisKelamin = sc.nextLine();
                    antrian.tambahPasien(new Pasien22(nama, nik, keluhan, usia, jenisKelamin));
                    System.out.println(">> Pasien masuk ke dalam antrian.");
                    break;

                case 2:
                    antrian.tampilkanAntrian();
                    break;

                case 3:
                    Pasien22 p = antrian.layaniPasien();
                    if (p == null) {
                        System.out.println("Tidak ada pasien dalam antrian.");
                    } else {
                        System.out.println("Pasien " + p.nama + " dipanggil");
                        System.out.print("Masukkan ID Dokter: ");
                        String idDokter = sc.nextLine();
                        System.out.print("Masukkan Nama Dokter: ");
                        String namaDokter = sc.nextLine();

                        int durasi, obat;
                        try {
                            System.out.print("Masukkan Durasi Layanan (jam): ");
                            durasi = Integer.parseInt(sc.nextLine());
                            System.out.print("Masukkan Jumlah Obat: ");
                            obat = Integer.parseInt(sc.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(">> Input durasi dan jumlah obat harus berupa angka.");
                            break;
                        }

                        Dokter22 dokter = new Dokter22(idDokter, namaDokter);
                        TransaksiLayanan22 t = new TransaksiLayanan22(p, dokter, durasi, obat);
                        riwayat.tambahTransaksi(t);
                        System.out.println(">> Pasien telah dilayani, transaksi berhasil dicatat.");
                    }
                    break;

                case 4:
                    System.out.println(">> Sisa pasien dalam antrian: " + antrian.sisaAntrian());
                    break;

                case 5:
                    riwayat.tampilkanRiwayat();
                    break;

                case 6:
                    System.out.println(">> Total pendapatan: Rp " + riwayat.hitungTotalPendapatan());
                    break;


                case 0:
                    System.out.println("Keluar dari sistem.");
                    return;

                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}
