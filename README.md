# PBO – Inheritance: Kasus Rumah Sakit

## Deskripsi

Proyek ini merupakan implementasi konsep **Object Oriented Programming (OOP)** pada mata kuliah **Pemrograman Berorientasi Objek (PBO)**, khususnya mengenai **Inheritance, Override, dan penggunaan `super`**.

Kasus yang digunakan adalah **Sistem Rumah Sakit** sederhana untuk mengelola data pasien, dokter, serta catatan rekam medis.

## Konsep OOP yang Diterapkan

1. **Inheritance**

   * `Dokter` dan `Pasien` mewarisi atribut serta method dari superclass `Orang`.
2. **Override**

   * Method `toString()` dioverride pada `Dokter` dan `Pasien` agar menampilkan informasi lebih spesifik.
3. **super**

   * Digunakan pada constructor subclass untuk memanggil constructor `Orang`.
   * Digunakan pada `toString()` untuk menggabungkan hasil dari superclass.
4. **Composition**

   * `Pasien` memiliki objek `RekamMedis` sebagai bagian dari dirinya.

## Cara Compile dan Run

1. Buka terminal atau PowerShell, lalu masuk ke folder `src`:

   ```powershell
   cd "D:\SEMESTER 3\PBO\PRAKTEK\W3_061_RinaPermataDewi\src"
   ```

2. Compile seluruh file:

   ```powershell
   javac id\ac\polban\model\*.java id\ac\polban\service\*.java id\ac\polban\test\*.java
   ```

3. Jalankan program utama:

   ```powershell
   java id.ac.polban.service.RumahSakitApp
   ```

4. Jalankan program uji coba:

   ```powershell
   java id.ac.polban.test.TestRumahSakit
   ```

## Contoh Output

### TestRumahSakit

```
Dokter: Orang[id=D001, nama=Dr. Andi], spesialis=Penyakit Dalam
Pasien: Orang[id=P001, nama=Budi], umur=30
Rekam medis: RekamMedis[Demam tinggi, diberi obat.]
```

### RumahSakitApp (menu interaktif)

```
=== MENU RUMAH SAKIT ===
1. Tambah Pasien
2. Tambah Dokter
3. Konsultasi
4. Lihat Data
0. Keluar
Pilih: 
```

## Kesimpulan

Melalui kasus Rumah Sakit ini, konsep **inheritance, override, super, dan composition** dapat diterapkan dengan baik untuk membangun sistem yang lebih rapi, terstruktur, serta meminimalkan duplikasi kode.
