package cl.bluex.devolucion.to;

public class DevolucionResponse {

	long codDevolucion;
	String nroRequerimiento;
	int codMotivo;
	String nombreMotivo;
	int codEcommerce;
	String eCommerce;
	int codEstadoDevolucion;
	String nombreDevolucion;
	String nombreUsuario;
	String fechaDevolucion;
	String descripProducto;
	long eevvNmrId;
	long nroOrdenServicio;
	int emprCdg;
	long clienteCodigo;
	int clienteSucursal;
	int clienteTipo;
	String emailUsuario;
	String telefono; 
	String identificador;
	
	public long getCodDevolucion() {
		return codDevolucion;
	}
	public void setCodDevolucion(long codDevolucion) {
		this.codDevolucion = codDevolucion;
	}
	public String getNroRequerimiento() {
		return nroRequerimiento;
	}
	public void setNroRequerimiento(String nroRequerimiento) {
		this.nroRequerimiento = nroRequerimiento;
	}
	public int getCodMotivo() {
		return codMotivo;
	}
	public void setCodMotivo(int codMotivo) {
		this.codMotivo = codMotivo;
	}
	public String getNombreMotivo() {
		return nombreMotivo;
	}
	public void setNombreMotivo(String nombreMotivo) {
		this.nombreMotivo = nombreMotivo;
	}
	public int getCodEcommerce() {
		return codEcommerce;
	}
	public void setCodEcommerce(int codEcommerce) {
		this.codEcommerce = codEcommerce;
	}
	public String geteCommerce() {
		return eCommerce;
	}
	public void seteCommerce(String eCommerce) {
		this.eCommerce = eCommerce;
	}
	public int getCodEstadoDevolucion() {
		return codEstadoDevolucion;
	}
	public void setCodEstadoDevolucion(int codEstadoDevolucion) {
		this.codEstadoDevolucion = codEstadoDevolucion;
	}
	public String getNombreDevolucion() {
		return nombreDevolucion;
	}
	public void setNombreDevolucion(String nombreDevolucion) {
		this.nombreDevolucion = nombreDevolucion;
	}
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	public String getFechaDevolucion() {
		return fechaDevolucion;
	}
	public void setFechaDevolucion(String fechaDevolucion) {
		this.fechaDevolucion = fechaDevolucion;
	}
	public String getDescripProducto() {
		return descripProducto;
	}
	public void setDescripProducto(String descripProducto) {
		this.descripProducto = descripProducto;
	}
	public long getEevvNmrId() {
		return eevvNmrId;
	}
	public void setEevvNmrId(long eevvNmrId) {
		this.eevvNmrId = eevvNmrId;
	}
	public long getNroOrdenServicio() {
		return nroOrdenServicio;
	}
	public void setNroOrdenServicio(long nroOrdenServicio) {
		this.nroOrdenServicio = nroOrdenServicio;
	}
	public int getEmprCdg() {
		return emprCdg;
	}
	public void setEmprCdg(int emprCdg) {
		this.emprCdg = emprCdg;
	}
	public long getClienteCodigo() {
		return clienteCodigo;
	}
	public void setClienteCodigo(long clienteCodigo) {
		this.clienteCodigo = clienteCodigo;
	}
	public int getClienteSucursal() {
		return clienteSucursal;
	}
	public void setClienteSucursal(int clienteSucursal) {
		this.clienteSucursal = clienteSucursal;
	}
	public int getClienteTipo() {
		return clienteTipo;
	}
	public void setClienteTipo(int clienteTipo) {
		this.clienteTipo = clienteTipo;
	}
	public String getEmailUsuario() {
		return emailUsuario;
	}
	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}
	
	public String getTelefono() {
		return this.telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getIdentificador() {
		return this.identificador;
	}
	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	@Override
	public String toString() {
		return "DevolucionResponse [codDevolucion=" + codDevolucion + ", nroRequerimiento=" + nroRequerimiento
				+ ", codMotivo=" + codMotivo + ", nombreMotivo=" + nombreMotivo + ", codEcommerce=" + codEcommerce
				+ ", eCommerce=" + eCommerce + ", codEstadoDevolucion=" + codEstadoDevolucion + ", nombreDevolucion="
				+ nombreDevolucion + ", nombreUsuario=" + nombreUsuario + ", fechaDevolucion=" + fechaDevolucion
				+ ", descripProducto=" + descripProducto + ", eevvNmrId=" + eevvNmrId + ", nroOrdenServicio="
				+ nroOrdenServicio + ", emprCdg=" + emprCdg + ", clienteCodigo=" + clienteCodigo + ", clienteSucursal="
				+ clienteSucursal + ", clienteTipo=" + clienteTipo + ", emailUsuario=" + emailUsuario + ", telefono="
				+ telefono + ", identificador=" + identificador + "]";
	}
		
	

	
}
