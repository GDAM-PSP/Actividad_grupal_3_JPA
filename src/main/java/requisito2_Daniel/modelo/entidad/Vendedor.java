package requisito2_Daniel.modelo.entidad;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Vendedor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private int sueldoBruto;

    @ManyToMany
    @JoinTable(
        name = "coche_vendedor",
        joinColumns = @JoinColumn(name = "id_vendedor"),
        inverseJoinColumns = @JoinColumn(name = "id_coche"))
    private List<Coche> cocheVendedor;

    @ManyToMany(mappedBy="vendedoresConcesionario")
    private List<Concesionario> concesionarioVendedor;

    public Vendedor() {
		super();
	}
    
	public Vendedor(int id, String nombre, List<Coche> cocheVendedor, List<Concesionario> concesionarioVendedor) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.cocheVendedor = cocheVendedor;
		this.concesionarioVendedor = concesionarioVendedor;
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

	public int getSueldoBruto() {
		return sueldoBruto;
	}

	public void setSueldoBruto(int sueldoBruto) {
		this.sueldoBruto = sueldoBruto;
	}

	public List<Coche> getCocheVendedor() {
		return cocheVendedor;
	}

	public void setCocheVendedor(List<Coche> cocheVendedor) {
		this.cocheVendedor = cocheVendedor;
	}

	public List<Concesionario> getConcesionarioVendedor() {
		return concesionarioVendedor;
	}

	public void setConcesionarioVendedor(List<Concesionario> concesionarioVendedor) {
		this.concesionarioVendedor = concesionarioVendedor;
	}   
}
