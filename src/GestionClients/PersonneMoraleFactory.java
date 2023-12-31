package GestionClients;

public class PersonneMoraleFactory implements ClientFactory {
    @Override
    public Client createClient(String nom, String identifiant) {
    	String[] parts = nom.split(" ");
        String prénom = parts[0];
        String nomFamille = parts[1];
        return new PersonneMorale(nomFamille,nom, identifiant);
    }
}
