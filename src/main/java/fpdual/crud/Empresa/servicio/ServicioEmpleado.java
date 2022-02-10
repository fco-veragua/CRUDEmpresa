package fpdual.crud.Empresa.servicio;

import java.util.List;

import fpdual.crud.Empresa.modelos.Empleado;

public interface ServicioEmpleado {
	public void borrarEmpleado(Long id);

	public List<Empleado> listaEmpleados();
}
