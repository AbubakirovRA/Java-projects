package Wildcards;
import java.util.List;
import java.util.ArrayList;
public class Test {
    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDog = new ArrayList<>();
        listOfDog.add(new Dog());
        listOfDog.add(new Dog());

        test(listOfAnimal);
        test(listOfDog);
    }

    private static void test(List<? extends Animal> list) {//(List<Animal> list) - в данном случае, мы не можем передать объекты Dog
                                            //в метод test, т.е. полиморфизм так не работает, целый список объектов,
                                            //хотя и наследников от класса Animal, метод принять не может. Что делать?
                                            // использовать т.н. WildCard-запись. В данном случае это запись 
                                            //(List<?> list), здесь знак вопроса говорит, что в качестве аргумента в
                                            //метод можно передать список любых объектов. Но! Чтобы метод принимал в качестве 
                                            //любых объектов, и те объекты которые унаследованы от Animal, нужно добавить
                                            //(List<? extends Animal>), здесь вместо extends можно поставить и super
        for (Animal animal : list){
            System.out.println(animal);
            animal.eat();
        }
    }
}
