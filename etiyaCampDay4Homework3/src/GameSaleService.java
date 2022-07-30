public interface GameSaleService {
    void buy(Gamer gamer,Game game);
    void buy(Gamer gamer,Game game,Campaign campaign);
}
