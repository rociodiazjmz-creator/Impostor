package modelo;

import java.util.Random;

/**
 * Clase que contiene una lista variada de palabras y devuelve una aleatoria.
 * 
 * @author Rocio
 */
public class Diccionario {
    private String[] palabras = {"Aeropuerto", "Animal", "Apartamento", "Autobús",
        "Banco", "Bar", "Biblioteca", "Bosque", "Cafetería",
        "Camping", "Casa", "Cine", "Cocina", "Colegio",
        "Comisaría", "Discoteca", "Dormitorio", "Escuela",
        "Estación de tren", "Fábrica", "Farmacia", "Garaje",
        "Gimnasio", "Granja", "Hospital", "Hotel", "Jardín",
        "León", "Llavero", "Mercado", "Metro", "Museo", "Oficina",
        "Parque", "Piscina", "Playa", "Rey", "Restaurante", "Sala de espera",
        "Salón", "Supermercado", "Teatro", "Universidad", "Vestuario", "Zoológico"
    };
    
    /**
     * Método que devuelve una palabra aleatoria.
     * @return palabra aleatoria del atributo tipo array del diccionario
     */
    public String obtenerPalabraAleatoria() {
        return palabras[new Random().nextInt(palabras.length)];
    }

}
