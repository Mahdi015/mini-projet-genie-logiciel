package GestionRéservations;

import GestionClients.Client;
import GestionVols.Vol;
import Infrastructure.Passager;

public abstract class RéservationDecorator extends Réservation {
    protected Réservation réservationDecorée;

    public RéservationDecorator(String c,String s, Client cl, Vol v, Passager p,Réservation réservation) {
        super(c,s,cl,v,p);
    	this.réservationDecorée = réservation;
    }
}

