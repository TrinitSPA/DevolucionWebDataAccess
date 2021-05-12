package cl.bluex.devolucion.to;

public class UpdateDevolucionResponse {
	
	String descripcion;
	int codigoError;
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public int getCodigoError() {
		return codigoError;
	}
	public void setCodigoError(int codigoError) {
		this.codigoError = codigoError;
	}
	@Override
	public String toString() {
		return "UpdateDevolucionResponse [descripcion=" + descripcion + ", codigoError=" + codigoError + "]";
	}
	
	

}
