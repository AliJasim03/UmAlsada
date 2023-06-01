package Logic;

public class PolytechnicStudent extends Member {
    private String major; // The major of the student
    private String team; // The team the student belongs to

    public PolytechnicStudent(String firstName, String lastName, String address, String phone, String gender, String birthDate, String major, String team) {
        super(firstName, lastName, address, phone, gender, birthDate); // Call the constructor of the parent class (Member) to initialize common member details
        this.major = major; // Set the major of the student
        this.team = team; // Set the team the student belongs to
    }

    public String getMajor() {
        return major; // Return the major of the student
    }

    public void setMajor(String major) {
        this.major = major; // Set the major of the student
    }

    public String getTeam() {
        return team; // Return the team the student belongs to
    }

    public void setTeam(String team) {
        this.team = team; // Set the team the student belongs to
    }
}
