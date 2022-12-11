public class Dog {
    public String name;
    public int weight;

    public Dog(String name, int weight){
        this.name = getName();
        this.weight = getWeight();
    }

    public Dog(){
        this("Dog", 20);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public int getWeight(){
        return weight;
    }
    public void setWeight(int weight){
        this.weight = weight;
    }
}
