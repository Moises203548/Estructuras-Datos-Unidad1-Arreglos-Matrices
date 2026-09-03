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

        while (!celdasPorExplorar.isEmpty()) {
            int[] celdaActual = celdasPorExplorar.poll();
            int filaActual = celdaActual[0];
            int columnaActual = celdaActual[1];

            if (mapaLaberinto[filaActual][columnaActual] == 'E') {
                rutaEncontrada = true;
                break;
            }

            for (int direccion = 0; direccion < 4; direccion++) {
                int filaVecina = filaActual + movimientoFila[direccion];
                int columnaVecina = columnaActual + movimientoColumna[direccion];

                boolean estaDentroDelMapa = filaVecina >= 0 && filaVecina < numeroFilas && columnaVecina >= 0 && columnaVecina < numeroColumnas;

                boolean esCeldaValida = estaDentroDelMapa && !celdaVisitada[filaVecina][columnaVecina] && mapaLaberinto[filaVecina][columnaVecina] != '#';

                if (esCeldaValida) {
                    celdaVisitada[filaVecina][columnaVecina] = true;
                    filaOrigen[filaVecina][columnaVecina] = filaActual;
                    columnaOrigen[filaVecina][columnaVecina] = columnaActual;
                    celdasPorExplorar.add(new int[]{filaVecina, columnaVecina});
                }
            }
        }
    }
}
