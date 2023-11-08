package td.info.model;

import java.util.List;

public class Zoo {

	private int visiteurs;
	private List<Secteur> secteurAnimaux;
	public static int NB_MAX_VISITEUR_PAR_SECTEUR = 15;

	public Zoo(int visiteurs, List<Secteur> secteurAnimaux) {
		super();
		this.visiteurs = visiteurs;
		this.secteurAnimaux = secteurAnimaux;
	}

	public int getVisiteurs() {
		return visiteurs;
	}

	public void setVisiteurs(int visiteurs) {
		this.visiteurs = visiteurs;
	}

	public List<Secteur> getSecteurAnimaux() {
		return secteurAnimaux;
	}

	public void setSecteurAnimaux(List<Secteur> secteurAnimaux) {
		this.secteurAnimaux = secteurAnimaux;
	}



}
