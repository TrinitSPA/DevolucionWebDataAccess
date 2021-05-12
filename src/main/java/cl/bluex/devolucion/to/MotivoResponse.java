package cl.bluex.devolucion.to;

public class MotivoResponse {
	
	int codigoMotivo;
	String nombreMotivo;
	
	
	public int getCodigoMotivo() {
		return codigoMotivo;
	}
	public void setCodigoMotivo(int codigoMotivo) {
		this.codigoMotivo = codigoMotivo;
	}
	public String getNombreMotivo() {
		return nombreMotivo;
	}
	public void setNombreMotivo(String nombreMotivo) {
		this.nombreMotivo = nombreMotivo;
	}
	@Override
	public String toString() {
		return "MotivoResponse [codigoMotivo=" + codigoMotivo + ", nombreMotivo=" + nombreMotivo + "]";
	}
	
	

}
