package metier;
import entitie.*;
import java.util.List;

public interface IGestionEtudiants {

	
	void ajouterEtudiant(Etudiant e);
	List<Etudiant> rechercherParMC(String mc);
	void trierListeEtudiantsParNom();
	List<Etudiant> listeDesEtudiants();
}
