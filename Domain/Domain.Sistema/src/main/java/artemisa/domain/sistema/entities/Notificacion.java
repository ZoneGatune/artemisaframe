package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Notificacion extends Generica implements Serializable {

	private static final long serialVersionUID = 6518199701683909199L;
	public Notificacion() {
	}
	
	private Empleado empleado;
	private Empresa empresa;
	private PuntoVenta puntoVenta;
	private Almacen almacen;
	private String puerto;
	private Date periodoTrabajo;
	private int menu;
	private String asunto;
	private Pais pais;
	private Date fecha;
	private String hora;
	private SubSistema subSistema;
	private int estado;
	private int motivo;
	private String observacion;
	private int archivo;
	private int codigoOperacion;
	
	public Empleado getEmpleado() {
		return empleado;
	}
	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public PuntoVenta getPuntoVenta() {
		return puntoVenta;
	}
	public void setPuntoVenta(PuntoVenta puntoVenta) {
		this.puntoVenta = puntoVenta;
	}
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	public String getPuerto() {
		return puerto;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	public Date getPeriodoTrabajo() {
		return periodoTrabajo;
	}
	public void setPeriodoTrabajo(Date periodoTrabajo) {
		this.periodoTrabajo = periodoTrabajo;
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
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public SubSistema getSubSistema() {
		return subSistema;
	}
	public void setSubSistema(SubSistema subSistema) {
		this.subSistema = subSistema;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public int getMotivo() {
		return motivo;
	}
	public void setMotivo(int motivo) {
		this.motivo = motivo;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	public int getArchivo() {
		return archivo;
	}
	public void setArchivo(int archivo) {
		this.archivo = archivo;
	}
	public int getCodigoOperacion() {
		return codigoOperacion;
	}
	public void setCodigoOperacion(int codigoOperacion) {
		this.codigoOperacion = codigoOperacion;
	}
	

}
