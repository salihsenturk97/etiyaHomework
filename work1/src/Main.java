public class Main {
    public static void main(String[] args) {

        Canal canal = new Canal(1, "İnternet");
        Customer customer = new IndividualCustomer(1, 123456789, canal, 2535, "Salih", "Şentürk", "5454456544646");

        Address address = new Address(1, customer, "Yenice Mah, 100.SOKAK SalihApt 5/9 Merkez/Kırşehir");
        System.out.println("Müşteri numarası: " + customer.getCustomerNumber());
        System.out.println("Müşteri ID: " + customer.getId());
        System.out.println("Müşteri Nereden Ulaştı: " + address.getCustomer().getCanal().getName());
        System.out.println(address.getCustomer().getId());

    }
}