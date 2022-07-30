package entities;

public class AdslProduct extends Product {

    private String bandWidth;
    private String speedCapability;
    private boolean isVoice;

    public AdslProduct() {

    }

    public AdslProduct(int id, String brand, String serialNumber, String cableType, String cableLength, Service service, String bandWidth, String speedCapability, boolean isVoice) {
        super(id, brand, serialNumber, cableType, cableLength, service);
        this.bandWidth = bandWidth;
        this.speedCapability = speedCapability;
        this.isVoice = isVoice;
    }

    public boolean isVoice() {
        return isVoice;
    }

    public void setVoice(boolean voice) {
        isVoice = voice;
    }

    public String getBandWidth() {
        return bandWidth;
    }

    public void setBandWidth(String bandWidth) {
        this.bandWidth = bandWidth;
    }

    public String getSpeedCapability() {
        return speedCapability;
    }

    public void setSpeedCapability(String speedCapability) {
        this.speedCapability = speedCapability;
    }
}
