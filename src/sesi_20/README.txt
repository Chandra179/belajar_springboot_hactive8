fitur security
- authentication
- authorization -> access role, ex: dosen, mahasiswa

spring-boot-startersecurity
- component yang di bundle -> spring security config, core, web

ketika kita menambahkan plugin spring boot security,
maka semua endpoint yang telah dibuat bersifat authenticated
atau user harus login terlebih dahulu. 


Unit testing adalah pengujian dasar yang menguji setiap unit atau component 
baik itu dari segi functional atau behavior.


JUNIT & MOCKITO
---------------

Unit Testing Service
1. service layer dimana layer 
   - logic dari aplikasi ini dan bisa berkomunikasi dengan repository atau database


Plugin Apache Commons 
- digunakan untuk menghasilkan data palsu
- misalkan membuat nama, title,alamat menggunakan class RandomStringUtils

Plugin Zalando Yang 
- mapper yang berfungsi untuk mengubah file json menjadi object


--------------------------------------


@RunWith(SpringRunner.class) 
- adalah sebuah alias dari class Spring Junit4 
- ClassRunner yang menghubungkan JUnit dan Spring TestContext. 
  Dengan SpringRunner, kita dapat mengimplementasikan JUnit dan integration test.

@InjectMock
- untuk membuat object dari class yang akan di test,
  dalam hal ini adalah ProductServiceImpl. 

@Mock
- membuat dependensi tiruan (mock) karena dalam class ProductServiceImpl 
  terdapat dependensi ke ProductRepository. 
  Sehingga nantinya kita seakan-akan berkomunikasi dengan database.

@Before
- annotasi untuk mengeksekusi pertama kali setiap dilakukan unit testing di panggil.

MockitoAnnotations.initMocks(this)
- menginisialisasi setiap property atau field yang diberi annotasi 

ReflectionTestUtils 
- adalah salah satu bagian dari Spring Test Context
- kumpulan dari method-method utilitas berbasis refleksi 
  yang dilakukan unit testing dan integration test untuk memanggil
  method private dan melakukan injection.

@Test
- adalah annotasi JUnit yang menandakan bahwa method testFindAll 
  adalah sebuah method yang digunakan untuk mengetest method tertentu, 

Mockito.when(productRepository.findAll()).thenReturn(datas) 
- merupakan simulasi bahwa kita seakan-akan memangil method findAll 
  dari productRepository dan hasil dari pemanggilan itu 
  kemudian mengembalikan variable datas yang telah diinisialisasi. 

final List actual = productService.findAllProducts()
- simulasi bahwa eksekusi berikutnya seakan-akan kita memanggil method 
  findAllProducts() dalam productService.
