package td.info.service;

import java.util.ArrayList;
import java.util.List;

import td.info.enums.TypeAnimal;
import td.info.exception.LimiteVisiteurException;
import td.info.model.Animal;
import td.info.model.Secteur;
import td.info.model.Zoo;

public class ZooService {

	public void ajouterSecteur(Zoo zoo, TypeAnimal typeAnimal) {
		
		List<Animal> animalList = new ArrayList<Animal>();
		Secteur secteur = new Secteur(typeAnimal, animalList);
		
		List<Secteur> secteurs = zoo.getSecteurAnimaux();
		secteurs.add(secteur);
		
		zoo.setSecteurAnimaux(secteurs);
	}
	
	
	public void ajouterVisiteur(Zoo zoo) throws LimiteVisiteurException {
		
		if(zoo.getVisiteurs() + 1 > zoo.getSecteurAnimaux().size() * zoo.NB_MAX_VISITEUR_PAR_SECTEUR) {
			throw new LimiteVisiteurException("nombre de visiteur dépasse la limite");
		}
		zoo.setVisiteurs(zoo.getVisiteurs() + 1);
		
	}
	
	public void ajouterAnimal(Zoo zoo, Animal animal) {
		List<Secteur> secteurs = zoo.getSecteurAnimaux();
		
		List<Secteur> nouvelList = zoo.getSecteurAnimaux();
		
		for(Secteur secteur : secteurs) {
			if(secteur.getTypeAnimalDansSecteur().equals(animal.getTypeAnimal())) {
				List<Animal> animalList = secteur.getAnimauxDansSecteur();
				animalList.add(animal);
				secteur.setAnimauxDansSecteur(animalList);
				nouvelList.add(secteur);
				
			} 
		}
		zoo.setSecteurAnimaux(nouvelList);
	}
}
