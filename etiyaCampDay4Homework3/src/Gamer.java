import java.util.Date;

public class Gamer {
    private String internationalId;
    private String firstName;
    private String lastName;
    private int birthOfYear;

    public Gamer() {
    }

    public Gamer(String internationalId, String firstName, String lastName, int birthOfYear) {
        this.internationalId = internationalId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthOfYear = birthOfYear;
    }

    public String getInternationalId() {
        return internationalId;
    }

    public void setInternationalId(String internationalId) {
        this.internationalId = internationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getBirthOfYear() {
        return birthOfYear;
    }

    public void setBirthOfYear(int birthOfYear) {
        this.birthOfYear = birthOfYear;
    }
}
