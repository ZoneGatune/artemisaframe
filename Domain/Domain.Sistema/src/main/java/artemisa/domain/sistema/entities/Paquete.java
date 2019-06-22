/**
 * 
 */
package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Paquete extends Generica implements Serializable {

	private static final long serialVersionUID = -6419755150578401400L;
	public Paquete() {
	}
	
	private Articulo articulo;
	private double cantidad;
	private Pais pais;
	private int paquete;
	private String codigoBarra;
	private String ubicacion;
	private int articuloPadre;
	private int indicadorVenta;
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public double getCantidad() {
		return cantidad;
	}
	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getPaquete() {
		return paquete;
	}
	public void setPaquete(int paquete) {
		this.paquete = paquete;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getArticuloPadre() {
		return articuloPadre;
	}
	public void setArticuloPadre(int articuloPadre) {
		this.articuloPadre = articuloPadre;
	}
	public int getIndicadorVenta() {
		return indicadorVenta;
	}
	public void setIndicadorVenta(int indicadorVenta) {
		this.indicadorVenta = indicadorVenta;
	}
	
	
}
