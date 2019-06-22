/**
 * 
 */
package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Identificacion extends Generica implements Serializable {

	private static final long serialVersionUID = 8862571546543205442L;

	private Empleado empleado;
	private Empresa empresa;
	private PuntoVenta puntoVenta;
	private Almacen almacen;
	private String puerto;
	private Date periodoTrabajo;
	private Pais pais;
	private SubSistema subSistema;
	private Date periodoContable;
	
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
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public SubSistema getSubSistema() {
		return subSistema;
	}
	public void setSubSistema(SubSistema subSistema) {
		this.subSistema = subSistema;
	}
	public Date getPeriodoContable() {
		return periodoContable;
	}
	public void setPeriodoContable(Date periodoContable) {
		this.periodoContable = periodoContable;
	}

	
	
	
	
}
