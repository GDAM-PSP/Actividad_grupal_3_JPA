package requisito2_David.modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Empleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apellido;
	
	@ManyToOne
	@JoinColumn(name = "departamento_id")
	private Departamento departamento;
	
	@OneToOne(mappedBy = "empleado")
	private FichaEmpleado fichaEmpleado;
	
	@ManyToMany
    @JoinTable(name = "empleado_proyecto",
            joinColumns = @JoinColumn(name = "empleado_id"),
            inverseJoinColumns = @JoinColumn(name = "proyecto_id"))
    private List<Proyecto> proyectos;
	
	
	public Empleado() {
		super();
	}
	
	
	public Empleado(int id, String nombre, String apellido, Departamento departamento, FichaEmpleado fichaEmpleado,
			List<Proyecto> proyectos) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.departamento = departamento;
		this.fichaEmpleado = fichaEmpleado;
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
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public Departamento getDepartamento() {
		return departamento;
	}



	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}



	public FichaEmpleado getFichaEmpleado() {
		return fichaEmpleado;
	}



	public void setFichaEmpleado(FichaEmpleado fichaEmpleado) {
		this.fichaEmpleado = fichaEmpleado;
	}



	public List<Proyecto> getProyectos() {
		return proyectos;
	}



	public void setProyectos(List<Proyecto> proyectos) {
		this.proyectos = proyectos;
	}
	
	
	
}
