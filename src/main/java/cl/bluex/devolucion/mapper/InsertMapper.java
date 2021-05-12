package cl.bluex.devolucion.mapper;

import java.util.Map;


public interface InsertMapper {

	void insertaDevolucionClient(Map parameters);
	void insertaOrdenServicio(Map parameters);
	void insertaBitacora(Map parameters);
}
