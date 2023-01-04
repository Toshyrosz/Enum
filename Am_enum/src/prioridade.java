
public enum prioridade {
	
	MIN(1),NOMRAL(5),MAX(10);
	
	private int valor;
	
	prioridade(int valor){
		this.valor = valor;
	}
	
	public int getValor () {
		return this.valor;
	}
	
}
