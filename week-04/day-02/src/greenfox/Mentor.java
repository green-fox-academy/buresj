package greenfox;

public class Mentor extends Person {

    String level;

    public Mentor() {
        super();
    }

    public Mentor(String name, int age, String gender) {
        super(name, age, gender);
    }

    public Mentor(String name, int age, String gender, String level) {
        super(name, age, gender);
        this.level = level;

    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Educate brilliant junior software developers.");
    }


    @Override
    public void introduce() {
        System.out.println("I'm " + name + " , a " + age + " year old " + gender + " , " + level);
    }

}
