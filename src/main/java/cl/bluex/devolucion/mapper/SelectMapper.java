package cl.bluex.devolucion.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import cl.bluex.devolucion.to.ConsultaDevolucionResponse;
import cl.bluex.devolucion.to.DevolucionResponse;
import cl.bluex.devolucion.to.ECommerceResponse;
import cl.bluex.devolucion.to.MotivoResponse;
import cl.bluex.devolucion.to.OrdenServicioResponse;
import cl.bluex.devolucion.to.SolicitudEtiquetaTO;

public interface SelectMapper {

	List<ECommerceResponse> selectEcommerce(Map parameters);

	List<MotivoResponse> selectMotivo();

	ConsultaDevolucionResponse selectDevolucionClient(@Param("nroDocto") String nroDocto);

	List<OrdenServicioResponse> consultaOs(Map<String, Object> parameters);
	
	List<OrdenServicioResponse> consultarDocumento(Map<String, Object> parameters);	

	List<DevolucionResponse> consultaDevolucionesDasheCommerce(Map parameters);
	
	List<DevolucionResponse> consultaDevolucionesDasheCommerceFecha(Map parameters);
	 
	List<SolicitudEtiquetaTO> consultaSolicitudEtiqueta(Map<String, Object> parameters);
	
}
