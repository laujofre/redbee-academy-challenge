package com.company;
import java.util.Scanner;
/*** EL programa recibe dos números enteros y los suma, imprimiendo en
 * pantalla el resultado **/

public class Main {
    public static void main(String[] args) {
        int a, b, sum; //Define las variables

        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa le pedirá dos números enteros y le devolverá la suma de ellos.");

        System.out.print("Intrduce el primer número: ");
        a = teclado.nextInt(); //Almacena el primer número

        System.out.print("Intrduce el segundo número: ");
        b = teclado.nextInt(); //Almacena el segundo número

        sum = a + b; //Realiza la operación
        System.out.println("La suma de " + a + " y " + b + " es: " + sum ); //Imprime el resultado

        System.out.println("Gracias por usar este programa");
    }
}


