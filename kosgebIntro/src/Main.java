import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //Date
        LocalDate localDateStart = LocalDate.of(2022, 7, 28);
        LocalDate localDateEnd = LocalDate.of(2032, 8, 29);
        //Instance
        Applicant applicant1 = new Corporate(1, "123456", "salih123", 1, "8978954646", 1, "ETİYA", 789, "Küçük");
        Authority authority = new Authority(1, "Kredi Sorgulama");
        AuthorityOfUser authorityOfUser = new AuthorityOfUser(1, authority, applicant1);
        Credit credit = new Credit(8, "Konut Kredisi", localDateStart, localDateEnd);
        Application application = new Application(1, applicant1,credit );
        Bank bank = new Bank(1, "GarantiBBVA");
        BankCustomer bankCustomer = new BankCustomer(1, "123456", "deneme", bank);
        BlackList blackList = new BlackList(1, applicant1);
        Applicant applicant2 = new Entrepreneur(1, "Salih", "Şentürk", "1223132132132");
        Feature feature = new Feature(1, "İhtiyaç Kredisi");
        CreditFeature creditFeature = new CreditFeature(1, feature, credit);
        Employee employee = new Employee(1, "132465", "k.adı", 1, "Salih", "şentürk", "Daire Başkanı");
        //Console
        System.out.println("Yetki: " + authority.getType());
        System.out.println("Çalışan Adı: " + employee.getFirstName());
        System.out.println("Başvuru Sahibi Kullanıcı Adı: " + application.getApplicant().getUserName());
        System.out.println("Banka Adı: " + bank.getName());
        System.out.println("Kara Liste: " + blackList.getApplicant().getUserName());
        System.out.println(application.getCredit().getId());


    }
}