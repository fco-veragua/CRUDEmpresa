package fpdual.crud.Empresa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import fpdual.crud.Empresa.modelos.Empleado;

public interface RepositorioEmpleado extends JpaRepository<Empleado, Long> {

}
