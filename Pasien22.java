public class Pasien22 {
    String nama;
    String nik;
    String keluhan;
    String usia;
    String jenisKelamin;
    Pasien22 next;

    public Pasien22(String nama, String nik, String keluhan, String usia, String jenisKelamin) {
        this.nama = nama;
        this.nik = nik;
        this.keluhan = keluhan;
        this.usia = usia;
        this.jenisKelamin = jenisKelamin;
        this.next = null;
    }

    public void tampilkanInformasi() {
        System.out.println("Nama Pasien: " + nama);
        System.out.println("NIK: " + nik);
        System.out.println("Keluhan: " + keluhan);
        System.out.println("Usia: " + usia);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
    }
}
