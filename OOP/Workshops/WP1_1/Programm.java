package OOP.Workshops.WP1_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programm {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        Dog dog = new Dog(getName(buffer.readLine()), getWeight(buffer.readLine()));
        System.out.println(dog);
    }

}
