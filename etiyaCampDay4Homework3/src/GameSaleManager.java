public class GameSaleManager implements GameSaleService {
    @Override
    public void buy(Gamer gamer, Game game) {
        System.out.println("Merhaba " + gamer.getFirstName() + " , Oyun başarıyla satın alındı : " + game.getGameName());
    }

    @Override
    public void buy(Gamer gamer, Game game, Campaign campaign) {
        System.out.println("Merhaba " + gamer.getFirstName() + " , Oyun " + campaign.getName() + " kampanyasıyla satın alındı : " + game.getGameName());
    }


}
