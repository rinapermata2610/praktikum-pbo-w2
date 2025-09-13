package id.ac.polban.test;

import id.ac.polban.model.*;

public class TestRumahSakit {
    public static void main(String[] args) {
        Dokter d1 = new Dokter("D001", "Dr. Andi", "Penyakit Dalam");
        Pasien p1 = new Pasien("P001", "Budi", 30);

        System.out.println(d1); // otomatis pakai override toString()
        System.out.println(p1);

        p1.tambahCatatan("Demam tinggi, diberi obat.");
        System.out.println("Rekam medis: " + p1.getRekamMedis());
    }
}
