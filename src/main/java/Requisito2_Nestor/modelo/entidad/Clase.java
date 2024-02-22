package Requisito2_Nestor.modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;

@Entity
public class Clase {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@ManyToMany
	@JoinTable(
			name = "clase_profesores",
			joinColumns = @JoinColumn(name = "clase_id"),
			inverseJoinColumns = @JoinColumn(name = "profesor_id"))
	private List<Profesor> profesoresClase;
	@OneToMany(mappedBy="claseAlumno")
	private List<Alumno> alumnosClase;
	
	public Clase(int id, String nombre, List<Profesor> profesoresClase, List<Alumno> alumnosClase) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.profesoresClase = profesoresClase;
		this.alumnosClase = alumnosClase;
	}
	public Clase() {
		super();
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
	public List<Profesor> getProfesoresClase() {
		return profesoresClase;
	}
	public void setProfesoresClase(List<Profesor> profesoresClase) {
		this.profesoresClase = profesoresClase;
	}
	public List<Alumno> getAlumnosClase() {
		return alumnosClase;
	}
	public void setAlumnosClase(List<Alumno> alumnosClase) {
		this.alumnosClase = alumnosClase;
	}
	
}
