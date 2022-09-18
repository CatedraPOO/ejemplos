package pack;

import java.time.LocalDate;
import java.util.ArrayList;

public class Temporada{
	private Integer numero;
	private ArrayList<Episodio> episodios;
	
	/* Defino solo los constructores que vaya a utilizar. Si solo utilizo uno, defino solo ese */
	public Temporada(Integer numero) {
		/* Podriamos pasar en el constructor el listado de episodios
		 * Sin embargo tiene mas sentido en un sistema de gestion que primero se cree la temporada
		 *  y luego se creen uno a uno los episodios. 
		 *  Por ende, suena mas util añadir metodos para agregar los capitulos de forma individual una vez que la temporada ya se creo
		 *  Sin embargo, no está mal pasar el listado ya en el constructor
		 *  */
		this.numero = numero;
		this.episodios =  new ArrayList<>(); // si no inicializamos este atributo, fallará al intentar añadir un elemento ya que es null
	}
	/* El siguiente constructor se añade solo a forma de ejemplo
	 * Este permite recibir ya el listado de episodios y asignarlos al atributo
	 * Como ya se dijo, a fines del ejercicio(por no ser un escenario real), cualquier opcion es valida
	 *  */
	public Temporada(Integer numero, ArrayList<Episodio> episodios) {
		this.numero = numero;
		this.episodios = episodios;
	}
	
	// este metodo se añade porque hemos decidido que los capitulos se añadan uno a uno
	public void añadirEpisodio(Episodio episodio) {
		this.episodios.add(episodio);
	}
	
	public String toString() {
		return "Temporada Nro " + this.numero;
	}
	
	public ArrayList<Episodio> getEpisodios(){
		return this.episodios;
	}
	
	
	
	/* Siempre añadir getters y setter solo para aquellos atributos en los que se vaya a utilizar */
	
	
}
