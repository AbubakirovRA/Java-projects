/**
 * task2
 */
public class task2 {
    public static void main(String[] args) {
        generate(1, 7, 1, 3, "");
    }
    
    public static void generate(int source, int target, int c, int d, String path) {
        if (source>target) return;
        if (source == target){
            System.out.println(path);
            return; 
        }
        generate(source + c, target, c, d, path + "k1 ");
        generate(source * d, target, c, d, path + "k2 ");
    }
}