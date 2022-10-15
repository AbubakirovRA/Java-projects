public class foo {
    public static int numDigits(int num){
        int count = 0;
        while(Math.abs(num) > 0){
            num /= 10;
            count +=1;
        }
        return count;
    }
}
