package requisito2_Roberto.modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import requisito2_Daniel.modelo.entidad.Coche;
import requisito2_Daniel.modelo.entidad.Vendedor;

public class Almacen {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;

	public Almacen() {
		super();
	}

	public Almacen(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
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

}
