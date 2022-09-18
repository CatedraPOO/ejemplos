package pack;

import java.time.LocalDate;
import java.util.ArrayList;

public class Serie{
	private String titulo;
	private ArrayList<Temporada> temporadas;
	
	/* Defino solo los constructores que vaya a utilizar. Si solo utilizo uno, defino solo ese */
	public Serie(String titulo) {
		/* Podriamos pasar en el constructor el listado de temporadas
		 * Sin embargo tiene mas sentido en un sistema de gestion que primero se cree la serie
		 *  y luego se creen una a una las temporadas. 
		 *  Por ende, suena mas util añadir metodos para agregar las temporadas de forma individual una vez que la serie ya se creo
		 *  Sin embargo, no está mal pasar el listado ya en el constructor
		 *  */
		this.titulo = titulo;
		this.temporadas =  new ArrayList<>(); // si no inicializamos este atributo, fallará al intentar añadir un elemento ya que es null
	}
	
	/* El siguiente constructor se añade solo a forma de ejemplo
	 * Este permite recibir ya el listado de temporadas y asignarlas al atributo
	 * Como ya se dijo, a fines del ejercicio(por no ser un escenario real), cualquier opcion es valida
	 *  */
	public Serie(String titulo, ArrayList<Temporada> temporadas) {
		this.titulo = titulo;
		this.temporadas = temporadas;
	}
	
	// este metodo se añade porque hemos decidido que las temporadas se añadan una a una
	public void añadirTemporada(Temporada temporada) {
		this.temporadas.add(temporada);
	}
	
	public String toString() {
		return this.titulo;
	}
	/* Siempre añadir getters y setters solo para aquellos atributos en los que se vaya a utilizar */
	public ArrayList<Temporada> getTemporadas(){
		return this.temporadas;
	}
	
	public ArrayList<Episodio> getTodosEpisodios(){
		ArrayList<Episodio> episodios =  new ArrayList<>();
		for(Temporada temporada : this.temporadas) {
			episodios.addAll(temporada.getEpisodios());
		}
		return episodios;
	}
} 
