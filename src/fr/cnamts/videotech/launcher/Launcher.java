package fr.cnamts.gestioncompte.launcher;

import fr.cnamts.gestioncompte.dao.CompteDao;
import fr.cnamts.gestioncompte.dao.CompteDaoJpa;
import fr.cnamts.gestioncompte.dao.IDao;
import fr.cnamts.gestioncompte.domaine.Compte;
import fr.cnamts.gestioncompte.service.CompteService;

public class Launcher {

	public static void main(String[] args) {

		Compte compte1 = new Compte(1, 123456789, "BREIZH FOREVER", "04");

		IDao iDao = new CompteDao();
		IDao iDaoJpa = new CompteDaoJpa();
		CompteService compteService = new CompteService(iDaoJpa);
		compteService.creerCompte(compte1);

		Compte compte2 = compteService.recuperationCompte(2);
		if (compte2 != null) {
			System.out.println("LAUNCHER: Récuperation du compte réussie " + compte2.toString());
		} else {
			System.out.println("LAUNCHER: Récuperation du compte échouée");
		}
	}

}
