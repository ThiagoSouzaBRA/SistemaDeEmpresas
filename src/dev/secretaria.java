package dev;

public class secretaria extends funcionario{
		 
		 public secretaria(int ID, String nome, double salario){
			 this.ID = ID;
			 this.nome = nome;
			 this.salario = salario;
			 // Desconto fixo de um sistema de previdência da empresa
			 this.previdencia = 0.05;
		 }
		 
	 public double getSalario (){
		 // Calcula o salário líquido
		 return(salario*(1-this.previdencia));
	 }
	 
}
