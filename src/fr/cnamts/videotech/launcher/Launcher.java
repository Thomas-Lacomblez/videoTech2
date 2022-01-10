package fr.cnamts.gestioncompte.launcher;

import fr.cnamts.gestioncompte.dao.CompteDao;
import fr.cnamts.gestioncompte.dao.CompteDaoJpa;
import fr.cnamts.gestioncompte.dao.IDao;
import fr.cnamts.gestioncompte.domaine.Compte;
import fr.cnamts.gestioncompte.service.CompteService;

public class Launcher {
    public static void main(String[] args) {
        Video v1 = new Video(2, "Ville nouvelle", "Documentaire", "3", "20/30/2020");

        VideoService videoService = new VideoService();
        videoService.creerVideo(v1);
    }
}
