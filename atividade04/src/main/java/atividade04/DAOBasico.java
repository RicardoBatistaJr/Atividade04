package atividade04;

import javax.persistence.EntityManager;

public class DAOBasico {
	
	public void inserirClientes(Cliente pCliente) {
	
		EntityManager em = UtilJPA.getEntityManager();
		
		em.getTransaction().begin();
		em.persist(pCliente);
		em.getTransaction().commit();
	}
	
	
	public void atualizarClientes(Cliente pCliente) {
		EntityManager em = UtilJPA.getEntityManager();
		
		em.getTransaction().begin();
		em.merge(pCliente);
		em.getTransaction().commit();
		
	}
	

	
	public void deletarClientes(Cliente pCliente) {
		
		EntityManager em = UtilJPA.getEntityManager();
		
		em.getTransaction().begin();
		em.remove(pCliente);
		em.getTransaction().commit();
	}

public void procurarClientes(Cliente pCliente) {


		EntityManager em = UtilJPA.getEntityManager();
		
		pCliente = em.find(Cliente.class, 19L);
		System.out.println(pCliente.getNome());
		System.out.println(pCliente.getCPF());
		System.out.println(pCliente.getEmail());
		em.close();
}

	

}
