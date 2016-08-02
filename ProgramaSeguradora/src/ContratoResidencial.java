
public class ContratoResidencial {
	
	private MetodosLeitura ler = new MetodosLeitura();
	
	private String cliente;
	private String endereco;
	private double valorImovel;
	private int tipoZona;
	private int tipoResidencia;
	private double valorSeguro;
	
	public void calValorSeguro(){
		this.valorSeguro = this.valorImovel * 0.02;
		
		if (this.tipoZona == 2){
			this.valorSeguro += this.valorImovel * 0.01;
		}else
			if (this.tipoZona == 3){
				this.valorSeguro += this.valorImovel * 0.005;
			}
		
		if (this.tipoResidencia == 1){
			this.valorSeguro += this.valorImovel * 0.005;
		}		
	}
	
	public double getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public double getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel() {
		double valorImovel = ler.lerDouble();		
		this.valorImovel = valorImovel;
	}
	public int getTipoZona() {
		return tipoZona;
	}
	public void setTipoZona() {
		int tipoZona = 2;
		
		System.out.println();
		System.out.println("Escolha o tipo de zona: ");
		System.out.println("[ 1 ] Rural");
		System.out.println("[ 2 ] Urbana");
		System.out.println("[ 3 ] SubUrbana");
		System.out.println();
		
		tipoZona = ler.lerInteiro();	
		
		this.tipoZona = tipoZona;
	}
	public int getTipoResidencia() {
		return tipoResidencia;
	}
	public void setTipoResidencia() {
		int tipoResidencia = 1;
		
		System.out.println();
		System.out.println("Escolha o tipo de residencia: ");
		System.out.println("[ 1 ] Casa");
		System.out.println("[ 2 ] Apartamento");
		System.out.println();
		
		tipoResidencia = ler.lerInteiro();
		
		
		this.tipoResidencia = tipoResidencia;
	}
	
	

}
