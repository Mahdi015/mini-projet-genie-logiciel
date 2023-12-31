package GestionRéservations;

import GestionClients.Client;
import GestionVols.Observer;
import GestionVols.Vol;
import Infrastructure.Passager;

public class RéservationObserver implements Observer {
    private Réservation réservation;

    public RéservationObserver(Réservation réservation) {
        this.réservation=réservation;
        this.réservation.getVol().attach((GestionVols.Observer) this);
    }

	@Override
	public void update() {
		if(this.réservation.getVol().getNombreDeSiègesDisponibles()>0) {
			System.out.println("il y a "+this.réservation.getVol().getNombreDeSiègesDisponibles()+" disponible");
		}
		else {
			System.out.println("aucune siége disponible");
		}
		
	}


		
	
}

