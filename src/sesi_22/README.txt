Codecoverage 
- tools yang mengukur efektivitas dari unit testing, 
- dan untuk menunjukan seberapa lengkap code yang telah ditulis
  yang sesuai dengan process business yang telah dicover oleh unit test.


Jacoco 
- melakukan generate result dari codecoverage yang telah kita buat pada unit testing


Sonarqube 
- tool yang dilakukan untuk menginspeksi kualitas dari code yang telah ditulis
- melihat bug, code smells, security vulnerabilities


generate code quality
--------------------------------

- download sonar cube
   - C:\Users\095047\Downloads\sonarqube-9.5.0.56709\sonarqube-9.5.0.56709\bin\windows-x86-64 (SESUAIKAN DENGAN OS)
   - run StartSonar
   - kalau stop. restart laptop

- ke localhost:9000

- LOGIN -> user: admin, pw: admin

- change password

- administration > security > disable Force user authentication (paling bawah)

- mvn sonar:sonar

- ANALYSIS SUCCESSFUL, 
  you can find the results at: 
  http://localhost:9000/dashboard?id=com.belajar.spring%3ADemoSpringJacocoSonarcube