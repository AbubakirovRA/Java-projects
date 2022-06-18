/* возведение в степень рекурсивным методом
https://learn.javascript.ru/recursion
 */
public class recurs_pow {
    public static void main(String[] args) {
        int x = 2, n = 5;
        System.out.println(pow(x, n));
    }

    public static int pow(int x, int n) {
        // return (n == 1) ? x : (x * pow(x, n - 1)); // то же через тернарные операторы
        if (n == 1)
            return x;
        return x * pow(x, n - 1);
    }
}
