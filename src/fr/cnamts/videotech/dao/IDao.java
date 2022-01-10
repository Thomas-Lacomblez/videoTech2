package fr.cnamts.gestioncompte.dao;

import java.util.List;

import fr.cnamts.gestioncompte.domaine.video;

public interface IDao {

	Compte getVideoById(int id);

	void createVideo(Compte compte);

	Compte updateVideo(Compte compte);

	void deleteVideo(Compte compte);

	List<Compte> getAllVideo();

}