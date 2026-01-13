package modelo;

import java.util.Random;

/**
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

    public String obtenerPalabraAleatoria() {
        return palabras[new Random().nextInt(palabras.length)];
    }

}
