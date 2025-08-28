import java.util.*;

public class RumahSakitApp {
    private static List<Pasien> daftarPasien = new ArrayList<>();
    private static List<Dokter> daftarDokter = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int pilih;
        do {
            System.out.println("\n=== MENU RUMAH SAKIT ===");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Tambah Dokter");
            System.out.println("3. Konsultasi");
            System.out.println("4. Lihat Data");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch(pilih) {
                case 1 -> tambahPasien();
                case 2 -> tambahDokter();
                case 3 -> konsultasi();
                case 4 -> lihatData();
                case 0 -> System.out.println("Program selesai.");
                default -> System.out.println("Pilihan salah!");
            }
        } while(pilih != 0);
    }

    private static void tambahPasien() {
        System.out.print("ID Pasien: ");
        String id = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Umur: ");
        int umur = sc.nextInt(); sc.nextLine();

        Pasien p = new Pasien(id, nama, umur);
        daftarPasien.add(p);
        System.out.println("Pasien berhasil ditambahkan.");
    }

    private static void tambahDokter() {
        System.out.print("ID Dokter: ");
        String id = sc.nextLine();
        System.out.print("Nama: ");
        String nama = sc.nextLine();
        System.out.print("Spesialis: ");
        String sp = sc.nextLine();

        Dokter d = new Dokter(id, nama, sp);
        daftarDokter.add(d);
        System.out.println("Dokter berhasil ditambahkan.");
    }

    private static void konsultasi() {
        if (daftarPasien.isEmpty() || daftarDokter.isEmpty()) {
            System.out.println("Data pasien/dokter belum ada.");
            return;
        }
        System.out.println("Pilih Pasien:");
        for (int i = 0; i < daftarPasien.size(); i++)
            System.out.println((i+1) + ". " + daftarPasien.get(i));
        int pIdx = sc.nextInt()-1; sc.nextLine();

        System.out.println("Pilih Dokter:");
        for (int i = 0; i < daftarDokter.size(); i++)
            System.out.println((i+1) + ". " + daftarDokter.get(i));
        int dIdx = sc.nextInt()-1; sc.nextLine();

        System.out.print("Catatan konsultasi: ");
        String catatan = sc.nextLine();
        daftarPasien.get(pIdx).tambahCatatan("Dokter " + daftarDokter.get(dIdx).getNama() + ": " + catatan);

        System.out.println("Konsultasi selesai dicatat!");
    }

    private static void lihatData() {
        System.out.println("=== Pasien ===");
        daftarPasien.forEach(System.out::println);
        System.out.println("=== Dokter ===");
        daftarDokter.forEach(System.out::println);
        System.out.println("=== Rekam Medis ===");
        daftarPasien.forEach(p -> System.out.println(p.getNama() + " -> " + p.getRekamMedis()));
    }
}
