package com.company;
import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int matriz [][],nFilas, nColum;

        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de filas"));
        nColum = Integer.parseInt(JOptionPane.showInputDialog("Ingrese número de columnas"));

        matriz = new int[nFilas] [nColum];

        System.out.println("Digite la matriz");
        for(int i=0; i<nFilas; i++){
            for(int j=0; j<nColum; j++){
                System.out.print("Primera Matriz [" + i +"][" + j + "]:");
                matriz[i][j] = entrada.nextInt();
            }
        }

        System.out.println("\nLa matriz es: ");
        for (int i=0; i<nFilas; i++){
            for(int j=0; j<nColum; j++){
                System.out.print(matriz [i][j] + " ");
            }
            System.out.println("");
        }
    }
}
