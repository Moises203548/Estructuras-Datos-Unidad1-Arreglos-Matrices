package co.edu.udec;

import java.util.Random;
public class Actividad1_Arreglos {
    public static void main(String[] args) {
    int[] arreglo = new int[10];
    Random random = new Random();
    for (int i = 0; i < arreglo.length; i++){
        arreglo[i] = random.nextInt(1000);
    }
    System.out.println("Recorrido con for clásico:");
    for (int i = 0; i < arreglo.length; i++) {
        System.out.print(arreglo[i] + " ");
        }
        System.out.println(---------------------------------------------------------------------------------------);

        System.out.println("Recorrido con for-each:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println(---------------------------------------------------------------------------------------);
    }
}
