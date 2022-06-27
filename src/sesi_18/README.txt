Serializable
 - To serialize an object means to convert its state to a byte stream 
   so that the byte stream can be reverted back into a copy of the object

build systems
1. dependency management
   - maven, gradle, ant
2. starters
   - dependency descriptions

auto-configuration
and how to run your applications



DEPLOY APP WITH SPRING BOOT
---------------------------
Spring Boot’s executable jars are ready-made for most popular
cloud PaaS (Platform-as-a-Service) providers.


Two popular cloud providers, Heroku and Cloud Foundry, 
employ a “buildpack” approach.



HEROKU
------
https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#deployment.cloud.heroku




define a class annotated with @ControllerAdvice to customize the 
JSON document to return for a particular controller and/or exception type

By default, Spring Boot serves static content from a directory called 
/static 
/public 
/resources or 
/META-INF/resources


Templates Engine
----------------
FreeMarker, Groovy, Thymeleaf, Mustache



Custom Error Pages
------------------

src/
 +- main/
     +- java/
     |   + <source code>
     +- resources/
         +- public/
             +- error/
             |   +- 404.html
             +- <other public assets>


Web Security
--------

Default configuration
- SecurityAutoConfigutarion
  - import SpringBootWebSecurityConfiguration for web security
  - import UserDetailsServiceAutoConfiguration configures authentication

to switch OFF default web app security configuration / combine multiple spring security component
- add bean type of SecurityFilterChain

to switch OFF UserDetailsService configuration
- add bean of UserDetailsService, AuthenticationProvider, or AuthenticationManager

Access Rules
- can be overridden by adding a custom SecurityFilterChain 
- or WebSecurityConfigurerAdapter bean



JPA (Java Persistence API)
--------------------------

Spring Data JPA Repositories (Interface)
- JPA queries created automatically from method names
- Spring Data Repositories -> usually extends from Repository or CrudRepository

By default, JPA databases are automatically created only if
you use an embedded database (H2, HSQL, or Derby). 



