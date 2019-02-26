
public class Nodo<T> {
	
	//Todo lo que este aquí adentro con T tendrá el tipo T que se defina en la implementación
	private T elemento;
	private Nodo<T> siguiente;

	public T getElemento() {
		return elemento;
	}

	public void setElemento(T elemento) {
		this.elemento = elemento;
	}

	public Nodo<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo<T> siguiente) {
		this.siguiente = siguiente;
	}
	
	
}
