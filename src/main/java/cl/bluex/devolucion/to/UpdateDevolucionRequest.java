package cl.bluex.devolucion.to;

public class UpdateDevolucionRequest {
	
	int codigoDevolucion;
	int motivoDevolucion;
	String descripcionDevolucion;
	public int getCodigoDevolucion() {
		return codigoDevolucion;
	}
	public void setCodigoDevolucion(int codigoDevolucion) {
		this.codigoDevolucion = codigoDevolucion;
	}
	public int getMotivoDevolucion() {
		return motivoDevolucion;
	}
	public void setMotivoDevolucion(int motivoDevolucion) {
		this.motivoDevolucion = motivoDevolucion;
	}
	public String getDescripcionDevolucion() {
		return descripcionDevolucion;
	}
	public void setDescripcionDevolucion(String descripcionDevolucion) {
		this.descripcionDevolucion = descripcionDevolucion;
	}
	@Override
	public String toString() {
		return "UpdateDevolucionRequest [codigoDevolucion=" + codigoDevolucion + ", motivoDevolucion="
				+ motivoDevolucion + ", descripcionDevolucion=" + descripcionDevolucion + "]";
	}
	
	
	
	
	

}
