package pack;

import java.util.ArrayList;
import java.util.Random;

/* Es una buena práctica que el método inicial, 
 * en este caso main, contenga la menor cantidad de lógica posible.
 * Facilita la lectura y el entendimiento del código
 * Separar código en metodos que hagan cosas claras y limitadas 
 * ayuda tmabien a quien está desarrollando
 * Un método deberia de tener una sola responsabilidad
 * 
 * Si necesitamos datos de prueba para analizar el correcto funcionamiento de nuestro diseño
 * O, si necesitamos hacerlo para cumplir con el enuniado de un ejercicio
 * Lo ideal es que esos datos no se auto generen dentro de las clases
 * Podemos crear una clase auxiliar cuya unica responsabilidad sea la de simular datos para nuestra prueba
 *
 *
 *
 * ¿Qué deberia de hacer el main entonces? 
 * Es nuestr método de inicio del programa. Deberia limitarse a las operaciones basicas
 * de instanciacion y llamado de metodos que permita la ejecución en orden de lo que queremos hacer
 * Todo lo que pueda delegar, lo delega. Pero, tampoco es necesario llegra a un extremo
 * No esta mal tener 10 lineas de código.
*/


public class Main { // Clases comienzan con nombre en mayúscula

	// métodos con estilo camelCase. 
	// Las palabras se unen pero cada una, excepto la primera, comienza con mayúscula
	// Ejemplo: miPrimerMetodo()
	public static void main(String[] args) {
		// TODO Auto-generated method stub <--- Remover comentarios autogenerados cuando no aportan nada
		
		
		/******** CASO 1 ********/
		Serie serie =  SimuladorDatos.generarSerie("Titulo serie", 2, 10);
		HelperImpresion.imprimirCaso1(serie);
		
		/******** CASO 2 ********/
		Random rand =  new Random();
		ArrayList<Pelicula> peliculas = SimuladorDatos.generarPeliculas(rand.nextInt(3, 6));
		HelperImpresion.imprimirCaso2(peliculas);
		
		/******** CASO 3 ********/
		HelperImpresion.imprimirCaso3(serie, peliculas);
		
		/******** CASO 4 ********/
		HelperImpresion.imprimirCaso4(serie, peliculas);
		
		
		/* Notese en los casos 3 y 4, que para los episodios no podemos saber a cual serie pertenecen
		 * Esto es por diseño y para no mezclar conceptos. Si esto funcionara con una base de datos
		 * seguramente tendriamos un relacion 1 a muchos entre episodio y temporada
		 * por ende, el episodio tendria un atributo temporada
		 * y dicha temporada podria tener un atributo serie
		 * sin embargo, al mismo tiempo, las series tienen temporadas(varias) y las temporadas tienen episodios(varios)
		 * Implementar ambas situaciones en este caso hubiese terminado por resultar confuso
		 * 
		 * 
		 * Si cada episodio tuviera la temporada a la que pertenece y la serie a la que pertenece
		 * armar el listado de temporadas a la inversa podria ser
		 * recorriendo cada capitulo y por cada temporada nueva que se encuentra crear una instancia
		 * si el capitulo pertenece a una temporada que ya "descubrimos" no hacemos nada
		 * Sin embargo, luego tendriamos que obtener la serie a partir de las temporadas que tenemos y vamos recorriendo y eso
		 * al no tener una base de datos de la cual traer esos datos no es posible
		 * 
		 *  */
		
	}

}
