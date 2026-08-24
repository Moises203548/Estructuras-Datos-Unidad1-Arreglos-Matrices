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
        System.out.println("---------------------------------------------------------------------------------------");

        System.out.println("Recorrido con for-each:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 != 0) {
                arreglo[i] = 0;
            }
        }
        System.out.println("Después de cambiar impares por cero:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println("---------------------------------------------------------------------------------------");

        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = arreglo[i] * i;
        }
        System.out.println("Después de multiplicar por índice:");
        for (int valor : arreglo) {
            System.out.print(valor + " ");
        }
        System.out.println("---------------------------------------------------------------------------------------");

        int buscado = arreglo[3];
        int posicion = busquedaLineal(arreglo, buscado);
        if (posicion != -1) {
            System.out.println("El valor " + buscado + " se encontró en la posición " + posicion);
        } else {
            System.out.println("El valor " + buscado + " no se encontró en el arreglo");
        }
    }

    public static int busquedaLineal(int[] arreglo, int valor) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == valor) {
                return i;
            }
        }
        return -1;
    }
}
