import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Programm {
    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        String str = buffer.readLine();
        Animals cat = new Cats();
        System.out.println(cat.type);
    }

}
