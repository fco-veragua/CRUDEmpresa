package fpdual.crud.Empresa.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpdual.crud.Empresa.modelos.Empleado;
import fpdual.crud.Empresa.repositorio.RepositorioEmpleado;
import fpdual.crud.Empresa.servicio.ServicioEmpleado;

@Service
public class ServicioEmpleadoImpl implements ServicioEmpleado {

	@Autowired
	private RepositorioEmpleado repositorioEmpleado;

	@Override
	public void borrarEmpleado(Long id) {
		this.repositorioEmpleado.deleteById(id);
	}

	@Override
	public List<Empleado> listaEmpleados() {
		return this.repositorioEmpleado.findAll();
	}

}
