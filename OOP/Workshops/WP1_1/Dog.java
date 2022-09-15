public class Dog {
    private String name;
    private int weight;

    public Dog(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public Dog(){
        this("Dog", 20);
    }

    public getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public getWeight(){
        return weight;
    }

    public void setWeight(String name){
        this.name = weight;
    }
}
