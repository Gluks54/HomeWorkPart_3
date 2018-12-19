# Zadania wprowadzajace do .stream() API w Java 8

1. zwroc najwieksza liczbe z listy intow.
2. zwroc najwieksza liczbe z listy Integerow.
3. zwroc srednia z listy intow
4. zamien wszystkie Stringi w tablicy na wielkie litery
5. z listy stringow wybierz te ktore zaczynaja sie od 'a' i maja dokladnie 3 znaki
6. napisz funkcje, ktora przyjmie liste Integerow i zwroci jeden string ktory sklada sie z wszystkich liczb polaczonych przecinkami.

    przyklad: [1,2,10] -> "1,2,10"

7. do funkcji z zadania 6 dodaj rozpoznawanie czy liczba jest parzysta czy nieparzysta. Jezeli liczba jest parzysta poprzedz ja "e", jezeli jest nieparzysta poprzedz ja "o".

    przyklad: [1,2,10] -> "o1,e2,e10"

8. napisz funkcje ktora zwroci wyraz podany na wejsciu od tylu.
9. napisz funkcje ktora z listy intow wybierze tyle te ktore sa podzielne przez 3.
10. napisz funkcje ktora z podanych liczb na wejsciu zsumuje te ktore sa wieksze od 10.
11. Napisz funkcje ktora dostanie liste imion, kazde imie zapisze wielkimi literami i zwroci tylko unikalne imiona. Dodatkowo funkcja ma zwracac maksymalnie 10 imion


# Przetwarzanie danych z pliku fules.csv za pomoca .stream() API

1. napisz klase "Car" przechowujaca dane z fuel.csv i wczytaj wiersze z fuel.csv do `List<Car>`
2. 10 modeli o najmniejszym spalaniu
    wypisz nazwe + spalanie
    tip: sortowanie
3. napisz kolejna klase przechowujaca informacje o samochodach ale z spalaniem podanym w l/100km
    tip: projekcja
4. poprzedni wynik posortuj dodatkowo alfabetycznie
    jezeli 2 modele maja takie samo spalanie pierwszy powinien byc ten ktory jest pierwszy alfabetycznie
5. 10 modeli o najmniejszym spalaniu dla wybranego przez Ciebie producenta
    tip: filtrowanie
6. jezeli istnieje wybierz taki model BMW ktory ma spalanie miejskie mniejsze niz 7 l/100Km
    tip: filtrowanie + findFirst
7. jezeli istnieje wybierz taki model McLaren ktory ma spalanie miejskie mniejsze niz 14 l/100Km
    tip: filtrowanie + findFirst
8. sprawdz czy wszystkie modele sa wyprodukowane przez Porshe
    tip: wszystkie -> ang. all, w stream() jest metoda All()
9. sprawdzy czy istnieje jaki kolwiek model wyprodukowany przez "Fiat", to samo dla "Olds Mobile"
    tip: tak jak poprzednio przyda nam sie angielskie slowo -> tym razem "any"
10. ilu roznych producentow samochodow istnieje?
    wypisz producentow zgrupowanych po pierwszej literze.
    tip: distinct

    przyklad:
```
    a: ALFA ROMEO, Aston Martin Lagonda Ltd, Audi, Acura
    b: BMW, Bentley, Buick
    c: Chevrolet, Cadillac, Chrysler, CHEVROLET
    ...
```

11. uzywajac grup z poprzedniego punktu wypisz liczebnosc kazdej grupy
    tip: projekcja
12. wypisz producentow dla ktorych istnieje conajmniej 50 modeli/ 20 modeli
    tip: wszyskiego skladowe juz znasz ;)
13. dla producentow dla ktorych istnieje conajmniej 50 modeli wypisz wszystkie modele
    tip: flatMap

# TODO

1. Znajdz wiecej danych o modelach samochodow wprowadzanych w roznych latach
2. Sprawdz jak zmienialo sie srednie spalanie modeli wprowadzanych w roznych latach
