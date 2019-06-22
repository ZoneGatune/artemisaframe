package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

public class Cliente extends Generica implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1419628080960371587L;

	private Pais pais;
	private String nombre;
	private String razonSocial;
	private String siglaComercial;
	private String correoElectronico;
	private TipoCliente tipoCliente;
	private Date fechaIngreso;
	private String contacto;
	private String cargoContacto;
	private Vendedor vendedor;
	private FormaPago formaPago;
	private TipoIdentificacion tipoIdentificacion;
	private String codigoIdentificacion;
	private Ubigeo ubigeoResidencia;
	private String barrioResidencia;
	private String direccionResidencia;
	private Ubigeo ubigeoDespacho;
	private Barrio barrioDespachO;
	private String direccionDespacho;
	private String zonaDespacho;
	private String origenNavegador;
	private String origenSistemaOperativo;
	private String telefonoFijoDespacho;
	private String telefonoCelular;
	private String observacion1;
	private EstadoCivil estadoCivil;
	private Sexo sexo;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private String zonaResidencia;
	private Moneda moneda;
	private ClaseCliente claseCliente;
	private String direccionReferenciaResidencia;
	private String direccionReferenciaDespacho;
	private String observacion2;
	private String telefonoFijoResidencia;
	private TipoPedido tipoPedido;
	
	
	
	
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




	public String getCorreoElectronico() {
		return correoElectronico;
	}




	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}




	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}




	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}




	public Date getFechaIngreso() {
		return fechaIngreso;
	}




	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}




	public String getContacto() {
		return contacto;
	}




	public void setContacto(String contacto) {
		this.contacto = contacto;
	}




	public String getCargoContacto() {
		return cargoContacto;
	}




	public void setCargoContacto(String cargoContacto) {
		this.cargoContacto = cargoContacto;
	}




	public Vendedor getVendedor() {
		return vendedor;
	}




	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}




	public FormaPago getFormaPago() {
		return formaPago;
	}




	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}




	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}




	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}




	public String getCodigoIdentificacion() {
		return codigoIdentificacion;
	}




	public void setCodigoIdentificacion(String codigoIdentificacion) {
		this.codigoIdentificacion = codigoIdentificacion;
	}




	public Ubigeo getUbigeoResidencia() {
		return ubigeoResidencia;
	}




	public void setUbigeoResidencia(Ubigeo ubigeoResidencia) {
		this.ubigeoResidencia = ubigeoResidencia;
	}




	public String getBarrioResidencia() {
		return barrioResidencia;
	}




	public void setBarrioResidencia(String barrioResidencia) {
		this.barrioResidencia = barrioResidencia;
	}




	public String getDireccionResidencia() {
		return direccionResidencia;
	}




	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}




	public Ubigeo getUbigeoDespacho() {
		return ubigeoDespacho;
	}




	public void setUbigeoDespacho(Ubigeo ubigeoDespacho) {
		this.ubigeoDespacho = ubigeoDespacho;
	}




	public Barrio getBarrioDespachO() {
		return barrioDespachO;
	}




	public void setBarrioDespachO(Barrio barrioDespachO) {
		this.barrioDespachO = barrioDespachO;
	}




	public String getDireccionDespacho() {
		return direccionDespacho;
	}




	public void setDireccionDespacho(String direccionDespacho) {
		this.direccionDespacho = direccionDespacho;
	}




	public String getZonaDespacho() {
		return zonaDespacho;
	}




	public void setZonaDespacho(String zonaDespacho) {
		this.zonaDespacho = zonaDespacho;
	}




	public String getOrigenNavegador() {
		return origenNavegador;
	}




	public void setOrigenNavegador(String origenNavegador) {
		this.origenNavegador = origenNavegador;
	}




	public String getOrigenSistemaOperativo() {
		return origenSistemaOperativo;
	}




	public void setOrigenSistemaOperativo(String origenSistemaOperativo) {
		this.origenSistemaOperativo = origenSistemaOperativo;
	}




	public String getTelefonoFijoDespacho() {
		return telefonoFijoDespacho;
	}




	public void setTelefonoFijoDespacho(String telefonoFijoDespacho) {
		this.telefonoFijoDespacho = telefonoFijoDespacho;
	}




	public String getTelefonoCelular() {
		return telefonoCelular;
	}




	public void setTelefonoCelular(String telefonoCelular) {
		this.telefonoCelular = telefonoCelular;
	}




	public String getObservacion1() {
		return observacion1;
	}




	public void setObservacion1(String observacion1) {
		this.observacion1 = observacion1;
	}




	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}




	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}




	public Sexo getSexo() {
		return sexo;
	}




	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}




	public String getApellidoPaterno() {
		return apellidoPaterno;
	}




	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}




	public String getApellidoMaterno() {
		return apellidoMaterno;
	}




	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}




	public String getZonaResidencia() {
		return zonaResidencia;
	}




	public void setZonaResidencia(String zonaResidencia) {
		this.zonaResidencia = zonaResidencia;
	}




	public Moneda getMoneda() {
		return moneda;
	}




	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}




	public ClaseCliente getClaseCliente() {
		return claseCliente;
	}




	public void setClaseCliente(ClaseCliente claseCliente) {
		this.claseCliente = claseCliente;
	}




	public String getDireccionReferenciaResidencia() {
		return direccionReferenciaResidencia;
	}




	public void setDireccionReferenciaResidencia(String direccionReferenciaResidencia) {
		this.direccionReferenciaResidencia = direccionReferenciaResidencia;
	}




	public String getDireccionReferenciaDespacho() {
		return direccionReferenciaDespacho;
	}




	public void setDireccionReferenciaDespacho(String direccionReferenciaDespacho) {
		this.direccionReferenciaDespacho = direccionReferenciaDespacho;
	}




	public String getObservacion2() {
		return observacion2;
	}




	public void setObservacion2(String observacion2) {
		this.observacion2 = observacion2;
	}




	public String getTelefonoFijoResidencia() {
		return telefonoFijoResidencia;
	}




	public void setTelefonoFijoResidencia(String telefonoFijoResidencia) {
		this.telefonoFijoResidencia = telefonoFijoResidencia;
	}




	public TipoPedido getTipoPedido() {
		return tipoPedido;
	}




	public void setTipoPedido(TipoPedido tipoPedido) {
		this.tipoPedido = tipoPedido;
	}




	public Cliente() {
		// TODO Auto-generated constructor stub
	}

}
