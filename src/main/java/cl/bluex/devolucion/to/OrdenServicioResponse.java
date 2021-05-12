package cl.bluex.devolucion.to;

import java.sql.Date;

public class OrdenServicioResponse {
	
	private long eevv_nmr_id;
	private long eevv_nmr_serie;
	private Date oser_fch_creacion;
	private String oser_nmbr_emba;
	private int empr_cdg;
	private long clhl_cdg_emba;
	private int clhl_scrs_emba;
	private int tpcl_cdg_emba;
	private String oser_direccion_emba;
	private String psta_cdg_origen;  
	private String psta_dsc_origen;
	private String oser_nmbr_dest;
	private String oser_direccion_dest;
	private String psta_cdg_destino;    
	private String psta_dsc_destino;
	private String fecha_retiro;
	private String fecha_entrega;
	private String macroestado;
	private String fecha_macroestado;
	
	public OrdenServicioResponse() {
		super();
	}

	public OrdenServicioResponse(long eevv_nmr_id, long eevv_nmr_serie, Date oser_fch_creacion, String oser_nmbr_emba,
			int empr_cdg, long clhl_cdg_emba, int clhl_scrs_emba, int tpcl_cdg_emba, String oser_direccion_emba,
			String psta_cdg_origen, String psta_dsc_origen, String oser_nmbr_dest, String oser_direccion_dest,
			String psta_cdg_destino, String psta_dsc_destino, String fecha_retiro, String fecha_entrega,
			String macroestado, String fecha_macroestado) {
		super();
		this.eevv_nmr_id = eevv_nmr_id;
		this.eevv_nmr_serie = eevv_nmr_serie;
		this.oser_fch_creacion = oser_fch_creacion;
		this.oser_nmbr_emba = oser_nmbr_emba;
		this.empr_cdg = empr_cdg;
		this.clhl_cdg_emba = clhl_cdg_emba;
		this.clhl_scrs_emba = clhl_scrs_emba;
		this.tpcl_cdg_emba = tpcl_cdg_emba;
		this.oser_direccion_emba = oser_direccion_emba;
		this.psta_cdg_origen = psta_cdg_origen;
		this.psta_dsc_origen = psta_dsc_origen;
		this.oser_nmbr_dest = oser_nmbr_dest;
		this.oser_direccion_dest = oser_direccion_dest;
		this.psta_cdg_destino = psta_cdg_destino;
		this.psta_dsc_destino = psta_dsc_destino;
		this.fecha_retiro = fecha_retiro;
		this.fecha_entrega = fecha_entrega;
		this.macroestado = macroestado;
		this.fecha_macroestado = fecha_macroestado;
	}

	public long getEevv_nmr_id() {
		return eevv_nmr_id;
	}

	public void setEevv_nmr_id(long eevv_nmr_id) {
		this.eevv_nmr_id = eevv_nmr_id;
	}

	public long getEevv_nmr_serie() {
		return eevv_nmr_serie;
	}

	public void setEevv_nmr_serie(long eevv_nmr_serie) {
		this.eevv_nmr_serie = eevv_nmr_serie;
	}

	public Date getOser_fch_creacion() {
		return oser_fch_creacion;
	}

	public void setOser_fch_creacion(Date oser_fch_creacion) {
		this.oser_fch_creacion = oser_fch_creacion;
	}

	public String getOser_nmbr_emba() {
		return oser_nmbr_emba;
	}

	public void setOser_nmbr_emba(String oser_nmbr_emba) {
		this.oser_nmbr_emba = oser_nmbr_emba;
	}

	public int getEmpr_cdg() {
		return empr_cdg;
	}

	public void setEmpr_cdg(int empr_cdg) {
		this.empr_cdg = empr_cdg;
	}

	public long getClhl_cdg_emba() {
		return clhl_cdg_emba;
	}

	public void setClhl_cdg_emba(long clhl_cdg_emba) {
		this.clhl_cdg_emba = clhl_cdg_emba;
	}

