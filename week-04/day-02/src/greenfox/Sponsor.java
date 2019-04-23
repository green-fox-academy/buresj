package greenfox;

public class Sponsor extends Person {

    String company;
    int hiredStudents;

    public Sponsor() {
        super();
    }

    public Sponsor(String name, int age, String gender, String company) {
        super(name, age, gender);
        this.company = company;
    }

    public void hire() {
        hiredStudents++;
    }

    @Override
    public void introduce() {
        System.out.println("I'm " + name + " , a " + age + " year old " + gender + " from "
                + company + " who hired " + hiredStudents + " students so far.");
    }

    @Override
    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}



