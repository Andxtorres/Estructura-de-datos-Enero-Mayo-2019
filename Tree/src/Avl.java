
public class Avl<T extends Comparable<T>> {
	private Nodo<T> raiz;

	public Nodo<T> getRaiz() {
		return raiz;
	}
	
	
	public void insertarElemento(T elemento) {
		raiz= insertaRecursivo(elemento,raiz);
	}
	
	
	public Nodo<T> insertaRecursivo(T elemento,Nodo<T> raiz) {
		if(raiz==null) {
			raiz= new Nodo<T>(elemento);
		}else {
			if(elemento.compareTo(raiz.getElemento())>0) {
				raiz.setDerecha(insertaRecursivo(elemento, raiz.getDerecha()));
				if(altura(raiz.getIzquierda())-altura(raiz.getDerecha())==-2) {
					if(elemento.compareTo(raiz.getDerecha().getElemento())>0) {
						raiz= rotaSimpleALaIzquierda(raiz);
					}else {
						raiz= rotarDobleALaIzquierda(raiz);
					}
				}
			}
			if(elemento.compareTo(raiz.getElemento())<0) {
				raiz.setIzquierda(insertaRecursivo(elemento, raiz.getIzquierda()));
				if(altura(raiz.getIzquierda())-altura(raiz.getDerecha())==2) {
					if(elemento.compareTo(raiz.getIzquierda().getElemento())<0) {
						raiz= rotaSimpleALaDerecha(raiz);
					}else {
						raiz= rotarDobleALaDerecha(raiz);
					}
				}	
			}
		}
		
		int altura= max(altura (raiz.getIzquierda()),altura(raiz.getDerecha()));
		System.out.println("Altura nodo: "+raiz.getElemento()+" "+altura);
		raiz.setAltura(altura+1);
		return raiz;
	}
	
	private Nodo<T> rotaSimpleALaIzquierda(Nodo<T> raiz){
		Nodo<T> temp= raiz.getDerecha();
		raiz.setDerecha(temp.getIzquierda());
		temp.setIzquierda(raiz);
		raiz.setAltura(max(altura(raiz.getIzquierda()),altura(raiz.getDerecha()))+1);
		temp.setAltura(max(altura(temp.getDerecha()),altura(raiz))+1);
		return temp;
	}
	private Nodo<T> rotaSimpleALaDerecha(Nodo<T> raiz){
		Nodo<T> temp= raiz.getIzquierda();
		raiz.setIzquierda(temp.getDerecha());
		temp.setDerecha(raiz);
		raiz.setAltura(max(altura(raiz.getIzquierda()),altura(raiz.getDerecha()))+1);
		temp.setAltura(max(altura(temp.getIzquierda()),altura(raiz))+1);
		return temp;
	}	
	
	private Nodo<T> rotarDobleALaIzquierda(Nodo<T> raiz){
		raiz.setDerecha(rotaSimpleALaDerecha(raiz.getDerecha()));
		return rotaSimpleALaIzquierda(raiz);
	}
	private Nodo<T> rotarDobleALaDerecha(Nodo<T> raiz){
		raiz.setIzquierda(rotaSimpleALaIzquierda(raiz.getIzquierda()));
		return rotaSimpleALaDerecha(raiz);
	}
	private int max(int a, int b) {
		if(a>b) {
			return a;
		}else {
			return b;
		}
	}
	
	private int altura(Nodo<T> nodo) {
		if(nodo==null) {
			return -1;
		}else {
			return nodo.getAltura();
		}
	}
}
