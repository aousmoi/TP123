package td.info;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import td.info.enums.TypeAnimal;
import td.info.exception.LimiteVisiteurException;
import td.info.model.Animal;
import td.info.model.Chat;
import td.info.model.Chien;
import td.info.model.Secteur;
import td.info.model.Zoo;
import td.info.service.ZooService;

public class App {

	public static void main(String[] args) throws LimiteVisiteurException {
		
		ZooService zooService = new ZooService();
	
		//Animals
		Animal animal1 = new Chien("snopy", TypeAnimal.CARNIVORE);
		Animal animal2 = new Chat("caty", TypeAnimal.CARNIVORE);
		
		//Seceturs
		Secteur secteur1 = new Secteur(TypeAnimal.CARNIVORE, Arrays.asList(animal1, animal2));
		List<Secteur> secteurList = new ArrayList<Secteur>();
		secteurList.add(secteur1);
		
		//Mon Zoo
		Zoo monZoo = new Zoo(0, secteurList);
		
		System.out.println(monZoo.getSecteurAnimaux().size());
		System.out.println(monZoo.getVisiteurs());
		
		zooService.ajouterSecteur(monZoo, TypeAnimal.HERBIVORE);
		zooService.ajouterVisiteur(monZoo);
		
		System.out.println(monZoo.getSecteurAnimaux().size());
		System.out.println(monZoo.getVisiteurs());
		
		for(int i = 0 ; i < 100 ; i++) {
			zooService.ajouterVisiteur(monZoo);
		}
		
		System.out.println(monZoo.getVisiteurs());
	}

}
