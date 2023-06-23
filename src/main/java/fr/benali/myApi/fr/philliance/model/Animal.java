package fr.benali.myApi.fr.philliance.model;

public class Animal {

    /*
 * Pour mener à bien cet exercice, vous allez devoir créer une nouvelle catégorie de route, en plus de « /user »,
 *  vous aurez à créer les méthodes GET, POST, UPDATE et DELETE de la route « /animal ». Les données des animaux 
 * seront : Un « id » de type « int ». Un « name » de type « String » pour définir son nom.
 Un « type » de type « String » pour définir le type d’animal. Un « weight » de type « int » pour définir le poids 
 de l’animal. Vous devrez créer tous les fichiers nécessaires pour implémenter ces routes. Ils devront avoir comme
 nom « Animal[xx].java ». Pour récupérer tous les animaux, vous allez également ajouter une route GET « /animals » 
 qui retournera la liste complète que vous avez.
 */
//attribus

    private int id;
    private String name;
    private String type;
    private int weight;
    public Animal(int id, String name, String type, int weight ){
        this.id=id;
        this.name=name;
        this.type=type;
        this.weight=weight;
    }
    public int getId(){
        return this.id;
    }    
    public String getName(){
        return this.name;
    }    
    public String getType(){
        return this.type;
    }    
    public int getWeight(){
        return this.weight;
    }    
    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setWeight(int weight){
        this.weight=weight;
    } 
    
    
    
}
