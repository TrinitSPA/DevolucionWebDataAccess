package cl.bluex.devolucion.to;

public class InsertDevolucionRequest {
	
	 String rut;
	 String nombre;
	 String email;
	 String telefono;
	 int codigoEmpresa;
	 int codigoMotivo;
	 String ordenCompra;
	 String tipoProducto;
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public int getCodigoEmpresa() {
		return codigoEmpresa;
	}
	public void setCodigoEmpresa(int codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}
	public int getCodigoMotivo() {
		return codigoMotivo;
	}
	public void setCodigoMotivo(int codigoMotivo) {
		this.codigoMotivo = codigoMotivo;
	}
	public String getOrdenCompra() {
		return ordenCompra;
	}
	public void setOrdenCompra(String ordenCompra) {
		this.ordenCompra = ordenCompra;
	}
	public String getTipoProducto() {
		return tipoProducto;
	}
	public void setTipoProducto(String tipoProducto) {
		this.tipoProducto = tipoProducto;
	}
	@Override
	public String toString() {
		return "InsertDevolucionRequest [rut=" + rut + ", nombre=" + nombre + ", email=" + email + ", telefono="
				+ telefono + ", codigoEmpresa=" + codigoEmpresa + ", codigoMotivo=" + codigoMotivo + ", ordenCompra="
				+ ordenCompra + ", tipoProducto=" + tipoProducto + "]";
	}
	
	 
	
	
	

}
