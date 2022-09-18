package pack;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class SimuladorDatos {
	//creo una sola instancia de random y la reutilizo, no tiene sentido crear una instancia nueva para cada dato random a generar
	// al ser privada solo la uso dentro de esta clase
	// la clase Main tiene necesidad de un random y crea su propia instancia
	private static Random rand =  new Random();
	
	
	/* para el caso de paises para peliculas vamos a usar un random de una lista precargada
	 * Notese la forma de definir los valores por defecto del array list en la misma inicialización
	 * usando Arrays.asList()
	 *  */
	private static ArrayList<String> paises = new ArrayList<>(Arrays.asList("Argentina", "Chile", "Paraguay") )  ;

	
	
	/* Recibo el titulo porque necesito saber que no esta repetido, 
	 * y eso lo sabe quien esté "demandando" la creación de peliculas. 
	 * Es decir, otro metodo que hace uso de este 
	 * Como el resto de los datos esta permitido que sea random no hay necesidad de que este metodo los reciba
	 * */
	public static Pelicula generarPelicula(String titulo){
		Integer duracion = rand.nextInt(300)+1; 
		Double calificacion = rand.nextDouble(0, 10); // ¿Puede esto generar calificación 10 o el maximo es 9,99?
		Double recaudacion = rand.nextDouble(100000, 999000000); // 100mil pesos a 999 millones
		String pais = paises.get(rand.nextInt(paises.size())); // un pais random de la lista precargada
		Pelicula pelicula = new Pelicula(titulo, duracion, calificacion, recaudacion, pais);
		// a fines de que se entienda se hace el return aqui, cuando pelicula ya existe
		return pelicula; 
		// Sin embargo hubiese sido mejor resolver en una sola linea asi:
		// return new Pelicula(titulo, duracion, calificacion, recaudacion, pais);
	}
	
	
	/* Recibo el titulo porque necesito saber que no esta repetido, 
	 * y eso lo sabe quien esté "demandando" la creación de episodios 
	 * Es decir, otro metodo que hace uso de este 
	 * Como el resto de los datos esta permitido que sea random no hay necesidad de que este metodo los reciba
	 * */
	private static Episodio generarEpisodio(String titulo) {
		Integer duracion = rand.nextInt(300)+1; 
		Double calificacion = rand.nextDouble(0, 10); // ¿Puede esto generar calificación 10 o el maximo es 9,99?
		Double recaudacion = rand.nextDouble(100000, 999000000); // 100mil pesos a 999 millones
		String pais = paises.get(rand.nextInt(paises.size())); // un pais random de la lista precargada
		// tiene sentido que un episodio posterior a otro tenga fecha igual o mayor a ese
		// para no desarrollar esa logica vamos a usar siempre la misma fecha pero quedan invitados a resolver el algoritmo par tal simulación
		LocalDate fechaEmision =  LocalDate.of(2022, 1, 1);
		return new Episodio(titulo, duracion, calificacion, fechaEmision);
	}
	
	private static Temporada generarTemporada(Integer numero, Integer cantidadCapitulosTemporada) {
		Temporada temporada =  new Temporada(numero);
		for(int i=1; i<=cantidadCapitulosTemporada; i++) {
			temporada.añadirEpisodio(generarEpisodio("T" + numero + "E" + i)); // generara algo como T1E1, T1E2,,, T2E1, T2E2, etc
		}
		return temporada;
	}
	
	
	public static Serie generarSerie(String titulo, Integer cantidadTemporadas, Integer cantidadCapitulosTemporada) {
		Serie serie = new Serie(titulo);
		
		for(int i=0; i<cantidadTemporadas; i++) {
			serie.añadirTemporada(generarTemporada(i+1, cantidadCapitulosTemporada));
		}
		return serie;		
	}

	
	public static ArrayList<Pelicula> generarPeliculas(Integer cantidad){
		ArrayList<Pelicula> peliculas =  new ArrayList<>();
		for(int i=0; i<cantidad; i++) {
			peliculas.add(generarPelicula("Pelicula " + (i+1)));
		}
		return peliculas;
	}
	
	
}
