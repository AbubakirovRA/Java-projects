public class Person {
    private String birthdate;
    private String deathdate;
    private String name;
    private String lastName;
    private Boolean sex;
    
    //Конструктор - если мы хотим, изначально при создании экземпляра присвоить атрибутам значения, то делаем так
    // public Person(String birthdate, String deathdate, String name, String lastName, Boolean sex)
    // {
    //     this.birthdate = birthdate;
    //     this.deathdate = deathdate;
    //     this.name = name;
    //     this.lastName = lastName;
    //     this.sex = sex;
    // }

    //Если мы хотим в консрукторе создавать пустой объект, 
    //полям которого будем присваивать значения ч/з сеттеры:
    public Person(){
        this.birthdate = "empty";
        this.deathdate = "empty";
        this.name = "empty";
        this.lastName = "empty";
        this.sex = null;
    }
    
    //
    public String getBirthdate(){
        return birthdate;
    }
    public void setBirthdate(String birthdate){
        this.birthdate = birthdate;
    }

    public String getDeathdate(){
        return deathdate;
    }
    public void setDeathdate(String deathdate){
        this.deathdate = deathdate;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public boolean getSex(){
        return sex;
    }
    public void setSex(boolean sex){
        this.sex = sex;
    }

    public void displayInfo()
    {
        System.out.printf("Birthday: %s \n Death Date: %s \n Name: %s \n Last Name: %s \n Sex: %s \n", birthdate, (deathdate == "" ? "Alive" : deathdate), name, lastName, (sex == null ? "empty" : sex ? "male" : "female"));
    }
}
