package test;

public class Audiolibro extends Sonido{
	private String idioma;

	public Audiolibro(
			String titulo, 
			Integer duracion, 
			Integer cantidadReproducciones,
			String idioma
			) {
		super(titulo, duracion, cantidadReproducciones);
		this.setIdioma(idioma);
	}
	
	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
}
