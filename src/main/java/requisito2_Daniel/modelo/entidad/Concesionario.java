package requisito2_Daniel.modelo.entidad;

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
public class Concesionario {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	
	@ManyToMany
	@JoinTable(
			name = "concesionario_vendedores",
			joinColumns = @JoinColumn(name = "id_concesionario"),
			inverseJoinColumns = @JoinColumn(name = "id_vendedor"))
	private List<Vendedor> vendedoresConcesionario;
	@OneToMany(mappedBy="concesionarioCoche")
	private List<Coche> cochesConcesionario;
	
	public Concesionario() {
		super();
	}
	
	public Concesionario(int id, String nombre, List<Vendedor> vendedoresConcesionario, List<Coche> cochesConcesionario) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.vendedoresConcesionario = vendedoresConcesionario;
		this.cochesConcesionario = cochesConcesionario;
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
	
	public List<Vendedor> getVendedoresConcesionario() {
		return vendedoresConcesionario;
	}
	
	public void setVendedoresConcesionario(List<Vendedor> vendedoresConcesionario) {
		this.vendedoresConcesionario = vendedoresConcesionario;
	}
	
	public List<Coche> getCochesConcesionario() {
		return cochesConcesionario;
	}
	
	public void setCochesConcesionario(List<Coche> cochesConcesionario) {
		this.cochesConcesionario = cochesConcesionario;
	}	
}
