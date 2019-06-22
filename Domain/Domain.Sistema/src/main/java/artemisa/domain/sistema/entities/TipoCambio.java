package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class TipoCambio extends Generica implements Serializable {

	private static final long serialVersionUID = 2372597275307592957L;
	public TipoCambio() {
	}

	private Pais pais;
	private Date fecha;
	private double compraBCR;
	private double ventaBCR;
	private double compraEmpresa;
	private double ventaEmpresa;
	private int moneda;
	
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
	public double getCompraBCR() {
		return compraBCR;
	}
	public void setCompraBCR(double compraBCR) {
		this.compraBCR = compraBCR;
	}
	public double getVentaBCR() {
		return ventaBCR;
	}
	public void setVentaBCR(double ventaBCR) {
		this.ventaBCR = ventaBCR;
	}
	public double getCompraEmpresa() {
		return compraEmpresa;
	}
	public void setCompraEmpresa(double compraEmpresa) {
		this.compraEmpresa = compraEmpresa;
	}
	public double getVentaEmpresa() {
		return ventaEmpresa;
	}
	public void setVentaEmpresa(double ventaEmpresa) {
		this.ventaEmpresa = ventaEmpresa;
	}
	public int getMoneda() {
		return moneda;
	}
	public void setMoneda(int moneda) {
		this.moneda = moneda;
	}
	
	
}