package Requisito2_Nestor.modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	@OneToOne(mappedBy="alumnoInformacion")
	private InformacionAlumno alumno;
	@ManyToMany(mappedBy="alumnoProfesor")
	private List<Profesor> alumnoProfesor;
	@ManyToOne
	@JoinColumn(name ="Clase_id")
	private Clase claseAlumno;

	
}
