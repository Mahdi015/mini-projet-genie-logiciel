package GestionVols;


import GestionVols.Vol;
import Infrastructure.Aéroport;

public class VolFactory {
	public Vol createVol(String n, String hd, String ha,String dd, String da,CompagnieAérienne ca,Aéroport ad,Aéroport aa,int nb) {
		return new Vol(n,hd,ha,dd,da,ca,ad,aa,nb);
		
	}

}
