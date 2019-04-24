package cloneable;

public class Person {

    String name;
    int age;
    String gender;

    public Person() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce() {
        System.out.println("I'm " + name + " , a " + age + " year old " + gender);
    }

    public void getGoal() {
        System.out.println("My goal is: Live for the moment!");
    }

}

