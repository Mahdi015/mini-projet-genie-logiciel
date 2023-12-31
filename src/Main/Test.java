package Main;

import GestionClients.Client;
import GestionClients.PersonneMoraleFactory;
import GestionRéservations.Réservation;
import GestionRéservations.RéservationFactory;
import GestionRéservations.RéservationObserver;
import GestionVols.CompagnieAérienne;
import GestionVols.Vol;
import GestionVols.VolFactory;
import Infrastructure.Aéroport;
import Infrastructure.Passager;


public class Test {

	public static void main(String[] args) {
		VolFactory vf = new VolFactory();
		PersonneMoraleFactory pmf = new PersonneMoraleFactory();		
		CompagnieAérienne compagnieAerienne = new CompagnieAérienne("Tunisaire", 012);
        Aéroport aeroportDepart = new Aéroport("TN", "Aéroport Carthage", "Tunis");
        Aéroport aeroportArrivee = new Aéroport("JFK", "Aéroport John F. Kennedy", "New York");
        Vol vol = vf.createVol("VOL1234", "23:00", "08:00", "30/12/2023", "31/12/2023", compagnieAerienne, aeroportDepart, aeroportArrivee,100);
        Client client= pmf.createClient("Hela Aouiti", "ID12345");
        Passager passager = new Passager("Hejer", "elleuch", "PAS123456"); 
        Réservation reservation = RéservationFactory.createRéservation(client, vol, passager);
        System.out.println("Réservation créée avec succès. Code: " + reservation.getCodeRéservation());
        RéservationObserver reservationObserver= new RéservationObserver(reservation);
        RéservationObserver reservationObserver2= new RéservationObserver(reservation);
        RéservationObserver reservationObserver3= new RéservationObserver(reservation);
        vol.notifyAllObservers();
        
	}

}
