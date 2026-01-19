package controlador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import modelo.Diccionario;
import modelo.Jugador;
import vista.Consola;

/**
 * Esta clase gestiona el funcionamiento de una partida al juego del Impostor.
 * 
 * @author Fernando
 */

public class Partida {
    private ArrayList<Jugador> jugadores = new ArrayList<>();
    private Consola consola = new Consola();
    private Diccionario dict = new Diccionario();
    private Scanner teclado  = new Scanner(System.in);

    /**
     * Método que registra a los jugadores y los añade al ArrayList de jugadores
     * No se podrá jugar con menos de 3 jugadores.
     */
    
    public void registrarJugadores() {
        int cantidad = 1;
        do{
            cantidad = consola.pideInt("¿Cuántos jugadores sois? Introduzca un número: ");
        } while (cantidad <= 2);
        
        for (int i = 0; i < cantidad; i++) {
            String nombre = consola.pideString("Nombre del jugador " + (i + 1));
            jugadores.add(new Jugador(nombre));
        }
    }
    
    /**
     * Método que gestiona una ronda del juego: 
     *  - Repartimos los roles de los jugadores:
     *      - Se 'barajea' el ArrayList y el primer jugador será el arbitro, y luego se deciden los impostores
     *  - Obtenemos la palabra de la ronda. 
     */
    public void jugarRonda() { 
        String palabraSecreta = dict.obtenerPalabraAleatoria();
        int nImpostores = consola.pideInt("¿Cuántos impostores habrá? Introduzca un número: ");
        Collections.shuffle(jugadores); 
        jugadores.get(0).setRol("ARBITRO");
        for (int i = 1; i <= nImpostores; i++) {
            jugadores.get(i).setRol("IMPOSTOR");
        }
        consola.mostrarResultados(jugadores, palabraSecreta);
    }  
    
    
}