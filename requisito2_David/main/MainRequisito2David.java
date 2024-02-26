package requisito2_David.main;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class MainRequisito2David {

	public static void main(String[] args) {
		EntityManagerFactory factoria = Persistence.createEntityManagerFactory("JPAlibreria");
		EntityManager em = factoria.createEntityManager();
		em.close();

	}

}
