package modelo.entidad;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="libreria")
public class Libreria {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String nombreDueno;
	private String direccion;
	@ManyToMany(mappedBy="libreria", cascade=CascadeType.PERSIST)
	private List<Libro> libros;
	
	public Libreria(int id, String nombre, String nombreDueno, String direccion, List<Libro> libros) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.nombreDueno = nombreDueno;
		this.direccion = direccion;
		this.libros = libros;
	}
	
	public Libreria() {
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
	public String getNombreDueno() {
		return nombreDueno;
	}
	public void setNombreDueno(String nombreDueno) {
		this.nombreDueno = nombreDueno;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Libro> getLibros() {
		return libros;
	}
	public void setLibros(List<Libro> libros) {
		this.libros = libros;
	}
	
}
