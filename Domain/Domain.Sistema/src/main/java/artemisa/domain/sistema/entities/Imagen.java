package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Imagen extends Generica implements Serializable {

	private static final long serialVersionUID = -938533737799509843L;
	public Imagen() {
	}
	
	private String archivo;
	private int codigoAcceso;
	private Pais pais;
	private String urlImagenFinal;
	private String urlImagenPreliminar;
	
	public String getArchivo() {
		return archivo;
	}
	public void setArchivo(String archivo) {
		this.archivo = archivo;
	}
	public int getCodigoAcceso() {
		return codigoAcceso;
	}
	public void setCodigoAcceso(int codigoAcceso) {
		this.codigoAcceso = codigoAcceso;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getUrlImagenFinal() {
		return urlImagenFinal;
	}
	public void setUrlImagenFinal(String urlImagenFinal) {
		this.urlImagenFinal = urlImagenFinal;
	}
	public String getUrlImagenPreliminar() {
		return urlImagenPreliminar;
	}
	public void setUrlImagenPreliminar(String urlImagenPreliminar) {
		this.urlImagenPreliminar = urlImagenPreliminar;
	}
	

}
