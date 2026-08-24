package co.edu.udec;

import java.util.Random;
public class Actividad1_Arreglos {
    public static void main(String[] args) {
    int[] arreglo = new int[10];
    Random random = new Random();
    for (int i = 0; i < arreglo.length; i++){
        arreglo[i] = random.nextInt(1000);
    }
    }
}
