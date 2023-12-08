package entitie;

import java.util.Objects;

public class Etudiant {
	private String  nom, prénom, sexe , filiere;
	private int id;
	private int cpt;
	public Etudiant(int id, String nom, String prénom, String sexe, String filiere) {
		super();
		this.id = ++cpt;
		this.nom = nom;
		this.prénom = prénom;
		this.sexe = sexe;
		this.filiere = filiere;
	}
	@Override
	public String toString() {
		return "Etudiant [nom=" + nom + ", prénom=" + prénom + ", sexe=" + sexe + ", filiere=" + filiere + ", id=" + id
				+ ", cpt=" + cpt + "]";
	}
	public Etudiant(String nom, String prénom, String sexe, String filiere) {
		super();
		this.nom = nom;
		this.prénom = prénom;
		this.sexe = sexe;
		this.filiere = filiere;
	}
//getters and setters 
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
	public String getSexe() {
		return sexe;
	}
	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
	public String getFiliere() {
		return filiere;
	}
	public void setFiliere(String filiere) {
		this.filiere = filiere;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Etudiant other = (Etudiant) obj;
		return Objects.equals(nom, other.getNom());
	}
	
}
