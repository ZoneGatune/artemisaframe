package artemisa.domain.sistema.entities;

import java.io.Serializable;

/**
 * @author Jossymar Cabanillas
 *
 */
public class AcumuladoArticulo extends Generica implements Serializable {

	private static final long serialVersionUID = 8245751563009895089L;
	public AcumuladoArticulo() {
	}
	
	private Pais pais;
	private Empresa empresa;
	private Almacen almacen;
	private Articulo articulo;
	private double inicioCantidad;
	private double inicioCostoPromedio;
	private double eneroIngresoCantidad;
	private double eneroIngresoValorizado;
	private double eneroSalidaCantidad;
	private double eneroSalidaValorizado;
	private double eneroCostoPromedio;
	private double febreroIngresoCantidad;
	private double febreroIngresoValorizado;
	private double febreroSalidaCantidad;
	private double febreroSalidaValorizado;
	private double febreroCostoPromedio;
	private double marzoIngresoCantidad;
	private double marzoIngresoValorizado;
	private double marzoSalidaCantidad;
	private double marzoSalidaValorizado;
	private double marzoCostoPromedio;
	private double abrilIngresoCantidad;
	private double abrilIngresoValorizado;
	private double abrilSalidaCantidad;
	private double abrilSalidaValorizado;
	private double abrilCostoPromedio;
	private double mayoIngresoCantidad;
	private double mayoIngresoValorizado;
	private double mayoSalidaCantidad;
	private double mayoSalidaValorizado;
	private double mayoCostoPromedio;
	private double junioIngresoCantidad;
	private double junioIngresoValorizado;
	private double junioSalidaCantidad;
	private double junioSalidaValorizado;
	private double junioCostoPromedio;
	private double julioIngresoCantidad;
	private double julioIngresoValorizado;
	private double julioSalidaCantidad;
	private double julioSalidaValorizado;
	private double julioCostoPromedio;	
	private double agostoIngresoCantidad;
	private double agostoIngresoValorizado;
	private double agostoSalidaCantidad;
	private double agostoSalidaValorizado;
	private double agostoCostoPromedio;	
	private double septiembreIngresoCantidad;
	private double septiembreIngresoValorizado;
	private double septiembreSalidaCantidad;
	private double septiembreSalidaValorizado;
	private double septiembreCostoPromedio;
	private double octubreIngresoCantidad;
	private double octubreIngresoValorizado;
	private double octubreSalidaCantidad;
	private double octubreSalidaValorizado;
	private double octubreCostoPromedio;
	private double noviembreIngresoCantidad;
	private double noviembreIngresoValorizado;
	private double noviembreSalidaCantidad;
	private double noviembreSalidaValorizado;
	private double noviembreCostoPromedio;
	private double diciembreIngresoCantidad;
	private double diciembreIngresoValorizado;
	private double diciembreSalidaCantidad;
	private double diciembreSalidaValorizado;
	private double diciembreCostoPromedio;
	private String anyho;
	
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
	public Almacen getAlmacen() {
		return almacen;
	}
	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}
	public Articulo getArticulo() {
		return articulo;
	}
	public void setArticulo(Articulo articulo) {
		this.articulo = articulo;
	}
	public double getInicioCantidad() {
		return inicioCantidad;
	}
	public void setInicioCantidad(double inicioCantidad) {
		this.inicioCantidad = inicioCantidad;
	}
	public double getInicioCostoPromedio() {
		return inicioCostoPromedio;
	}
	public void setInicioCostoPromedio(double inicioCostoPromedio) {
		this.inicioCostoPromedio = inicioCostoPromedio;
	}
	public double getEneroIngresoCantidad() {
		return eneroIngresoCantidad;
	}
	public void setEneroIngresoCantidad(double eneroIngresoCantidad) {
		this.eneroIngresoCantidad = eneroIngresoCantidad;
	}
	public double getEneroIngresoValorizado() {
		return eneroIngresoValorizado;
	}
	public void setEneroIngresoValorizado(double eneroIngresoValorizado) {
		this.eneroIngresoValorizado = eneroIngresoValorizado;
	}
	public double getEneroSalidaCantidad() {
		return eneroSalidaCantidad;
	}
	public void setEneroSalidaCantidad(double eneroSalidaCantidad) {
		this.eneroSalidaCantidad = eneroSalidaCantidad;
	}
	public double getEneroSalidaValorizado() {
		return eneroSalidaValorizado;
	}
	public void setEneroSalidaValorizado(double eneroSalidaValorizado) {
		this.eneroSalidaValorizado = eneroSalidaValorizado;
	}
	public double getEneroCostoPromedio() {
		return eneroCostoPromedio;
	}
	public void setEneroCostoPromedio(double eneroCostoPromedio) {
		this.eneroCostoPromedio = eneroCostoPromedio;
	}
	public double getFebreroIngresoCantidad() {
		return febreroIngresoCantidad;
	}
	public void setFebreroIngresoCantidad(double febreroIngresoCantidad) {
		this.febreroIngresoCantidad = febreroIngresoCantidad;
	}
	public double getFebreroIngresoValorizado() {
		return febreroIngresoValorizado;
	}
	public void setFebreroIngresoValorizado(double febreroIngresoValorizado) {
		this.febreroIngresoValorizado = febreroIngresoValorizado;
	}
	public double getFebreroSalidaCantidad() {
		return febreroSalidaCantidad;
	}
	public void setFebreroSalidaCantidad(double febreroSalidaCantidad) {
		this.febreroSalidaCantidad = febreroSalidaCantidad;
	}
	public double getFebreroSalidaValorizado() {
		return febreroSalidaValorizado;
	}
	public void setFebreroSalidaValorizado(double febreroSalidaValorizado) {
		this.febreroSalidaValorizado = febreroSalidaValorizado;
	}
	public double getFebreroCostoPromedio() {
		return febreroCostoPromedio;
	}
	public void setFebreroCostoPromedio(double febreroCostoPromedio) {
		this.febreroCostoPromedio = febreroCostoPromedio;
	}
	public double getMarzoIngresoCantidad() {
		return marzoIngresoCantidad;
	}
	public void setMarzoIngresoCantidad(double marzoIngresoCantidad) {
		this.marzoIngresoCantidad = marzoIngresoCantidad;
	}
	public double getMarzoIngresoValorizado() {
		return marzoIngresoValorizado;
	}
	public void setMarzoIngresoValorizado(double marzoIngresoValorizado) {
		this.marzoIngresoValorizado = marzoIngresoValorizado;
	}
	public double getMarzoSalidaCantidad() {
		return marzoSalidaCantidad;
	}
	public void setMarzoSalidaCantidad(double marzoSalidaCantidad) {
		this.marzoSalidaCantidad = marzoSalidaCantidad;
	}
	public double getMarzoSalidaValorizado() {
		return marzoSalidaValorizado;
	}
	public void setMarzoSalidaValorizado(double marzoSalidaValorizado) {
		this.marzoSalidaValorizado = marzoSalidaValorizado;
	}
	public double getMarzoCostoPromedio() {
		return marzoCostoPromedio;
	}
	public void setMarzoCostoPromedio(double marzoCostoPromedio) {
		this.marzoCostoPromedio = marzoCostoPromedio;
	}
	public double getAbrilIngresoCantidad() {
		return abrilIngresoCantidad;
	}
	public void setAbrilIngresoCantidad(double abrilIngresoCantidad) {
		this.abrilIngresoCantidad = abrilIngresoCantidad;
	}
	public double getAbrilIngresoValorizado() {
		return abrilIngresoValorizado;
	}
	public void setAbrilIngresoValorizado(double abrilIngresoValorizado) {
		this.abrilIngresoValorizado = abrilIngresoValorizado;
	}
	public double getAbrilSalidaCantidad() {
		return abrilSalidaCantidad;
	}
	public void setAbrilSalidaCantidad(double abrilSalidaCantidad) {
		this.abrilSalidaCantidad = abrilSalidaCantidad;
	}
	public double getAbrilSalidaValorizado() {
		return abrilSalidaValorizado;
	}
	public void setAbrilSalidaValorizado(double abrilSalidaValorizado) {
		this.abrilSalidaValorizado = abrilSalidaValorizado;
	}
	public double getAbrilCostoPromedio() {
		return abrilCostoPromedio;
	}
	public void setAbrilCostoPromedio(double abrilCostoPromedio) {
		this.abrilCostoPromedio = abrilCostoPromedio;
	}
	public double getMayoIngresoCantidad() {
		return mayoIngresoCantidad;
	}
	public void setMayoIngresoCantidad(double mayoIngresoCantidad) {
		this.mayoIngresoCantidad = mayoIngresoCantidad;
	}
	public double getMayoIngresoValorizado() {
		return mayoIngresoValorizado;
	}
	public void setMayoIngresoValorizado(double mayoIngresoValorizado) {
		this.mayoIngresoValorizado = mayoIngresoValorizado;
	}
	public double getMayoSalidaCantidad() {
		return mayoSalidaCantidad;
	}
	public void setMayoSalidaCantidad(double mayoSalidaCantidad) {
		this.mayoSalidaCantidad = mayoSalidaCantidad;
	}
	public double getMayoSalidaValorizado() {
		return mayoSalidaValorizado;
	}
	public void setMayoSalidaValorizado(double mayoSalidaValorizado) {
		this.mayoSalidaValorizado = mayoSalidaValorizado;
	}
	public double getMayoCostoPromedio() {
		return mayoCostoPromedio;
	}
	public void setMayoCostoPromedio(double mayoCostoPromedio) {
		this.mayoCostoPromedio = mayoCostoPromedio;
	}
	public double getJunioIngresoCantidad() {
		return junioIngresoCantidad;
	}
	public void setJunioIngresoCantidad(double junioIngresoCantidad) {
		this.junioIngresoCantidad = junioIngresoCantidad;
	}
	public double getJunioIngresoValorizado() {
		return junioIngresoValorizado;
	}
	public void setJunioIngresoValorizado(double junioIngresoValorizado) {
		this.junioIngresoValorizado = junioIngresoValorizado;
	}
	public double getJunioSalidaCantidad() {
		return junioSalidaCantidad;
	}
	public void setJunioSalidaCantidad(double junioSalidaCantidad) {
		this.junioSalidaCantidad = junioSalidaCantidad;
	}
	public double getJunioSalidaValorizado() {
		return junioSalidaValorizado;
	}
	public void setJunioSalidaValorizado(double junioSalidaValorizado) {
		this.junioSalidaValorizado = junioSalidaValorizado;
	}
	public double getJunioCostoPromedio() {
		return junioCostoPromedio;
	}
	public void setJunioCostoPromedio(double junioCostoPromedio) {
		this.junioCostoPromedio = junioCostoPromedio;
	}
	public double getJulioIngresoCantidad() {
		return julioIngresoCantidad;
	}
	public void setJulioIngresoCantidad(double julioIngresoCantidad) {
		this.julioIngresoCantidad = julioIngresoCantidad;
	}
	public double getJulioIngresoValorizado() {
		return julioIngresoValorizado;
	}
	public void setJulioIngresoValorizado(double julioIngresoValorizado) {
		this.julioIngresoValorizado = julioIngresoValorizado;
	}
	public double getJulioSalidaCantidad() {
		return julioSalidaCantidad;
	}
	public void setJulioSalidaCantidad(double julioSalidaCantidad) {
		this.julioSalidaCantidad = julioSalidaCantidad;
	}
	public double getJulioSalidaValorizado() {
		return julioSalidaValorizado;
	}
	public void setJulioSalidaValorizado(double julioSalidaValorizado) {
		this.julioSalidaValorizado = julioSalidaValorizado;
	}
	public double getJulioCostoPromedio() {
		return julioCostoPromedio;
	}
	public void setJulioCostoPromedio(double julioCostoPromedio) {
		this.julioCostoPromedio = julioCostoPromedio;
	}
	public double getAgostoIngresoCantidad() {
		return agostoIngresoCantidad;
	}
	public void setAgostoIngresoCantidad(double agostoIngresoCantidad) {
		this.agostoIngresoCantidad = agostoIngresoCantidad;
	}
	public double getAgostoIngresoValorizado() {
		return agostoIngresoValorizado;
	}
	public void setAgostoIngresoValorizado(double agostoIngresoValorizado) {
		this.agostoIngresoValorizado = agostoIngresoValorizado;
	}
	public double getAgostoSalidaCantidad() {
		return agostoSalidaCantidad;
	}
	public void setAgostoSalidaCantidad(double agostoSalidaCantidad) {
		this.agostoSalidaCantidad = agostoSalidaCantidad;
	}
	public double getAgostoSalidaValorizado() {
		return agostoSalidaValorizado;
	}
	public void setAgostoSalidaValorizado(double agostoSalidaValorizado) {
		this.agostoSalidaValorizado = agostoSalidaValorizado;
	}
	public double getAgostoCostoPromedio() {
		return agostoCostoPromedio;
	}
	public void setAgostoCostoPromedio(double agostoCostoPromedio) {
		this.agostoCostoPromedio = agostoCostoPromedio;
	}
	public double getSeptiembreIngresoCantidad() {
		return septiembreIngresoCantidad;
	}
	public void setSeptiembreIngresoCantidad(double septiembreIngresoCantidad) {
		this.septiembreIngresoCantidad = septiembreIngresoCantidad;
	}
	public double getSeptiembreIngresoValorizado() {
		return septiembreIngresoValorizado;
	}
	public void setSeptiembreIngresoValorizado(double septiembreIngresoValorizado) {
		this.septiembreIngresoValorizado = septiembreIngresoValorizado;
	}
	public double getSeptiembreSalidaCantidad() {
		return septiembreSalidaCantidad;
	}
	public void setSeptiembreSalidaCantidad(double septiembreSalidaCantidad) {
		this.septiembreSalidaCantidad = septiembreSalidaCantidad;
	}
	public double getSeptiembreSalidaValorizado() {
		return septiembreSalidaValorizado;
	}
	public void setSeptiembreSalidaValorizado(double septiembreSalidaValorizado) {
		this.septiembreSalidaValorizado = septiembreSalidaValorizado;
	}
	public double getSeptiembreCostoPromedio() {
		return septiembreCostoPromedio;
	}
	public void setSeptiembreCostoPromedio(double septiembreCostoPromedio) {
		this.septiembreCostoPromedio = septiembreCostoPromedio;
	}
	public double getOctubreIngresoCantidad() {
		return octubreIngresoCantidad;
	}
	public void setOctubreIngresoCantidad(double octubreIngresoCantidad) {
		this.octubreIngresoCantidad = octubreIngresoCantidad;
	}
	public double getOctubreIngresoValorizado() {
		return octubreIngresoValorizado;
	}
	public void setOctubreIngresoValorizado(double octubreIngresoValorizado) {
		this.octubreIngresoValorizado = octubreIngresoValorizado;
	}
	public double getOctubreSalidaCantidad() {
		return octubreSalidaCantidad;
	}
	public void setOctubreSalidaCantidad(double octubreSalidaCantidad) {
		this.octubreSalidaCantidad = octubreSalidaCantidad;
	}
	public double getOctubreSalidaValorizado() {
		return octubreSalidaValorizado;
	}
	public void setOctubreSalidaValorizado(double octubreSalidaValorizado) {
		this.octubreSalidaValorizado = octubreSalidaValorizado;
	}
	public double getOctubreCostoPromedio() {
		return octubreCostoPromedio;
	}
	public void setOctubreCostoPromedio(double octubreCostoPromedio) {
		this.octubreCostoPromedio = octubreCostoPromedio;
	}
	public double getNoviembreIngresoCantidad() {
		return noviembreIngresoCantidad;
	}
	public void setNoviembreIngresoCantidad(double noviembreIngresoCantidad) {
		this.noviembreIngresoCantidad = noviembreIngresoCantidad;
	}
	public double getNoviembreIngresoValorizado() {
		return noviembreIngresoValorizado;
	}
	public void setNoviembreIngresoValorizado(double noviembreIngresoValorizado) {
		this.noviembreIngresoValorizado = noviembreIngresoValorizado;
	}
	public double getNoviembreSalidaCantidad() {
		return noviembreSalidaCantidad;
	}
	public void setNoviembreSalidaCantidad(double noviembreSalidaCantidad) {
		this.noviembreSalidaCantidad = noviembreSalidaCantidad;
	}
	public double getNoviembreSalidaValorizado() {
		return noviembreSalidaValorizado;
	}
	public void setNoviembreSalidaValorizado(double noviembreSalidaValorizado) {
		this.noviembreSalidaValorizado = noviembreSalidaValorizado;
	}
	public double getNoviembreCostoPromedio() {
		return noviembreCostoPromedio;
	}
	public void setNoviembreCostoPromedio(double noviembreCostoPromedio) {
		this.noviembreCostoPromedio = noviembreCostoPromedio;
	}
	public double getDiciembreIngresoCantidad() {
		return diciembreIngresoCantidad;
	}
	public void setDiciembreIngresoCantidad(double diciembreIngresoCantidad) {
		this.diciembreIngresoCantidad = diciembreIngresoCantidad;
	}
	public double getDiciembreIngresoValorizado() {
		return diciembreIngresoValorizado;
	}
	public void setDiciembreIngresoValorizado(double diciembreIngresoValorizado) {
		this.diciembreIngresoValorizado = diciembreIngresoValorizado;
	}
	public double getDiciembreSalidaCantidad() {
		return diciembreSalidaCantidad;
	}
	public void setDiciembreSalidaCantidad(double diciembreSalidaCantidad) {
		this.diciembreSalidaCantidad = diciembreSalidaCantidad;
	}
	public double getDiciembreSalidaValorizado() {
		return diciembreSalidaValorizado;
	}
	public void setDiciembreSalidaValorizado(double diciembreSalidaValorizado) {
		this.diciembreSalidaValorizado = diciembreSalidaValorizado;
	}
	public double getDiciembreCostoPromedio() {
		return diciembreCostoPromedio;
	}
	public void setDiciembreCostoPromedio(double diciembreCostoPromedio) {
		this.diciembreCostoPromedio = diciembreCostoPromedio;
	}
	public String getAnyho() {
		return anyho;
	}
	public void setAnyho(String anyho) {
		this.anyho = anyho;
	}
	
		
}
