import java.util.ArrayList;
import java.util.List;

public class Applicant extends User {
    private int applicantId;
    private String applicantNumber;

    public Applicant() {
    }

    public Applicant(int id, String password, String userName, int applicantId, String applicantNumber) {
        super(id, password, userName);
        this.applicantId = applicantId;
        this.applicantNumber = applicantNumber;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getApplicantNumber() {
        return applicantNumber;
    }

    public void setApplicantNumber(String applicantNumber) {
        this.applicantNumber = applicantNumber;
    }
}
