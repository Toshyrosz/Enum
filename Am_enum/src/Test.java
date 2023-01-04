
public class Test {
	public static void main(String[] args) {
		
		prioridade pMin = prioridade.MIN;
		prioridade pMax = prioridade.MAX;
		
		System.out.println(pMin.name());
		System.out.println(pMax.name());
		
		System.out.println(pMin.ordinal());
		System.out.println(pMax.ordinal());
		
		System.out.println(pMin.getValor());
		System.out.println(pMax.getValor());
	}
}