package requisito2_David.modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.JoinColumn;

@Entity
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	@OneToMany(mappedBy = "departamento")
	private List<Empleado>listaEmpleados;
	
	@ManyToMany
    @JoinTable(name = "departamento_proyecto",
               joinColumns = @JoinColumn(name = "departamento_id"),
               inverseJoinColumns = @JoinColumn(name = "proyecto_id"))
    private List<Proyecto> proyectos;


	
	public Departamento() {
		super();
	}
	


	public Departamento(int id, String nombre, List<Empleado> listaEmpleados, List<Proyecto> proyectos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.listaEmpleados = listaEmpleados;
		this.proyectos = proyectos;
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

	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}

	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}



	public List<Proyecto> getProyectos() {
		return proyectos;
	}



	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
	
	
	
	
}
