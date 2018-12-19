import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ex_10 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Users\\AguRok\\Downloads\\cwiczenia_fuel.csv");
        List<String> lines = Files.readAllLines(path);
        // System.out.println(carEx1);
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

//        System.out.println(lables);
//        System.out.println(lables.size());

        Map<String, List<Car_Ex2>> groupedByDivision2 = lables
                .stream()
                .collect(Collectors.groupingBy(x -> x.division));
        System.out.println(groupedByDivision2.keySet().size());

        groupedByDivision2
                .keySet()
                .stream()
                .filter(x-> groupedByDivision2.get(x).size() >= 50)
                .map(x->
                    String.format("%s -- %d",x,groupedByDivision2.get(x).size()))
                .forEach(System.out::println);
    }
}
//10. wypisz producentów dla których istnieje conajmniej 50 modeli/ 20 modeli
//    tip: wszyskiego składowe już znasz ;)