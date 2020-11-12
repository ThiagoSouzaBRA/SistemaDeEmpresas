package dev;

public class gerente extends funcionario{

	 private double adicional;

	 public gerente(int ID, String nome, double salario, double adicional){
		 this.ID = ID;
		 this.nome = nome;
		 this.salario= salario;
		 this.previdencia=0.07;
		 // adicional caso o funcionário seja por exemplo chefe.
		 this.adicional = adicional;
	 }
	 
	 @Override
	 public void alteraAdicional(double novo_percentual){
		 this.adicional = adicional*(1+novo_percentual);
	 }
	 
	 
	 public double getSalario(){
		 // Calcula o salário líquido
		 return(salario*((1- this.previdencia) + this.adicional));
	 }
	
}