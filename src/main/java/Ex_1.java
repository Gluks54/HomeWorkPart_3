import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_1 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\AguRok\\Downloads\\cwiczenia_fuel.csv");
        List<String> lines = Files.readAllLines(path);
       // System.out.println(carEx1);
        List<String> models = lines.subList(1, lines.size());

        List<Car_Ex1> carEx1 = models
                .stream()
                .map(x ->{
                    String [] split = x.split(",");
                    Car_Ex1 listCarEx1 = new Car_Ex1();
                    listCarEx1.Comb_Fe = Integer.parseInt(split[7]);
                    listCarEx1.division = split[1];
                    return listCarEx1;
                })
                //natural ordering
               // .sorted((x,y)->x.division.compareTo(y.division))
               .sorted((x,y)->(x.Comb_Fe - y.Comb_Fe) )
                    .collect(Collectors.toList());

        System.out.println(carEx1);


    }
}
//0. napisz klase "Car_Ex1" przechowującą dane z fuel.csv i wczytaj wiersze zfuel.csv do "List<Car_Ex1>"
///////////////////////////////////////////////////////
//1. 10 modeli o najmniejszym spalaniu wypisz nazwę + spalanie
//    tip: sortowanie
////////////////////////////////////////////////////////
//2. napisz kolejną klasę przechowującą informację o samochodach ale z spalaniem podanym w l/100km
//    tip: projekcja
////////////////////////////////////////
//3. poprzedni wynik posortuj dodatkowo alfabetycznie
//    jeżeli 2 modele mają takie samo spalanie pierwszy powinien być ten który jest pierwszy alfabetycznie
//4. 10 modeli o najmniejszym spalaniu dla wybranego przez Ciebie producenta
//    tip: filtrowanie
//5. jeżeli istnieje wybierz taki model BMW który ma spalanie mniejsze niż 20
//    tip: filtrowanie + sortowanie
//6. sprawdź czy wszystkie modele są wyprodukowane przez Porshe
//    tip: wszystkie -> ang. all, w stream() jest metoda All()
//7. sprawdzy czy istnieje jaki kolwiek model wyprodukowany przez "Fiat", to samo dla "Olds Mobile"
//    tip: tak jak poprzednio przyda nam się angielskie słowo -> tym razem "any"
//8. pogrupuj modele po producencie i wypisz ilu różnych producentów istnieje
//    tip: collect + grouping
//9. używając grup z poprzedniego punktu wypisz liczebność każdej grupy
//    tip: projekcja
//10. wypisz producentów dla których istnieje conajmniej 50 modeli/ 20 modeli
//    tip: wszyskiego składowe już znasz ;)
//11. dla producentów dla których istnieje conajmniej 20 modeli wypisz wszystkie modele
//    tip: flatMap