package GestionVols;

import java.util.ArrayList;
import java.util.List;

public class CompagnieAérienne {
	private String nom;
	private int Code;
	private List<Vol> vols;
	
	public CompagnieAérienne(String nom, int code) {
		this.nom = nom;
		Code = code;
		this.vols = new ArrayList<>();
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getCode() {
		return Code;
	}
	public void setCode(int code) {
		Code = code;
	}
	 public List<Vol> getVols() {
	        return vols;
	}
	 public void ajouterVol(Vol vol) {
	        vols.add(vol);
	}
	 public void supprimerVol(Vol vol) {
	        vols.remove(vol);
	}

}
