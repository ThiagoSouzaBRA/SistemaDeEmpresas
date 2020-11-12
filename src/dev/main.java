package dev;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		
		empresa monzeu = new empresa();
		
		falar("Seja bem vindo ao sistema de empresas.");
		falar("Agradecimentos ao professor F�bio Aparecido Gamarra Lubacheski.");
		falar("(PROJETO DE PARADIGMAS DE LINGUAGEM DE PROGRAMA��O)");
		
		imprimirPainel();
		
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		
		String op = in.nextLine();
		
		while(op != "0") {
			
			switch(op) {
			case "1": //Adicionar funcion�rio
				falar("Digite o funcion�rio que deseja adicionar:");
					falar("[1] - Estagi�rio.");
					falar("[2] - Secretaria.");
					falar("[3] - Gerente.");
					falar("[4] - Presidente.");
					
					String _id = "";
					String _nome = "";
					String _salario = "";
					String _vale_coxinha = "";
					String _adicional = "";
					
					switch(in.nextLine()) {
						case "1": 
							
							falar("Insira o ID: ");
							_id = in.nextLine();
							falar("Insira o Nome: ");
							_nome = in.nextLine();
							falar("Insira o Sal�rio: ");
							_salario = in.nextLine();
							falar("Insira o vale coxinha: ");
							_vale_coxinha = in.nextLine();
							
							//Adicionando.
							estagiario func = new estagiario(Integer.parseInt(_id), _nome, Double.parseDouble(_salario), Double.parseDouble(_vale_coxinha));
							monzeu.addFunc(func);
							
							break;
						case "2":
							
							falar("Insira o ID: ");
							_id = in.nextLine();
							falar("Insira o Nome: ");
							_nome = in.nextLine();
							falar("Insira o Sal�rio: ");
							_salario = in.nextLine();
							
							//Adicionando.
							monzeu.addFunc(new secretaria(Integer.parseInt(_id), _nome, Double.parseDouble(_salario)));
							
							break;
						case "3":
							
							falar("Insira o ID: ");
							_id = in.nextLine();
							falar("Insira o Nome: ");
							_nome = in.nextLine();
							falar("Insira o Sal�rio: ");
							_salario = in.nextLine();
							falar("Insira o adicional: ");
							_adicional = in.nextLine();
							
							//Adicionando.
							monzeu.addFunc(new gerente(Integer.parseInt(_id), _nome, Double.parseDouble(_salario), Double.parseDouble(_adicional)));
							
							break;
						case "4":
							
							falar("Insira o ID: ");
							_id = in.nextLine();
							falar("Insira o Nome: ");
							_nome = in.nextLine();
							falar("Insira o Sal�rio: ");
							_salario = in.nextLine();
							
							//Adicionando.
							monzeu.addFunc(new presidente(Integer.parseInt(_id), _nome, Double.parseDouble(_salario)));
							
							break;
						default:
							falar("Tipo de funcion�rio inv�lido.");
							break;
					}
				
				break;
			case "2":
				
				falar("Por favor digite o ID do funcion�rio: ");
				String id_func = in.nextLine();
				
				falar("Sal�rio de funcion�rio ID [" + id_func + "]: R$ " + monzeu.calcSalario(Integer.parseInt(id_func)));
				break;
			case "3":
				
				falar("Por favor insira o adicional [0.0 a 1.0] : ");
				String adicionalTodos = in.nextLine();
				
				falar(monzeu.aumentaAdicional(Double.parseDouble(adicionalTodos)) ? "[SUCESSO] Adicional atualizado." : "[Erro] N�o foi possivel atualizar o adicional.");
			
				break;
			case "4":
				
				falar(monzeu.gerarRelatorio());
				
				break;
		
			default:
				
				imprimirPainel();
				falar("Opera��o inv�lida.");
			}
			
			falar("Pressione ENTER para realizar mais uma opera��o.. ");
			
			in.nextLine();
			
			imprimirPainel();
			op = in.nextLine();
		}	

		falar("Muito obrigado por utilizar o programa, at� a pr�xima! :D");
	}
	
	
	public static void imprimirPainel() {
		falar("====================================================================");
		falar("=============================== MENU ===============================");
		falar("====================================================================");
		falar("[0] - Sair do programa.");
		falar("[1] - Adicionar um funcion�rio.");
		falar("[2] - Calcular pagamento do funcion�rio.");
		falar("[3] - Aumentar o adicional de todos os funcion�rios.");
		falar("[4] - Relat�rio dos funcion�rios da empresa.");
		falar("====================================================================");
		falar("Por favor digite a opera��o: ");
	}
	
	
	public static void falar(String msg) {
		System.out.println(msg);
	}
	
}
