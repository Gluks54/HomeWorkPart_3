import java.util.Comparator;

public class Class_For_Compor implements Comparator<Car_Ex2> {


    @Override
    public int compare(Car_Ex2 o1, Car_Ex2 o2) {
        int rezult = (int) (o1.Comb_Fe - o2.Comb_Fe);
        if(o1.Comb_Fe == o2.Comb_Fe){
           return o1.division.compareTo(o2.division);
        }

        return rezult;
    }
}