	public int getClhl_scrs_emba() {
		return clhl_scrs_emba;
	}

	public void setClhl_scrs_emba(int clhl_scrs_emba) {
		this.clhl_scrs_emba = clhl_scrs_emba;
	}

	public int getTpcl_cdg_emba() {
		return tpcl_cdg_emba;
	}

	public void setTpcl_cdg_emba(int tpcl_cdg_emba) {
		this.tpcl_cdg_emba = tpcl_cdg_emba;
	}

	public String getOser_direccion_emba() {
		return oser_direccion_emba;
	}

	public void setOser_direccion_emba(String oser_direccion_emba) {
		this.oser_direccion_emba = oser_direccion_emba;
	}

	public String getPsta_cdg_origen() {
		return psta_cdg_origen;
	}

	public void setPsta_cdg_origen(String psta_cdg_origen) {
		this.psta_cdg_origen = psta_cdg_origen;
	}

	public String getPsta_dsc_origen() {
		return psta_dsc_origen;
	}

	public void setPsta_dsc_origen(String psta_dsc_origen) {
		this.psta_dsc_origen = psta_dsc_origen;
	}

	public String getOser_nmbr_dest() {
		return oser_nmbr_dest;
	}

	public void setOser_nmbr_dest(String oser_nmbr_dest) {
		this.oser_nmbr_dest = oser_nmbr_dest;
	}

	public String getOser_direccion_dest() {
		return oser_direccion_dest;
	}

	public void setOser_direccion_dest(String oser_direccion_dest) {
		this.oser_direccion_dest = oser_direccion_dest;
	}

	public String getPsta_cdg_destino() {
		return psta_cdg_destino;
	}

	public void setPsta_cdg_destino(String psta_cdg_destino) {
		this.psta_cdg_destino = psta_cdg_destino;
	}

	public String getPsta_dsc_destino() {
		return psta_dsc_destino;
	}

	public void setPsta_dsc_destino(String psta_dsc_destino) {
		this.psta_dsc_destino = psta_dsc_destino;
	}

	public String getFecha_retiro() {
		return fecha_retiro;
	}

	public void setFecha_retiro(String fecha_retiro) {
		this.fecha_retiro = fecha_retiro;
	}

	public String getFecha_entrega() {
		return fecha_entrega;
	}

	public void setFecha_entrega(String fecha_entrega) {
		this.fecha_entrega = fecha_entrega;
	}

	public String getMacroestado() {
		return macroestado;
	}

	public void setMacroestado(String macroestado) {
		this.macroestado = macroestado;
	}

	public String getFecha_macroestado() {
		return fecha_macroestado;
	}

	public void setFecha_macroestado(String fecha_macroestado) {
		this.fecha_macroestado = fecha_macroestado;
	}

	@Override
	public String toString() {
		return "OrdenServicioResponse [eevv_nmr_id=" + eevv_nmr_id + ", eevv_nmr_serie=" + eevv_nmr_serie
				+ ", oser_fch_creacion=" + oser_fch_creacion + ", oser_nmbr_emba=" + oser_nmbr_emba + ", empr_cdg="
				+ empr_cdg + ", clhl_cdg_emba=" + clhl_cdg_emba + ", clhl_scrs_emba=" + clhl_scrs_emba
				+ ", tpcl_cdg_emba=" + tpcl_cdg_emba + ", oser_direccion_emba=" + oser_direccion_emba
				+ ", psta_cdg_origen=" + psta_cdg_origen + ", psta_dsc_origen=" + psta_dsc_origen + ", oser_nmbr_dest="
				+ oser_nmbr_dest + ", oser_direccion_dest=" + oser_direccion_dest + ", psta_cdg_destino="
				+ psta_cdg_destino + ", psta_dsc_destino=" + psta_dsc_destino + ", fecha_retiro=" + fecha_retiro
				+ ", fecha_entrega=" + fecha_entrega + ", macroestado=" + macroestado + ", fecha_macroestado="
				+ fecha_macroestado + "]";
	}
	
	
	
    
}
