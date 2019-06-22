package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Auditoria extends Generica implements Serializable{

	private static final long serialVersionUID = -3385748015023890694L;
	public Auditoria() {
	}
	
	private Empleado empleado;
	private Empresa empresa;
	private PuntoVenta puntoVenta;
	private Almacen almacen;
	private String puerto;
	private Date periodoTrabajo;
	private int menu;
	private int componente;
	private int objeto;
	private int archivo;
	private String campo;
	private int tipoRegistro;
	private String programa;
	private String valorAnterior;
	private String valorActual;
	private String comentario;
	private Pais pais;
	
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
	public int getComponente() {
		return componente;
	}
	public void setComponente(int componente) {
		this.componente = componente;
	}
	public int getObjeto() {
		return objeto;
	}
	public void setObjeto(int objeto) {
		this.objeto = objeto;
	}
	public int getArchivo() {
		return archivo;
	}
	public void setArchivo(int archivo) {
		this.archivo = archivo;
	}
	public String getCampo() {
		return campo;
	}
	public void setCampo(String campo) {
		this.campo = campo;
	}
	public int getTipoRegistro() {
		return tipoRegistro;
	}
	public void setTipoRegistro(int tipoRegistro) {
		this.tipoRegistro = tipoRegistro;
	}
	public String getPrograma() {
		return programa;
	}
	public void setPrograma(String programa) {
		this.programa = programa;
	}
	public String getValorAnterior() {
		return valorAnterior;
	}
	public void setValorAnterior(String valorAnterior) {
		this.valorAnterior = valorAnterior;
	}
	public String getValorActual() {
		return valorActual;
	}
	public void setValorActual(String valorActual) {
		this.valorActual = valorActual;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	
	
}
