package Infrastructure;
import java.util.ArrayList;
import java.util.List;

import GestionVols.Vol;

public class Aéroport {
    private String codeAéroport;
    private String nom;
    private String villeDesservie;
    private List<Vol> volsDépart;
    private List<Vol> volsArrivée;
    private List<Vol> escales;

    public Aéroport(String codeAéroport, String nom, String villeDesservie) {
        this.codeAéroport = codeAéroport;
        this.nom = nom;
        this.villeDesservie = villeDesservie;
        this.volsDépart = new ArrayList<>();
        this.volsArrivée = new ArrayList<>();
        this.escales = new ArrayList<>();
    }

    public String getCodeAéroport() {
        return codeAéroport;
    }

    public void setCodeAéroport(String codeAéroport) {
        this.codeAéroport = codeAéroport;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getVilleDesservie() {
        return villeDesservie;
    }

    public void setVilleDesservie(String villeDesservie) {
        this.villeDesservie = villeDesservie;
    }

    public List<Vol> getVolsDépart() {
        return volsDépart;
    }

    public List<Vol> getVolsArrivée() {
        return volsArrivée;
    }

    public List<Vol> getEscales() {
        return escales;
    }

    public void ajouterVolDépart(Vol vol) {
        volsDépart.add(vol);
    }

    public void ajouterVolArrivée(Vol vol) {
        volsArrivée.add(vol);
    }

    public void ajouterEscale(Vol vol) {
        escales.add(vol);
    }
}

