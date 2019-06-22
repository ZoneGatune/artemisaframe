package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

public class Vendedor extends Generica implements Serializable{

	private static final long serialVersionUID = 9110630767604929141L;
	public Vendedor() {
	}
	
	private Pais pais;
	private String nombre;
	private Date fechaIngreso;
	private int tipoIdentificacion;
	private String codigoIdentificacion;
	private String telefonoFijo;
	private String telefonoCelular;
	private String observacion;

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}
	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public String getTelefonoCelular() {
		return telefonoCelular;
	}
	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	
}
