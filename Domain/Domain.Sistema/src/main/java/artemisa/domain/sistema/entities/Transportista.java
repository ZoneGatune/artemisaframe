package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Transportista extends Generica implements Serializable{

	private static final long serialVersionUID = -2722346307655076941L;
	public Transportista() {
	}
	
	private String barrio;
	private String codigoIdentificacion;
	private String correoElectronico;
	private String direccion;
	private Date fechaIngreso;
	private String licenciaConducir;
	private String nombre;
	private String observacion;
	private Pais pais;
	private String placaDeVehiculo;
	private String razonSocial;
	private String siglaComercial;
	private String telefonoCelular;
	private String telefonoFijo;
	private int tipoIdentificacion;
	private Ubigeo ubigeo;
	private Zona Zona;
	private String direccionReferencia;

	public String getBarrio() {
		return barrio;
	}
	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}
	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}
	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Date getFechaIngreso() {
		return fechaIngreso;
	}
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}
	public String getLicenciaConducir() {
		return licenciaConducir;
	}
	public void setLicenciaConducir(String licenciaConducir) {
		this.licenciaConducir = licenciaConducir;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getPlacaDeVehiculo() {
		return placaDeVehiculo;
	}
	public void setPlacaDeVehiculo(String placaDeVehiculo) {
		this.placaDeVehiculo = placaDeVehiculo;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getSiglaComercial() {
		return siglaComercial;
	}
	public void setSiglaComercial(String siglaComercial) {
		this.siglaComercial = siglaComercial;
	}
	public String getTelefonoCelular() {
		return telefonoCelular;
	}
	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public int getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(int tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public Ubigeo getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(Ubigeo ubigeo) {
		this.ubigeo = ubigeo;
	}
	public Zona getZona() {
		return Zona;
	}
	public void setZona(Zona zona) {
		Zona = zona;
	}
	public String getDireccionReferencia() {
		return direccionReferencia;
	}
	public void setDireccionReferencia(String direccionReferencia) {
		this.direccionReferencia = direccionReferencia;
	}
	
	
}
