package estruturaestatisica;

public class teste {
	public static void main (String[] args) {
		Fila<Integer> fila = new Fila<Integer>();
		fila.enfileira(1);
		fila.enfileira(2);
		fila.enfileira(3);
		
		System.out.println(fila.espiar());
		
		System.out.println(fila.toString());
		
		System.out.println(fila.desenfileira());
		
		System.out.println(fila.toString());
		
	}
	
	
}
