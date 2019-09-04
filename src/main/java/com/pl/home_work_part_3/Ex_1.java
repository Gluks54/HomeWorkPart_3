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
        List<String> models = lines.subList(1, lines.size());

        List<Car_Ex1> carEx1 = models
                .stream()
                .map(x -> {
                    String[] split = x.split(",");
                    Car_Ex1 listCarEx1 = new Car_Ex1();
                    listCarEx1.Comb_Fe = Integer.parseInt(split[7]);
                    listCarEx1.division = split[1];
                    return listCarEx1;
                })
                .sorted((x, y) -> (x.Comb_Fe - y.Comb_Fe))
                .collect(Collectors.toList());

        System.out.println(carEx1);
    }
}
