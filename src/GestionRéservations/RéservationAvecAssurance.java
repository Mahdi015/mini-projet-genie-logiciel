package GestionRéservations;

import GestionClients.Client;
import GestionVols.Vol;
import Infrastructure.Passager;

public class RéservationAvecAssurance extends RéservationDecorator {
    public RéservationAvecAssurance(String c,String s, Client cl, Vol v, Passager p,Réservation réservation) {
    	super(c,s,cl,v,p,réservation);
    }

    @Override
    public void confirmerRéservation() {
        réservationDecorée.confirmerRéservation();
    }
}