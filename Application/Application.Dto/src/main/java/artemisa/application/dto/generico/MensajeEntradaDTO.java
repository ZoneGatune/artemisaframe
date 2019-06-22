package artemisa.application.dto.generico;

import java.io.Serializable;

public class MensajeEntradaDTO implements Serializable {
	

	private static final long serialVersionUID = 4778259721679447268L;
	
	private int idTransaccion;
	
	
	private String nombreRed;
	private String claveRed;
	private int empresa;
	private int puntoVenta;
	private String opcion;
	private String puerto;
	private int subSistema;
	private int codigoNotificacion;
	private int tipoUsuario;
	public String getPuerto() {
		return puerto;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	public int getSubSistema() {
		return subSistema;
	}
	public void setSubSistema(int subSistema) {
		this.subSistema = subSistema;
	}
	public int getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public String getNombreRed() {
		return nombreRed;
	}
	public void setNombreRed(String nombreRed) {
		this.nombreRed = nombreRed;
	}
	public String getClaveRed() {
		return claveRed;
	}
	public void setClaveRed(String claveRed) {
		this.claveRed = claveRed;
	}
	public int getEmpresa() {
		return empresa;
	}
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	public int getPuntoVenta() {
		return puntoVenta;
	}
	public void setPuntoVenta(int puntoVenta) {
		this.puntoVenta = puntoVenta;
	}
	public String getOpcion() {
		return opcion;
	}
	public void setOpcion(String opcion) {
		this.opcion = opcion;
	}
	public int getCodigoNotificacion() {
		return codigoNotificacion;
	}
	public void setCodigoNotificacion(int codigoNotificacion) {
		this.codigoNotificacion = codigoNotificacion;
	}
	public int getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}

	

	
	

}
