import java.util.Scanner;

public class array {

   
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int valor = 0;        
                
    System.out.println("Dame un numero que sea mayor que 0: ");
    int num = teclado.nextint();
    
    while (num <= 0) {
        System.out.println("ERROR. Dame un numero mayor que 0: ");
        num = teclado.nextInt();
    }
    int lista [] = new int [num];
    for (int i = 0; i < num; i++){
        System.out.println("Dame un valor " + i);
        valor = teclado.nextInt();
        lista[i] = valor;
    }
      for (int i = 0; i < lista.lenght; i++){
        System.out.println(lista[i]);
    
        
    }
    
    
                
    }

}
