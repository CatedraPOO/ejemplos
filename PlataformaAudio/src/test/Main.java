package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("POO music");
		
		ArrayList<Sonido> canciones = HelperDatos.generarCanciones(5);
		ArrayList<Sonido> capitulos = HelperDatos.generarCapitulos(5);
		ArrayList<Sonido> audiolibros = HelperDatos.generarAudiolibros(5);
		ArrayList<Sonido> sonidos = HelperDatos.unificarListas(canciones,  capitulos, audiolibros);
		
		HelperDatos.imprimirRanking("Canciones", canciones);
		HelperDatos.imprimirRanking("Capitulos", capitulos);
		HelperDatos.imprimirRanking("Audiolibros", audiolibros);
		HelperDatos.imprimirRanking("General", sonidos);
	
		
	
		
		//System.out.println("");
		//System.out.println("VERSION 1");
		// Usamos una clase GeneradorRandom que se encarga de esa tarea, podria hacerse sin ella
		//ArrayList <Cancion> canciones = HelperDatosDePrueba.generarCanciones(5);
		//ArrayList <CapituloPodcast> capitulos = HelperDatosDePrueba.generarCapitulos(5);
		//ArrayList <Audiolibro> audiolibros = HelperDatosDePrueba.generarAudiolibros(5);
		
		//ArrayList<Sonido> sonidos  = HelperDatosDePrueba.unificarListas(canciones, capitulos, audiolibros);
		
		/* Este ejemplo muestra una solución donde un solo metodo sabe imprimir cada ranking*/
		
		/* POLIMORFISMO
		 * 4 Rankings que llaman al mismo con colecciones que tiene instancias de clases diferentes
		 */
		
		//HelperDatosDePrueba.imprimirSonido(capitulos.get(0));
		//HelperDatosDePrueba.imprimirRanking("CANCIONES", canciones);
		//HelperDatosDePrueba.imprimirRanking("CAPITULOS", capitulos);
		//HelperDatosDePrueba.imprimirRanking("AUDIOLIBROS", audiolibros);
		//HelperDatosDePrueba.imprimirRanking("GENERAL", sonidos);
		
		/* POLIMORFISO V2 */
		/*System.out.println("");
		System.out.println("VERSION 2");
		ListaSonidos listaCanciones = HelperDatosDePruebaV2.generarCanciones(5);
		ListaSonidos listaCapitulos = HelperDatosDePruebaV2.generarCapitulos(5);
		ListaSonidos listaAudiolibros = HelperDatosDePruebaV2.generarAudiolibros(5);
		ArrayList<Sonido> listaSonidos  = HelperDatosDePruebaV2.unificarListas(listaCanciones, listaCapitulos, listaAudiolibros);
	
		HelperDatosDePruebaV2.imprimirRanking("CANCIONES", listaCanciones);
		HelperDatosDePruebaV2.imprimirRanking("CAPITULOS", listaCapitulos);
		HelperDatosDePruebaV2.imprimirRanking("AUDIOLIBROS", listaAudiolibros);
		HelperDatosDePruebaV2.imprimirRanking("GENERAL", listaSonidos);
		*/
		
		/* Tambien es valido armar cada ranking por separado */
		/* Lo siguiente hace eso*/
		/*System.out.println("");
		System.out.println("VERSION 3");
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

