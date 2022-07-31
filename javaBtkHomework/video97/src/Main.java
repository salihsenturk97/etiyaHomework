public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("");
        CustomerManager customerManager = new CustomerManager();
        customerManager.add(customer);
    }
}
class CustomerManager {
    public void add(Customer customer) {
        validate(customer);
    }
    public void validate(Customer customer) { // BU İFLERİ FARKLI METHODLARDA YAZILMASI GEREKİYOR. tak çıkar mantığı ile kullanacağımız yerde eklememiz yeterli.
        if (String.valueOf(customer.firstName).length() != 0 &&
                String.valueOf(customer.lastName).length() != 0 &&
                String.valueOf(customer.cityId).length() != 0 &&
                String.valueOf(customer.identityNumber).length() != 0) {
            System.out.println("Eklendi");

        }
        System.out.println("Eklenemedi, değerler boş");
    }
}
class Customer {

    public String firstName;
    public String lastName;
    public String identityNumber;

    public int cityId;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String identityNumber, int cityId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.identityNumber = identityNumber;
        this.cityId = cityId;
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

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}