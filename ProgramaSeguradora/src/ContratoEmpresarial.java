
public class ContratoEmpresarial {
	
	private MetodosLeitura ler = new MetodosLeitura();
	
	private String cliente;
	private int ramo;
	private int numFuncionarios;
	private int numVisitas;
	private double valorImovel;
	private double valorSeguro;
	
	public void calValorSeguro(){
		this.valorSeguro = this.valorImovel * 0.04;
		
		if (this.ramo == 1){		
			this.valorSeguro += this.valorImovel * 0.01;
		}else
		{
			this.valorSeguro += this.valorImovel * 0.005;
		}
		
		int calFuncionarios = this.numFuncionarios % 10;
		
		this.valorSeguro += (this.valorImovel * 0.002) * calFuncionarios;
		
		int calVisitas = this.numVisitas % 200;
		
		this.valorSeguro += (this.valorImovel * 0.003) * calVisitas;
	}
	
	public double getValorSeguro() {
		return valorSeguro;
	}
	public void setValorSeguro(double valorSeguro) {
		this.valorSeguro = valorSeguro;
	}
	public MetodosLeitura getLer() {
		return ler;
	}
	public void setLer(MetodosLeitura ler) {
		this.ler = ler;
	}
	public String getCliente() {
		return cliente;
	}
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	public int getRamo() {
		return ramo;
	}
	public void setRamo() {
		int ramo = 1;
		
		System.out.println();
		System.out.println("Digite o ramo: ");
		System.out.println("[ 1 ] Comércio");
		System.out.println("[ 2 ] Indústria");
		System.out.println("[ 3 ] Agropecuária");
		System.out.println();
		
		ramo = ler.lerInteiro();
		
		this.ramo = ramo;
	}
	public int getNumFuncionarios() {
		return numFuncionarios;
	}
	public void setNumFuncionarios() {
		int numFuncionarios = ler.lerInteiro();
		this.numFuncionarios = numFuncionarios;
	}
	public int getNumVisitas() {
		return numVisitas;
	}
	public void setNumVisitas() {
		int numVisitas = ler.lerInteiro();
		this.numVisitas = numVisitas;
	}
	public double getValorImovel() {
		return valorImovel;
	}
	public void setValorImovel() {
		double valorImovel = ler.lerDouble();
		this.valorImovel = valorImovel;
	}
	
	

}
