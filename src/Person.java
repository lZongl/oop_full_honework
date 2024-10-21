public class Person {
    private int age;
    private String name;

    public Person(int age, String name) {//сделал на уроке
        this.age = age;
        this.name = name;
    }

    void performDuty(){
        System.out.println("Выполняет обязанность");
    }

    public int getAge() {//сделал на уроке
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }//сделал на уроке

    public void setName(String name) {
        this.name = name;
    }
    public void callPersonToDuty(Person person){
        this.performDuty();
    }
}
