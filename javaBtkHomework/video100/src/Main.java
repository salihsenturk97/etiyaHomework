public class Main {
    public static void main(String[] args) {

        System.out.println("Çıplak class kalmasın. extends implements");
        CustomerDao customerDao = new CustomerDao(DatabaseType.Oracle);


    }
}

class CustomerDao {
    DatabaseType databaseType ;
    public CustomerDao(DatabaseType databaseType){
        this.databaseType = databaseType;
    }
        public void add(Customer customer) {
        System.out.println("Veritabanına eklendi.");
    }
}

class Customer {
    private int id;
    private String firstName;

    public Customer() {
    }

    public Customer(int id, String firstName) {
        this.id = id;
        this.firstName = firstName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}

enum DatabaseType {
    Oracle, SqlServer
}