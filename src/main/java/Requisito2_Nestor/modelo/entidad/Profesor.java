package requisito2_Nestor.modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Profesor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre; // Cambiado a String

    @ManyToMany
    @JoinTable(
        name = "alumno_profesor",
        joinColumns = @JoinColumn(name = "profesor_id"),
        inverseJoinColumns = @JoinColumn(name = "alumno_id"))
    private List<Alumno> alumnoProfesor;

    @ManyToMany(mappedBy="profesoresClase")
    private List<Clase> claseProfesor;

	public Profesor(int id, String nombre, List<Alumno> alumnoProfesor, List<Clase> claseProfesor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.alumnoProfesor = alumnoProfesor;
		this.claseProfesor = claseProfesor;
	}

	public Profesor() {
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

	public List<Alumno> getAlumnoProfesor() {
		return alumnoProfesor;
	}

	public void setAlumnoProfesor(List<Alumno> alumnoProfesor) {
		this.alumnoProfesor = alumnoProfesor;
	}

	public List<Clase> getClaseProfesor() {
		return claseProfesor;
	}

	public void setClaseProfesor(List<Clase> claseProfesor) {
		this.claseProfesor = claseProfesor;
	}
    
}
