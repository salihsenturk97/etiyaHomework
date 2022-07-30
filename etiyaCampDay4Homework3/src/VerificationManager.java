import MernisReferance.DKGKPSPublicSoap;

import java.rmi.RemoteException;

public class VerificationManager implements VerificationService {
    @Override
    public boolean verification(Gamer gamer) {
        DKGKPSPublicSoap client = new DKGKPSPublicSoap();
        boolean result = false;
        try {
            result = client.TCKimlikNoDogrula(Long.valueOf(gamer.getInternationalId()), gamer.getFirstName(), gamer.getLastName(), gamer.getBirthOfYear());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return result;

    }
}
