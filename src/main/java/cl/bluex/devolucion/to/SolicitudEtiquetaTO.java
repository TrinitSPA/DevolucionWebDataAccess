package cl.bluex.devolucion.to;

import java.io.Serializable;

public class SolicitudEtiquetaTO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 460643464909785656L;
	
	private Integer codigoUsuario;
	private String idToken;
	private String codigoPersona;
	private String email;
	private String solicitud;
	private Integer codigoEmpresa;
	private Integer codigoCliente;
	private Integer codigoSucursal;
	private Integer tipoCliente;
	private String alias;
	private String nombreEmbalador;
	private String direccionEmbalador;
	private String telefonoEmbalador;
	private String localidadOrigen;
	private Integer regionOrigen;
	private Integer comunaOrigen;
	private String nombreDestinatario;
	private String direccionDestinatario;
	private String telefonoDestinatario;
	private String localidadDestino;
	private Integer regionDestino;
	private Integer comunaDestino;
	private Float pesoFisico;
	private Float pesoVolumen;
	private Integer cantidadPiezas;
	
	public SolicitudEtiquetaTO() {
		super();
	}
	
	public SolicitudEtiquetaTO(Integer codigoUsuario, String idToken, String codigoPersona, String email,
			String solicitud, Integer codigoEmpresa, Integer codigoCliente, Integer codigoSucursal, Integer tipoCliente,
			String alias, String nombreEmbalador, String direccionEmbalador, String telefonoEmbalador,
			String localidadOrigen, Integer regionOrigen, Integer comunaOrigen, String nombreDestinatario,
			String direccionDestinatario, String telefonoDestinatario, String localidadDestino, Integer regionDestino,
			Integer comunaDestino, Float pesoFisico, Float pesoVolumen, Integer cantidadPiezas) {
		super();
		this.codigoUsuario = codigoUsuario;
		this.idToken = idToken;
		this.codigoPersona = codigoPersona;
		this.email = email;
		this.solicitud = solicitud;
		this.codigoEmpresa = codigoEmpresa;
		this.codigoCliente = codigoCliente;
		this.codigoSucursal = codigoSucursal;
		this.tipoCliente = tipoCliente;
		this.alias = alias;
		this.nombreEmbalador = nombreEmbalador;
		this.direccionEmbalador = direccionEmbalador;
		this.telefonoEmbalador = telefonoEmbalador;
		this.localidadOrigen = localidadOrigen;
		this.regionOrigen = regionOrigen;
		this.comunaOrigen = comunaOrigen;
		this.nombreDestinatario = nombreDestinatario;
		this.direccionDestinatario = direccionDestinatario;
		this.telefonoDestinatario = telefonoDestinatario;
		this.localidadDestino = localidadDestino;
		this.regionDestino = regionDestino;
		this.comunaDestino = comunaDestino;
		this.pesoFisico = pesoFisico;
		this.pesoVolumen = pesoVolumen;
		this.cantidadPiezas = cantidadPiezas;
	}	

	public Integer getCodigoUsuario() {
		return codigoUsuario;
	}

	public void setCodigoUsuario(Integer codigoUsuario) {
		this.codigoUsuario = codigoUsuario;
	}

	public String getIdToken() {
		return idToken;
	}

	public void setIdToken(String idToken) {
		this.idToken = idToken;
	}

	public String getCodigoPersona() {
		return codigoPersona;
	}

	public void setCodigoPersona(String codigoPersona) {
		this.codigoPersona = codigoPersona;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSolicitud() {
		return solicitud;
	}

	public void setSolicitud(String solicitud) {
		this.solicitud = solicitud;
	}

	public Integer getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(Integer codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public Integer getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Integer codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public Integer getCodigoSucursal() {
		return codigoSucursal;
	}

	public void setCodigoSucursal(Integer codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public Integer getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(Integer tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getAlias() {
		return alias;
	}

	public void setAlias(String alias) {
		this.alias = alias;
	}

	public String getNombreEmbalador() {
		return nombreEmbalador;
	}

	public void setNombreEmbalador(String nombreEmbalador) {
		this.nombreEmbalador = nombreEmbalador;
	}

	public String getDireccionEmbalador() {
		return direccionEmbalador;
	}

	public void setDireccionEmbalador(String direccionEmbalador) {
		this.direccionEmbalador = direccionEmbalador;
	}

	public String getTelefonoEmbalador() {
		return telefonoEmbalador;
	}

	public void setTelefonoEmbalador(String telefonoEmbalador) {
		this.telefonoEmbalador = telefonoEmbalador;
	}

	public String getLocalidadOrigen() {
		return localidadOrigen;
	}

	public void setLocalidadOrigen(String localidadOrigen) {
		this.localidadOrigen = localidadOrigen;
	}

	public Integer getRegionOrigen() {
		return regionOrigen;
	}

	public void setRegionOrigen(Integer regionOrigen) {
		this.regionOrigen = regionOrigen;
	}

	public Integer getComunaOrigen() {
		return comunaOrigen;
	}

	public void setComunaOrigen(Integer comunaOrigen) {
		this.comunaOrigen = comunaOrigen;
	}

	public String getNombreDestinatario() {
		return nombreDestinatario;
	}

	public void setNombreDestinatario(String nombreDestinatario) {
		this.nombreDestinatario = nombreDestinatario;
	}

	public String getDireccionDestinatario() {
		return direccionDestinatario;
	}

	public void setDireccionDestinatario(String direccionDestinatario) {
		this.direccionDestinatario = direccionDestinatario;
	}

	public String getTelefonoDestinatario() {
		return telefonoDestinatario;
	}

	public void setTelefonoDestinatario(String telefonoDestinatario) {
		this.telefonoDestinatario = telefonoDestinatario;
	}

	public String getLocalidadDestino() {
		return localidadDestino;
	}

	public void setLocalidadDestino(String localidadDestino) {
		this.localidadDestino = localidadDestino;
	}

	public Integer getRegionDestino() {
		return regionDestino;
	}

	public void setRegionDestino(Integer regionDestino) {
		this.regionDestino = regionDestino;
	}

	public Integer getComunaDestino() {
		return comunaDestino;
	}

	public void setComunaDestino(Integer comunaDestino) {
		this.comunaDestino = comunaDestino;
	}

	public Float getPesoFisico() {
		return pesoFisico;
	}

	public void setPesoFisico(Float pesoFisico) {
		this.pesoFisico = pesoFisico;
	}

	public Float getPesoVolumen() {
		return pesoVolumen;
	}

	public void setPesoVolumen(Float pesoVolumen) {
		this.pesoVolumen = pesoVolumen;
	}

	public Integer getCantidadPiezas() {
		return cantidadPiezas;
	}

	public void setCantidadPiezas(Integer cantidadPiezas) {
		this.cantidadPiezas = cantidadPiezas;
	}

	@Override
	public String toString() {
		return "SolicitudEtiquetaTO [codigoUsuario=" + codigoUsuario + ", idToken=" + idToken + ", codigoPersona="
				+ codigoPersona + ", email=" + email + ", solicitud=" + solicitud + ", codigoEmpresa=" + codigoEmpresa
				+ ", codigoCliente=" + codigoCliente + ", codigoSucursal=" + codigoSucursal + ", tipoCliente="
				+ tipoCliente + ", alias=" + alias + ", nombreEmbalador=" + nombreEmbalador + ", direccionEmbalador="
				+ direccionEmbalador + ", telefonoEmbalador=" + telefonoEmbalador + ", localidadOrigen="
				+ localidadOrigen + ", regionOrigen=" + regionOrigen + ", comunaOrigen=" + comunaOrigen
				+ ", nombreDestinatario=" + nombreDestinatario + ", direccionDestinatario=" + direccionDestinatario
				+ ", telefonoDestinatario=" + telefonoDestinatario + ", localidadDestino=" + localidadDestino
				+ ", regionDestino=" + regionDestino + ", comunaDestino=" + comunaDestino + ", pesoFisico=" + pesoFisico
				+ ", pesoVolumen=" + pesoVolumen + ", cantidadPiezas=" + cantidadPiezas + "]";
	}
	
}
