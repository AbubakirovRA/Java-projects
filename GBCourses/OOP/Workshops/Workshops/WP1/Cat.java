public class Cat {
/*ПЕРЕМЕННЫЕ КЛАССА (ПОЛЯ)*/
    String name; //это переменные экземпляра(объекта) 
    int age;// или поля, у каждого экземпляра они будут свои.

    static int catsCount = 0;//статическая переменная класса, общая для класса Cat
    static int streetCats = 0;
/*МЕТОДЫ КЛАССА */
    public void sayMeow(){
        System.out.println(this.name + " Мяу!");
    }

    public void jump(){
        System.out.println(this.name + " Прыг-скок!");
    }

/*КОНСТРУКТОР КЛАССА (если не определен, то используется конструктор по умолчанию (без параметров)
 * если конструктор определен, дефолтный конструктор исчезает, при необходимости одновременного
 * наличия и конструктора с параметрами и пустого, пустой нужно создать специально (т.е. без параметров)
*/
    public Cat(String name, int age){ //Имя конструктора совпадает с именем класса
        catsCount ++;    //порядок присвоения переменных в теле должен совпадать с порядком следования в сигнатуре
        this.name = name; // this - дословно этот, указывает, что присвоение
        this.age = age;// производится для конкретно этого экземпляра, по сути this это переменная
    }                   // в которую в момент создания экземпляра подставляется сам экземпляр, т.е.
                         // при создании экземпляра barsik записи приобретут вид: barsik.name = name;, barsik.age = age;
    public Cat(){//пустой конструктор для создания безымянных котов
        streetCats ++;
        this.name = "Street cat №" + streetCats;
    }
}                      
