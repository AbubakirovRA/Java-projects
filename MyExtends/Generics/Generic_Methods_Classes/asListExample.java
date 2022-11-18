package Generic_Methods_Classes;
import java.util.Arrays;
import java.util.List;

public class asListExample {
    public static void main(String[] args) {
        String array[] = {"Apple", "Mango", "Pepper", "Grape"};
        List<String> list = convertArrayToList(array);

        Integer array1[] = {123, 2342, 434, 898};
        List<Integer> list1 = convertArrayToList(array1);
        System.out.println(list1);
        System.out.println(list);
    }

    private static <T> List<T> convertArrayToList(T array[]) { //параметризованный (дженерик) метод
        List<T> list = Arrays.asList(array);
        return list;
    }
}