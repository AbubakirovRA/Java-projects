import java.util.*;
public class HelloWorld{
	public static void main(String []args) {
		List<String> list = Arrays.asList("Hello", "World");
		List<Integer> data = new ArrayList<>(list);//Без нотации diamond т.е. - <>, 
                                                    //компилятор разрешает положить в Integer список строк
                                                    //т.е. пропускает т.н. Raw-тип (сырой тип), что приводит 
                                                    //к ошибке исполнения, (если убрать <> - 
                                                    //ошибка исчезнет и компилятор скомпилирует данный код)
                                                    // чтобы этого не происходило всегда нужно
                                                    //использовать diamond нотацию, т.е. при параметризации типа
                                                    //в правой части необходимо всегда указывать <>
		Integer intNumber = data.get(0);
		System.out.println(data);
	}
}