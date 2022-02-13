**Opis zrobionych zadań**

<!-- Unordered List -->
    Tworzenie zmiennych
    * val_integer typu integer z wartością 250
    * val_string typu String z wartością “Akademia jest super !”
    * val_double typu zmiennoprzecinkowej z wartością 1.234555
    Wyświetl wszystkie zmienne na konsoli w postaci “Zmienna X ma wartosc Y”

<!-- Unordered List -->
    Kolecje i pętle
    * tablica 10 liczb typu int, iteracja, sprawdzenie, parzystości i wyświetlenie informacji o niej,
    * Pętla while, sumowanie liczb od 1 do 500 i ich wyświetlanie.
    * Obliczanie średniej liczb z tablicy int i na jej podstawie wystawi ocenę (char) (A >=4, B >=3 i <4, C < 3),
    * Użycie polecenia switch które wyświetla odpowiedni komunikat w zależności od oceny,
    * Funkcje static pod funkcja main, pobierająca tablice typu double i zwracająca zmodyfikowaną tablice bezwzględną,
    * Funkcja static pod funkcja main, która będzie pobierać imię (String) i zwracać typ enum MEN, WOMEN
    w zależności od tego czy imię jest męskie czy nie.

<!-- Unordered List -->
    Stworzone 2 klasy : Zoo i Animal
    Animal 
        * pola prywatne name, yearOfBirth, type (enum - REPTILE, AMPHIBIAN)
        * publiczne metody dostępe
        * nadpisane metody equals, hashCode, toString z klasy Object, przy użyciu getterów pól prywatnych
        * statyczne, prywatne pola CURRENT_YEAR=2022
        * publicznej metody zwracającej wiek zwierzaka
        * konstruktora
    Zoo 
        * pola prywatne name, yearOfEstablishment, animals (typ List<Animal>)
        * konstruktor
        * publiczną metodę addAnimal(Animal animal) 
        * publiczna metodę showAnimals()
        * publiczna metodę countAnimals()
        * prywatnej metody avgAge()
        * getter do pola prywatnego animals
        * publiczne metody showInfo() (info o Zoo, średni wiek zwierząt, nazwa, rok założenia)
    Tworzene są obiekty i używe wszystkie metody z klas. 
    
_W konstruktorach Zoo i Animal nie są ustawione wartości domyślne, są tylko wymagane przy ich tworzeniu._

<!-- Unordered List -->
    Diedziczenie
    * Dodatkowe klasy specyficzne dla Animals (dziedziczące po niej) Snake, Dog, Fish
    * pola prywatne specyficzne dla tych zwierząt
    * gettery i settery dla pól
    * konstruktor inicjalizujący pola wraz z polami z nad klasy
    * dwa obiekty tych klas

<!-- Unordered List -->
    Interfejsy
    * interface Speakable z metoda sound() i domyślnym dźwiękiem w klasie Animal
    * nadpisanie w klasach dziedziczących
    * zwierzęra na liście List<Speakable> animals wraz z iteracją.

<!-- Unordered List -->
    Lambdy
    * Klasa Numbers wraz z obiektem [-1,2,50,100]
    * interfejsy dodawania, średniej i wyświetlania liczb większych od 2 
    * lambdy do metod wraz z wywołaniem bez java stream i z ich wykorzystaniem

<!-- Unordered List -->
    Zapisywanie do pliku
    * metoda statyczna void convertAnimalsToTxt(Zoo zoo) 
    * otwieranie pliku z obsługa wyjątku FileNotFoundException
    * zapisanie do pliku nazwy zwierzaków w zoo.
