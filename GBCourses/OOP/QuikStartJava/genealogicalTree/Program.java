public class Program {
    public static void main(String[] args) {
        Person Kate = new Person ();
        Kate.displayInfo();
        Kate.setName("Ekaterina");
        Kate.setBirthdate("05.10.1974");
        Kate.setLastName("Abubakirova");
        Kate.setSex(false);
        Kate.setDeathdate("Alive");
        Kate.displayInfo();
        System.out.println(Kate.getBirthdate());
    }    
}
