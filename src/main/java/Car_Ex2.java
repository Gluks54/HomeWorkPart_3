import java.util.Comparator;

public class Car_Ex2  {
    int mode_year;
    int Cyl;
    int City_Fe;
    int hwy_Fe;
    double Comb_Fe;
    String division;

    public double getComb_Fe() {
        return Comb_Fe;
    }

    public void setComb_Fe(double comb_Fe) {
        Comb_Fe = comb_Fe;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    String carline;
    String eng_disp;

    @Override
    public String toString() {
        return division + " " + Comb_Fe;
    }


    }

