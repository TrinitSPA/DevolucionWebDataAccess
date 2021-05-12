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
import cl.bluex.devolucion.mapper.UpdateMapper;
import cl.bluex.devolucion.to.UpdateDevolucionRequest;
import cl.bluex.devolucion.to.UpdateDevolucionResponse;

public class SPUpdate {
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
    
    public UpdateDevolucionResponse actualizaDeolucion(UpdateDevolucionRequest Updrequest) throws IOException, SimpleException {
    	SqlSession session = getSqlSession();
    	UpdateDevolucionResponse respuesta = new UpdateDevolucionResponse();
        UpdateMapper mapper = session.getMapper(UpdateMapper.class);
        Map parameters = new HashMap<String, Object>();
        parameters.put("p_ldsl_seq_cdg", Updrequest.getCodigoDevolucion());
        parameters.put("p_ldes_cdg", Updrequest.getMotivoDevolucion());
        logger.info("invocando con parametros: " + Updrequest.toString());
        mapper.updateDevolucion(parameters);
        String descError = (String) parameters.get("o_error_dsc");
        BigDecimal codError = (BigDecimal) parameters.get("o_error_cdg");
        logger.info("resultado de actualizar: "+ descError);
        SPInsert insert = new SPInsert();
        if(codError.intValue()==0) {
        	insert.insertaBitacora(Updrequest);
        }
        logger.info("resultado de actualizar: "+ descError);
        session.commit();
        cierraConexion(session);
        respuesta.setCodigoError(codError.intValue());
        respuesta.setDescripcion(descError);
        
        return respuesta;
    }
}
