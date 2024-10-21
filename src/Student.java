public class Student extends Person{
    private int grade;

    public Student(int age, String name, int grade) {
        super(age, name);
        this.grade = grade;
    }
    //сделал на уроке
    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {//сделал на уроке
        this.grade = grade;
    }

    @Override
    void performDuty() {
        System.out.println("Студень "+getName()+" учиться в классе "+ getGrade());//сделал на уроке
    }
    void study(){
        System.out.println("Студень "+getName()+" делает домашнее задание");
    }
    void search(){
        System.out.println("Сутдент "+getName()+" ищет свой класс");
    }

    @Override
    public void callPersonToDuty(Person person) {
        this.performDuty();
    }
}
