package GestionVols;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import GestionRéservations.RéservationObserver;
import Infrastructure.Aéroport;

public class Vol {
    private String numéroVol;
    private String heureDépart;
    private String heureArrivée;
    private String dateDépart;
    private String dateArrivée;
    private CompagnieAérienne compagnieAérienne;
    private Aéroport aéroportDépart;
    private Aéroport aéroportArrivée;
    private List<Escale> escales;
    private List<Observer> observers;
    private int nombreDeSiègesDisponibles;

    public Vol(String numéroVol, String heureDépart, String heureArrivée,String dateDépart, String dateArrivée, CompagnieAérienne ca,Aéroport aéroportDépart,Aéroport aéroportArrivée,int nb) {
        this.numéroVol = numéroVol;
        this.heureDépart = heureDépart;
        this.heureArrivée = heureArrivée;
        this.dateDépart = dateDépart;
        this.dateArrivée = dateArrivée;
        this.compagnieAérienne=ca;
        this.aéroportArrivée=aéroportArrivée;
        this.aéroportDépart=aéroportDépart;
        this.nombreDeSiègesDisponibles=nb;
        this.escales = new ArrayList<>();
        observers=new ArrayList<Observer>();
    }

    public String getNuméroVol() {
		return numéroVol;
	}

	public void setNuméroVol(String numéroVol) {
		this.numéroVol = numéroVol;
	}

	public String getHeureDépart() {
		return heureDépart;
	}

	public void setHeureDépart(String heureDépart) {
		this.heureDépart = heureDépart;
	}

	public String getHeureArrivée() {
		return heureArrivée;
	}

	public void setHeureArrivée(String heureArrivée) {
		this.heureArrivée = heureArrivée;
	}

	public String getDateDépart() {
		return dateDépart;
	}

	public void setDateDépart(String dateDépart) {
		this.dateDépart = dateDépart;
	}

	public String getDateArrivée() {
		return dateArrivée;
	}

	public void setDateArrivée(String dateArrivée) {
		this.dateArrivée = dateArrivée;
	}

	public List<Escale> getEscales() {
		return escales;
	}

	public void setEscales(List<Escale> escales) {
		this.escales = escales;
	}

	public CompagnieAérienne getCompagnieAérienne() {
		return compagnieAérienne;
	}

	public Aéroport getAéroportDépart() {
		return aéroportDépart;
	}

	public Aéroport getAéroportArrivée() {
		return aéroportArrivée;
	}

	public void setCompagnieAérienne(CompagnieAérienne compagnieAérienne) {
        this.compagnieAérienne = compagnieAérienne;
    }

    public void setAéroportDépart(Aéroport aéroportDépart) {
        this.aéroportDépart = aéroportDépart;
    }

    public void setAéroportArrivée(Aéroport aéroportArrivée) {
        this.aéroportArrivée = aéroportArrivée;
    }

    public void ajouterEscale(Escale escale) {
        escales.add(escale);
        
        
    }

    public void supprimerEscale(Escale escale) {
        escales.remove(escale);
        
    }
    public void attach(Observer reservationObserver) {
        observers.add(reservationObserver);
        nombreDeSiègesDisponibles--;
    }

    public void detach(Observer observer) {
        observers.remove(observer);
        nombreDeSiègesDisponibles++;
    }
    public void setNombreDeSiègesDisponibles(int nombre) {
        nombreDeSiègesDisponibles = nombre;
        notifyAllObservers();
    }

    public void notifyAllObservers() {
        for (Observer observer : observers) {
            System.out.print("Observer "+observer);
        	observer.update();
        }
    }

    public int getNombreDeSiègesDisponibles() {
        return nombreDeSiègesDisponibles;
    }
}

