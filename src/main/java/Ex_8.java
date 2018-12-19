import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Collectors;

public class Ex_8 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\AguRok\\Downloads\\cwiczenia_fuel.csv");
        List<String> lines = Files.readAllLines(path);
        // System.out.println(carEx1);
        List<String> models = lines.subList(1, lines.size());

        List<String> lables = models
                .stream()
                .map(x ->{
                    String [] split = x.split(",");
                    Car_Ex2 listCarEx1 = new Car_Ex2();
                    listCarEx1.division = split[1];
                     return listCarEx1;
                 })
                .map(x->x.division)
                .distinct()
                .collect(Collectors.toList());

        System.out.println(lables);
        System.out.println(lables.size());
        Map<Character, List<String>> groupedByFirstCharacter = lables
                .stream()
                .collect(Collectors.groupingBy(x -> Character.toLowerCase(x.charAt(0))));
        System.out.println(groupedByFirstCharacter);
    }

}
//8. pogrupuj modele po producencie i wypisz ilu różnych producentów istnieje
//    tip: collect + grouping