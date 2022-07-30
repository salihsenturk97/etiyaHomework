public class CorporateCustomer extends Customer {
    private String title;
    private int taxNumber;

    public CorporateCustomer() {
    }

    public CorporateCustomer(int id, int customerNumber, Canal canal, String title, int taxNumber) {
        super(id, customerNumber, canal);
        this.title = title;
        this.taxNumber = taxNumber;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(int taxNumber) {
        this.taxNumber = taxNumber;
    }
}
