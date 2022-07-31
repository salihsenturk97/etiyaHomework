public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager(new HibernateCustomerDao());
        customerManager.add();

    }
}
class CustomerManager{
    CustomerDao customerDao;

    public CustomerManager(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public void add(){
        System.out.println("Eklendi");
        customerDao.add();
    }
}
interface CustomerDao{
    void add();
}
class HibernateCustomerDao implements  CustomerDao{


    @Override
    public void add() {
        System.out.println("Hibernate ile eklendi.");
    }
}
class DenemeCustomerDao implements CustomerDao{

    @Override
    public void add() {
        System.out.println("Deneme ile eklendi.");
    }
}