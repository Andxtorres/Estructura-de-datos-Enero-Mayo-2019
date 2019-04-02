
public class Arbol<T extends Comparable<T>> {
	
	private Nodo<T> raiz;
	
	
	public void insertarElemento(T elemento) {
		Nodo<T> nodo= new Nodo<>(elemento);
		if(raiz==null) {
			raiz=nodo;
		}else {
			insertarElementoRec(raiz,nodo);
		}
	}
	
	public Nodo<T> insertarElementoRec(Nodo<T> raiz, Nodo<T> nodoAInsertar) {
		if(raiz==null) {
			return nodoAInsertar;
		}else {
			if(nodoAInsertar.getElemento().compareTo(raiz.getElemento())>0) {
				raiz.setDerecha(insertarElementoRec(raiz.getDerecha(),nodoAInsertar));
			}else {
				raiz.setIzquierda(insertarElementoRec(raiz.getIzquierda(),nodoAInsertar));

			}
			return raiz;
		}
	}
	
	public void recorreEnPreOrden() {
		recorreEnPreOrdenRec(raiz);
	}
	
	private void recorreEnPreOrdenRec(Nodo<T> nodo) {
		if(nodo!=null) {
			System.out.print(nodo.getElemento().toString()+", ");
			recorreEnPreOrdenRec(nodo.getIzquierda());
			recorreEnPreOrdenRec(nodo.getDerecha());
		}
	}

}
