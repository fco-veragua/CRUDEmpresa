package fpdual.crud.Empresa.servicio.implementacion;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fpdual.crud.Empresa.modelos.Empleado;
import fpdual.crud.Empresa.modelos.Empresa;
import fpdual.crud.Empresa.repositorio.RepositorioEmpresa;
import fpdual.crud.Empresa.servicio.ServicioEmpresa;

@Service
public class ServicioEmpresaImpl implements ServicioEmpresa {

	@Autowired
	private RepositorioEmpresa repositorio;

	@Override
	public void guardarEmpresa(Empresa empresa, List<Empleado> empleados) {
		Empresa empresaNueva = new Empresa();
		if (!empleados.isEmpty()) {
			empleados.forEach(empleado -> {
				empresaNueva.addEmpleados(empleado);
			});
		}
		empresaNueva.setNombre(empresa.getNombre());
		this.repositorio.saveAndFlush(empresaNueva);
	}

	@Override
	public List<Empresa> listarEmpresas() {
		return this.repositorio.findAll();
	}

}
