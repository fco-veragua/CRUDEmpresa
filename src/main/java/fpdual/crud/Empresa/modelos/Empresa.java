package fpdual.crud.Empresa.modelos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@Entity(name = "Empresa")
@Table(name = "empresa")
@Data
public class Empresa {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nombre")
	private String nombre;

	@JsonIgnoreProperties("empresa")
	@OneToMany(mappedBy = "empresa", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Empleado> empleados = new ArrayList<>();

	public void addEmpleados(Empleado empleado) {
		empleados.add(empleado);
		empleado.setEmpresa(this);
	}

	public void removeEmpleados(Empleado empleado) {
		empleados.remove(empleado);
		empleado.setEmpresa(null);
	}
}
