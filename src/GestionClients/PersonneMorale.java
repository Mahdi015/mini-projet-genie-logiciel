package GestionClients;

public class PersonneMorale extends Client {
    private String raisonSociale;

    public PersonneMorale(String raisonSociale, String prénom, String identifiant) {
    	super(raisonSociale,prénom,identifiant);  // nom est utilisé ici comme raison sociale

    }

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

}
