public class Director extends Person {
    private int yearsOfExperience;

    public Director(int age, String name,int yearsOfExperience) {
        super(age, name);
        this.yearsOfExperience = yearsOfExperience;//сделал на уроке
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    //сделал на уроке
    @Override
    void performDuty() {
        System.out.println("Директор "+getName()+ " управляет школой с опытом в "+getYearsOfExperience()+" лет");
    }
    void manage(){
        System.out.println("Директор "+getName()+ " проводит собрание с учителями");
    }//сделал на уроке
    void smart(){
        System.out.println("Директор "+getName()+" умничает на собрании учительском");
    }

    @Override
    public void callPersonToDuty(Person person) {
        this.performDuty();
    }
}
