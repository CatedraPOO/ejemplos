package pack;

import java.text.DecimalFormat;

/* Nunca voy a querer instanciar Obra sino sus clases derivadas, por ende la clase es abstract  */
public abstract class Obra {
	/* 
	 * Personalmente, si quiero heredar de una clase, prefiero que sus atributos y metodos sean protected y no private 
	 * Algo private no se hereda, por ende requiere de que existan getter y setters
	 * Una clase que extiende de otra pero no hereda atributos por ser privados no esta realmente heredandolos aunque tenga getters y setters para ellos
	 * */
	protected String titulo;
	protected Integer duración;
	protected Double calificacion;
	
	/* Defino solo los constructores que vaya a utilizar. Si solo utilizo uno, defino solo ese */
	public Obra(String titulo, Integer duracion, Double calificacion) {
		// super(); Esta clase no extiende especificamente de una clase nuestra, no tiene sentido hacer uso de super
		this.titulo=titulo;
		this.duración = duracion;
		this.calificacion = calificacion;
	}
	
	public String toString() {
		DecimalFormat decimalFormat =  new DecimalFormat("0.00"); // para mostrar la calificación con solo dos decimales, vease la siguiente linea
		return this.titulo + " - Duración: " + this.duración + " minutos - Calificación: " + decimalFormat.format(this.calificacion); 
	}
	/* Siempre añadir getters y setter solo para aquellos atributos en los que se vaya a utilizar */
	public Double getCalificacion() {
		return this.calificacion;
	}
	
	public Integer getDuracion() {
		return this.duración;
	}
}
