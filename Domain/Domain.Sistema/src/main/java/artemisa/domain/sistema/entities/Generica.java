package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Generica implements Serializable {

	private static final long serialVersionUID = 1652449682899028511L;
	
	private int codigo;
	private String codigoA;
	private Date fechaActualizacion; 
	private String horaActualizacion; 
	private int usuarioActualizacion; 
	private int indicadorActivo;
	
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
	public Date getFechaActualizacion() {
		return fechaActualizacion;
	}
	public void setFechaActualizacion(Date fechaActualizacion) {
		this.fechaActualizacion = fechaActualizacion;
	}
	public String getHoraActualizacion() {
		return horaActualizacion;
	}
	public void setHoraActualizacion(String horaActualizacion) {
		this.horaActualizacion = horaActualizacion;
	}
	public int getUsuarioActualizacion() {
		return usuarioActualizacion;
	}
	public void setUsuarioActualizacion(int usuarioActualizacion) {
		this.usuarioActualizacion = usuarioActualizacion;
	}
	public int getIndicadorActivo() {
		return indicadorActivo;
	}
	public void setIndicadorActivo(int indicadorActivo) {
		this.indicadorActivo = indicadorActivo;
	}
	
	
}
