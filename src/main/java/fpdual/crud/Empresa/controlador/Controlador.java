package fpdual.crud.Empresa.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fpdual.crud.Empresa.modelos.Empresa;
import fpdual.crud.Empresa.servicio.implementacion.ServicioEmpresaImpl;

@RestController
@RequestMapping("/api/v3")
public class Controlador {

	@Autowired
	ServicioEmpresaImpl servicio;

	@GetMapping("/empresas")
	public ResponseEntity<List<Empresa>> getAll() {
		return new ResponseEntity<>(this.servicio.listarEmpresas(), HttpStatus.OK);
	}

	@PostMapping("/guardar")
	public ResponseEntity<Empresa> guardarEmpresa(@RequestBody Empresa empresa) {
		this.servicio.guardarEmpresa(empresa, empresa.getEmpleados());
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
