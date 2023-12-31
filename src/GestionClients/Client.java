package GestionClients;
import java.util.ArrayList;
import java.util.List;

import GestionRéservations.Réservation;

public class Client {
    private String nom;
    private String prénom;
    private String identifiant;
    private List<Réservation> réservations;

    public Client(String nom, String prénom, String identifiant) {
        this.nom = nom;
        this.prénom = prénom;
        this.identifiant = identifiant;
        this.réservations = new ArrayList<>();
    }


	public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrénom() {
        return prénom;
    }

    public void setPrénom(String prénom) {
        this.prénom = prénom;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public List<Réservation> getRéservations() {
        return réservations;
    }

    // Méthodes pour gérer les réservations
    public void ajouterRéservation(Réservation réservation) {
        réservations.add(réservation);
    }

    public void supprimerRéservation(Réservation réservation) {
        réservations.remove(réservation);
    }
}
