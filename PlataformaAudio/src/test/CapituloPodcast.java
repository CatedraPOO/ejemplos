package test;

public class CapituloPodcast extends Sonido {
	private String urlWeb;

	public CapituloPodcast(
			String titulo, 
			Integer duracion, 
			Integer cantidadReproducciones,
			String urlWeb
			) {
		super(titulo, duracion, cantidadReproducciones);
		this.setUrlWeb(urlWeb);
	}
	
	public String getUrlWeb() {
		return urlWeb;
	}

	public void setUrlWeb(String urlWeb) {
		this.urlWeb = urlWeb;
	}
}
