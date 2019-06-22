package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class Articulo extends Generica implements Serializable {

	private static final long serialVersionUID = 7253175135070722907L;
	public Articulo() {
	}
	
	private Pais pais;
	private Empresa empresa; 
	private String nombreComercial; 
	private String nombreProveedor;
	private Proveedor proveedor; 
	private String ubicacion; 
	private int unidadAlmacen; 
	private int unidadCompra; 
	private int familia; 
	private double cantidadMinima; 
	private double loteEconomico; 
	private double largo; 
	private double ancho; 
	private double alto; 
	private String descripcion; 
	private TipoArticulo tipoArticulo; 
	private double precioCosto;  
	private Color color; 
	private int unidadEmpaqueCapital; 
	private int unidadEmpaqueExterior; 
	private int unidadEmpaqueProvincia;
	private GrupoPadre grupoPadre; 
	private int indicadorVentaMensualPreviaComision; 
	private int codigoLinea;
	private int codigoSegmento; 
	private int subCategoria; 
	private int subSegmento; 
	private int categoria;
	private int gama; 
	private Marca marca; 
	private TipoArticulo tipoArticuloAnterior; 
	private String codigoBarra; 
	private String codigoAnterior; 
	private int indicadorVentaStock;
		
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
	public String getNombreComercial() {
		return nombreComercial;
	}
	public void setNombreComercial(String nombreComercial) {
		this.nombreComercial = nombreComercial;
	}
	public String getNombreProveedor() {
		return nombreProveedor;
	}
	public void setNombreProveedor(String nombreProveedor) {
		this.nombreProveedor = nombreProveedor;
	}
	public Proveedor getProveedor() {
		return proveedor;
	}
	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public int getUnidadAlmacen() {
		return unidadAlmacen;
	}
	public void setUnidadAlmacen(int unidadAlmacen) {
		this.unidadAlmacen = unidadAlmacen;
	}
	public int getUnidadCompra() {
		return unidadCompra;
	}
	public void setUnidadCompra(int unidadCompra) {
		this.unidadCompra = unidadCompra;
	}
	public int getFamilia() {
		return familia;
	}
	public void setFamilia(int familia) {
		this.familia = familia;
	}
	public double getCantidadMinima() {
		return cantidadMinima;
	}
	public void setCantidadMinima(double cantidadMinima) {
		this.cantidadMinima = cantidadMinima;
	}
	public double getLoteEconomico() {
		return loteEconomico;
	}
	public void setLoteEconomico(double loteEconomico) {
		this.loteEconomico = loteEconomico;
	}
	public double getLargo() {
		return largo;
	}
	public void setLargo(double largo) {
		this.largo = largo;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getAlto() {
		return alto;
	}
	public void setAlto(double alto) {
		this.alto = alto;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public TipoArticulo getTipoArticulo() {
		return tipoArticulo;
	}
	public void setTipoArticulo(TipoArticulo tipoArticulo) {
		this.tipoArticulo = tipoArticulo;
	}
	public double getPrecioCosto() {
		return precioCosto;
	}
	public void setPrecioCosto(double precioCosto) {
		this.precioCosto = precioCosto;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public int getUnidadEmpaqueCapital() {
		return unidadEmpaqueCapital;
	}
	public void setUnidadEmpaqueCapital(int unidadEmpaqueCapital) {
		this.unidadEmpaqueCapital = unidadEmpaqueCapital;
	}
	public int getUnidadEmpaqueExterior() {
		return unidadEmpaqueExterior;
	}
	public void setUnidadEmpaqueExterior(int unidadEmpaqueExterior) {
		this.unidadEmpaqueExterior = unidadEmpaqueExterior;
	}
	public int getUnidadEmpaqueProvincia() {
		return unidadEmpaqueProvincia;
	}
	public void setUnidadEmpaqueProvincia(int unidadEmpaqueProvincia) {
		this.unidadEmpaqueProvincia = unidadEmpaqueProvincia;
	}
	public GrupoPadre getGrupoPadre() {
		return grupoPadre;
	}
	public void setGrupoPadre(GrupoPadre grupoPadre) {
		this.grupoPadre = grupoPadre;
	}
	public int getIndicadorVentaMensualPreviaComision() {
		return indicadorVentaMensualPreviaComision;
	}
	public void setIndicadorVentaMensualPreviaComision(int indicadorVentaMensualPreviaComision) {
		this.indicadorVentaMensualPreviaComision = indicadorVentaMensualPreviaComision;
	}
	public int getCodigoLinea() {
		return codigoLinea;
	}
	public void setCodigoLinea(int codigoLinea) {
		this.codigoLinea = codigoLinea;
	}
	public int getCodigoSegmento() {
		return codigoSegmento;
	}
	public void setCodigoSegmento(int codigoSegmento) {
		this.codigoSegmento = codigoSegmento;
	}
	public int getSubCategoria() {
		return subCategoria;
	}
	public void setSubCategoria(int subCategoria) {
		this.subCategoria = subCategoria;
	}
	public int getSubSegmento() {
		return subSegmento;
	}
	public void setSubSegmento(int subSegmento) {
		this.subSegmento = subSegmento;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getGama() {
		return gama;
	}
	public void setGama(int gama) {
		this.gama = gama;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca marca) {
		this.marca = marca;
	}
	public TipoArticulo getTipoArticuloAnterior() {
		return tipoArticuloAnterior;
	}
	public void setTipoArticuloAnterior(TipoArticulo tipoArticuloAnterior) {
		this.tipoArticuloAnterior = tipoArticuloAnterior;
	}
	public String getCodigoBarra() {
		return codigoBarra;
	}
	public void setCodigoBarra(String codigoBarra) {
		this.codigoBarra = codigoBarra;
	}
	public String getCodigoAnterior() {
		return codigoAnterior;
	}
	public void setCodigoAnterior(String codigoAnterior) {
		this.codigoAnterior = codigoAnterior;
	}
	public int getIndicadorVentaStock() {
		return indicadorVentaStock;
	}
	public void setIndicadorVentaStock(int indicadorVentaStock) {
		this.indicadorVentaStock = indicadorVentaStock;
	}
		

}
