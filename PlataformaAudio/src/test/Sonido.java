package test;

public class Sonido {

	protected String titulo;
	protected Integer duracion;
	protected Integer cantidadReproducciones;
	
	public Sonido(String titulo, Integer duracion, Integer cantidaReproducciones) {
		this.setTitulo(titulo);
		this.setDuracion(duracion);
		this.setCantidadReproducciones(cantidaReproducciones);
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public Integer getDuracion() {
		return duracion;
	}
	public void setDuracion(Integer duracion) {
		this.duracion = duracion;
	}
	public Integer getCantidadReproducciones() {
		return cantidadReproducciones;
	}
	public void setCantidadReproducciones(Integer cantidadReproducciones) {
		this.cantidadReproducciones = cantidadReproducciones;
	}
	
}
