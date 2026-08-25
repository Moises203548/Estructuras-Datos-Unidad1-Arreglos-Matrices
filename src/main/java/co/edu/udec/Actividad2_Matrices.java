package co.edu.udec;

import java.sql.SQLOutput;

public class Actividad2_Matrices {
    public static void main(String[] args) {
        int[][] numeros = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        System.out.println("Matriz:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Recorrido por columnas:");
        for (int j = 0; j < numeros[0].length; j++) {
            for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Suma de Matriz:");
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                suma += numeros[i][j];
            }
        }
        System.out.println("Suma total de los elementos: " + suma);

        int[] filaTemporal = numeros[0];
        numeros[0] = numeros[numeros.length - 1];
        numeros[numeros.length - 1] = filaTemporal;

        System.out.println("Matriz despues de intercambiar primera y ultima fila:");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
