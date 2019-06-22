package artemisa.domain.sistema.entities;

import java.io.Serializable;
import java.util.Date;

public class Empleado extends Generica  implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1959949999399908856L;

	public Empleado() {
	}

	private String nombre; 
	private int empresaArea; 
	private int empresaCargo; 
	private String claveRed; 
	private String nombreCorreo; 
	private EmpleadoGrupo empleadoGrupo; 
	private Pais pais; 
	private int numeroIntentoIngreso;
	private String nombreRed;
	private int numeroSesionPermitido;
	private String apellidoPaterno;
	private String apellidoMaterno;
	private Sexo sexo;
	private Date fechaNacimiento;
	private EstadoCivil estadoCivil;
	private int puedeAutorizar;
	private Empresa empresa;

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEmpresaArea() {
		return empresaArea;
	}
	public void setEmpresaArea(int empresaArea) {
		this.empresaArea = empresaArea;
	}
	public int getEmpresaCargo() {
		return empresaCargo;
	}
	public void setEmpresaCargo(int empresaCargo) {
		this.empresaCargo = empresaCargo;
	}
	public String getClaveRed() {
		return claveRed;
	}
	public void setClaveRed(String claveRed) {
		this.claveRed = claveRed;
	}
	public String getNombreCorreo() {
		return nombreCorreo;
	}
	public void setNombreCorreo(String nombreCorreo) {
		this.nombreCorreo = nombreCorreo;
	}
	public EmpleadoGrupo getEmpleadoGrupo() {
		return empleadoGrupo;
	}
	public void setEmpleadoGrupo(EmpleadoGrupo empleadoGrupo) {
		this.empleadoGrupo = empleadoGrupo;
	}
	public Pais getPais() {
		return pais;
	}
	public void setPais(Pais pais) {
		this.pais = pais;
	}
	public int getNumeroIntentoIngreso() {
		return numeroIntentoIngreso;
	}
	public void setNumeroIntentoIngreso(int numeroIntentoIngreso) {
		this.numeroIntentoIngreso = numeroIntentoIngreso;
	}
	public String getNombreRed() {
		return nombreRed;
	}
	public void setNombreRed(String nombreRed) {
		this.nombreRed = nombreRed;
	}
	public int getNumeroSesionPermitido() {
		return numeroSesionPermitido;
	}
	public void setNumeroSesionPermitido(int numeroSesionPermitido) {
		this.numeroSesionPermitido = numeroSesionPermitido;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}
	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}
	public int getPuedeAutorizar() {
		return puedeAutorizar;
	}
	public void setPuedeAutorizar(int puedeAutorizar) {
		this.puedeAutorizar = puedeAutorizar;
	}
	public Empresa getEmpresa() {
		return empresa;
	}
	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

		

}
