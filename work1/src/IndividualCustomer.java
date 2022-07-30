public class IndividualCustomer extends Customer {
    private int customerId;
    private String firstName;
    private String lastName;
    private String nationalIdentity;

    public IndividualCustomer() {
    }

    public IndividualCustomer(int id, int customerNumber, Canal canal, int customerId, String firstName, String lastName, String nationalIdentity) {
        super(id, customerNumber, canal);
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalIdentity = nationalIdentity;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getNationalIdentity() {
        return nationalIdentity;
    }

    public void setNationalIdentity(String nationalIdentity) {
        this.nationalIdentity = nationalIdentity;
    }
}
