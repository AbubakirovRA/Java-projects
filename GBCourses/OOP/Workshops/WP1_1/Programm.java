import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import OOP.Workshops.WP1_1.Dog;

public class Programm {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String str = buffer.readLine();
        Animals cat = new Cats();
        System.out.println(cat.type);
        Dog dog = new Dog(getName(buffer.readLine()), getWeight(Integer.parseInt(buffer.readLine())));
        System.out.println(dog);
    }

}
