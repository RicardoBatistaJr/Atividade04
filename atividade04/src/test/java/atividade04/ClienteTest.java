package atividade04;

import static org.junit.Assert.*;

import org.junit.Test;

import atividade04.Cliente;


public class ClienteTest {


	@Test
	public void testarInserirCliente() {

	Cliente tcliente = new Cliente();
	tcliente.setCPF(12345);
	tcliente.setNome("Arthur");
	tcliente.setEmail("arthur@gmail.com");

	DAOBasico aDao = new DAOBasico();
	aDao.inserirClientes(tcliente);

	assertNotNull(tcliente);

	}
	
	@Test
	public void testarAtualizarCliente() {
	Cliente tcliente = new Cliente();

	tcliente.setNome("ArthurSegundaVez");
	tcliente.setEmail("arthur212344gmail.com");	

	DAOBasico aDao = new DAOBasico();
	aDao.atualizarClientes(tcliente);

	}
	
	@Test
	public void testarRemoverCliente() {
	Cliente tcliente = new Cliente();

	tcliente.setNome("ArthurSegundaVez");
	tcliente.setEmail("arthur212344gmail.com");	

	DAOBasico aDao = new DAOBasico();
	aDao.deletarClientes(tcliente);

	}
	

}
