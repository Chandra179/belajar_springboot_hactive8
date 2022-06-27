Firebase Cloud Messaging 
- service yang disediakan oleh Firebase untuk mendapatkan push notification pada 
  perangkat Android dan iOS atau bahkan front-end.


Mengapa push notification? 
- Jika sebuah perangkat melakukan pull setiap sekian detik untuk mengecek notifikasi,
  aplikasi akan menjadi boros daya, server yang melayani akan down jika dilakukan oleh 
  banyak perangkat dalam waktu yang bersamaan.


Alur Notifikasi
---------------
1. pengguna membuka aplikasi 
2. kita akan request permissions untuk mengirim notifikasi. 
3. Jika hasilnya memberikan akses (grant permission) 
   maka Firebase akan mengirimkan token untuk mengidentifikasi perangkat mereka. 
4. Kemudian, klien mengirimkan token ke aplikasi Spring Boot kita sehingga
   kita dapat menggunakannya untuk mengirim notifications ke pengguna tersebut.
5. Setiap kali backend kita ingin mengirim notifikasi, 
   maka akan memberikan detail tentang notifikasi yang diinginkan ke Firebase. 
6. Dari proses ini lah, backend Firebase akan mengirimkan notifikasi ke perangkat yang benar



Topic Notifications vs Direct Notifications
-------------------------------------------
Notifikasi topik 
- notifikasi dengan tag/spesifikasi tertentu yang dikenal sebagai topik. 
  1. Pengguna akan berlangganan untuk diberi tahu tentang pesan apapun dengan topik pilihan mereka.
  2. Setiap kali pengguna berlangganan suatu topik, sistem akan mengirimkan token mereka 
     dan nama topik untuk berlangganan, ke aplikasi Springboot kita. 
  3. Nah Dengan menggunakan alur ini, kita dapat memberi tahu Firebase untuk 
     mengirimi mereka notifikasi tentang topik itu.
  4. kita juga memiliki opsi untuk mengirim direct notifications untuk menentukan di objek Pesan, 
     token pengguna untuk memberi notif. 
  5. Kemudian, Firebase akan mengirimkan notifikasi ke pengguna tersebut.
