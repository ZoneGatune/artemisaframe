package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class Empresa extends Generica implements Serializable {
	

	/**
	 * 
	 */
	private static final long serialVersionUID = -2229282510929210717L;
	public Empresa() {
	}
	
	private Pais pais; 
	private String direccion; 
	private Ubigeo ubigeo; 
	private Barrio barrio; 
	private String nombre; 
	private String razonSocial; 
	private String representanteLegal; 
	private String correoElectronico; 
	private String siglaComercial; 
	private String telefonoFijo; 
	private String telefonoCelular; 
	private String observacion; 
	private TipoIdentificacion codigoTipoIdentificacion;
	private String codigoIdentificacion;
	private String direccionReferencia;
	private Moneda moneda;
	private String nombreBD;
	private String imagenLogo;
	private String imagenPais;
	private PuntoVenta puntoVenta;
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public Ubigeo getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(Ubigeo ubigeo) {
		this.ubigeo = ubigeo;
	}
	public Barrio getBarrio() {
		return barrio;
	}
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getRepresentanteLegal() {
		return representanteLegal;
	}
	public void setRepresentanteLegal(String representanteLegal) {
		this.representanteLegal = representanteLegal;
	}
	public String getCorreoElectronico() {
		return correoElectronico;
	}
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}
	public String getSiglaComercial() {
		return siglaComercial;
	}
	public void setSiglaComercial(String siglaComercial) {
		this.siglaComercial = siglaComercial;
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
	public TipoIdentificacion getCodigoTipoIdentificacion() {
		return codigoTipoIdentificacion;
	}
	public void setCodigoTipoIdentificacion(TipoIdentificacion codigoTipoIdentificacion) {
		this.codigoTipoIdentificacion = codigoTipoIdentificacion;
	}
	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}
	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}
	public String getDireccionReferencia() {
		return direccionReferencia;
	}
	public void setDireccionReferencia(String direccionReferencia) {
		this.direccionReferencia = direccionReferencia;
	}
	public Moneda getMoneda() {
		return moneda;
	}
	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	public String getNombreBD() {
		return nombreBD;
	}
	public void setNombreBD(String nombreBD) {
		this.nombreBD = nombreBD;
	}
	public String getImagenLogo() {
		return imagenLogo;
	}
	public void setImagenLogo(String imagenLogo) {
		this.imagenLogo = imagenLogo;
	}
	public String getImagenPais() {
		return imagenPais;
	}
	public void setImagenPais(String imagenPais) {
		this.imagenPais = imagenPais;
	}
	public PuntoVenta getPuntoVenta() {
		return puntoVenta;
	}
	public void setPuntoVenta(PuntoVenta puntoVenta) {
		this.puntoVenta = puntoVenta;
	}
	
	
	
	

}
