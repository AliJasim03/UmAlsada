package Logic;

import java.util.ArrayList;

public class PersonalTrainer extends Employee {
    private ArrayList<Member> members; // List to store the members assigned to the personal trainer

    public PersonalTrainer(String firstName, String lastName, String address, String phone, double salary) {
        super(firstName, lastName, address, phone, salary); // Call the superclass constructor to initialize the personal trainer's employee details
        this.members = new ArrayList<>(); // Create a new empty list for the assigned members
    }

    public ArrayList<Member> getMembers() {
        return members; // Return the list of members assigned to the personal trainer
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members; // Set the list of members assigned to the personal trainer
    }
}
