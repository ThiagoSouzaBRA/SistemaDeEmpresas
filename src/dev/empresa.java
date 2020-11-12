package dev;

import java.util.ArrayList;

public class empresa {
	
	//Lista contendo os objetos que extendem o tipo funcion�rio.
	private ArrayList<funcionario> lista = new ArrayList<>();
	
	
	//Adicionar Estagiario.
	public void addFunc(estagiario func) {
		lista.add(func);
	}
	
	//Adicionar Gerente.
	public void addFunc(gerente func) {
		lista.add(func);	
	}
	
	//Adicionar Presidente
	public void addFunc(presidente func) {
		lista.add(func);
	}
	
	//Adicionar Secretaria.
	public void addFunc(secretaria func) {
		lista.add(func);
	}
	
	//Calculando o sal�rio do funcion�rio igual ao ID passado por parametro.
	public double calcSalario(int ID) {
		
		//Buscando na lista.
		for(funcionario func : lista){
			  if(func.getID() == ID){
			    return func.getSalario();
			  }
		}
		return 0.0;
	}
	
	//Aumenta adicional para tipo de usu�rios especificos.
	public boolean aumentaAdicional(double adicional_novo) {
		
		//Verificar se o novo adicional est� nos parametros aceitaveis
		if(adicional_novo >= 0.0 && adicional_novo <= 1.0) {
			//Buscando na lista.
			for(funcionario func : lista){
				//Percorrendo a lista e aplicando adicional para os funcion�rios que possuem a funcionalidade.
				  func.alteraAdicional(adicional_novo);
			}
			return true;
		}
		//Caso parametros aceitaveis n�o estejam aceitaveis.
		return false;
	}
	
	
	public String gerarRelatorio() {
		String relatorio = "";
		
		//Buscando na lista.
		for(funcionario func : lista){
			
			relatorio += 	"ID: " 		+	func.getID() 		+ " |" +
							"Nome: " 	+	func.getNome() 		+ " |" +
							"Sal�rio: " + 	func.getSalario() 	+ " |\n" ; 
		}
		return relatorio;
	}
	

}
