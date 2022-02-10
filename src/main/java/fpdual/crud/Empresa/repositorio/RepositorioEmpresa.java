package fpdual.crud.Empresa.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;

import fpdual.crud.Empresa.modelos.Empresa;

public interface RepositorioEmpresa extends JpaRepository<Empresa, Long> {

}
