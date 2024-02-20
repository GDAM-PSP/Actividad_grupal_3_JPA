package modelo.entidad;

import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="editorial")
public class Editorial {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String direccion;
	@OneToMany(mappedBy="editorial", cascade=CascadeType.ALL)
	private List<Libro> libro;
	public Editorial(int id, String nombre, String direccion, List<Libro> libro) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.direccion = direccion;
		this.libro = libro;
	}
	public Editorial() {
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public List<Libro> getLibro() {
		return libro;
	}
	public void setLibro(List<Libro> libro) {
		this.libro = libro;
	}
	
	
}
