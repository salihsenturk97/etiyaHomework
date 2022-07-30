public class Main {
    public static void main(String[] args) {

        Gamer gamer1 = new Gamer("41965640702", "Salih", "Şentürk", 1997);
        Gamer gamer2 = new Gamer("123456789", "Engin", "Demiroğ", 1997);
        Game game1 = new Game(1, "Valorant", 250);
        //MERNİSLİ
        GamerManager gamerManager = new GamerManager(new VerificationManager());
        gamerManager.add(gamer1);
        gamerManager.add(gamer2);
        //SAHTE MERNİSLİ
        GamerManager gamerManager1 = new GamerManager(new FakeVerificationManager());
        gamerManager1.add(gamer1);
        gamerManager1.add(gamer2);
        CampaignService campaignManager = new CampaignManager();
        campaignManager.add(game1);
        GameSaleManager gameSaleManager = new GameSaleManager();
        gameSaleManager.buy(gamer1, game1);
        Campaign campaign = new Campaign(1, "TEMMUZ2022");
        gameSaleManager.buy(gamer1, game1, campaign);
    }
}