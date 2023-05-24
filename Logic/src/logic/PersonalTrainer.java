package Logic;

import java.util.ArrayList;

public class PersonalTrainer extends Employee {
    private ArrayList<Member> members;

    public PersonalTrainer(String firstName, String lastName, String address, String phone, double salary) {
        super(firstName, lastName, address, phone, salary);
        this.members = new ArrayList<>();
    }

    public ArrayList<Member> getMembers() {
        return members;
    }

    public void setMembers(ArrayList<Member> members) {
        this.members = members;
    }
}
