//Create a Person class with the following fields:
//
//        name: the name of the person
//        age: the age of the person (whole number)
//        gender: the gender of the person (male / female)
//        And the following methods:
//
//        introduce(): prints out "Hi, I'm name, a age year old gender."
//        getGoal(): prints out "My goal is: Live for the moment!"
//        And the following constructors:
//
//        Person(name, age, gender)
//        Person(): sets name to Jane Doe, age to 30, gender to female


package greenfoxbefore;

public class Person {
    String name;
    int age;
    String gender;

    public Person ()
    {
        name = "Jane Doe";
        age = 30;
        gender = "female";
    }

    public Person (String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void introduce () {
        System.out.println("I'm " + name + " , a " + age + " year old " + gender);
    }

    public void getGoal () {
        System.out.println("My goal is: Live for the moment!");
    }
}
