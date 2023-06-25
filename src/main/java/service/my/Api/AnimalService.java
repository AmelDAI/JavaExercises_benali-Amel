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
  
    public Animal getAnimals( int id){
        for(Animal animal : this.animals){
            if(  animal.getId()== id){
                return animal;
             }   
        } 
return null;
}
public Animal createAnimal( String name, String type, int weight){      
    Animal animal = new Animal(this.animals.size(), name ,  type,  weight);
 this.animals.add(animal);
return animal;
}
public Animal updateAnimal(int id,  String name, String type, int weight){      
for(Animal animal : this.animals){
    if(  animal.getId()== id){
        animal.setName(name);
        animal.setType(type);
        animal.setWeight(weight);

        return animal;       }   
} 
return null;
}
public Animal deleteAnimal( int id){
for(Animal animal : this.animals){
    if(  animal.getId()== id){
        int index = this.animals.indexOf(animal);
        this.animals.remove(index);
        return animal;
     }   
} 
return null;
}


}
