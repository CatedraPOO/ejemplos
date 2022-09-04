package test;

public class Cancion extends Sonido{
	private String nombreAlbum;
	private String letra;
	private Integer añoPublicacion;
	
	public Cancion(
			String titulo, 
			Integer duracion, 
			Integer cantidadReproducciones,
			String nombreAlbum,
			String letra, 
			Integer añoPublicacion
			) {
		super(titulo, duracion, cantidadReproducciones);
		this.setNombreAlbum(nombreAlbum);
		this.setLetra(letra);
		this.setAñoPublicacion(añoPublicacion);
	}
	
	public String getNombreAlbum() {
		return nombreAlbum;
	}
	public void setNombreAlbum(String nombreAlbum) {
		this.nombreAlbum = nombreAlbum;
	}
	public String getLetra() {
		return letra;
	}
	public void setLetra(String letra) {
		this.letra = letra;
	}
	public Integer getAñoPublicacion() {
		return añoPublicacion;
	}
	public void setAñoPublicacion(Integer añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}
	
	
	
}
