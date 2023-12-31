package GestionRéservations;

import GestionClients.Client;
import GestionVols.Vol;
import Infrastructure.Passager;

public class CreateReservationCommand implements Command {
    private RéservationFactory reservationFactory; // Service that actually creates a reservation
    private Client client;
    private Vol vol;
    private Passager passager;

    public CreateReservationCommand(RéservationFactory rf, Client client, Vol vol, Passager passager) {
        this.reservationFactory = rf;
        this.client = client;
        this.vol = vol;
        this.passager = passager;
    }

    @Override
    public void execute() {
        reservationFactory.createRéservation(client, vol, passager);

    }
}
