
public class Cola<T> {
	
	private Nodo<T> primero;
	
	public void enqueue(T element) {
		Nodo<T> newNode= new Nodo<>();
		newNode.setElemento(element);
		if(primero==null) {
			primero=newNode;
		}else {
			Nodo<T> temp= primero;
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(newNode);
		}
		
	}
	
	public T dequeue() {
		if(primero==null) {
			System.out.println("Nada que sacar");
			return null;
		}else {
			T resultado= primero.getElemento();
			primero= primero.getSiguiente();
			return resultado;
		}
		
	}
	
	public T peek() {
		if(primero==null) {
			System.out.println("Nada que sacar");
			return null;
		}else {
			T resultado= primero.getElemento();
			return resultado;
		}
	}

	public Nodo<T> getPrimero() {
		return primero;
	}

	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}
	
	

}
