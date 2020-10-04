public class Person {


    public Person() {
    }


    public boolean personAgeVerification(int age) {
        return age >= 18;

    }

    public double threePeronsAverageAge(int personAge1, int personAge2, int personAge3) {
        return  (((double)personAge1 + (double)personAge2 + (double)personAge3) / 3);


    }

    public String nameToUpperCase(String name) {
        return name.toUpperCase();
    }
    public Integer ageMultiplyByFive(Integer age) {
        return age * 5;
    }


}
