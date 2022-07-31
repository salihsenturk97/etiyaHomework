public class Main {
    public static void main(String[] args) {
        System.out.println("Bir başkası sizin yazdığı koda baktığı zaman şunları diyorsa; " +
                "“Bunu buraya niye yazmış”, “Burası niye bu kadar karmaşık”, " +
                "“Bu değişken alaka” gibi soruları soruyorsa kirli koddur buna kokan kod(Code Smell) ” adı verilmektedir.");
        System.out.println("Yeni bir özellik geldiği zaman, sistemde minimal seviyede değişiklik olması gerekiyor.");
        System.out.println("SOLID : Single Responsibility Principle,Code Refactoring");
        CustomerManager customerManager = new CustomerManager();
        customerManager.add("Salih", "Şentürk", "12346579810");
        customerManager.add("Engin", "Şentürk", "12346579810");
        customerManager.add("Derin", "Şentürk", "12346579810");
        customerManager.add("İdris", "Şentürk", "12346579810");
    }


}

class CustomerManager {
    public void add(String firstName, String lastName, String identityNumber) {
        System.out.println("Eklendi: " + firstName);
    }
}