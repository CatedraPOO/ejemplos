package pack;

import java.time.LocalDate;

public class Episodio extends Obra{
	/* Esta clase no se va a extender, por ende sus atributos serán private */
	private LocalDate fechaEmision; 
	
	/* Defino solo los constructores que vaya a utilizar. Si solo utilizo uno, defino solo ese */
	public Episodio(String titulo, Integer duracion, Double calificacion, LocalDate fechaEmision) {
		super(titulo, duracion, calificacion); // Esta clase extiende especificamente de una clase nuestra, tiene sentido hacer uso de super
		this.fechaEmision = fechaEmision;
	}
	
	public String toString() {
		return super.toString() + " - Emisión: " + this.fechaEmision; 
	}
	
	/* Siempre añadir getters y setter solo para aquellos atributos en los que se vaya a utilizar */
	
}
