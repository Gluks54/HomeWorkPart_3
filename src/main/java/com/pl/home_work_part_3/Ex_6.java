import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Ex_6 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\AguRok\\Downloads\\cwiczenia_fuel.csv");
        List<String> lines = Files.readAllLines(path);

        List<String> models = lines.subList(1, lines.size());

        boolean allPorshe = models
                .stream()
                .map(x -> {
                    String[] split = x.split(",");
                    Car_Ex2 listCarEx1 = new Car_Ex2();
                    listCarEx1.division = split[1];
                    return listCarEx1;
                })
                .allMatch(x -> x.division.startsWith("Porshe"));
        System.out.println(allPorshe);
    }
}
