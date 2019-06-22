package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Kardex extends Generica implements Serializable {
	
	private static final long serialVersionUID = 3820726542569809870L;
	public Kardex() {
	}
	
	private Articulo articulo;
	private int cantidad;
	private double costoPromedio;
	private double costoUnitario;
	private Documento documentoOperacion;
	private Empresa empresa;
	private Date fechaOperacion;
	private String numeroOperacion;
	private String serieOperacion;
	private TipoMovimiento tipoMovimiento;
	private UnidadMedida unidadMedida;
	private Pais pais;
	
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getCostoPromedio() {
		return costoPromedio;
	}
	public void setCostoPromedio(double costoPromedio) {
		this.costoPromedio = costoPromedio;
	}
	public double getCostoUnitario() {
		return costoUnitario;
	}
	public void setCostoUnitario(double costoUnitario) {
		this.costoUnitario = costoUnitario;
	}
	public Documento getDocumentoOperacion() {
		return documentoOperacion;
	}
	public void setDocumentoOperacion(Documento documentoOperacion) {
		this.documentoOperacion = documentoOperacion;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public Date getFechaOperacion() {
		return fechaOperacion;
	}
	public void setFechaOperacion(Date fechaOperacion) {
		this.fechaOperacion = fechaOperacion;
	}
	public String getNumeroOperacion() {
		return numeroOperacion;
	}
	public void setNumeroOperacion(String numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}
	public String getSerieOperacion() {
		return serieOperacion;
	}
	public void setSerieOperacion(String serieOperacion) {
		this.serieOperacion = serieOperacion;
	}
	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public UnidadMedida getUnidadMedida() {
		return unidadMedida;
	}
	public void setUnidadMedida(UnidadMedida unidadMedida) {
		this.unidadMedida = unidadMedida;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	

}
