# PRD MENYELAM

## 1. Ringkasan Produk

Aplikasi ini adalah simulasi menyelam berbasis teks (Console) di Java. Sistem ini akan mensimulasikan penyelam yang menggunakan berbagai jenis peralatan selam (seperti Scuba dan FreeDive), memantau kedalaman, kapasitas oksigen, serta status penyelaman secara real-time.

## 2. Fitur Utama

1. Manajemen Penyelam: Memilih jenis peralatan selam di awal simulasi.
2. Sistem Oksigen: Oksigen berkurang setiap kali penyelam melakukan aksi (turun/berenang).
3. Pemantauan Real-time: Menampilkan informasi kedalaman dan sisa oksigen saat ini.
4. Sistem Polimorfisme: Aksi seperti turun() atau tampilkanInfo() memiliki perilaku spesifik yang berbeda tergantung pada jenis peralatan yang digunakan penyelam.

## 3. Struktur Class (Class Specifications)

Kita akan menggunakan 1 interface, 2 class turunan, dan 1 class utama untuk menjalankan program.

1. Interface PeralatanSelamInterface ini mendefinisikan kontrak aksi yang harus dimiliki oleh semua jenis peralatan selam.

- Fungsi (Method):
  - turun(int meter): Menambah kedalaman dan mengurangi oksigen.
  - tampilkanInfo(): Mencetak status peralatan, oksigen, dan kedalaman saat ini.

2. Class ScubaDiving (Implementasi PeralatanSelam)Mewakili penyelam yang menggunakan tabung oksigen konvensional.

   - Atribut (Fields):
     - double oksigen (Default: 100.0)
     - int kedalaman (Default: 0)
     - double kapasitasTangki (Default: 12.0 liter)
   - Fungsi (Method):

     - turun(int meter): Oksigen berkurang secara stabil setiap turun 1 meter. Kedalaman bertambah.
     - tampilkanInfo(): Menampilkan sisa oksigen (dalam bar) dan kedalaman saat ini.

3. Class FreeDiving (Implementasi PeralatanSelam)
   Mewakili penyelam tanpa tabung yang mengandalkan teknik menahan napas.

   - Atribut (Fields):
     - double oksigen (Default: 100.0 - merepresentasikan - kapasitas paru-paru)
     - int kedalaman (Default: 0)
     - int batasWaktuTahanNapas (Default: 3 menit)
   - Fungsi (Method):
   - turun(int meter): Oksigen berkurang lebih cepat karena aktivitas fisik yang berat saat turun.
   - tampilkanInfo(): Menampilkan persentase oksigen dan kedalaman saat ini.D. Class MainApp (Driver Class)

- Fungsi (Method):
  - main(String[] args): Fungsi utama program. Berfungsi untuk inisialisasi objek, menjalankan loop menu simulasi (opsi untuk menyelam atau melihat status), dan menangani input dari pengguna.

## 4. Implementasi Polimorfisme (Gambaran Logika)

Kunci dari polimorfisme pada program ini adalah menggunakan referensi dari Interface untuk menampung objek dari class turunannya. Ini membuat programmu jauh lebih fleksibel.

Contoh Logika Polimorfisme di Java:java// Menggunakan Polymorphism

```bash
PeralatanSelam penyelam1 = new ScubaDiving();
PeralatanSelam penyelam2 = new FreeDiving();

// Saat method ini dipanggil, Java akan otomatis menjalankan logika
// turun() yang sesuai dengan class dari objek tersebut (Scuba atau FreeDive)

penyelam1.turun(10);
penyelam2.turun(10);

Use code with caution.
```

## 5. Langkah-Langkah Pembuatan Program di Java

- Buat file baru dan definisikan interface PeralatanSelam.java.
- Buat class ScubaDiving.java yang mengimplementasikan PeralatanSelam, lalu tulis logikanya.
- Buat class FreeDiving.java yang mengimplementasikan PeralatanSelam dengan rumus pengurangan oksigen versimu sendiri.
- Buat class MainApp.java untuk menggabungkan semuanya dan menambahkan loop menu interaktif agar kamu bisa mengetik perintah dari keyboard.
- Silakan gunakan rancangan di atas sebagai cetak biru untuk menulis kodenya di IDE favoritmu (seperti IntelliJ IDEA atau Eclipse)!
