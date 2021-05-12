package cl.bluex.devolucion.sp;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import cl.bluex.devolucion.exceptions.SimpleException;
import cl.bluex.devolucion.to.DashboardRequest;
import cl.bluex.devolucion.to.InsertDevolucionRequest;
import cl.bluex.devolucion.to.UpdateDevolucionRequest;

public class Main2 {

	public static void main(String[] args) throws IOException, SimpleException {
		// TODO Auto-generated method stub
		InsertDevolucionRequest insReq = new InsertDevolucionRequest();
		insReq.setCodigoEmpresa(2);
		insReq.setCodigoMotivo(1);
		insReq.setEmail("a@b.cl");
		insReq.setNombre("test");
		insReq.setOrdenCompra("198079022");
		insReq.setRut("1-9");
		insReq.setTelefono("123123123");
		insReq.setTipoProducto("Zapatillas");
		SPSelect select = new SPSelect();
		SPInsert insert = new SPInsert();
		SPUpdate update = new SPUpdate();
    	//System.out.println(select.selectDevolucion("iJ00000012hF"));90635000-20-8
		List<DashboardRequest> listDash = new ArrayList<>();
		DashboardRequest dash = new DashboardRequest();
		dash.setCodigo(76800250);
		dash.setSucursal(1);
		dash.setTipo(8);
		listDash.add(dash);
		dash = new DashboardRequest();
		dash.setCodigo(90635000);
		dash.setSucursal(20);
		dash.setTipo(8);
		listDash.add(dash);
		dash = new DashboardRequest();
		dash.setCodigo(96801150);
		dash.setSucursal(11);
		dash.setTipo(8);
		listDash.add(dash);
		dash = new DashboardRequest();
		dash.setCodigo(77261280);
		dash.setSucursal(1);
		dash.setTipo(8);
		listDash.add(dash);
		dash = new DashboardRequest();
		dash.setCodigo(99520000);
		dash.setSucursal(1);
		dash.setTipo(8);
		listDash.add(dash);
    	System.out.println(select.consultaDevolucionesDasheCommerce(listDash));
    	//System.out.println(select.consultaDevoluciones(96801150, 11, 8));
    	//System.out.println(select.selectEcommerce().toString());
    	//System.out.println(select.obtenerMovimiento());
		//System.out.println(insert.insertaDevolucion(insReq).toString());
		//System.out.println("OS: " + select.consultarOS(198072103, 1));
		//UpdateDevolucionRequest upd = new UpdateDevolucionRequest();
		//upd.setCodigoDevolucion(83);
		//upd.setMotivoDevolucion(4);
		//upd.setDescripcionDevolucion("Por falta de información");
		//System.out.println("OS UPD: " + update.actualizaDeolucion(upd));
	}

}
