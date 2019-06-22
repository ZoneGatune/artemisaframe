package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Proveedor extends Generica implements Serializable {

	private static final long serialVersionUID = 1540233747705920360L;
	public Proveedor() {
	}
	
	private Barrio barrio;
	private String cargoContacto;
	private String codigoIdentificacion;
	private String codigoInterno;
	private String contacto;
	private String correoElectronico;
	private String direccion;
	private Date fechaIngreso;
	private int indicadorDetraccion;
	private String nombre;
	private String observacion;
	private Pais pais;
	private String razonSocial;
	private String siglaComercial;
	private String telefonoCelular;
	private TipoIdentificacion tipoIdentificacion;
	private String telefonoFijo;
	private TipoProveedor tipoProveedor;
	private Ubigeo ubigeo;
	private String direccionReferencia;
	
	public Barrio getBarrio() {
		return barrio;
	}
	public void setBarrio(Barrio barrio) {
		this.barrio = barrio;
	}
	public String getCargoContacto() {
		return cargoContacto;
	}
	public void setCargoContacto(String cargoContacto) {
		this.cargoContacto = cargoContacto;
	}
	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}
	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}
	public String getCodigoInterno() {
		return codigoInterno;
	}
	public void setCodigoInterno(String codigoInterno) {
		this.codigoInterno = codigoInterno;
	}
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
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
	public int getIndicadorDetraccion() {
		return indicadorDetraccion;
	}
	public void setIndicadorDetraccion(int indicadorDetraccion) {
		this.indicadorDetraccion = indicadorDetraccion;
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
	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getTelefonoFijo() {
		return telefonoFijo;
	}
	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}
	public TipoProveedor getTipoProveedor() {
		return tipoProveedor;
	}
	public void setTipoProveedor(TipoProveedor tipoProveedor) {
		this.tipoProveedor = tipoProveedor;
	}
	public Ubigeo getUbigeo() {
		return ubigeo;
	}
	public void setUbigeo(Ubigeo ubigeo) {
		this.ubigeo = ubigeo;
	}
	public String getDireccionReferencia() {
		return direccionReferencia;
	}
	public void setDireccionReferencia(String direccionReferencia) {
		this.direccionReferencia = direccionReferencia;
	}

	
}
