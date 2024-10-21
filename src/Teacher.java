public class Teacher extends Person {
    private String subject;

    public Teacher(int age, String name,String subject) { //сделал на уроке
        super(age, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    void performDuty() {
        System.out.printf("Учитель "+getName()+" преподает предмет "+ getSubject()+"\n");
    }
    void teach(){
        System.out.println("Учитель "+getName()+" объясняет новую тему по предмету "+ getSubject());//сделал на уроке
    }
    void scream(){
        System.out.println("Учитель "+getName()+" кричит на учеников на уроке");
    }

    @Override
    public void callPersonToDuty(Person person) {
        this.performDuty();
    }
}
