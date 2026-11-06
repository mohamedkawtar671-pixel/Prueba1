
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;



public class adivinaNumero {

   
    public static void main(String[] args) {
        //piensa numero aleatorio
        int pensamiento = (int)(Math.random()*100+1);
        
        //pedimos jugada al usuario
        System.out.print("Adivina el numero entre 1 y 100: ");
        int jugada = teclado.nextInt();
        
        //Mientraa no adivine sigue el juego
        while (jugada != pensamiento){
            if (jugada > pensamiento){
                System.out.println("Te has pasado!!");
            }
            else if (jugada < pensamiento){     
                System.out.println("Te has quedado corto!!");
            }
                System.out.println("Vuelve a intentarlo...:");
                jugada = teclado.nextInt();
            }   
            System.out.println("Lo lograste!");
        }
    }


