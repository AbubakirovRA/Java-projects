package OOP.Lectures.Lecture1.Part2;

public class Programm {
    public static void main(String[] args) {
        Robot1 robot1 = new Robot1("Robot1", 1);
        System.out.printf("%s %d\n", robot1.name, robot1.level);

        robot1.startBIOS();
        robot1.startOS();
        robot1.sayHi();

        robot1.work();

        robot1.sayBy();
        robot1.stopOS();
        robot1.stopBIOS();

        /**Клиентский код для Робота 2 */
        Robot2 robot2 = new Robot2("Robot2", 2);
        System.out.printf("%s %d\n", robot2.getName(), robot2.getLevel());

        robot2.powerOn();
        robot2.work();
        robot2.powerOf();

        /**Клиентский код для Робота 3 */
        Robot3 robot3 = new Robot3("Robot3");
        System.out.println("-----------------");
        System.out.println(robot3);
        
        robot3.power();
        robot3.work();
        robot3.power();
        robot3.work();
        robot3.power();

    }
    
}
