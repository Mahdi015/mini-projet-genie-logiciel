package GestionRéservations;

import GestionClients.Client;
import GestionVols.Vol;
import Infrastructure.Passager;

public class RéservationFactory {

    public static Réservation createRéservation(Client client, Vol vol, Passager passager) {
        String codeRéservation = generateReservationCode();
        Réservation réservation = new Réservation(codeRéservation,"confirmé", client, vol, passager);
        return réservation;
    }

    private static String generateReservationCode() {
        return "RES" + System.currentTimeMillis(); 
    }
}
