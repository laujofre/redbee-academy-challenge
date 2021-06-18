package com.company;
import java.util.Scanner;
/*** EL programa recibe tres números enteros, los compara e imprime en
 * pantalla el mayor de ellos **/

public class Main {
    public static void main(String[] args) {
        int a, b, c; //Define las variables

        Scanner teclado = new Scanner(System.in);

        System.out.println("Este programa le pedirá tres números enteros, y le dirá cuál es el mayor.");

        System.out.print("Intrduce el primer número: ");
        a = teclado.nextInt(); //Almacena el primer número

        System.out.print("Intrduce el segundo número: ");
        b = teclado.nextInt(); //Almacena el segundo número

        System.out.print("Intrduce el tercer número: ");
        c = teclado.nextInt(); //Almacena el tercer número

        if (a > b) {
            if (a > c) {
                System.out.println("El mayor de " + a + ", " + b + " y " + c + " es: " + a); //Imprime el resultado
            } else {
                System.out.println("El mayor de " + a + ", " + b + " y " + c + " es: " + c); //Imprime el resultado
            }
        }
        else if (b > c){
            System.out.println("El mayor de " + a + ", " + b + " y " + c + " es: " + b); //Imprime el resultado
        }
        else{
            System.out.println("El mayor de " + a + ", " + b + " y " + c + " es: " + c); //Imprime el resultado
        }
        System.out.println("Gracias por usar este programa");
    }
}
