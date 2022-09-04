package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("POO music");
		// Usamos una clase GeneradorRandom que se encarga de esa tarea, podria hacerse sin ella
		ArrayList <Cancion> canciones = HelperDatosDePrueba.generarCanciones(5);
		ArrayList <CapituloPodcast> capitulos = HelperDatosDePrueba.generarCapitulos(5);
		ArrayList <Audiolibro> audiolibros = HelperDatosDePrueba.generarAudiolibros(5);
		
		ArrayList<Sonido> sonidos  = HelperDatosDePrueba.unificarListas(canciones, capitulos, audiolibros);
		
		/* Este ejemplo muestra una solución donde un solo metodo sabe imprimir cada ranking*/
		
		/* POLIMORFISMO
		 * 4 Rankings que llaman al mismo con colecciones que tiene instancias de clases diferentes
		 */
		HelperDatosDePrueba.imprimirRanking("CANCIONES", canciones);
		HelperDatosDePrueba.imprimirRanking("CAPITULOS", capitulos);
		HelperDatosDePrueba.imprimirRanking("AUDIOLIBROS", audiolibros);
		HelperDatosDePrueba.imprimirRanking("GENERAL", sonidos);
		
		
		/* Sin embargo, tambien es valido armar cada ranking por separado */
		/* Lo siguiente hace eso 
		System.out.println("### TOP 3 CANCIONES ###");
		for(int i=0; i<3 ; i++) {
			System.out.println(canciones.get(i).getTitulo() + " " + canciones.get(i).getCantidadReproducciones());
		}
		//Ranking tres capitulos mas escuchadas
		System.out.println("### TOP 3 CAPITULOS ###");
		for(int i=0; i<3 ; i++) {
			System.out.println(capitulos.get(i).getTitulo() + " " + capitulos.get(i).getCantidadReproducciones());
		}
		// Ranking tres audiolibros mas escuchadas
		System.out.println("### TOP 3 AUDIOLIBROS ###");
		for(int i=0; i<3 ; i++) {
			System.out.println(audiolibros.get(i).getTitulo() + " " + audiolibros.get(i).getCantidadReproducciones());
		}
		//Ranking tres sonidos mas escuchados}
		System.out.println("### TOP 3 GENERAL ###");
		for(int i=0; i<3 ; i++) {
			System.out.println(sonidos.get(i).getTitulo() + " " + sonidos.get(i).getCantidadReproducciones());
		}*/
		
		
		
		
		
	}
	
	
}
