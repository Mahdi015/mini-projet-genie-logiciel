package GestionVols;

import Infrastructure.Aéroport;

public class Escale {
    private String heureDépart;
    private String heureArrivée;
    private Vol vol;
    private Aéroport aéroport;

    public Escale(String heureDépart, String heureArrivée, Vol vol, Aéroport aéroport) {
        this.heureDépart = heureDépart;
        this.heureArrivée = heureArrivée;
        this.vol = vol;
        this.aéroport = aéroport;
    }

    // Getters et setters
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

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Aéroport getAéroport() {
        return aéroport;
    }

    public void setAéroport(Aéroport aéroport) {
        this.aéroport = aéroport;
    }
}

