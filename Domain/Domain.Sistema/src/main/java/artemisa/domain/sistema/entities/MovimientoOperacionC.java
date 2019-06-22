package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jossymar Cabanillas
 *
 */
public class MovimientoOperacionC extends Generica implements Serializable {

	private static final long serialVersionUID = 6751669187525443405L;
	public MovimientoOperacionC() {
	}

	private Pais pais;
	private Empresa empresa;
	private PuntoVenta puntoVenta;
	private TipoMovimiento tipoMovimiento;
	private Moneda moneda;
	private Date fechaEmision;
	private String serieReferencia;
	private String numeroReferencia;
	private TipoIdentificacion tipoIdentificacion;
	private String codigoIdentifacion;
	private String barrioResidencia;
	private String direccionDespacho;
	private TipoCambio tipoCambio;
	private FormaPago formaPago;
	private Date fechaVencimiento;
	private EstadoDocumento estadoDocumento;
	private Cliente cliente;
	private String departamentoResidencia;
	private int almacenDestino;
	private int almacenOrigen;
	private String barrioDespacho;
	private String codigoIdentificacionTransportista;
	private ConceptoContable conceptoContable;
	private String departamentoDespacho;
	private String direccionReferenciaDespacho;
	private String direccionReferenciaResidencia;
	private String direccionReferencia;
	private String distritoDespacho;
	private String distritoResidencia;
	private EstadoPedido estadoPedido;
	private String glosa;
	private String placaVehiculo;
	private Proveedor proveedor;
	private String provinciaDespacho;
	private String provinciaResidencia;
	private String razonSocial;
	private String regionDespacho;
	private String regionResidencia;
	private TipoGuiaRemision tipoGuiaRemision;
	private String tipoIdentificacionTransportista;
	private Transportista transportista;
	private int ubigeoDespacho;
	private int ubigeoResidencia;
	private String zonaDespacho;
	private String zonaResidencia;
	private double valorImpuesto;
	private String serieOperacion;
	private PrecioVenta precioVenta;
	private double precioPublico;
	private double precioDescuento;
	private double precioCosto;
	private double precioComision;
	private String numeroOperacion;
	private int documentoOperacionReferencia;
	private int documentoOperacion;
	private TipoPedido tipoPedido;
	private int reservado01;
	private double importeValorVenta;
	private double importePrecioVenta;
	private MotivoOperacion motivoOperacion;
	
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}
	public PuntoVenta getPuntoVenta() {
		return puntoVenta;
	}
	public void setPuntoVenta(PuntoVenta puntoVenta) {
		this.puntoVenta = puntoVenta;
	}
	public TipoMovimiento getTipoMovimiento() {
		return tipoMovimiento;
	}
	public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
		this.tipoMovimiento = tipoMovimiento;
	}
	public Moneda getMoneda() {
		return moneda;
	}
	public void setMoneda(Moneda moneda) {
		this.moneda = moneda;
	}
	public Date getFechaEmision() {
		return fechaEmision;
	}
	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}
	public String getSerieReferencia() {
		return serieReferencia;
	}
	public void setSerieReferencia(String serieReferencia) {
		this.serieReferencia = serieReferencia;
	}
	public String getNumeroReferencia() {
		return numeroReferencia;
	}
	public void setNumeroReferencia(String numeroReferencia) {
		this.numeroReferencia = numeroReferencia;
	}
	public TipoIdentificacion getTipoIdentificacion() {
		return tipoIdentificacion;
	}
	public void setTipoIdentificacion(TipoIdentificacion tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}
	public String getCodigoIdentifacion() {
		return codigoIdentifacion;
	}
	public void setCodigoIdentifacion(String codigoIdentifacion) {
		this.codigoIdentifacion = codigoIdentifacion;
	}
	public String getBarrioResidencia() {
		return barrioResidencia;
	}
	public void setBarrioResidencia(String barrioResidencia) {
		this.barrioResidencia = barrioResidencia;
	}
	public String getDireccionDespacho() {
		return direccionDespacho;
	}
	public void setDireccionDespacho(String direccionDespacho) {
		this.direccionDespacho = direccionDespacho;
	}
	public TipoCambio getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(TipoCambio tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	public FormaPago getFormaPago() {
		return formaPago;
	}
	public void setFormaPago(FormaPago formaPago) {
		this.formaPago = formaPago;
	}
	public Date getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(Date fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	public EstadoDocumento getEstadoDocumento() {
		return estadoDocumento;
	}
	public void setEstadoDocumento(EstadoDocumento estadoDocumento) {
		this.estadoDocumento = estadoDocumento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public String getDepartamentoResidencia() {
		return departamentoResidencia;
	}
	public void setDepartamentoResidencia(String departamentoResidencia) {
		this.departamentoResidencia = departamentoResidencia;
	}
	public int getAlmacenDestino() {
		return almacenDestino;
	}
	public void setAlmacenDestino(int almacenDestino) {
		this.almacenDestino = almacenDestino;
	}
	public int getAlmacenOrigen() {
		return almacenOrigen;
	}
	public void setAlmacenOrigen(int almacenOrigen) {
		this.almacenOrigen = almacenOrigen;
	}
	public String getBarrioDespacho() {
		return barrioDespacho;
	}
	public void setBarrioDespacho(String barrioDespacho) {
		this.barrioDespacho = barrioDespacho;
	}
	public String getCodigoIdentificacionTransportista() {
		return codigoIdentificacionTransportista;
	}
	public void setCodigoIdentificacionTransportista(String codigoIdentificacionTransportista) {
		this.codigoIdentificacionTransportista = codigoIdentificacionTransportista;
	}
	public ConceptoContable getConceptoContable() {
		return conceptoContable;
	}
	public void setConceptoContable(ConceptoContable conceptoContable) {
		this.conceptoContable = conceptoContable;
	}
	public String getDepartamentoDespacho() {
		return departamentoDespacho;
	}
	public void setDepartamentoDespacho(String departamentoDespacho) {
		this.departamentoDespacho = departamentoDespacho;
	}
	public String getDireccionReferenciaDespacho() {
		return direccionReferenciaDespacho;
	}
	public void setDireccionReferenciaDespacho(String direccionReferenciaDespacho) {
		this.direccionReferenciaDespacho = direccionReferenciaDespacho;
	}
	public String getDireccionReferenciaResidencia() {
		return direccionReferenciaResidencia;
	}
	public void setDireccionReferenciaResidencia(String direccionReferenciaResidencia) {
		this.direccionReferenciaResidencia = direccionReferenciaResidencia;
	}
	public String getDireccionReferencia() {
		return direccionReferencia;
	}
	public void setDireccionReferencia(String direccionReferencia) {
		this.direccionReferencia = direccionReferencia;
	}
	public String getDistritoDespacho() {
		return distritoDespacho;
	}
	public void setDistritoDespacho(String distritoDespacho) {
		this.distritoDespacho = distritoDespacho;
	}
	public String getDistritoResidencia() {
		return distritoResidencia;
	}
	public void setDistritoResidencia(String distritoResidencia) {
		this.distritoResidencia = distritoResidencia;
	}
	public EstadoPedido getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(EstadoPedido estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	public String getGlosa() {
		return glosa;
	}
	public void setGlosa(String glosa) {
		this.glosa = glosa;
	}
	public String getPlacaVehiculo() {
		return placaVehiculo;
	}
	public void setPlacaVehiculo(String placaVehiculo) {
		this.placaVehiculo = placaVehiculo;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public String getProvinciaDespacho() {
		return provinciaDespacho;
	}
	public void setProvinciaDespacho(String provinciaDespacho) {
		this.provinciaDespacho = provinciaDespacho;
	}
	public String getProvinciaResidencia() {
		return provinciaResidencia;
	}
	public void setProvinciaResidencia(String provinciaResidencia) {
		this.provinciaResidencia = provinciaResidencia;
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public String getRegionDespacho() {
		return regionDespacho;
	}
	public void setRegionDespacho(String regionDespacho) {
		this.regionDespacho = regionDespacho;
	}
	public String getRegionResidencia() {
		return regionResidencia;
	}
	public void setRegionResidencia(String regionResidencia) {
		this.regionResidencia = regionResidencia;
	}
	public TipoGuiaRemision getTipoGuiaRemision() {
		return tipoGuiaRemision;
	}
	public void setTipoGuiaRemision(TipoGuiaRemision tipoGuiaRemision) {
		this.tipoGuiaRemision = tipoGuiaRemision;
	}
	public String getTipoIdentificacionTransportista() {
		return tipoIdentificacionTransportista;
	}
	public void setTipoIdentificacionTransportista(String tipoIdentificacionTransportista) {
		this.tipoIdentificacionTransportista = tipoIdentificacionTransportista;
	}
	public Transportista getTransportista() {
		return transportista;
	}
	public void setTransportista(Transportista transportista) {
		this.transportista = transportista;
	}
	public int getUbigeoDespacho() {
		return ubigeoDespacho;
	}
	public void setUbigeoDespacho(int ubigeoDespacho) {
		this.ubigeoDespacho = ubigeoDespacho;
	}
	public int getUbigeoResidencia() {
		return ubigeoResidencia;
	}
	public void setUbigeoResidencia(int ubigeoResidencia) {
		this.ubigeoResidencia = ubigeoResidencia;
	}
	public String getZonaDespacho() {
		return zonaDespacho;
	}
	public void setZonaDespacho(String zonaDespacho) {
		this.zonaDespacho = zonaDespacho;
	}
	public String getZonaResidencia() {
		return zonaResidencia;
	}
	public void setZonaResidencia(String zonaResidencia) {
		this.zonaResidencia = zonaResidencia;
	}
	public double getValorImpuesto() {
		return valorImpuesto;
	}
	public void setValorImpuesto(double valorImpuesto) {
		this.valorImpuesto = valorImpuesto;
	}
	public String getSerieOperacion() {
		return serieOperacion;
	}
	public void setSerieOperacion(String serieOperacion) {
		this.serieOperacion = serieOperacion;
	}
	public PrecioVenta getPrecioVenta() {
		return precioVenta;
	}
	public void setPrecioVenta(PrecioVenta precioVenta) {
		this.precioVenta = precioVenta;
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
	public double getPrecioCosto() {
		return precioCosto;
	}
	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}
	public double getPrecioComision() {
		return precioComision;
	}
	public void setPrecioComision(double precioComision) {
		this.precioComision = precioComision;
	}
	public String getNumeroOperacion() {
		return numeroOperacion;
	}
	public void setNumeroOperacion(String numeroOperacion) {
		this.numeroOperacion = numeroOperacion;
	}
	public int getDocumentoOperacionReferencia() {
		return documentoOperacionReferencia;
	}
	public void setDocumentoOperacionReferencia(int documentoOperacionReferencia) {
		this.documentoOperacionReferencia = documentoOperacionReferencia;
	}
	public int getDocumentoOperacion() {
		return documentoOperacion;
	}
	public void setDocumentoOperacion(int documentoOperacion) {
		this.documentoOperacion = documentoOperacion;
	}
	public TipoPedido getTipoPedido() {
		return tipoPedido;
	}
	public void setTipoPedido(TipoPedido tipoPedido) {
		this.tipoPedido = tipoPedido;
	}
	public int getReservado01() {
		return reservado01;
	}
	public void setReservado01(int reservado01) {
		this.reservado01 = reservado01;
	}
	public double getImporteValorVenta() {
		return importeValorVenta;
	}
	public void setImporteValorVenta(double importeValorVenta) {
		this.importeValorVenta = importeValorVenta;
	}
	public double getImportePrecioVenta() {
		return importePrecioVenta;
	}
	public void setImportePrecioVenta(double importePrecioVenta) {
		this.importePrecioVenta = importePrecioVenta;
	}
	public MotivoOperacion getMotivoOperacion() {
		return motivoOperacion;
	}
	public void setMotivoOperacion(MotivoOperacion motivoOperacion) {
		this.motivoOperacion = motivoOperacion;
	}
	
	
}
