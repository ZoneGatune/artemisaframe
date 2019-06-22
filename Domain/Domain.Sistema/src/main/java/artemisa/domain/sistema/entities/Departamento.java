package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class Departamento extends Generica implements Serializable {

	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -8368114496744092081L;

	public Departamento() {
	}
	
	private Pais pais;
	private Region region;
	private String nombre;
	private double flete;
	private String departamento;

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
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getFlete() {
		return flete;
	}
	public void setFlete(double flete) {
		this.flete = flete;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	
	
}
