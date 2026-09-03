package co.edu.udec;

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

    }
}
