package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MovimientoOperacionDI extends Generica implements Serializable {

	private static final long serialVersionUID = -8808641475164676546L;
	public MovimientoOperacionDI() {
	}

	private MovimientoOperacionC movimientoOperacionC;
	private MovimientoOperacionD movimientoOperacionD;
	private Pais pais;
	private double porcentajeImpuesto;
	private TipoImpuesto tipoImpuesto;
	private TipoPrecio tipoPrecio;
	private PrecioVenta precioVenta;
	private double valorImpuesto;
	private Articulo articulo;
	
	public MovimientoOperacionC getMovimientoOperacionC() {
		return movimientoOperacionC;
	}
	public void setMovimientoOperacionC(MovimientoOperacionC movimientoOperacionC) {
		this.movimientoOperacionC = movimientoOperacionC;
	}
	public MovimientoOperacionD getMovimientoOperacionD() {
		return movimientoOperacionD;
	}
	public void setMovimientoOperacionD(MovimientoOperacionD movimientoOperacionD) {
		this.movimientoOperacionD = movimientoOperacionD;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public double getPorcentajeImpuesto() {
		return porcentajeImpuesto;
	}
	public void setPorcentajeImpuesto(double porcentajeImpuesto) {
		this.porcentajeImpuesto = porcentajeImpuesto;
	}
	public TipoImpuesto getTipoImpuesto() {
		return tipoImpuesto;
	}
	public void setTipoImpuesto(TipoImpuesto tipoImpuesto) {
		this.tipoImpuesto = tipoImpuesto;
	}
	public TipoPrecio getTipoPrecio() {
		return tipoPrecio;
	}
	public void setTipoPrecio(TipoPrecio tipoPrecio) {
		this.tipoPrecio = tipoPrecio;
	}
	public PrecioVenta getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(PrecioVenta precioVenta) {
		this.precioVenta = precioVenta;
	}
	public double getValorImpuesto() {
		return valorImpuesto;
	}
	public void setValorImpuesto(double valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	
	
}
