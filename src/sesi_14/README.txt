Model :mempresentasikan data dan logika bisnis, biasanya berhubungan dengan basis data.
View: menampilkan data atau mengatur tampilan ke pengguna
Controller: menghubungkan antara view dengan model


----------------------------------------------


Servlet
- penghubung client dan server
- servlet container berada di dalam web server

Servlet Controller 
- manajemen alur aplikasi
- konfilg -> .xml

client -> http req -> servlet container -> server -> response (HTML)

siklus hidup servlet
1. inisialisasi
2. service() menunggu req, response
3. destroy() matikan servlet container


---------------------------------------


javaBean -> konstruktor tanpa argumen (default) (POJO)