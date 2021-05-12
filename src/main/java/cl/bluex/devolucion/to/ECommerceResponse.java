package cl.bluex.devolucion.to;

import java.sql.Date;

public class ECommerceResponse {

	int segEmpresa;
	int codigoEmpresa;
	int rutEmpresa;
	int digRut;
	int cl_cdg;
	String nombreEmpresa;
	String mail;
	Date fecha;
	int estado;
	
	public int getSegEmpresa() {
		return segEmpresa;
	}
	public void setSegEmpresa(int segEmpresa) {
		this.segEmpresa = segEmpresa;
	}
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	public int getRutEmpresa() {
		return rutEmpresa;
	}
	public void setRutEmpresa(int rutEmpresa) {
		this.rutEmpresa = rutEmpresa;
	}
	public int getDigRut() {
		return digRut;
	}
	public void setDigRut(int digRut) {
		this.digRut = digRut;
	}
	public int getCl_cdg() {
		return cl_cdg;
	}
	public void setCl_cdg(int cl_cdg) {
		this.cl_cdg = cl_cdg;
	}
	public String getNombreEmpresa() {
		return nombreEmpresa;
	}
	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	@Override
	public String toString() {
		return "ECommerceResponse [segEmpresa=" + segEmpresa + ", codigoEmpresa=" + codigoEmpresa + ", rutEmpresa="
				+ rutEmpresa + ", digRut=" + digRut + ", cl_cdg=" + cl_cdg + ", nombreEmpresa=" + nombreEmpresa
				+ ", mail=" + mail + ", fecha=" + fecha + ", estado=" + estado + "]";
	}
	
	
	
	
}
