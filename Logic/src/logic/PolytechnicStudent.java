package Logic;

public class PolytechnicStudent extends Member {
    private String major;
    private String team;

    public PolytechnicStudent(String firstName, String lastName, String address, String phone, String gender, String birthDate, String major, String team) {
        super(firstName, lastName, address, phone, gender, birthDate);
        this.major = major;
        this.team = team;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }
}
