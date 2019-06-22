package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class BarrioExcepcion extends Generica implements Serializable{

	private static final long serialVersionUID = -3876063465114147999L;
	public BarrioExcepcion() {
	}
	
	private int codigoInei;
	private int codigoPostal;
	private Departamento departamento;
	private Distrito distrito;
	private double flete;
	private String nombre;
	private Pais pais;
	private Provincia provincia;
	private Region region;
	private Zona zona;
	private Barrio barrio;

	public int getCodigoInei() {
		return codigoInei;
	}
	public void setCodigoInei(int codigoInei) {
		this.codigoInei = codigoInei;
	}
	public int getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	public Departamento getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}
	public Distrito getDistrito() {
		return distrito;
	}
	public void setDistrito(Distrito distrito) {
		this.distrito = distrito;
	}
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
	public Zona getZona() {
		return zona;
	}
	public void setZona(Zona zona) {
		this.zona = zona;
	}
	public Barrio getBarrio() {
		return barrio;
	}
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}	
	

}
