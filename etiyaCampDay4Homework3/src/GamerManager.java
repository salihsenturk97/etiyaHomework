public class GamerManager implements GamerService {
    private VerificationService verificationService;

    public GamerManager(VerificationService verificationService) {
        this.verificationService = verificationService;
    }

    @Override
    public void add(Gamer gamer) {
        if (verificationService.verification(gamer)) {
            System.out.println("Oyuncu eklendi: " + gamer.getFirstName());
        } else {
            System.out.println("Oyuncu eklenemedi.");
        }
    }

    @Override
    public void delete(Gamer gamer) {
        if (verificationService.verification(gamer)) {
            System.out.println("Oyuncu silindi: " + gamer.getFirstName());
        } else {
            System.out.println("Oyuncu Silinemedi.");
        }

    }

    @Override
    public void update(Gamer gamer) {
        if (verificationService.verification(gamer)) {
            System.out.println("Oyuncu günellendi: " + gamer.getFirstName());
        } else {
            System.out.println("Oyuncu Güncellenemedi.");
        }

    }
}

