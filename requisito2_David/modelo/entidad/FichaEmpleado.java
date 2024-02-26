package requisito2_David.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class FichaEmpleado {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String direccion;
	private String puesto;
	
	@OneToOne
    @JoinColumn(name = "empleado_id")
    private Empleado empleado;
	
	public FichaEmpleado() {
		super();
	}

	public FichaEmpleado(int id, String direccion, String puesto, Empleado empleado) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.puesto = puesto;
		this.empleado = empleado;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getPuesto() {
		return puesto;
	}

	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	public Empleado getEmpleado() {
		return empleado;
	}

	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
	
	

}
