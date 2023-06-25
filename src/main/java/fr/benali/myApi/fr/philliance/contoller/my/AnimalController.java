package fr.benali.myApi.fr.philliance.contoller.my;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import fr.benali.myApi.fr.philliance.model.Animal;
import service.my.Api.AnimalService;
 
public class AnimalController {
    private AnimalService animalService;
    private AnimalRequest body;
    public AnimalController(AnimalService animalService){

        this.animalService = animalService;
    }
    @GetMapping("/animal")
    public Animal getAnimals(@RequestParam int id){
        Animal animal = animalService.getAnimals(id);
        return animal;
    } 
    @PostMapping("/animal")
    public Animal creatAnimal(@RequestBody AnimalRequest body){
       Animal animal= animalService.createAnimal(body.getName(),body.getWeight(), body.getType()); 
        return animal;         
    }
     @PutMapping("/animal") 
    public Animal updateAnimal(@RequestParam int id,@RequestBody AnimalRequest body  ){
        Animal animal=  animalService.updateAnimal(id, body.getName(),body.getWeight(), body.getType());
        return animal;            
    }
    @DeleteMapping("/animal") 
    public Animal deleteAnimal(@RequestParam int id){
        Animal animal=  animalService.deleteAnimal(id);
        return animal;            
    }
    
}
