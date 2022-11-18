package OOP.Lectures.Lecture1.Part2;

public class Robot1 {
    /**
     * Имя робота
     */
    public String name;

    /**
     * Уровень робота
     */
    public int level;

    /**
     * Создание робота
     * @param name - имя робота
     * @param level - уровень робота
     */
    public Robot1(String name, int level){
        this.name = name;
        this.level = level;
    }

    //Методы вкл/выкл подсистем

    /**
     * Загрузка BIOS
     */
    public void startBIOS(){
        System.out.println("Start BIOS...");
    }

    /**
     * Загрузка OS
     */
    public void startOS(){
        System.out.println("Start OS...");
    }

    /**
     * Приветствие
     */
    public void sayHi(){
        System.out.println("Hi!");
    }

    /**
     * Выгрузка BIOS
     */
    public void stopBIOS(){
        System.out.println("Stop BIOS");
    }

     /**
      * Выгрузка OS
      */
    public void stopOS(){
        System.out.println("StopOS");
    }

    /**
    * Прощание
    */
    public void sayBy(){
        System.out.println("By-by!");
    }

    /**
    * Работа
    */
    public void work(){
        System.out.println("Working!");
    }
}
