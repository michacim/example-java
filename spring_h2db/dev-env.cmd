@echo off
rem *** Lokale Umgebungsvariablen für die Entwicklung ***
rem #spring.datasource.username=sa
set SPRING_DATASOURCE_URL=jdbc:h2:file:./books.db
set SPRING_DATASOURCE_USERNAME=testuser
set SPRING_DATASOURCE_PASSWORD=testpasswort

call .\mvnw.cmd spring-boot:run
