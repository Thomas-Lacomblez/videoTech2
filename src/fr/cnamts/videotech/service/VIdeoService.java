package fr.cnamts.gestioncompte.service;

import java.util.List;

import fr.cnamts.gestioncompte.dao.IDao;
import fr.cnamts.gestioncompte.domaine.Compte;

public class VIdeoService {

	private IDao iDao;

	public VIdeoService(IDao iDao) {
		super();
		this.iDao = iDao;
	}

	public Compte recuperationVideo(int id) {
		System.out.println("SERVICE: r�cup�ration du compte id=" + id);

		Compte compteRetour = iDao.getVideoById(id);
		return compteRetour;
	}

	public void creerVideo(Compte compte) {
		System.out.println("SERVICE: cr�ation du compte " + compte.toString());

		iDao.createVideo(compte);
	}

	public Compte mettreAJourVideo(Compte compte) {
		System.out.println("SERVICE: mise � jour du compte " + compte.toString());

		Compte compteRetour = iDao.updateVideo(compte);
		return compteRetour;
	}

	public void supprimerVideo(Compte compte) {
		System.out.println("SERVICE: suppression du compte " + compte.toString());

		iDao.deleteVideo(compte);
	}

	public List<Compte> recuperationVideoListe() {
		System.out.println("SERVICE: r�cup�ration de tous les comptes");

		List<Compte> compteListeRetour = iDao.getAllVideo();
		return compteListeRetour;
	}

	public void comparaisonCompte(Compte compte1, Compte compte2) {
		System.out.println("SERVICE: comparaison entre deux comptes");
	}
}
