package Infrastructure;

public class Passager {
    private String nom;
    private String prénom;
    private String numéroPassport;

    public Passager(String nom, String prénom, String numéroPassport) {
        this.nom = nom;
        this.prénom = prénom;
        this.numéroPassport = numéroPassport;
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

    public String getNuméroPassport() {
        return numéroPassport;
    }

    public void setNuméroPassport(String numéroPassport) {
        this.numéroPassport = numéroPassport;
    }
}

