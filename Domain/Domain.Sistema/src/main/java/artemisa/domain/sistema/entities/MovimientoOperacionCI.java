package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MovimientoOperacionCI extends Generica implements Serializable {

	private static final long serialVersionUID = -3240173766309809671L;
	public MovimientoOperacionCI() {
	}
	
	private MovimientoOperacionC movimientoOperacionC;
	private Pais pais;
	private double porcentajeImpuesto;
	private TipoImpuesto tipoImpuesto;
	private TipoPedido tipoPedido;
	private PrecioVenta precioVenta;
	private double valorImpuesto;
	
	public MovimientoOperacionC getMovimientoOperacionC() {
		return movimientoOperacionC;
	}
	public void setMovimientoOperacionC(MovimientoOperacionC movimientoOperacionC) {
		this.movimientoOperacionC = movimientoOperacionC;
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
	public TipoPedido getTipoPedido() {
		return tipoPedido;
	}
	public void setTipoPedido(TipoPedido tipoPedido) {
		this.tipoPedido = tipoPedido;
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
	
	
}
