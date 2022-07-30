public class CreditFeature {
    private int id;
    private Feature feature;
    private Credit credit;

    public CreditFeature() {
    }

    public CreditFeature(int id, Feature feature, Credit credit) {
        this.id = id;
        this.feature = feature;
        this.credit = credit;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Feature getFeatures() {
        return feature;
    }

    public void setFeatures(Feature feature) {
        this.feature = feature;
    }

    public Credit getCredit() {
        return credit;
    }

    public void setCredit(Credit credit) {
        this.credit = credit;
    }
}
