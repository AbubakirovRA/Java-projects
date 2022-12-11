package Lectures.Lecture1.Part2;

import java.util.ArrayList;

public class Robot3 {
    
    enum State {
        On, Off;
    }
    
    private static int defaultIndex;
    private static ArrayList<String> names;

    /**статический инициализатор */
    static {
        defaultIndex = 1;
        names = new ArrayList<String>();
    }

     /** имя робота */
     private String name;

     /** Состояние робота */
     private State state;

     /** уровень робота */
     private int level;

    /**
     * Создание робота
     * @param name
     * @param level
     */
    private Robot3(String name, int level){
        if ((name.isEmpty()
                || Character.isDigit(name.charAt(0 )))
                || Robot3.names.indexOf(name) != -1)
        {
            this.name = String.format("DefaultName_%d", defaultIndex++);
        }else {
            this.name = name;
        }

        Robot3.names.add(this.name);
        this.level = level;
        this.state = State.Off;
    }

    /**Дополнительная логика (конструкторы) спроектированные с нарушением принципа DRY
     */

     /**
      * Робот с одним аргументом
      * @param name
    
    // public Robot3(String name){
    //     if ((name.isEmpty()
    //             || Character.isDigit(name.charAt(0 )))
    //             || Robot3.names.indexOf(name) == -1)
    //     {
    //         this.name = String.format("DefaultName_%d", defaultIndex++);
    //     }else {
    //         this.name = name;
    //     }

    //     Robot3.names.add(this.name);
    //     this.level = 1;
    //     this.state = State.Off;
    // }
    */
    
    /**
     * Робот без аргументов (по умолчанию)
    // public Robot3(){
    //     this.name = String.format("DefaultName_%d", defaultIndex++);

    //     Robot3.names.add(this.name);
    //     this.level = 1;
    //     this.state = State.Off;
    // }
     */

    /**
     * Используем правильные конструкции:
     * дополнительные конструкторы используют основной конструктор
     * т.е. с логикой, охватывающей максимальное количество вариантов)
     * @param name
     */
    public Robot3(String name){
        this(name, 1);
    }

    public Robot3(){
        this("");
    }

    /*Методы включения и отключения подсистем */

    public void power(){
        if (this.state == State.Off){
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOf();
            this.state = State.Off; 
        }
        System.out.println();
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

    @Override
    public String toString(){
        return String.format("%s %d\n", this.name, this.level);
    }
}

