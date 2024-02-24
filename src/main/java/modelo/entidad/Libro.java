package modelo.entidad;

import java.util.ArrayList;
import java.util.List;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="libro")
public class Libro {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private double precio;
	
	//relacion N 1 con editorial
	@ManyToOne //(cascade=CascadeType.ALL)
    @JoinColumn(name="fk_id_editorial", referencedColumnName="id")
    private Editorial editorial;

	//relacion N 1 con autor
	@ManyToOne //(cascade=CascadeType.ALL)
	@JoinColumn(name="fk_id_autor", referencedColumnName="id")
	private Autor autor;
	
	//Relacion muchos a muchos apoyada con una tabla intermedia llamada librerias_libro
	@ManyToMany(cascade=CascadeType.PERSIST)
    @JoinTable(name="librerias_libro",
                joinColumns = {@JoinColumn(name="fk_id_libro", referencedColumnName="id")},
                inverseJoinColumns = {@JoinColumn(name="fk_id_libreria", referencedColumnName="id")})
    private List<Libreria> libreria = new ArrayList<>(); // Corrección en el nombre de la propiedad

	public Libro(int id, String nombre, double precio, Editorial editorial, Autor autor, List<Libreria> libreria) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.editorial = editorial;
		this.autor = autor;
		this.libreria = libreria;
	}

	public Libro() {
		super();
	}
	
	public void setLibreria(List<Libreria> libreria) {
		this.libreria = libreria;
	}

	public List<Libreria> getLibreria() {
		return libreria;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", nombre=" + nombre + ", precio=" + precio + "]";
	}
}
