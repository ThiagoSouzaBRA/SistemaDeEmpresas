package dev;

public class secretaria extends funcionario{
		 
		 public secretaria(int ID, String nome, double salario){
			 this.ID = ID;
			 this.nome = nome;
			 this.salario = salario;
			 // Desconto fixo de um sistema de previd�ncia da empresa
			 this.previdencia = 0.05;
		 }
		 
	 public double getSalario (){
		 // Calcula o sal�rio l�quido
		 return(salario*(1-this.previdencia));
	 }
	 
}
