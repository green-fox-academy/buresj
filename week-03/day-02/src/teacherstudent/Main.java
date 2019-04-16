package teacherstudent;

public class Main {
    public static void main(String[] args) {

        Student studentOne = new Student();
        Teacher teacherOne = new Teacher();

        studentOne.learn();

        System.out.println(studentOne.question(teacherOne));
    }
}
