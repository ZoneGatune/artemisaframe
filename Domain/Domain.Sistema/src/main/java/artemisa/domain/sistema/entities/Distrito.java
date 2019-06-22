package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class Distrito extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8479686542902283469L;

	public Distrito() {
		// TODO Auto-generated constructor stub
	}

	private Departamento departamento;
	private Pais pais;
	private Provincia provincia;
	private Region region;
	private String nombre;
	private double flete;
	private String distrito;

	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Provincia getProvincia() {
		return provincia;
	}
	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
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
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	
	
}
