//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //сделал на уроке
    public static void main(String[] args) {
            Person student = new Student(16,"Кабанн",5);
            Person teacher = new Teacher(21,"Хлюбач","Хачапури");//сделал на уроке
            Person director = new Director(26,"Бабак",5);
        student.callPersonToDuty(student);
        teacher.callPersonToDuty(teacher);
        director.callPersonToDuty(director); //сделал на уроке

        }
    }
