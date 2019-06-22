package artemisa.application.dto.sistema;

import java.io.Serializable;

public class ObjetoTrabajoDTO implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1568397061083278679L;
	
	private int idTransaccion;
	private String codigoRespuesta;
	private String mensajeRespuesta;
	private Object datosBean;
	
	
	public Object getDatosBean() {
		return datosBean;
	}
	public void setDatosBean(Object datosBean) {
		this.datosBean = datosBean;
	}
	public int getIdTransaccion() {
		return idTransaccion;
	}
	public void setIdTransaccion(int idTransaccion) {
		this.idTransaccion = idTransaccion;
	}
	public String getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(String codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}
	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
	
	
	

}
