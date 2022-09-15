// // package Кубики.Массивы;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.util.Arrays;

// public class ArraysJava {
//     public static void main(String[] args) throws IOException {
//         System.out.println("Enter 10 string into Array");

//         /**
//          * Метод создания массива из строк, введеных с клавиатуры
//          */
//         BufferedReader readerString = new BufferedReader(new InputStreamReader(System.in));
//         String[] listString = new String[10];

//         for (int i = 0; i < listString.length; i++) {
//             listString[i] = readerString.readLine();
//         }

//         /**
//          * Метод создания массива из десяти чисел, введеных с клавиатуры
//          */
//         BufferedReader readerInt = new BufferedReader(new InputStreamReader(System.in));
//         int[] listInt = new int[10];

//         for (int i = 0; i < listInt.length; i++) {
//             String s = readerInt.readLine();
//             listInt[i] = Integer.parseInt(s);
//         }

//         /** Методы печати массива */

//         System.out.println("Имеем массив:");

//         System.out.print("{");

//         /** Цикл с итератором */
//         for (int value : listInt) {
//             System.out.print(value + ", ");
//         }

//         /** Обычный цикл */
//         // for (int i = 0; i < listInt.length; i++) {
//         // System.out.printf("%s ", listInt[i]);
//         // }
//         System.out.print("}");

//         /**
//          * Встроенный метод
//          * позволяет напечатать в строку массив
//          */
//         System.out.println(Arrays.toString(listInt));

//         // Заполнение массива из 10 чисел, числами от 1 до 10:
//         int[] numbers = new int[10];
//         for (int i = 0; i < numbers.length; i++) {
//             numbers[i] = i + 1;
//         }

//         // Заполнение массива из 10 чисел, числами от 10 до 1:
//         int[] numbers1 = new int[10];
//         for (int i = 0; i < numbers1.length; i++) {
//             numbers1[i] = 10 - i;
//         }

//         // Заполнение массива из 10 чисел, числами от 0 до 9:
//         int[] numbers2 = new int[10];
//         for (int i = 0; i < numbers2.length; i++) {
//             numbers2[i] = i;
//         }

//         // Заполнение массива из 10 чисел, числами от 9 до 0:
//         int[] numbers3 = new int[10];
//         for (int i = 0; i < numbers3.length; i++) {
//             numbers3[i] = 9 - i;
//         }

//         // Пример 2.
//         // Ввод 10 строк с клавиатуры
//         BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//         String[] list = new String[10];
//         for (int i = 0; i < list.length; i++) {
//             list[i] = reader.readLine();
//         }

//         // Ввод 10 чисел с клавиатуры
//         BufferedReader reader2 = new BufferedReader(new InputStreamReader(System.in));
//         int[] list2 = new int[10];

//         for (int i = 0; i < list2.length; i++) {
//             String s = reader2.readLine();
//             list2[i] = Integer.parseInt(s);
//         }

//         // Пример 3.
//         // Вывод массива на экран

//         int[] list3 = new int[10];

//         // заполнение массива
//         for (int i = 0; i < list3.length; i++) {
//             list3[i] = i;
//         }

//         // вывод на экран
//         for (int i = 0; i < list3.length; i++) {
//             System.out.println(list3[i]);
//         }

//         // Пример 4.
//         // Быстрая (статическая) инициализация. Сумма элементов массива:

//         // это статическая инициализация
//         int[] list4 = { 5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0 };

//         // подсчёт суммы элементов
//         int sum = 0;
//         for (int i = 0; i < list4.length; i++) {
//             sum += list4[i];
//         }
//         System.out.println("Sum is " + sum);

//         // Пример 5.
//         // Поиск минимального элемента в массиве:
//         int[] list5 = { 5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0 };

//         int min = list5[0];
//         for (int i = 1; i < list5.length; i++) {
//             if (list5[i] < min) {
//                 min = list5[i];
//             }
//         }
//         System.out.println("Min is " + min);

//     }
// }
