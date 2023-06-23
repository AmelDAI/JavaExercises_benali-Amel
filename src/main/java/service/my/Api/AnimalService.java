package service.my.Api;

import java.util.ArrayList;

import fr.benali.myApi.fr.philliance.model.Animal;

public class AnimalService {

    private ArrayList<Animal>animals;
   
    
public AnimalService(){
 this.animals = new ArrayList<Animal>();

 this.animals.add(new Animal(0, "Coucou", "chat", 5));
 this.animals.add(new Animal(1, "mimi", "chien", 12));
 this.animals.add(new Animal(2, "Kiki", null, 41));
    }
    
}
