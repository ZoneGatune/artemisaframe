package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Ubigeo extends Generica implements Serializable{

	private static final long serialVersionUID = 803239250960251799L;
	public Ubigeo() {
	}
	
	private Pais pais;
	private Region region;
	private Departamento departamento;
	private Provincia provincia;
	private Distrito distrito;
	private Barrio barrio;
	private Zona zona;
	private double flete;
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	public Distrito getDistrito() {
		return distrito;
	}
	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
	public Barrio getBarrio() {
		return barrio;
	}
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public double getFlete() {
		return flete;
	}
	public void setFlete(double flete) {
		this.flete = flete;
	}
	

}
