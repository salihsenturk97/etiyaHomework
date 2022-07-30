public class CampaignManager implements CampaignService {
    @Override
    public void add(Game game) {
        System.out.println("Kampanya girişi yapıldı : " + game.getGameName() + " : " + game.getPrice() / 10 + " TL");
    }

    @Override
    public void delete(Game game) {
        System.out.println("Kampanya silindi : " + game.getGameName());
    }

    @Override
    public void update(Game game) {
        System.out.println("Kampanya güncellendi : " + game.getGameName()+ " : "+game.getPrice() / 15 +" TL");
    }
}
