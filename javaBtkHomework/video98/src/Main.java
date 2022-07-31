public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setFirstName("Salih");
        CustomerDal customerDal = new CustomerDal();
        if (customerDal.customerExists(customer)) {
            customerDal.add(customer);
        }
        //Fluent validation olmadığı için o kodlar yazılamadı.

    }
}