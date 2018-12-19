import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_2_Ex_3 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\AguRok\\Downloads\\cwiczenia_fuel.csv");
        List<String> lines = Files.readAllLines(path);
        // System.out.println(carEx1);
        List<String> models = lines.subList(1, lines.size());

        List<Car_Ex2> carEx2 = models
                .stream()
                .map(x ->{
                    String [] split = x.split(",");
                    Car_Ex2 listCarEx2 = new Car_Ex2();
                    listCarEx2.Comb_Fe = Double.parseDouble(split[5])*1.6;
                    listCarEx2.division = split[1];
                    return listCarEx2;
                })
                .filter(x->x.Comb_Fe <= 100)
                .sorted(new Class_For_Compor())
                .collect(Collectors.toList());

        System.out.println(carEx2);


    }
}

//2. napisz kolejną klasę przechowującą informację o samochodach ale z
// spalaniem podanym w l/100km
//    tip: projekcja
//3. poprzedni wynik posortuj dodatkowo alfabetycznie
//    jeżeli 2 modele mają takie samo spalanie pierwszy powinien być ten
// który jest pierwszy alfabetycznie
