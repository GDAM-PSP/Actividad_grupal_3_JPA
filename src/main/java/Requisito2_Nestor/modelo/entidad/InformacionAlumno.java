package Requisito2_Nestor.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class InformacionAlumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@OneToOne
	@JoinColumn(name = "alumno_id")
	private Alumno alumnoInformacion;
	private String direccion;
	private int telefono;
	public InformacionAlumno(int id, Alumno alumnoInformacion, String direccion, int telefono) {
		super();
		this.id = id;
		this.alumnoInformacion = alumnoInformacion;
		this.direccion = direccion;
		this.telefono = telefono;
	}
	
	public InformacionAlumno() {
		super();
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Alumno getAlumnoInformacion() {
		return alumnoInformacion;
	}
	public void setAlumnoInformacion(Alumno alumnoInformacion) {
		this.alumnoInformacion = alumnoInformacion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public int getTelefono() {
		return telefono;
	}
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
}
