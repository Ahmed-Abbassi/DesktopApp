package metier;

import java.util.*;


import entitie.Etudiant;

public class GestionEtudiants implements IGestionEtudiants {

	List <Etudiant> listeEtudiants = new ArrayList<>();
	
	@Override
	public void ajouterEtudiant(Etudiant e) {

		listeEtudiants.add(e);
		}
	
	public void setListeEtudiants(List<Etudiant> liste) {
		listeEtudiants=liste;
	}
	
	

	@Override
	public List<Etudiant> rechercherParMC(String mc) {
		List<Etudiant> to_return_list = new ArrayList<Etudiant>();
		for(Etudiant i: listeEtudiants) {
			if(i.getNom().contains(mc)) to_return_list.add(i);
		}
		return to_return_list;
	}

	@Override
	public void trierListeEtudiantsParNom() {
		listeEtudiants.sort(((o1 , o2) -> o1.getNom().compareTo(o2.getNom())));

	}

	@Override
	public String toString() {
		return "GestionEtudiants [listeEtudiants=" + listeEtudiants + "]";
	}


	@Override
	public List<Etudiant> listeDesEtudiants() {
		
		return listeEtudiants;
	}

}
