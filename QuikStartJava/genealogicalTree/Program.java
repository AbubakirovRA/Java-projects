package genealogicalTree;

public class Program {
    public static void main(String[] args) {
        Person Kate = new Person ("08.03.1983", "", "Катя", "Абубакирова", false);
        Kate.displayInfo();
        Kate.setName("Ekaterina");
        Kate.setBirthdate("05.10.1974");
        Kate.displayInfo();
    }    
}
