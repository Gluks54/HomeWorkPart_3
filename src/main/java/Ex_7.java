import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex_7 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\AguRok\\Downloads\\cwiczenia_fuel.csv");
        List<String> lines = Files.readAllLines(path);
        // System.out.println(carEx1);
        List<String> models = lines.subList(1, lines.size());

        boolean allPorshe = models
                .stream()
                .map(x ->{
                    String [] split = x.split(",");
                    Car_Ex2 listCarEx1 = new Car_Ex2();
                    listCarEx1.division = split[1].toUpperCase();
                    return listCarEx1; })
                .anyMatch(x->x.division.startsWith("OLDS"));
        System.out.println(allPorshe);

    }
}
//7. sprawdzy czy istnieje jaki kolwiek model wyprodukowany przez "Fiat", to samo dla "Olds Mobile"
//    tip: tak jak poprzednio przyda nam się angielskie słowo -> tym razem "any"