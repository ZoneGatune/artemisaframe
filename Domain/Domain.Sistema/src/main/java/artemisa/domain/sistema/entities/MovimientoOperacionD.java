package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MovimientoOperacionD extends Generica implements Serializable{

	private static final long serialVersionUID = -8439474430860419397L;
	public MovimientoOperacionD() {
	}
	
	private Articulo articulo;
	private TipoPrecio tipoPrecio;
	private double cantidad;
	private PorcentajeDescuento porcentajeDescuento;
	private double precioPublico;
	private double precioDescuento;
	private PrecioVenta precioVenta;
	private double precioComision;
	private double precioCosto;
	private double valorImpuesto;
	private Pais pais;
	private String articuloDescripcion;
	private TipoArticulo tipoArticulo;
	private int unidadVenta;
	private MovimientoOperacionC movimientoOperacionC;
	private double cantidadDespachado;
	private double importeValorVenta;
	
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public TipoPrecio getTipoPrecio() {
		return tipoPrecio;
	}
	public void setTipoPrecio(TipoPrecio tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
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
	public PrecioVenta getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(PrecioVenta precioVenta) {
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
	public double getValorImpuesto() {
		return valorImpuesto;
	}
	public void setValorImpuesto(double valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getArticuloDescripcion() {
		return articuloDescripcion;
	}
	public void setArticuloDescripcion(String articuloDescripcion) {
		this.articuloDescripcion = articuloDescripcion;
	}
	public TipoArticulo getTipoArticulo() {
		return tipoArticulo;
	}
	public void setTipoArticulo(TipoArticulo tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	public int getUnidadVenta() {
		return unidadVenta;
	}
	public void setUnidadVenta(int unidadVenta) {
		this.unidadVenta = unidadVenta;
	}
	public MovimientoOperacionC getMovimientoOperacionC() {
		return movimientoOperacionC;
	}
	public void setMovimientoOperacionC(MovimientoOperacionC movimientoOperacionC) {
		this.movimientoOperacionC = movimientoOperacionC;
	}
	public double getCantidadDespachado() {
		return cantidadDespachado;
	}
	public void setCantidadDespachado(double cantidadDespachado) {
		this.cantidadDespachado = cantidadDespachado;
	}
	public double getImporteValorVenta() {
		return importeValorVenta;
	}
	public void setImporteValorVenta(double importeValorVenta) {
		this.importeValorVenta = importeValorVenta;
	}
	
	
}
