import java.time.LocalDate;

public class CommercialActivity {
    private int id;
    private IndividualCustomer individualCustomer;
    private LocalDate date;

    public CommercialActivity() {
    }

    public CommercialActivity(int id, IndividualCustomer individualCustomer, LocalDate date) {
        this.id = id;
        this.individualCustomer = individualCustomer;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public IndividualCustomer getIndividualCustomer() {
        return individualCustomer;
    }

    public void setIndividualCustomer(IndividualCustomer individualCustomer) {
        this.individualCustomer = individualCustomer;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
