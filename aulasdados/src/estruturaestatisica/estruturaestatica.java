package estruturaestatisica;
public class estruturaestatica<T>{
	
	public T[] elementos;
	public int tamanho;
	
	
	
	public estruturaestatica(int capacidade) {
		this.elementos = (T[]) new Object[capacidade];
		this.tamanho = 0;
	}
	
	public estruturaestatica(){
		this(10);
	}
	
	
	public boolean adiciona(T elemento) {
		this.aumentaCapacidade();
		if(this.tamanho < this.elementos.length) {
			this.elementos[this.tamanho] = elemento;
			this.tamanho++;
			return true;
		}
		return false;
	}
	
	
	public void aumentaCapacidade() {
		if(this.tamanho == this.elementos.length) {
			T[] elementosNovos = (T[]) new Object[this.elementos.length * 2];
			for (int i=0; i<this.elementos.length; i++) {
				elementosNovos[i] = this.elementos[i];
			
			}
			this.elementos = elementosNovos;
		}
	}
	
	public int tamanho() {
		return this.tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i = 0; i < this.tamanho-1; i++) {
			s.append(this.elementos[i]);
			s.append(", ");
		}
		
		if(this.tamanho> 0) {
			s.append(this.elementos[this.tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
		
	}
	
	public boolean estaVazia() {
		return this.tamanho == 0;
	}
	
	public void remove(int posicao) {
		if(!(posicao >=0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
			
		}
		for(int i= posicao; i<tamanho-1; i++) {
			elementos[i] = elementos[i++];
		}
		tamanho --;
	}
	
	
	
}
