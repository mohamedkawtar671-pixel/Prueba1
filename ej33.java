import java.util.Scanner;

public class ej33 {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int sumaTotal=0;
        int suma36= 0;
        int suma10= 0;
        for(int i = 1; i < 6; i++) {
            System.out.println("Dame numero :");
            int num = teclado.nextInt();
            sumaTotal +=num;
            if(num>36){
                suma36 += num;
            }
            else if(num<10) {
                suma10+= num;
            }
        }
    }

}
