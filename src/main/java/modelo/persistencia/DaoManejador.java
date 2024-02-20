package modelo.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DaoManejador {
	
	public EntityManager abrirConexion(EntityManager em) {
		try {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("JPAlibreria");
		em = factoria.createEntityManager();
		return em;
		}catch(Exception e) {
			return null;
		}
	}
	public boolean cerrarConexion(EntityManager em) {
		try {
			em.close();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
