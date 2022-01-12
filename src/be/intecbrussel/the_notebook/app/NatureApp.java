package be.intecbrussel.the_notebook.app;

import be.intecbrussel.the_notebook.entities.animal_entities.Carnivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Herbivore;
import be.intecbrussel.the_notebook.entities.animal_entities.Omnivore;
import be.intecbrussel.the_notebook.entities.plant_entities.*;
import be.intecbrussel.the_notebook.services.ForestNotebook;

import java.util.LinkedHashSet;
import java.util.Set;

public class NatureApp {
    public static void main(String[] args) {

        Set<Plant> plantDiet = new LinkedHashSet<>();
        ForestNotebook notebook = new ForestNotebook();

        Tree tree = new Tree("Whitewood", 20.3);
        Flower flower = new Flower("Whiteorchid", 2.15);
        Weed weed = new Weed("Clover", 0.15);
        Tree fruitTree1 = new Tree("Green apple", 9.65);
        Tree fruitTree2 = new Tree("Banana", 14.5);
        Bush bush = new Bush("Bushybush", 2.6);
        Bush roseHip = new Bush("Rose hip", 1.7);
        Flower colorFlower = new Flower("Mimosa", 0.35);
        colorFlower.setSmell(Scent.SWEET);
        flower.setSmell(Scent.EARTHY);
        tree.setLeafType(LeafType.HAND);
        fruitTree1.setLeafType(LeafType.HEART);
        fruitTree2.setLeafType(LeafType.SPEAR);
        roseHip.setFruit("Rose Hips");
        roseHip.setLeafType(LeafType.NEEDLE);
        bush.setFruit("Bushybush");
        bush.setLeafType(LeafType.NEEDLE);
        weed.setArea(47.2);

        Herbivore sheep = new Herbivore("Dolly", 45.4, 1.0, 1.2);
        sheep.addPlantToDiet(weed);
        Herbivore goat = new Herbivore("Capricorn", 33.3, 1.1, 1.2);
        goat.addPlantToDiet(bush);
        Herbivore cow = new Herbivore("Belgian Blue", 275.4, 2.3, 2.0);
        cow.addPlantToDiet(weed);
        Herbivore horse = new Herbivore("Pony", 165.3, 2.7, 3.9);
        Carnivore fox = new Carnivore("Firefox", 20.4, 0.80, 0.40);
        fox.setMaxFoodSize(1);
        Carnivore wolf = new Carnivore("Wolfy", 52.1, 1.9, 2.2);
        wolf.setMaxFoodSize(3);
        Carnivore croc = new Carnivore("Alligator", 90.9, 0.35, 3.3);
        croc.setMaxFoodSize(2);
        Omnivore bear = new Omnivore("Mozilla", 175.6, 1.7, 1.40);
        bear.setMaxFoodSize(3);
        bear.addPlantToDiet(bush);
        Omnivore raven = new Omnivore("Triple eyes", 5.4, 0.30, 0.40);
        raven.setMaxFoodSize(0.5);
        raven.addPlantToDiet(roseHip);
        Omnivore monkey = new Omnivore("Godzilla", 65.3, 1.50, 0.90);
        monkey.setMaxFoodSize(2);
        monkey.addPlantToDiet(weed);

        sheep.setPlantDiet(plantDiet);
        goat.setPlantDiet(plantDiet);
        cow.setPlantDiet(plantDiet);
        bear.setPlantDiet(plantDiet);
        raven.setPlantDiet(plantDiet);
        monkey.setPlantDiet(plantDiet);

        notebook.addPlant(tree);
        notebook.addPlant(fruitTree1);
        notebook.addPlant(fruitTree2);
        notebook.addPlant(flower);
        notebook.addPlant(weed);
        notebook.addPlant(bush);
        notebook.addPlant(roseHip);
        notebook.addPlant(colorFlower);

        notebook.addAnimal(fox);
        notebook.addAnimal(wolf);
        notebook.addAnimal(croc);
        notebook.addAnimal(sheep);
        notebook.addAnimal(goat);
        notebook.addAnimal(horse);
        notebook.addAnimal(cow);
        notebook.addAnimal(bear);
        notebook.addAnimal(raven);
        notebook.addAnimal(monkey);

        System.out.println("------------------");
        System.out.println("Index of Notebook");
        System.out.println(" ");
        notebook.printNotebook();
        System.out.println(" ");

        System.out.println("------------------");
        System.out.println("Plants sorted by name");
        System.out.println(" ");
        notebook.sortPlantsByName();
        System.out.println("------------------");
        System.out.println(" ");
        System.out.println("Animals sorted by name");
        System.out.println(" ");
        notebook.sortAnimalsByName();
        System.out.println("------------------");
        System.out.println(" ");

        System.out.println("Animals and Plants sorted by their heights");
        notebook.sortAnimalsByHeight();
        notebook.sortPlantsByHeight();
        System.out.println("------------------");
        System.out.println(" ");

        System.out.println("Total number of plants counted");
        System.out.println(notebook.getPlantCount());
        System.out.println("Total number of animals counted");
        System.out.println(notebook.getAnimalCount());
        System.out.println("------------------");

    }
}
