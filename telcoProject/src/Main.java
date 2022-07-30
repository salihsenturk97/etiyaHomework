import entities.*;
import entities.Package;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //List
        List<Product> products = new ArrayList<>();
        List<Address> addresses = new ArrayList<>();
        List<Subscription> subscriptions = new ArrayList<>();
        //Instance
        AddressType addressType = new AddressType(1, "Ev Adresi", addresses);
        CorporateCustomer corporateCustomer1 = new CorporateCustomer("45564198183", "Etiya", 1, "123456", subscriptions, addresses);
        Address address = new Address(1, "Yenice Mah. 100.Sokak SalihApt 5/9 Merkez/Kırşehir", addressType, corporateCustomer1);
        Service service = new Service(1, "Ev İnterneti", products);
        AdslProduct adslProduct = new AdslProduct(1, "Zyxel", "GS2210-8", "Bakır %100", "5M", service, "20 MHz", "300 Mhz", false);

        //Add list
        addresses.add(address);

        //Console
        System.out.println("Voice Özelliği: " + adslProduct.isVoice());
        System.out.println("Müşteri numarası: " + address.getCustomer().getCustomerNumber());
        System.out.println("Müşteri adresi: " + address.getDetail());
        System.out.println("Müşteri numarası: 'AdressType'dan' " + addressType.getAddresses().get(0).getCustomer().getCustomerNumber());


    }
}
