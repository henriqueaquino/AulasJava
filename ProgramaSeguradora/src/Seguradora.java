import java.util.Scanner;


public class Seguradora {
	
	public static void main(String[] args) {
	
		Menu menu = new Menu();
		Secretaria s = new Secretaria();
		Scanner ler = new Scanner(System.in);
		
		s.instancia();
		
		while(true){
			
			s.opSeguradora(menu.menu());	
		}
		
		
		
	}

}
