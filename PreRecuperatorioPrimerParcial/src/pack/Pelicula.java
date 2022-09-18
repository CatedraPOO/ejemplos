package pack;

import java.text.DecimalFormat;

public class Pelicula extends Obra{
	/* Esta clase no se va a extender, por ende sus atributos serán private */
	private Double recaudacion;
	private String pais; 
	
	/* Defino solo los constructores que vaya a utilizar. Si solo utilizo uno, defino solo ese */
	public Pelicula(String titulo, Integer duracion, Double calificacion, Double recaudacion, String pais) {
		super(titulo, duracion, calificacion); // Esta clase extiende especificamente de una clase nuestra, tiene sentido hacer uso de super
		this.recaudacion = recaudacion;
		this.pais = pais;
	}
	
	public String toString() {
		DecimalFormat decimalFormat =  new DecimalFormat("0,000.00"); // para mostrar la recaudación con solo dos decimales y separador de miles, vease la siguiente linea
		return super.toString() + " - Recaudación: $" + decimalFormat.format(this.recaudacion)   + " - País: " + this.pais; 
	}
	
	/* Siempre añadir getters y setter solo para aquellos atributos en los que se vaya a utilizar */
	
}
