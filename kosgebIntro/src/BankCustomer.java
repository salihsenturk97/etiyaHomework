public class BankCustomer extends User {

    private int bankCustomerId;
    private Bank bank;




    public BankCustomer() {
    }

    public BankCustomer(int id, String password, String userName, Bank bank) {
        super(id, password, userName);
        this.bank = bank;

    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


}
