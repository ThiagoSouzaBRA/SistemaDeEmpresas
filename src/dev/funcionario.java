package dev;

//Modelo de Funcionário padrão.

public class funcionario {

	 protected int ID;
	 protected String nome;
	 protected double salario;
	 protected double previdencia;
	 
	//Utilizando Getters e Setters.
	 
	public int getID() {
		return ID;
	}
	 
	public void setID(int iD) {
		ID = iD;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	public double getPrevidencia() {
		return previdencia;
	}
	
	public void setPrevidencia(double previdencia) {
		this.previdencia = previdencia;
	}
	
	public void alteraAdicional(double novo_percentual){
		//Somente vai alterar o percentual das classes que possuirem override que estão de acordo com a regra de negócio.
		return;
	}
	 
	

}
