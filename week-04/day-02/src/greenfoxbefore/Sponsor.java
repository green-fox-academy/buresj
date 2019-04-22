//Create a Sponsor class that has the same fields and methods as the Personclass, and has the following additional
//
//        fields:
//        company: name of the company
//        hiredStudents: number of students hired
//        method:
//        introduce(): "Hi, I'm name, a age year old gender who represents company and hired hiredStudents students so far."
//        hire(): increase hiredStudents by 1
//        getGoal(): prints out "Hire brilliant junior software developers."
//        The Sponsor class has the following constructors:
//
//        Sponsor(name, age, gender, company): beside the given parameters, it sets hiredStudents to 0
//        Sponsor(): sets name to Jane Doe, age to 30, gender to female, company to Google and hiredStudents to 0

package greenfoxbefore;

public class Sponsor {

    String name;
    int age;
    String gender;
    String company;
    int hiredStudents;


    Sponsor() {
        name = "Jane Doe";
        age = 30;
        gender = "female";
        company = "Google";
        hiredStudents = 0;
    }

    public Sponsor(String name, int age, String gender, String company) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.company = company;
        hiredStudents = 0;
    }

    public void introduce() {
        System.out.println("I'm " + name + " , a " + age + " year old " + gender + " from "
                + company + " who hired " + hiredStudents + " students so far.");
    }

    public void hire() {
        hiredStudents++;
    }

    public void getGoal() {
        System.out.println("My goal is: Hire brilliant junior software developers.");
    }
}
