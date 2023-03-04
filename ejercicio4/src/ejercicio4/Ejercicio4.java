package ejercicio4;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        int edjuan, edalber, edana, edmama;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan");
        edjuan = input.nextInt();
        edalber = 2 * edjuan / 3;
        edana = 4 * edjuan / 3;
        edmama = edjuan + edalber + edana;
        
        System.out.println("Las edades son: Alberto = "+edalber+", Juan = "+edjuan+", Ana = "+edana+", Mamá = "+edmama);
    }
    
}
