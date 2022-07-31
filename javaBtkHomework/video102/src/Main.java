public class Main {
    public static void main(String[] args) {

        System.out.println("Yeni bir servis geldiği zaman manageri bağımlı hale getirmememiz gerekiyor." +
                "Çok fazla yorum satırına gerek yok.");
        PersonManager personManager = new PersonManager(new KpsServiceAdapter());
        personManager.add(new Person("45456", "Salih"));

    }
}

class PersonManager {
    PersonService personService;

    public PersonManager(PersonService personService) {
        this.personService = personService;
    }

    public void add(Person person) {
        System.out.println("İşlem yapıldı");
        personService.checkPerson(person);
    }
}

class KpsService { //Bu koda dokunmuyoruz. Adaptasyona ihtiyacımız var.
    public boolean checkPerson(String tcNo, String firstName) {
        System.out.println("Dışardan gelen servisim ben");
        return true;
    }
}


class KpsServiceAdapter implements PersonService {

    @Override
    public boolean checkPerson(Person person) {
        KpsService kpsService = new KpsService();
        kpsService.checkPerson(person.getTcNo(), person.getFirstName());
        return true;
    }
}


interface PersonService {
    boolean checkPerson(Person person);
}

class Person {
    private String tcNo;
    private String firstName;

    public Person() {
    }

    public Person(String tcNo, String firstName) {
        this.tcNo = tcNo;
        this.firstName = firstName;
    }

    public String getTcNo() {
        return tcNo;
    }

    public void setTcNo(String tcNo) {
        this.tcNo = tcNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
}
