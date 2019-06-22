
package artemisa.domain.sistema.entities;

import java.io.Serializable;

public class Documento extends Generica implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7528311988646701351L;

	public Documento() {
	}
	
	private Pais pais;
	private String descripciom;
	private String abreviatura;
	private int indicadorRegistroVenta;
	private int indicadorRegistroCompra;
	private int indicadorOperacionPuntoEmisionActual;
	private int indicadorActualizaInventario;
	private int indicadorActualizaInventarioDocumentoReferencia;
	private int indicadorValidaStock;
	private int indicadorValidaStockDocumentoReferencia;

	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public String getDescripciom() {
		return descripciom;
	}
	public void setDescripciom(String descripciom) {
		this.descripciom = descripciom;
	}
	public String getAbreviatura() {
		return abreviatura;
	}
	public void setAbreviatura(String abreviatura) {
		this.abreviatura = abreviatura;
	}
	public int getIndicadorRegistroVenta() {
		return indicadorRegistroVenta;
	}
	public void setIndicadorRegistroVenta(int indicadorRegistroVenta) {
		this.indicadorRegistroVenta = indicadorRegistroVenta;
	}
	public int getIndicadorRegistroCompra() {
		return indicadorRegistroCompra;
	}
	public void setIndicadorRegistroCompra(int indicadorRegistroCompra) {
		this.indicadorRegistroCompra = indicadorRegistroCompra;
	}
	public int getIndicadorOperacionPuntoEmisionActual() {
		return indicadorOperacionPuntoEmisionActual;
	}
	public void setIndicadorOperacionPuntoEmisionActual(int indicadorOperacionPuntoEmisionActual) {
		this.indicadorOperacionPuntoEmisionActual = indicadorOperacionPuntoEmisionActual;
	}
	public int getIndicadorActualizaInventario() {
		return indicadorActualizaInventario;
	}
	public void setIndicadorActualizaInventario(int indicadorActualizaInventario) {
		this.indicadorActualizaInventario = indicadorActualizaInventario;
	}
	public int getIndicadorActualizaInventarioDocumentoReferencia() {
		return indicadorActualizaInventarioDocumentoReferencia;
	}
	public void setIndicadorActualizaInventarioDocumentoReferencia(int indicadorActualizaInventarioDocumentoReferencia) {
		this.indicadorActualizaInventarioDocumentoReferencia = indicadorActualizaInventarioDocumentoReferencia;
	}
	public int getIndicadorValidaStock() {
		return indicadorValidaStock;
	}
	public void setIndicadorValidaStock(int indicadorValidaStock) {
		this.indicadorValidaStock = indicadorValidaStock;
	}
	public int getIndicadorValidaStockDocumentoReferencia() {
		return indicadorValidaStockDocumentoReferencia;
	}
	public void setIndicadorValidaStockDocumentoReferencia(int indicadorValidaStockDocumentoReferencia) {
		this.indicadorValidaStockDocumentoReferencia = indicadorValidaStockDocumentoReferencia;
	}
	
	
	

}
