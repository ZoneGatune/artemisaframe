package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Region extends Generica implements Serializable {

	private static final long serialVersionUID = -6456696855471425871L;
	public Region() {
	}

	private double flete;
	private String nombre;
	private Pais pais;
	private String region;

	public double getFlete() {
		return flete;
	}
	public void setFlete(double flete) {
		this.flete = flete;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
		
	
}
