import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class Ex_5 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\AguRok\\Downloads\\cwiczenia_fuel.csv");
        List<String> lines = Files.readAllLines(path);

        List<String> models = lines.subList(1, lines.size());

        List<Car_Ex2> carEx2 = models
                .stream()
                .map(x -> {
                    String[] split = x.split(",");
                    Car_Ex2 listCarEx1 = new Car_Ex2();
                    listCarEx1.Comb_Fe = Integer.parseInt(split[7]);
                    listCarEx1.division = split[1];
                    return listCarEx1;
                })
                .filter(x -> x.division.startsWith("BMW") && x.Comb_Fe < 20)
                .sorted((x, y) -> (int) (x.Comb_Fe - y.Comb_Fe))
                .collect(Collectors.toList());

        System.out.println(carEx2);
    }
}
