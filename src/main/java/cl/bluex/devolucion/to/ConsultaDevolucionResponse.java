package cl.bluex.devolucion.to;

public class ConsultaDevolucionResponse {
	
	private String numeroRequerimiento;
	private String nombreCliente;
	private String rut;
	private String nombreProducto;
	private String estadoDevolucion;
	private String motivoDevolucion;
	private String fechaIngresoDevolucion;

	public String getNumeroRequerimiento() {
		return numeroRequerimiento;
	}
	public void setNumeroRequerimiento(String numeroRequerimiento) {
		this.numeroRequerimiento = numeroRequerimiento;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getRut() {
		return rut;
	}
	public void setRut(String rut) {
		this.rut = rut;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public String getEstadoDevolucion() {
		return estadoDevolucion;
	}
	public void setEstadoDevolucion(String estadoDevolucion) {
		this.estadoDevolucion = estadoDevolucion;
	}
	public String getMotivoDevolucion() {
		return motivoDevolucion;
	}
	public void setMotivoDevolucion(String motivoDevolucion) {
		this.motivoDevolucion = motivoDevolucion;
	}
	public String getFechaIngresoDevolucion() {
		return fechaIngresoDevolucion;
	}
	public void setFechaIngresoDevolucion(String fechaIngresoDevolucion) {
		this.fechaIngresoDevolucion = fechaIngresoDevolucion;
	}
	
	
	@Override
	public String toString() {
		return "ConsultaDevolucionResponse [numeroRequerimiento=" + numeroRequerimiento + ", nombreCliente="
				+ nombreCliente + ", rut=" + rut + ", nombreProducto=" + nombreProducto + ", estadoDevolucion="
				+ estadoDevolucion + ", motivoDevolucion=" + motivoDevolucion + ", fechaIngresoDevolucion="
				+ fechaIngresoDevolucion + "]";
	}
	
	
	
	

}
