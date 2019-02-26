
public class Stack<T> {
	
	private Nodo<T> primero;
	
	public void push(T element) {
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
	
	public T pop() {
		if(primero==null) {
			System.out.println("Nada que sacar");
			return null;
		}else {
			Nodo<T> temp= primero;
			if(temp.getSiguiente()==null) {
				T resultado=temp.getElemento();
				primero=null;
				return resultado;
			}else {
				while(temp.getSiguiente().getSiguiente()!=null) {
					temp=temp.getSiguiente();
				}
				T resultado= temp.getSiguiente().getElemento();
				temp.setSiguiente(null);
				return resultado;
			}
			
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
