package modelo.persistencia;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import modelo.entidad.Autor;
import modelo.persistencia.interfaces.DaoAutor;

public class DaoAutorJPA implements DaoAutor{
	
	private DaoManejador manejador = new DaoManejador();
	private EntityManager em;

	//metodo para instertar autores 
	@Override
	public int insertar(Autor a) {
		em = manejador.abrirConexion(em);
		if(em == null) {
			return 0;
		}
		
		EntityTransaction et = em.getTransaction();
		et.begin();
		em.persist(a);
		et.commit();
		manejador.cerrarConexion(em);
		// Autor dado de alta
		return a.getId();
	}

	@Override
	public int borrar(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Autor modificar(Autor a) {
		// TODO Auto-generated method stub
		return null;
	}
	//Metodo de buscar datos
	@Override
	public Autor buscar(int id) {
		em = manejador.abrirConexion(em);
		if(em == null) {
			return null;
		}
		return em.find(Autor.class, id);
	}

	@Override
	public List<Autor> listar() {
		// TODO Auto-generated method stub
		return null;
	}

}
