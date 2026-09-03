package co.edu.udec;

import java.util.LinkedList;
import java.util.Queue;

public class Busqueda_Rutas_ejercicio15 {
    static int numeroFilas, numeroColumnas;
    static char[][] mapaLaberinto;
    public static void main(String[] args) {
        mapaLaberinto = new char[][]{
                {'S', '.', '#', '.', '.'},
                {'#', '.', '#', '.', '#'},
                {'.', '.', '.', '.', '.'},
                {'.', '#', '#', '#', '.'},
                {'.', '.', '.', '#', 'E'}
        };

        numeroFilas = mapaLaberinto.length;
        numeroColumnas = mapaLaberinto[0].length;

        int filaInicio = 0, columnaInicio = 0;
        int filaSalida = 4, columnaSalida = 4;

        boolean[][] celdaVisitada = new boolean[numeroFilas][numeroColumnas];

        int[][] filaOrigen = new int[numeroFilas][numeroColumnas];
        int[][] columnaOrigen = new int[numeroFilas][numeroColumnas];

        Queue<int[]> celdasPorExplorar = new LinkedList<>();
        celdasPorExplorar.add(new int[]{filaInicio, columnaInicio});
        celdaVisitada[filaInicio][columnaInicio] = true;

        int[] movimientoFila   = {-1,  1,  0,  0};
        int[] movimientoColumna = { 0,  0, -1,  1};

        boolean rutaEncontrada = false;
    }
}
