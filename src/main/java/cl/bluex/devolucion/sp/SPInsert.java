package cl.bluex.devolucion.sp;


import java.io.IOException;
import java.io.Reader;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.exceptions.PersistenceException;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import cl.bluex.devolucion.exceptions.SimpleException;
import cl.bluex.devolucion.mapper.InsertMapper;
import cl.bluex.devolucion.mapper.SelectMapper;
import cl.bluex.devolucion.to.InsertDevolucionRequest;
import cl.bluex.devolucion.to.InsertaDevolucionResponse;
import cl.bluex.devolucion.to.OrdenServicioResponse;
import cl.bluex.devolucion.to.UpdateDevolucionRequest;
import cl.bluex.devolucion.to.UpdateDevolucionResponse;

/**
 * Created by andres on 17-05-19.
 */
public class SPInsert {

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

    /**
     * Método encargado de insertar Glosa Variable
     * @throws SimpleException
     * */
    public InsertaDevolucionResponse insertaDevolucion(InsertDevolucionRequest insertRequest) throws IOException, SimpleException {
    	InsertaDevolucionResponse respuesta = new InsertaDevolucionResponse();
    	SqlSession session = getSqlSession();

    	SPSelect select = new SPSelect();
    	//long retornaEeVV = select.consultarOS(Long.parseLong(insertRequest.getOrdenCompra()),
    	//		insertRequest.getCodigoEmpresa()).getEevv_nmr_id();
    	
    	long retornaEeVV = select.consultarDocumento(insertRequest.getOrdenCompra(), insertRequest.getCodigoEmpresa()).getEevv_nmr_id();
    	
        InsertMapper mapper = session.getMapper(InsertMapper.class);
        HashMap<String, Object> parameters = new HashMap<String, Object>();

        parameters.put("p_ldmt_cdg", insertRequest.getCodigoMotivo());
        parameters.put("p_ldcl_seq_cdg", insertRequest.getCodigoEmpresa());
        parameters.put("p_ldes_cdg", 1);
        parameters.put("p_ldsl_nombre", insertRequest.getNombre());
        parameters.put("p_ldsl_identificador", insertRequest.getRut());
        parameters.put("p_ldsl_telefono", insertRequest.getTelefono());
        parameters.put("p_ldsl_email", insertRequest.getEmail());
        parameters.put("p_ldsl_descripcion", insertRequest.getTipoProducto());
        parameters.put("p_ldsl_noti_email", 1);
        parameters.put("p_ldsl_noti_sms", 0);
        parameters.put("p_ldsl_noti_whatsapp", 0);

        mapper.insertaDevolucionClient(parameters);
        BigDecimal nroOS = (BigDecimal) parameters.get("o_ldsl_seq_cdg");
        String descError = (String) parameters.get("o_error_dsc");
        String nroReq = (String) parameters.get("o_ldsl_cdg_solicitud");
        Map parametersOS = new HashMap<String, Object>();
        System.out.println("mensaje: " + descError);
        System.out.println("numero devolucion: " + nroReq);
        System.out.println("numero OS: " + nroOS);
        parametersOS.put("p_eevv_nmr_id", retornaEeVV);
        parametersOS.put("p_ldsl_seq_cdg", nroOS.intValue());
        parametersOS.put("p_ldoe_cdg", 1);
        parametersOS.put("p_ldos_descripcion", "");
        session.commit();
        mapper.insertaOrdenServicio(parametersOS);
        BigDecimal codErrorOs = (BigDecimal) parametersOS.get("o_error_cdg");
        String mensajeErrorOs = (String) parametersOS.get("o_error_dsc");
        if(codErrorOs.intValue()==0) {
        	session.commit();
        }else {
        	session.rollback();
        }
        cierraConexion(session);
        BigDecimal codError = (BigDecimal) parameters.get("o_error_cdg");
        String mensajeError = (String) parameters.get("o_error_dsc");

        respuesta.setCodigoRespuesta(codError.intValue());
        if(codErrorOs.intValue()==0) {
        	respuesta.setMensajeRespuesta(mensajeError+ nroOS +" -" + mensajeErrorOs);
        	respuesta.setIdNumeroRequerimiento(nroReq);
        }else {
        	respuesta.setMensajeRespuesta(mensajeErrorOs);
        }


        return respuesta;

    }

    /**
     * Método encargado de insertar Glosa Variable
     * @throws SimpleException
     * */
    public UpdateDevolucionResponse insertaBitacora(UpdateDevolucionRequest udpdateRequest) throws IOException, SimpleException {
    	UpdateDevolucionResponse respuesta = new UpdateDevolucionResponse();
    	SqlSession session = getSqlSession();

        InsertMapper mapper = session.getMapper(InsertMapper.class);
        Map parameters = new HashMap<String, Object>();

        parameters.put("p_ldsl_seq_cdg", udpdateRequest.getCodigoDevolucion());
        parameters.put("p_ldes_cdg", udpdateRequest.getMotivoDevolucion());
        parameters.put("p_lbdt_descripcion", udpdateRequest.getDescripcionDevolucion());

        mapper.insertaBitacora(parameters);
        session.commit();
        cierraConexion(session);
        BigDecimal codError = (BigDecimal) parameters.get("o_error_cdg");
        String mensajeError = (String) parameters.get("o_error_dsc");

        respuesta.setCodigoError(codError.intValue());
        respuesta.setDescripcion(mensajeError);

        return respuesta;

    }

}
