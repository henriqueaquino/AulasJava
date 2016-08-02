import java.util.Scanner;


public class MetodosLeitura {
	
	private Scanner ler = new Scanner(System.in);
	
	public int lerInteiro(){
		int valor = -1;
		
		while(valor < 0){
			try{
				valor = Integer.parseInt(ler.nextLine());
				ler.nextLine();
			}catch(NumberFormatException exp){
				System.out.println("Digite um valor válido: ");
			}
		}
		
		return valor;
	}
	
	public double lerDouble(){
		
		double valor = -1;
		
		while(valor < 0){
			try{
				valor = Double.parseDouble(ler.nextLine());
				ler.nextLine();
			}catch(NumberFormatException exp){
				System.out.println("Digite um valor válido: ");
			}
		}
		
		return valor;
	}
}
