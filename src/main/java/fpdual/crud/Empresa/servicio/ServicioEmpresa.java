package fpdual.crud.Empresa.servicio;

import java.util.List;

import fpdual.crud.Empresa.modelos.Empleado;
import fpdual.crud.Empresa.modelos.Empresa;

public interface ServicioEmpresa {

	public void guardarEmpresa(Empresa empresa, List<Empleado> empleados);

	public List<Empresa> listarEmpresas();
}
