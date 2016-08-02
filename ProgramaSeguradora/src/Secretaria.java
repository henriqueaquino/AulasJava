import java.util.Scanner;


public class Secretaria {
	
	private final int MAX = 10;
	private Scanner ler = new Scanner(System.in);
	private ContratoResidencial[] res = new ContratoResidencial[MAX];
	private ContratoEmpresarial[] emp = new ContratoEmpresarial[MAX];
	private int q = 0;
	private int w = 0;
	
	public void instancia(){
		
		for(int i = 0; i < 10; i++){
			this.res[i] = new ContratoResidencial();
		}
		
		for(int i = 0; i < 10; i++){
			this.emp[i] = new ContratoEmpresarial();
		}
	}
	
	public void opSeguradora(int dig){
		
		switch(dig){
		
		case 1 : if(this.q < 10){
					 System.out.println("Dados do cliente: ");
					 System.out.println("Nome: ");
					 this.res[this.q].setCliente(ler.nextLine());
					 System.out.println("Endereco: ");
					 this.res[this.q].setEndereco(ler.nextLine());
					 System.out.println("Valor imovel: ");
					 this.res[this.q].setValorImovel();
					 this.res[this.q].setTipoResidencia();
					 this.res[this.q].setTipoZona();
					 this.res[this.q].calValorSeguro();
					 this.q++;
				 }else System.out.println("Não há espaço para contratos");
				 break;
				 
		case 2 : if(this.w < 10){
					 System.out.println("Dados do cliente: ");
					 System.out.println("Nome: ");
					 this.emp[this.w].setCliente(ler.nextLine());
					 this.emp[this.w].setRamo();
					 System.out.println("Numero de funcionarios: ");
					 this.emp[this.w].setNumFuncionarios();
					 System.out.println("Numero de visitas diarias: ");
					 this.emp[this.w].setNumVisitas();
					 System.out.println("Valor imóvel: ");
					 this.emp[this.w].setValorImovel();
					 this.emp[this.w].calValorSeguro();
					 this.w++;
				 }else System.out.println("Não há espaço para contratos");
				 break;
				 
		case 3 : for(int i = 0; i < this.q; i++ ){
					System.out.println("Cliente "+i);
					System.out.println("Nome: "+this.res[i].getCliente());
					System.out.println("Endereço: "+this.res[i].getEndereco());
					System.out.println("Valor imóvel: "+this.res[i].getValorImovel());
					System.out.println("Tipo de zona: "+this.res[i].getTipoZona());
					System.out.println("Tipo residencia: "+this.res[i].getTipoResidencia());
					System.out.println("Valor do seguro: "+this.res[i].getValorSeguro());
				 }
				 ler.nextLine();
				 ler.nextLine();
				 break;
				 
		case 4 : for(int i = 0; i < this.w; i++){
					System.out.println("Cliente "+i);
					System.out.println("Nome: "+this.emp[i].getCliente());
					System.out.println("Ramo: "+this.emp[i].getRamo());
					System.out.println("Numero de funcionários: "+this.emp[i].getNumFuncionarios());
					System.out.println("Numero de visitas diárias: "+this.emp[i].getNumVisitas());
					System.out.println("Valor do imóvel: "+this.emp[i].getValorImovel());
					System.out.println("Valor do seguro: "+this.emp[i].getValorSeguro());
				 }
				 ler.nextLine();
				 ler.nextLine();
				 break;
				 
		case 0 : System.exit(0);				 
		
		}
	}

}
