public class Corporate extends Applicant {
    private int corporateId;
    private String corporateName;
    private int taxNumber;
    private String scale;


    public Corporate() {
    }

    public Corporate(int id, String password, String userName, int applicantId, String applicantNumber, int corporateId, String corporateName, int taxNumber, String scale) {
        super(id, password, userName, applicantId, applicantNumber);
        this.corporateId = corporateId;
        this.corporateName = corporateName;
        this.taxNumber = taxNumber;
        this.scale = scale;
    }

    public int getCorporateId() {
        return corporateId;
    }

    public void setCorporateId(int corporateId) {
        this.corporateId = corporateId;
    }

    public String getCorporateName() {
        return corporateName;
    }

    public void setCorporateName(String corporateName) {
        this.corporateName = corporateName;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getScale() {
        return scale;
    }

    public void setScale(String scale) {
        this.scale = scale;
    }
}
