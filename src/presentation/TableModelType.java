package presentation;

import entitie.*;
import java.util.*;


import javax.swing.table.*;



public class TableModelType extends AbstractTableModel{

	List<Etudiant> listeEtudiants ;
	
	String Column[] = {
			"ID", "NOM", "PRENOM", "SEXE", "FILIERE"
	};
	 public TableModelType() {
		 listeEtudiants = new ArrayList<Etudiant>();
	}

	@Override
	public int getRowCount() {
		listeEtudiants.size();
		return 0;
	}

	@Override
	public int getColumnCount() {
		
		return Column.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		switch (columnIndex) {
		case 0: return listeEtudiants.get(rowIndex).getId();
		case 1: return listeEtudiants.get(rowIndex).getNom();
		case 2: return listeEtudiants.get(rowIndex).getPrénom();
		case 3: return listeEtudiants.get(rowIndex).getSexe();
		default:
			throw new IllegalArgumentException("Unexpected value: " + columnIndex);
		}
	}

	

}
