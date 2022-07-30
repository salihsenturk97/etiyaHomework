public class Customer {
    private int id;
    private int customerNumber;
    private Canal canal;

    public Customer() {
    }

    public Customer(int id, int customerNumber, Canal canal) {
        this.id = id;
        this.customerNumber = customerNumber;
        this.canal = canal;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(int customerNumber) {
        this.customerNumber = customerNumber;
    }

    public Canal getCanal() {
        return canal;
    }

    public void setCanal(Canal canal) {
        this.canal = canal;
    }
}
