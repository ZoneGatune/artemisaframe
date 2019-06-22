package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class PrecioVenta extends Generica implements Serializable {

	private static final long serialVersionUID = -4914687763988159779L;
	public PrecioVenta() {
	}

	private Pais pais;
	private Date fechaInicial;
	private Date fechaFinal;
	private TipoPrecio tipoPrecio;
	private PorcentajeDescuento porcentajeDescuento;
	private double precioPublico;
	private double precioDescuento;
	private double precioVenta;
	private double precioComision;
	private double precioCosto;
	private Articulo articulo;
	private int unidadVenta;
	private double reservado01;
	private double reservado02;
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Date getFechaInicial() {
		return fechaInicial;
	}
	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}
	public Date getFechaFinal() {
		return fechaFinal;
	}
	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}
	public TipoPrecio getTipoPrecio() {
		return tipoPrecio;
	}
	public void setTipoPrecio(TipoPrecio tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}
	public PorcentajeDescuento getPorcentajeDescuento() {
		return porcentajeDescuento;
	}
	public void setPorcentajeDescuento(PorcentajeDescuento porcentajeDescuento) {
		this.porcentajeDescuento = porcentajeDescuento;
	}
	public double getPrecioPublico() {
		return precioPublico;
	}
	public void setPrecioPublico(double precioPublico) {
		this.precioPublico = precioPublico;
	}
	public double getPrecioDescuento() {
		return precioDescuento;
	}
	public void setPrecioDescuento(double precioDescuento) {
		this.precioDescuento = precioDescuento;
	}
	public double getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(double precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double getPrecioComision() {
		return precioComision;
	}
	public void setPrecioComision(double precioComision) {
		this.precioComision = precioComision;
	}
	public double getPrecioCosto() {
		return precioCosto;
	}
	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public int getUnidadVenta() {
		return unidadVenta;
	}
	public void setUnidadVenta(int unidadVenta) {
		this.unidadVenta = unidadVenta;
	}
	public double getReservado01() {
		return reservado01;
	}
	public void setReservado01(double reservado01) {
		this.reservado01 = reservado01;
	}
	public double getReservado02() {
		return reservado02;
	}
	public void setReservado02(double reservado02) {
		this.reservado02 = reservado02;
	}
	
	
}
