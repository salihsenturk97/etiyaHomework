public class Main {
    public static void main(String[] args) {

        int sayi1 = 20;
        int sayi2 = 25;
        sayi1 = sayi2;
        sayi2 = 30;
        System.out.println(sayi1); // 25 Çıkacak. Çünkü değer tip. Sadece değerini değiştirir referansına dokunmaz.


        int[] sayilar1 = new int[]{1, 2, 3}; // 1016+6a
        int[] sayilar2 = new int[]{4, 5, 6};
        sayilar1 = sayilar2;
        sayilar2[0] = 30;
        System.out.println(sayilar1[0]);  // 30 Çıkar çünkü referans tip. sayilar1 sayılar2nin referansını tutar.

        Cusomer cusomer = new Cusomer("123123132");
        Cusomer cusomer2 = cusomer;

        Person person = new Person();
        Person person1 = cusomer;
        Person person2 = new Employee();
        PersonDal personDal = new PersonDal();
        personDal.add(new Employee());
    }
}

class Person {
    private int id;
    private String firstName;

    public Person() {
    }

    public Person(int id, String firstName) {
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

class PersonDal {
    public void add(Person person) {

    }
}

class Cusomer extends Person {
    private String creditCardNo;

    public Cusomer() {
    }

    public Cusomer(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public void setCreditCardNo(String creditCardNo) {
        this.creditCardNo = creditCardNo;
    }
}

class Employee extends Person {
    private double salary;

    public Employee() {
    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class Product {
    private int id;
    private String name;

    public Product() {
    }

    public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}