package controlador;

import vista.Consola;

/**
 * Clase principal que inicia la aplicación.
 * 
 * Inicia la aplicación, y gestiona la partida después de cada ronda.
 * 
 * @author Claudia
 */

public class Main {
    public static void main(String[] args) {
        Consola consola = new Consola();
        Partida partida = new Partida();
        boolean jugando = true;
        
        consola.mostrar("\t=== BIENVENIDO AL JUEGO DEL IMPOSTOR ===\n");
        partida.registrarJugadores();
        while (jugando){
            partida.jugarRonda();
            String opcion= consola.pideString("\n¿Deseas jugar otra RONDA con los mismos jugadores? (s/n)");
            if (opcion.equalsIgnoreCase("n")){
                jugando=false;
            }
        }
        consola.mostrar("Fin del Juego. ¡Gracias por jugar!\n");
    }
    
}
