API
---
- interface yang digunakan oleh satu layanan dengan yang lainnya untuk saling 
  'berkomunikasi' (client & server)
- Penggunaan API memberikan benefit yang besar untuk seorang developer, 
  karena dengan bantuanAPI, developer tidak perlu membuat banyak aplikasi inti (core) 
  untuk masing-masing platform yang berbeda.
- contoh API : google maps API, google login, google kubernetes



Web service vs. Web API
-----------------------
1. Web service memfasilitasi untuk melakukan interaksi antara dua perangkat atau 
   aplikasi melalui jaringan. 
   Sedangkan API bertindak sebagai penghubung antara dua aplikasi berbeda sehingga 
   bisa berkomunikasi satu sama lain baik dengan ataupun tanpa jaringan.

2. Semua web service menggunakan API tapi tidak semua API digunakan sebagai web
   service

3.Web service selalu membutuhkan jaringan untuk pengoperasiannya sedangkan API 
  tidak selalu memerlukan jaringan untuk operasinya.

4.Web service hanya menggunakan 3 style yaitu SOAP, REST, atau XML-RPC 
  untuk berkomunikasi sedangkan 
  API dapat menggunakan style apapun.



REST (Representational state transfer)
-------------------------------------
- Secara singkat REST adalah cara kita untuk menggunakan resource (fungsi/method) 
  yang ada di sebuah server dengan mengakses url yang telah disediakan.

- Cara mengaksesnya tentu dengan menggunakan HTTP (Hyper Text Transfer Protocol)
  dengan method (httpverb) yang umum digunakan yaitu:

  ● GET, untuk membaca resource (data)
  ● POST, untuk membuat resource baru (data baru)
  ● DELETE, tentu untuk menghapus resource (data)
  ● PUT, untuk merubah resource (data).



KOMPONEN REST API
-----------------
● HTTP method seperti GET, POST, PUT, DELETE, dll 
● URI (Uniform Resource Identifier) untuk mengetahui lokasi data di server
● HTTP Version, seperti HTTP v1.1
● Request Header, berisi metadata seperti Authorization,tipe client dll
● Request Body, data yang diberikan client ke serverseperi URI params



PRINSIP RESTFUL API
-------------------
● Uniform Interface: Antarmuka komponen harus sama.
   Ini berarti menggunakan sekitar URI (Uniform ResourceIdentifier) 
   untuk mengidentifikasi sumber daya—dengan kata lain, path yang dapat dimasukkan ke bilah lokasibrowser.

● Client-Server: Ada pemisahan kekhawatiran antara server, yang menyimpan dan memanipulasi data,
   dan klien,yang meminta dan menampilkan respon.

● Stateless Interactions: Semua informasi tentang setiap permintaan terkandung 
   dalam setiap permintaan individudan tidak tergantung pada status session.

● Cacheable: Klien dan server dapat menyimpan sumber daya.

● Layered System: Klien dapat dihubungkan ke server akhir, atau lapisan menengah seperti load-balancer.

● Code on Demand (Opsional): Seorang klien dapat mengunduh kode, yang mengurangi visibilitas dari luar