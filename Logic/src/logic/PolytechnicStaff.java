package Logic;

public class PolytechnicStaff extends Member {
    private String position; // The position of the staff member
    private String department; // The department of the staff member

    public PolytechnicStaff(String firstName, String lastName, String address, String phone, String gender, String birthDate, String position, String department) {
        super(firstName, lastName, address, phone, gender, birthDate); // Call the constructor of the parent class (Member) to initialize common member details
        this.position = position; // Set the position of the staff member
        this.department = department; // Set the department of the staff member
    }

    public String getPosition() {
        return position; // Return the position of the staff member
    }

    public void setPosition(String position) {
        this.position = position; // Set the position of the staff member
    }

    public String getDepartment() {
        return department; // Return the department of the staff member
    }

    public void setDepartment(String department) {
        this.department = department; // Set the department of the staff member
    }
}
