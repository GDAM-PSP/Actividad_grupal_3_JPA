package requisito2_David.modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Proyecto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	@ManyToMany(mappedBy = "proyectos")
    private List<Empleado> empleados;
	
	@ManyToMany(mappedBy = "proyectos")
    private List<Departamento> departamentos;
	
	public Proyecto() {
		super();
	}

	

	public Proyecto(int id, String nombre, List<Empleado> empleados, List<Departamento> departamentos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.empleados = empleados;
		this.departamentos = departamentos;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}



	public List<Departamento> getDepartamentos() {
		return departamentos;
	}



	public void setDepartamentos(List<Departamento> departamentos) {
		this.departamentos = departamentos;
	}
	
	
	
}
