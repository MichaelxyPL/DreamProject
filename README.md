# DreamProject
Projekt zaliczeniowy w ramach laboratiorów uczelni WSB Warszawa

Michał 11232, Krzysztof 11366, Katarzyna 11241, Dawid 11333

Instrukcja uruchomienia aplikacji:

1. Paczkę DreamProject-1.0-SNAPSHOT.war z katalogu DreamProject/target/ proszę umieścić w katalogu webapp, który znajduje się w katalogu zainstalowanym przez Apache Tomcat.
2. Bazę danych z katalogu DreamProject/.sql/ uruchomić
3. Uruchomić Apache Tomcat.
4. Strona będzie dostępna pod adresem http://localhost:"skonfigurowany port w Apache Tomcat"/DreamProject-1.0-SNAPSHOT/
   NP. href=http://localhost:8080/DreamProject-1.0-SNAPSHOT/

Alternatywnie można też uruchomić cały projekt w IDE z podpiętym do niego Tomcatem i serwerem MySql (używaliśmy pakietu XAMPP, który zapewniał wszystko)

Konfiguracja MySQL
DBURL = "jdbc:mysql://localhost/DreamProjct"
DBUSER = "root"
DBPASS = ""
DBDRIVER = "com.mysql.cj.jdbc.Driver"


Funkcje zaimplementowane w budowanym systemie:
1. Rejestracja z walidacją typu inputów po stronie przeglądarki i hashowaniem haseł
2. Logowanie z obsługą błędnych danych, które przechowuje obiekt logowania w sesji
3. Składanie zamówień z obsługą javascritpu
4. Podgląd historii zamówień

Struktura stron:
1. Panel główny: pokazanie produktów z bazy, panel nawigacji po stronie
2. Logowanie 
3. Rejestracja
4. Historia zamówień

Użyte wzorce projektowe:
1. Strategy - budowanie widoku produktu w podziale na typ book i audiobook
2. Singleon - zapewniający posiadanie tylko jednej klasy logowania w sesji

Użyte oprogramowanie na licencjach zewnętrznych:
1. BCrypt 0.2 by Damien Miller - MIT license
2. Bootstrap 1.3.0 - MIT license
3. Jquery 3.6.0 - MIT license

Licencja:
1. Nie wyrażamy zgody na kopiowanie i jakiekolwiek używanie kodu, struktury czy jakiejkolwiek części tego proejktu bez pisemnej zgody wszystkich współtwórców.
