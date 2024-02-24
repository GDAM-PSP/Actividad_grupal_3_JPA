package modelo.persistencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*
 * Esta clase maneja la conexion JPA con el manejador
 */
public class DaoManejador {
	
	/*
	 * Se le pasa el objeto EntityManager y abre la conexion
	 */
	public EntityManager abrirConexion(EntityManager em) {
		try {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("JPAlibreria");
		em = factoria.createEntityManager();
		return em;
		}catch(Exception e) {
			return null;
		}
	}
	/*
	 * Se le pasa el objeto EntityManager y cierra la conexion
	 */
	public boolean cerrarConexion(EntityManager em) {
		try {
			em.close();
			return true;
		}catch(Exception e) {
			return false;
		}
	}
}
