package OOP.Lectures.Lecture1.Part1;

public class Point2D {
    private int x, y; //если модификатор доступа не указан, то по умолчанию устанавливается доступ public

    public Point2D(int valueX, int valueY){
        x = valueX;
        y = valueY;
    }

    static double distance(Point2D a, Point2D b){
        return Math.sqrt(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2));
    }

/**
 * Реализация принципа DRY для одного аргумента
 * @param value - значение аргумента
 */
    public Point2D(int value){
        this(value, value);
    }

    /**
     * Реализация принципа DRY для поведения по умолчанию
     */
    public Point2D(){
        this(0);
    }

    /**
     * Реализация принципа DRY - dont repeat yourself
     * В данном случае уходим от повторения конструкции вида
     * x = ; y = ;
     */

    /**
     * Вариант конструктора по умолчанию
     */
    // public Point2D(){
    //     x = 0;
    //     y = 0;
    // }

    /**
     * Вариант конструктора с одним аргументом
     */
    // public Point2D(int value) {
    //     x = value;
    //     y = value;
    // }
    
    /**
     * Метод, предоставляющий доступ к чтению параметра X(геттер)
     * @return - значение координаты X
     */
    public int getX(){
        return x;
    }

    /**
     * Метод, предоставляющий доступ к записи параметра X(сеттер)
     * @param value - значение координаты X
     */
    public void setX(int value){
        this.x = value;
    }

    public int getY(){
        return y;
    }

    public void setY(int value){
        this.y = value;
    }

    /**
     * Метод форматирующий результат вывода по умолчанию (toString)
     * @return - возврат переопределения метода toString
     */
    private String getInfo(){
        return String.format("x: %d, y: %d", x, y);
    }

    /**
     * Переопределяем метод toString, функционалом из getInfo
     */
    @Override
    public String toString() {
        return getInfo();
    }

}
