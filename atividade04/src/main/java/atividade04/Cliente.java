package atividade04;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente extends DAOBasico{
	
	@Id
	int CPF;
	String nome;
	String email;
	
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	
}
