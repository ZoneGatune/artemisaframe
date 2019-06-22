/**
 * 
 */
package artemisa.application.dto.sistema;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class IdentificacionDTO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6856264820291015722L;
	private int codigo;
	private String codigoA;
	private int pais;
	private int empresa;
	private int almacen;
	private int puntoVenta;
	private int empleado;
	private String puerto;
	private int subSistema;
	private String periodoContable;
	private String periodoTrabajo;
	private String nombreBd;
	private String imagenLogoEmpresa;
	private String imagenPais;
	private String imagenLogoArtemisa;
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getCodigoA() {
		return codigoA;
	}
	public void setCodigoA(String codigoA) {
		this.codigoA = codigoA;
	}
	public int getPais() {
		return pais;
	}
	public void setPais(int pais) {
		this.pais = pais;
	}
	public int getEmpresa() {
		return empresa;
	}
	public void setEmpresa(int empresa) {
		this.empresa = empresa;
	}
	public int getAlmacen() {
		return almacen;
	}
	public void setAlmacen(int almacen) {
		this.almacen = almacen;
	}
	public int getPuntoVenta() {
		return puntoVenta;
	}
	public void setPuntoVenta(int puntoVenta) {
		this.puntoVenta = puntoVenta;
	}
	public int getEmpleado() {
		return empleado;
	}
	public void setEmpleado(int empleado) {
		this.empleado = empleado;
	}
	public String getPuerto() {
		return puerto;
	}
	public void setPuerto(String puerto) {
		this.puerto = puerto;
	}
	public int getSubSistema() {
		return subSistema;
	}
	public void setSubSistema(int subSistema) {
		this.subSistema = subSistema;
	}
	public String getPeriodoContable() {
		return periodoContable;
	}
	public void setPeriodoContable(String periodoContable) {
		this.periodoContable = periodoContable;
	}
	public String getPeriodoTrabajo() {
		return periodoTrabajo;
	}
	public void setPeriodoTrabajo(String periodoTrabajo) {
		this.periodoTrabajo = periodoTrabajo;
	}
	public String getNombreBd() {
		return nombreBd;
	}
	public void setNombreBd(String nombreBd) {
		this.nombreBd = nombreBd;
	}
	public String getImagenLogoEmpresa() {
		return imagenLogoEmpresa;
	}
	public void setImagenLogoEmpresa(String imagenLogoEmpresa) {
		this.imagenLogoEmpresa = imagenLogoEmpresa;
	}
	public String getImagenPais() {
		return imagenPais;
	}
	public void setImagenPais(String imagenPais) {
		this.imagenPais = imagenPais;
	}
	public String getImagenLogoArtemisa() {
		return imagenLogoArtemisa;
	}
	public void setImagenLogoArtemisa(String imagenLogoArtemisa) {
		this.imagenLogoArtemisa = imagenLogoArtemisa;
	}
	
	

}
