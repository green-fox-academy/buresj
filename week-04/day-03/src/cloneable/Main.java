package cloneable;

public class Main {
    public static void main(String[] args) {

        Student studentOne = new Student("John", 20, "male", "Random");
        Student studentTwo = (Student) studentOne.clone();
        Student studentThree = (Student) studentOne.clone();
        Student studentFour = (Student) studentOne.clone();
    }
}
