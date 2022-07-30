public class Entrepreneur extends Applicant {
    private int entrepreneurId;
    private String firstName;
    private String lastName;
    private String identityNumber;


    public Entrepreneur() {
    }

    public Entrepreneur(int entrepreneurId, String firstName, String lastName, String identityNumber) {
        this.entrepreneurId = entrepreneurId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
    }

    public int getEntrepreneurId() {
        return entrepreneurId;
    }

    public void setEntrepreneurId(int entrepreneurId) {
        this.entrepreneurId = entrepreneurId;
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

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }
}
