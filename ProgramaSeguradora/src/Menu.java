import java.util.Scanner;


public class Menu {

	private MetodosLeitura ler = new MetodosLeitura();
	
	public int menu(){
		
		System.out.println();
		System.out.println("### SEGURADORA ###");
		System.out.println("[ 1 ] - Fazer contrato pessoa fisica");
		System.out.println("[ 2 ] - Fazer contrato pessoa juridica");
		System.out.println("[ 3 ] - Exibir contratos pessoa fisica");
		System.out.println("[ 4 ] - Exibir contratos pessoa juridica");
		System.out.println("[ 0 ] - Encerrar programa");
		System.out.println();
		return ler.lerInteiro();
	}
}
