public class TransaksiLayanan22 {
    Pasien22 pasien;
    Dokter22 dokter;
    int durasiLayanan;
    int biaya;
    int obat;

    public TransaksiLayanan22(Pasien22 pasien, Dokter22 dokter, int durasiLayanan, int obat) {
        this.pasien = pasien;
        this.dokter = dokter;
        this.durasiLayanan = durasiLayanan;
        this.obat = obat;
        this.biaya = hitungBiaya();
    }

    private int hitungBiaya() {
        return (durasiLayanan * 50000) + (obat * 10000); // 10000 per obat
    }

    public void tampilkanTransaksi() {
        System.out.println(pasien.nama + " (" + durasiLayanan + " jam, " + obat + " obat): Rp " + biaya);
    }
}