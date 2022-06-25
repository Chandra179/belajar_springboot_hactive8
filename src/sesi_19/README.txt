https://docs.google.com/presentation/d/1NbezAv0g-P9hvVCUl4W81RAvAbGzSmNnEaW6FYbaMFM/edit#slide=id.ge7b226dabd_0_386

OpenAPI 
- standar spesifikasi untuk membuat dokumentasi RESTful API.
- OpenAPI dibuat agar pengguna RESTful API tidak perlu mengakses kode aplikasi 
  dan membaca dokumen manual (misal dalam bentuk doc, pdf) 

OpenAPI Document
{
	"openapi": "3.0.3",
	"info": {},
	"servers": [],
	"paths": {}
}

- info         : informasi metadata API, author, lisensi, dll
- server       : url, deskripsi, dll
- exteral docs
- path         : api endpoint
- operation    : dokumentasi operation pada rest api
  - bisa 1/lebih operation, karena dalam HTTP satu url bisa punya banyak method (GET, POST, PUT)
  - parameter
    - bisa memiliki lebih dari 1 parameter
    - bisa menambahkan parameter pada operation
    - query parameter, path variable, header, coookie, etc.
    - atribut
      - schema
        - tipe data untuk parameter
        - menggunakan JSON schema untuk identifikasi struktur data
          - string, boolean, array, object, etc.
        - json schema validation
          - memberitahu validasi yang diperlukan ketika pengguna membaca OpenAPI kita
        