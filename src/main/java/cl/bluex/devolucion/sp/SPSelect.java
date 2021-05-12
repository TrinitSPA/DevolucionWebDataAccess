package cl.bluex.devolucion.sp;


import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import cl.bluex.devolucion.exceptions.SimpleException;
import cl.bluex.devolucion.mapper.SelectMapper;
import cl.bluex.devolucion.to.ConsultaDevolucionResponse;
import cl.bluex.devolucion.to.DashboardRequest;
import cl.bluex.devolucion.to.DevolucionResponse;
import cl.bluex.devolucion.to.ECommerceResponse;
import cl.bluex.devolucion.to.MotivoResponse;
import cl.bluex.devolucion.to.OrdenServicioResponse;
import cl.bluex.devolucion.to.SolicitudEtiquetaTO;

/**
 * Created by andres on 10-08-20.
 */
public class SPSelect {

	private static final Logger logger = LogManager.getLogger(SPSelect.class);

    private SqlSession getSqlSession() throws IOException, SimpleException {
    	try {
    			Reader reader = Resources.getResourceAsReader("configuration.xml");
    			SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    			return sqlSessionFactory.openSession();
    	} catch (PersistenceException e) {
    		logger.error("Error de comunicación a BBDD: "+ e.getMessage());
    		throw new SimpleException("Error de comunicación a BBDD", e, 1);
    	}

    }

    private void cierraConexion(SqlSession session) {
        session.commit();
        session.close();
    }


    /*public List<ECommerceResponse> selectEcommerce() throws IOException, SimpleException {
		SqlSession session = getSqlSession();
		SelectMapper mapper = session.getMapper(SelectMapper.class);
		logger.info("Entrando a consultar con los eCommerce");
		List<ECommerceResponse> eCommerce = (List<ECommerceResponse>) mapper.selectEcommerce();
		cierraConexion(session);
		return eCommerce;
    }*/

    public List<MotivoResponse> selectMotivo() throws IOException, SimpleException {
		SqlSession session = getSqlSession();
		SelectMapper mapper = session.getMapper(SelectMapper.class);
		logger.info("Entrando a consultar con los motivos");
		List<MotivoResponse> motivos = (List<MotivoResponse>) mapper.selectMotivo();
		cierraConexion(session);
		return motivos;
    }

    public ConsultaDevolucionResponse selectDevolucion(String nroDocto) throws IOException, SimpleException {
    		SqlSession session = getSqlSession();
    		SelectMapper mapper = session.getMapper(SelectMapper.class);
    		logger.info("Entrando a consultar con el requerimiento: "+ nroDocto);
    		ConsultaDevolucionResponse devolucion = (ConsultaDevolucionResponse) mapper.selectDevolucionClient(nroDocto);
    		cierraConexion(session);
    		return devolucion;
    }

    public List<ECommerceResponse> selectEcommerce() throws IOException, SimpleException {
		SqlSession session = getSqlSession();
		SelectMapper mapper = session.getMapper(SelectMapper.class);
		logger.info("Entrando a consultar con los eCommerce");
		Map parameters = new HashMap<String, Object>();
		mapper.selectEcommerce(parameters);
		List<ECommerceResponse> eCommerce =(List<ECommerceResponse>)  parameters.get("o_cur_cliente");
		cierraConexion(session);
		return eCommerce;
    }

    /**
     * Realiza la busqueda de una orden de servicio asociada a un cliente registrado en la logistica devolucion
     * @param idOs
     * @param idEcommerce
     * @return
     * @throws IOException
     * @throws SimpleException
     */
    public OrdenServicioResponse consultarOS(long idOs, int idEcommerce) throws IOException, SimpleException {
		SqlSession session = getSqlSession();
		SelectMapper mapper = session.getMapper(SelectMapper.class);
		logger.info("Entrando a consultar la OS");
		HashMap<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("i_eevv_nmr_serie", idOs);
        parameters.put("i_ldcl_seq_cdg", idEcommerce);
        parameters.put("i_empr_cdg", 2000);
        parameters.put("i_fevl_cdg", 5);
		mapper.consultaOs(parameters);
		List<OrdenServicioResponse> eCommerce =(List<OrdenServicioResponse>) parameters.get("o_cur_buscar_orden_servicio");
		
		cierraConexion(session);
		if(eCommerce.size()>0) {
			logger.info("Si se encontró la OS");
		}else {
			logger.info("No se encontró la OS");
			OrdenServicioResponse ordenVacia = new OrdenServicioResponse();
			eCommerce.add(ordenVacia);
		}
		return eCommerce.get(0);
    }
    
