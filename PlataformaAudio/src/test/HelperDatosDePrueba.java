package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class HelperDatosDePrueba {
	
	
	
	public static ArrayList<Sonido> unificarListas(ArrayList<Cancion> canciones, ArrayList<CapituloPodcast> capitulos, ArrayList<Audiolibro> audiolibros){
		// unificamos las tres listas en una sola de Sonidos
		ArrayList<Sonido> sonidos = new ArrayList<Sonido>();
		sonidos.addAll(canciones);
		sonidos.addAll(audiolibros);
		sonidos.addAll(capitulos);

		sonidos.sort(Comparator.comparing(x -> x.getCantidadReproducciones()));
		Collections.reverse(sonidos);
		return sonidos;
	}
	
	public static ArrayList<Cancion> generarCanciones(Integer cantidad){
		ArrayList <Cancion> canciones = new ArrayList<Cancion>();
		for(int i=1; i<= cantidad; i++) {
			canciones.add( new Cancion(
					"Cancion " + i,
					400,
					new Random().nextInt(1000),
					"Album " + i,
					"letra cancion " + i,
					2000
					));
		}

		canciones.sort(Comparator.comparing(x -> x.getCantidadReproducciones()));
		Collections.reverse(canciones);
		
		return canciones;
	}
	public static ArrayList<CapituloPodcast> generarCapitulos(Integer cantidad){
		ArrayList <CapituloPodcast> capitulos = new ArrayList<CapituloPodcast>();
		for(int i=1; i<= cantidad; i++) {
			capitulos.add( new CapituloPodcast(
					"Capitulo podcast " + i,
					400,
					new Random().nextInt(1000),
					"http://poo"
					));
		}

		capitulos.sort(Comparator.comparing(x -> x.getCantidadReproducciones()));
		Collections.reverse(capitulos);
		
		return capitulos;
	}
	public static ArrayList<Audiolibro> generarAudiolibros(Integer cantidad){
		ArrayList <Audiolibro> audiolibros = new ArrayList<Audiolibro>();
		for(int i=1; i<= cantidad; i++) {
			audiolibros.add( new Audiolibro(
					"Audiolibro " + i,
					400,
					new Random().nextInt(1000),
					"Español"
					));
		}
		audiolibros.sort(Comparator.comparing(x -> x.getCantidadReproducciones()));
		Collections.reverse(audiolibros);
		
		return audiolibros;
	}
	
	public static void imprimirRanking(String titulo, ArrayList<? extends Sonido> sonidos) {
		System.out.println("### TOP 3 "+ titulo +" ###");
		for(int i=0; i<3 ; i++) {
			System.out.println(sonidos.get(i).getTitulo() + " " + sonidos.get(i).getCantidadReproducciones());
		}
	}
	
}
