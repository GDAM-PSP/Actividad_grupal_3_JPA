package modelo.persistencia;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import modelo.entidad.Editorial;
import modelo.persistencia.interfaces.DaoEditorial;

public class DaoEditorialJPA implements DaoEditorial{

	private DaoManejador manejador = new DaoManejador();
	private EntityManager em;
	
	@Override
	public int insertar(Editorial e) {
		em = manejador.abrirConexion(em);
		if(em == null) {
			return 0;
		}
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(e);
		et.commit();
		manejador.cerrarConexion(em);
		//Añade una editorial
		return e.getId();
	}

	@Override
	public int borrar(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Editorial modificar(Editorial e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Editorial buscar(int id) {
		em = manejador.abrirConexion(em);
		if(em == null) {
			return null;
		}
		return em.find(Editorial.class, id);
	}

	@Override
	public List<Editorial> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
