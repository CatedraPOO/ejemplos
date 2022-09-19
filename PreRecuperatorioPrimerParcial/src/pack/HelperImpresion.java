package pack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

/* Una clase de ayuda como esta no requiere ser instanciada, basta con definir sus metodos como static
 * Por favor, si crean una clase de apoyo, no creen instancias de ellas solo para hacer uso de algun metodo
 * Definan el metodo como static
 * Y usenlo como se muestra en la clase Main
 *  */
public class HelperImpresion {

	public static void imprimirCaso1(Serie serie) {
		System.out.println("CASO 1\n");
		System.out.println(serie.toString());
		for(Temporada temporada : serie.getTemporadas()) {
			System.out.println(temporada.toString());
			for(Episodio episodio : temporada.getEpisodios()) {
				System.out.println(episodio.toString());
			}
		}
	}
	
	public static void imprimirCaso2(ArrayList<Pelicula> peliculas) {
		System.out.println("\n\nCASO 2\n");
		// ordenamos el array de peliculas por calificacion
		peliculas.sort(Comparator.comparing(x -> x.getCalificacion()));
		// eso deja ordenado de menor a mayor, procedemos a invertir el array list
		Collections.reverse(peliculas);
		
		/* con el listado ya ordenado de mayor a menor por calificación, imprimimos */
		for(Pelicula pelicula : peliculas) {
			System.out.println(pelicula.toString());
		}

	}
	
	public static void imprimirCaso3(Serie serie, ArrayList<Pelicula> peliculas) {
		System.out.println("\n\nCASO 3\n");
		// definimos un array de obras para unificar todas las peliculas y eposidios en una sola lista
		ArrayList<Obra> obras = new ArrayList<>(); 
		// añadimos un get especial a series para obtener todos los episodios de sus temporadas
		obras.addAll(serie.getTodosEpisodios());
		obras.addAll(peliculas);

		
		// ordenamos el array por calificación
		obras.sort(Comparator.comparing(x -> x.getCalificacion()));
		// eso deja ordenado de menor a mayor, procedemos a invertir el array list
		Collections.reverse(obras);

		/* con el listado ya ordenado de mayor a menor por calificación, imprimimos */
		for(int i=0; i<5; i++) {
			System.out.println(obras.get(i).toString());
		}
		
	}
	
	
	public static void imprimirCaso4(Serie serie, ArrayList<Pelicula> peliculas) {
		System.out.println("\n\nCASO 4\n");
		// definimos un array de obras para unificar todas las peliculas y eposidios en una sola lista
		ArrayList<Obra> obras = new ArrayList<>(); 
		// añadimos un get especial a series para obtener todos los episodios de sus temporadas
		obras.addAll(serie.getTodosEpisodios());
		obras.addAll(peliculas);

		
		// ordenamos el array por duración
		obras.sort(Comparator.comparing(x -> x.getDuracion()));
		// eso deja ordenado de menor a mayor, procedemos a invertir el array list
		Collections.reverse(obras);

		/* con el listado ya ordenado de mayor a menor por duración, imprimimos */
		for(int i=0; i<5; i++) {
			System.out.println(obras.get(i).toString());
		}
		
	}
}
