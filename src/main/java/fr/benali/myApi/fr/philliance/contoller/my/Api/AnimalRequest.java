package fr.benali.myApi.fr.philliance.contoller.my.Api;

public class AnimalRequest {
    
    private String name;
    private String type;
    private int weight;

    public AnimalRequest(String name, String type, int weight){
        this.name=name;
        this.type=type;
        this.weight=weight;
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
    
}
