Ini adalah proyek JASAKEREN MEMAKAI Java menggunakan Apache Maven 3.6.. 

Jasakeren adalah proyek coba-coba untuk belajar microservice di JAVA

mvn archetype:generate -DgroupId=com.wibisono.app -DartifactId=customer -Dversion=1.0-SNAPSHOT -DinteractiveMode=true

mvn archetype:generate -DgroupId=com.amigoscode -DartifactId=amigosservices -DarchetypeArtifactId=maven-archetype-quickstart -DarchetypeVersion=1.4 -DinteractiveMode=false

error:

org.springframework.beans.factory.BeanDefinitionStoreException: Failed to read candidate component class: file [D:\java\demoku\amigosservices\customer\target\classes\com\amigoscode\customer\CustomerApplication.class]; nested exception is org.springframework.core.NestedIOException: ASM ClassReader failed to parse class file - probably due to a new Java class file version that isn't supported yet: file [D:\java\demoku\amigosservices\customer\target\classes\com\amigoscode\customer\CustomerApplication.class]; nested exception is java.lang.IllegalArgumentException: Unsupported class file major version 63
Caused by: org.springframework.core.NestedIOException: ASM ClassReader failed to parse class file - probably due to a new Java class file version that isn't supported yet: file [D:\java\demoku\amigosservices\customer\target\classes\com\amigoscode\customer\CustomerApplication.class]; nested exception is java.lang.IllegalArgumentException: Unsupported class file major version 63

Untuk menjalankan
<ol>
<li>Jalankan Container
<li>Jalankan Eureka-Server
<li>Jalankan customer dan fraud
</ol>

Untuk mematikan
<ol>
<li>matikan customer dan fraud
<li>matikan Eureka-Server
<li>Matikan container
</ol>