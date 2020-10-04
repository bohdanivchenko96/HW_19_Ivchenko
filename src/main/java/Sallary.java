import java.util.List;

public class Sallary {

    List<Integer> listOfYearSallary;



    public Integer sallaryForYear1(int amount) {
        return (amount > 0) ?  amount * 12 : null;
    }
    public int sallaryForYear2(int amount) {
        return (amount > 0) ?  amount * 12 : amount * (-12);
    }


}
