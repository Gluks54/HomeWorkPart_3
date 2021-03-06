import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex_11 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\AguRok\\Downloads\\cwiczenia_fuel.csv");
        List<String> lines = Files.readAllLines(path);
        List<String> models = lines.subList(1, lines.size());

        List<Car_Ex2> lables = models
                .stream()
                .map(x -> {
                    String[] split = x.split(",");
                    Car_Ex2 carModel = new Car_Ex2();
                    carModel.mode_year = Integer.parseInt(split[0]);
                    carModel.division = split[1];
                    carModel.carline = split[2];
                    carModel.eng_disp = split[3];
                    carModel.Cyl = Integer.parseInt(split[4]);
                    carModel.City_Fe = Integer.parseInt(split[5]);
                    carModel.hwy_Fe = Integer.parseInt(split[6]);
                    carModel.Comb_Fe = Integer.parseInt(split[7]);
                    return carModel;
                })

                .collect(Collectors.toList());

        Map<String, List<Car_Ex2>> groupedByDivision2 = lables
                .stream()
                .collect(Collectors.groupingBy(x -> x.division));

        groupedByDivision2
                .keySet()
                .stream()
                .filter(x -> groupedByDivision2.get(x).size() >= 20)
                .flatMap(x -> groupedByDivision2.get(x).stream())
                .forEach(System.out::println);
    }
}
