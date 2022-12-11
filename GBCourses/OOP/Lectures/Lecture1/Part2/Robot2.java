package Lectures.Lecture1.Part2;

public class Robot2 {

    /** имя робота */
    private String name;

    /** уровень робота */
    private int level;

    /**
     * Создание робота
     * @param name
     * @param level
     */
    public Robot2(String name, int level){
        this.name = name;
        this.level = level;
    }

    public void powerOn(){
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    public void powerOf(){
        this.stopBIOS();
        this.stopOS();
        this.sayBy();
    }

    public String getName(){
        return this.name;
    }
    
    public int getLevel(){
        return this.level;
    }

    //Методы вкл/выкл подсистем

    /**
     * Загрузка BIOS
     */
    private void startBIOS(){
        System.out.println("Start BIOS...");
    }

    /**
     * Загрузка OS
     */
    private void startOS(){
        System.out.println("Start OS...");
    }

    /**
     * Приветствие
     */
    private void sayHi(){
        System.out.println("Hi!");
    }

    /**
     * Выгрузка BIOS
     */
    private void stopBIOS(){
        System.out.println("Stop BIOS");
    }

     /**
      * Выгрузка OS
      */
    private void stopOS(){
        System.out.println("StopOS");
    }

    /**
    * Прощание
    */
    private void sayBy(){
        System.out.println("By-by!");
    }

    /**
    * Работа
    */
    public void work(){
        System.out.println("Working!");
    }

}
