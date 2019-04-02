
public class Nodo<T> {
	
	private T elemento;
	private Nodo<T> izquierda;
	private Nodo<T> derecha;
	
	public Nodo(T elemento) {
		this.elemento=elemento;
	}
	public T getElemento() {
		return elemento;
	}
	public void setElemento(T elemento) {
		this.elemento = elemento;
	}
	public Nodo<T> getIzquierda() {
		return izquierda;
	}
	public void setIzquierda(Nodo<T> izquierda) {
		this.izquierda = izquierda;
	}
	public Nodo<T> getDerecha() {
		return derecha;
	}
	public void setDerecha(Nodo<T> derecha) {
		this.derecha = derecha;
	}
	
	

}
