import java.util.Scanner;

public class ej5array {

   
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int flags [] = {0,1,0,-1,0,-1,-1,-1,0,0,-1};
        int tivic [] = {0,1,0,-1,0,-1,-1,-1,0,0,-1};
        for (int i = 0; i < flags.length; i++) {
            if (flags [i] < 0) {
                flags [i] = 8;
            }
            System.out.println(flags[i]);
        }
        
    }

}
