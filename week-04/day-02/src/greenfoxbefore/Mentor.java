//Create a Mentor class that has the same fields and methods as the Person class, and has the following additional
//
//        fields:
//        level: the level of the mentor (junior / intermediate / senior)
//        methods:
//        getGoal(): prints out "Educate brilliant junior software developers."
//        introduce(): "Hi, I'm name, a age year old gender level mentor."
//        The Mentor class has the following constructors:
//
//        Mentor(name, age, gender, level)
//        Mentor(): sets name to Jane Doe, age to 30, gender to female, level to intermediate

package greenfoxbefore;

public class Mentor {
    String name;
    int age;
    String gender;
    String level;


    public Mentor() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        level = "intemediate";
    }

    public Mentor(String name, int age, String gender, String level) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.level = level;
    }

    public void introduce() {
        System.out.println("I'm " + name + " , a " + age + " year old " + gender + " , " + level);
    }

    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }

}
