package requisito2_Daniel.modelo.entidad;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class HojaCoche {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String dniTitular;
	
	@OneToOne
	@JoinColumn(name = "id_coche")
	private Coche coche;
	
	public HojaCoche() {
		super();
	}
	
	public HojaCoche(int id, Coche coche, String dniTitular) {
		super();
		this.id = id;
		this.coche = coche;
		this.dniTitular = dniTitular;
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getDniTitular() {
		return dniTitular;
	}

	public void setDniTitular(String dniTitular) {
		this.dniTitular = dniTitular;
	}

	public Coche getCoche() {
		return coche;
	}

	public void setCoche(Coche coche) {
		this.coche = coche;
	}
}
