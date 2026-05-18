# PRD (Product Requirements Document) SIMULASI MENYELEM

## 1. Sistem simulasi diving

berbasis objek. Sistem ini memodelkan perhitungan fisika dasar penyelaman, seperti perubahan tekanan, air, konsumsi oksigen, batas waktu penyelaman tanpa dekompresi, dan manajemen kedalaman untuk memastikan penyelam menyelam dengan aman.

## 2. Fitur Utama

- **Profil Penyelam (Driver Profile):** Mengelola berat badan, kapasitas tabung oksigen, dan tingkat konsumsi udara permukaan.

- **Pelacakan Kedalaman & Tekanan:** Mencatat kedalaman saat ini dan menghitung tekanan

  - **Tekanan hidrostatis:** Tekanan yang diberikan oleh zat cair yang diam pada suatu objek di dalamnya

- **Pemantauan Oksigen & Waktu:** Menghitung sisa udara dan waktu penyelaman yang aman

- **Peringatan Keselamatan:** Memberikan notifikasi otomatis jika penyelam melebihi batas kedalaman, batas NDL, atau jika sisa oksigen menipis.

## 3. Spesifikasi Teknis

- **Bahasa Pemrograman: Java**
- **Paradigma: OOP**
- **Struktur Utama:**
  - diver.Java: Menyimpan data profil penyelam
  - menyelam.java: Kelas utama (mainClass)
  - diveComputer.java: Mengelola logika perhitungan kedalaman, tekanan, dan oksigen.
- **Sistem Logika & Matematika:**
  -Tekanan absolut P = D/10 + 1 (P: atmosfer, D: kedalaman dalam meter)
  -Konsumsi udara: AirUsed= SAC x P x Time.

## 4. Alur Pengguna (User Flow)

1. **Inisialisasi:** Pengguna memasukkan data profil awal (Kapasitas tabung dalam liter, tekanan awal dalam BAR, dan SAC rate).
2. **Mulai Simulasi:** Program mulai loop penyelaman. Penyelam dapat memilih opsi untuk turun kedalaman tertentu (input), diam, atau naik ke permukaan.
3. **Update Real-time:** Sistem akan mengupdate sisa oksigen, kedalaman, dan batas NDL

   - NDL adalah waktu maksimal penyelam boleh bertahan di kedalaman tertentu tanpa perlu berhenti untuk dekompresi saat naik.

4. **Peringatan:** Jika sisa udara tersisa untuk cadangan naik ke permukaan ditambah safty stop (kedalaman 5 meter selama 3 menit), program akan mengeluarkan intruksi wajib naik.

## 5. Batasan (constraints)

- **Batas Kedalaman Rekreasional:** Simulasi akan memperingatkan penyelam jika kedalaman melebihi 40 meter.
- **Tabel NDL:** Mengimplementasikan metode sederhana untuk membatasi waktu di kedalaman tertentu guna mencegah penyakit dekompresi (misalnya, batas waktu 60 menit pada kedalaman 18 meter).
