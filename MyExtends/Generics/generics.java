import java.util.ArrayList;
import java.util.List;

/**
 * generics
 */
public class generics {

    public static void main(String[] args) {
        List animals = new ArrayList(); /*до Java 5 коллекции объявлялись без указания типа содержимого
                                        поэтому любое помещаемое в них содержимое по умолчанию имело 
                                        базовый тип - Object, благодаря этому в коллекцию можно было
                                        поместить и строку и число и вообще, все что угодно*/
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String)animals.get(1); /* по этой причине, было необходимо делать приведение типов,
                                                    каждый раз, когда необходимо было получить объект из коллекции
                                                    что не очень удобно и вызывало путаницу*/

                                                    
        /* По указанной причине начиная с Java 5 появились так называемые дженерики, или параметризация класса
        * то есть механизм, позволяющий при созданиии коллекции задать определенный тип
        * данных, который она содержит. Что позволяло в дальнейшем не отслеживать что в нее попадает
        * и что из нее извлекается: 
        */
        List<String> animals2 = new ArrayList<String>();

        animals2.add("cat");
        animals2.add("dog");
        animals2.add("frog");

        String animal2 = animals2.get(1); /*как видно, при параметризации класса, извлечение 
                                                значения происходит без требования приведения типа*/
//////////////// начиная с Java 7 <Тип> в правой части не указываются при параметризации класса://///////////
        
        List<String> animals3 = new ArrayList<>();//но diamond-нотация, т.е. <> - обязательна к указанию! 
                                                  //(см. пример HelloWorld)

    }
}