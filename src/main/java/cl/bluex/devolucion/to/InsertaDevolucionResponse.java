package cl.bluex.devolucion.to;

public class InsertaDevolucionResponse {
	
	private String idNumeroRequerimiento;
	private String mensajeRespuesta;
	private int codigoRespuesta;
	
	public String getIdNumeroRequerimiento() {
		return idNumeroRequerimiento;
	}
	public void setIdNumeroRequerimiento(String idNumeroRequerimiento) {
		this.idNumeroRequerimiento = idNumeroRequerimiento;
	}
	public String getMensajeRespuesta() {
		return mensajeRespuesta;
	}
	public void setMensajeRespuesta(String mensajeRespuesta) {
		this.mensajeRespuesta = mensajeRespuesta;
	}
	public int getCodigoRespuesta() {
		return codigoRespuesta;
	}
	public void setCodigoRespuesta(int codigoRespuesta) {
		this.codigoRespuesta = codigoRespuesta;
	}
	@Override
	public String toString() {
		return "InsertaDevolucionResponse [idNumeroRequerimiento=" + idNumeroRequerimiento + ", mensajeRespuesta="
				+ mensajeRespuesta + ", codigoRespuesta=" + codigoRespuesta + "]";
	}
	
	
	
	
	

}