    public OrdenServicioResponse consultarDocumento(String numeroDocumento, int idEcommerce) throws IOException, SimpleException {
		SqlSession session = getSqlSession();
		SelectMapper mapper = session.getMapper(SelectMapper.class);
		logger.info("Entrando a consultar la OS");
		HashMap<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("i_numero_documento", numeroDocumento);
        parameters.put("i_ldcl_seq_cdg", idEcommerce);
        parameters.put("i_empr_cdg", 2000);
        parameters.put("i_fevl_cdg", "5");
		mapper.consultarDocumento(parameters);
		List<OrdenServicioResponse> eCommerce =(List<OrdenServicioResponse>) parameters.get("o_cur_buscar_orden_servicio");
		
		cierraConexion(session);
		if(eCommerce.size()>0) {
			logger.info("Si se encontró la OS");
		}else {
			logger.info("No se encontró la OS");
			OrdenServicioResponse ordenVacia = new OrdenServicioResponse();
			eCommerce.add(ordenVacia);
		}
		return eCommerce.get(0);
    }    

    public List<DevolucionResponse> consultaDevolucionesDasheCommerce(List<DashboardRequest> listDash) throws IOException, SimpleException {
		SqlSession session = getSqlSession();
		SelectMapper mapper = session.getMapper(SelectMapper.class);
		List<DevolucionResponse> listDevoluciones = new ArrayList<>();
		logger.info("Entrando a consultar las devoluciones");
		Map parameters;
		for (DashboardRequest dashboardRequest : listDash) {
			parameters = new HashMap<String, Object>();
			parameters.put("p_empr_cdg", 2000);
	        parameters.put("p_clhl_cdg", dashboardRequest.getCodigo());
	        parameters.put("p_clhl_scrs", dashboardRequest.getSucursal());
	        parameters.put("p_tpcl_cdg", dashboardRequest.getTipo());
	        if(null != dashboardRequest.getFechaInicio()) {
	        	parameters.put("p_fecha_ini", dashboardRequest.getFechaInicio());
	        	parameters.put("p_fecha_fin", dashboardRequest.getFechaFin());
	        	mapper.consultaDevolucionesDasheCommerceFecha(parameters);
	        }else {	        	
	        	parameters.put("p_dias_busqueda", 60);
	        	mapper.consultaDevolucionesDasheCommerce(parameters);
	        }
			String desError =(String)  parameters.get("o_error_dsc");
			List<DevolucionResponse> devoluciones = (List<DevolucionResponse>) parameters.get("o_cur_solicitud_cliente");
			for (DevolucionResponse dashboardResponse : devoluciones) {
				listDevoluciones.add(dashboardResponse);
			}
		}

		cierraConexion(session);
		return listDevoluciones;
    }

    public List<SolicitudEtiquetaTO> consultaSolicitudEtiqueta(Integer codigoSolicitud) throws IOException, SimpleException {
    	SqlSession session = getSqlSession();
    	SelectMapper mapper = session.getMapper(SelectMapper.class);
    	List<SolicitudEtiquetaTO> solicitudEtiquetaTOs = new ArrayList<SolicitudEtiquetaTO>();
    	logger.info("Entrando a consultaSolicitudEtiqueta()");
    	Map<String, Object> parameters = new HashMap<String, Object>();
    	parameters.put("p_ldsl_seq_cdg", codigoSolicitud);
    	mapper.consultaSolicitudEtiqueta(parameters);
    	//Integer codigoError = (Integer) parameters.get("o_error_cdg");
    	String mensajeError = (String)  parameters.get("o_error_dsc");
    	solicitudEtiquetaTOs = (List<SolicitudEtiquetaTO>) parameters.get("o_cur_solicitud_etiqueta");
    	cierraConexion(session);
    	return solicitudEtiquetaTOs;
    }
}
