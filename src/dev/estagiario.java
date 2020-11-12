package dev;

public class estagiario extends funcionario{
	 
	 private double vale_coxinha;
	
	 public estagiario(int ID, String nome, double salario, double vale_coxinha){
		 this.ID = ID;
		 this.nome = nome;
		 this.salario = salario;
		 this.vale_coxinha = vale_coxinha;
	 }
	 
	 
	 public void setValeCoxinha( double vale_coxinha ){
		 this.vale_coxinha = vale_coxinha;
	 }
	 
	 
	 public double getSalario(){
		 // Calcula o salário líquido
		 return(this.salario+this.vale_coxinha);
	 }
}
