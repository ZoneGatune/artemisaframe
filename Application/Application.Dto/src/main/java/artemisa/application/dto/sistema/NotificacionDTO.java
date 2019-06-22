/**
 * 
 */
package artemisa.application.dto.sistema;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class NotificacionDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2800659811126962941L;
	/**
	 * 
	 */
	public NotificacionDTO() {
		// TODO Auto-generated constructor stub
	}
	
	private int codigoNotificacion;
	private int codigoEmpleado;
	private String puerto;
	private int empresa;
	private int puntoVenta;
	private int almacen;
	private String periodo;
	private int menu;
	private String asunto;
	public int getCodigoNotificacion() {
		return codigoNotificacion;
	}
	public void setCodigoNotificacion(int codigoNotificacion) {
		this.codigoNotificacion = codigoNotificacion;
	}
	public int getCodigoEmpleado() {
		return codigoEmpleado;
	}
	public void setCodigoEmpleado(int codigoEmpleado) {
		this.codigoEmpleado = codigoEmpleado;
	}
	public String getPuerto() {
		return puerto;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
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
	public int getAlmacen() {
		return almacen;
	}
	public void setAlmacen(int almacen) {
		this.almacen = almacen;
	}
	public String getPeriodo() {
		return periodo;
	}
	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	public int getMenu() {
		return menu;
	}
	public void setMenu(int menu) {
		this.menu = menu;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	
	

}
