package GestionRéservations;

import GestionClients.Client;
import GestionVols.Vol;
import Infrastructure.Passager;

public class Réservation {
    private String codeRéservation;
    private String statut; 
    private Client client;
    private Vol vol;
    private Passager passager;

    public Réservation(String codeRéservation,String statut, Client client, Vol vol, Passager passager) {
        this.codeRéservation = codeRéservation;
        this.statut = statut;
        this.client = client;
        this.vol = vol;
        this.passager = passager;
    }

    public String getCodeRéservation() {
        return codeRéservation;
    }

    public void setCodeRéservation(String codeRéservation) {
        this.codeRéservation = codeRéservation;
    }

    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Vol getVol() {
        return vol;
    }

    public void setVol(Vol vol) {
        this.vol = vol;
    }

    public Passager getPassager() {
        return passager;
    }

    public void setPassager(Passager passager) {
        this.passager = passager;
    }

    public void confirmerRéservation() {
        this.statut = "Confirmée";
    }

    public void annulerRéservation() {
        this.statut = "Annulée";
    }
}