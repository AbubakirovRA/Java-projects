import java.util.Scanner;

/**
 * ReadLine
 */
public class ReadLine {

    public static void main(String[] args) {
        Class a = String.class;
        System.out.println(a);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi! Do you want to calculate? (Y/N)");
        String answer = scanner.next();
        if (answer.toLowerCase() == "y"){
            calc();
        }
        scanner.close();
    }

    public static void calc(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of operation:\n1. - add\n2.- subtract\n3. - multiplay\n4. - division");
        int s = scanner.nextInt();
        System.out.println("Enter first digit");
        int a = scanner.nextInt();
        System.out.println("Enter second digit");
        int b = scanner.nextInt();
        if (s == 1) System.out.println("a + b = " + (a + b));
        if (s == 2) System.out.println("a - b = " + (a - b));
        if (s == 3) System.out.println("a * b = " + (a * b));
        if (s == 14) System.out.println("a / b = " + (a / b));
        scanner.close();
    }

    public class User
    {
        int age;
        String firstName;
        String lastName;
        //Конструктор
        public User(int age, String firstName, String lastName)
        {
            this.age = age;
            this.firstName = firstName;
            this.lastName = lastName;
        }

    }

    public class Student extends User
    {
        int group;
        //Конструктор
        public Student(int age, String firstName, String lastName)
        {
            super(age, firstName, lastName);
        }
        boolean isMyGroup(int g)
        {
            return g == group;
        }
    }
}