
public class ListaLigada<T> {
	
	private Nodo<T> primero;
	
	public int contar() {
		if(primero==null) {
			return 0;
		}else {
			int resultado=0;
			Nodo<T> temp= primero;
			while(temp!=null) {
				resultado++;
				temp=temp.getSiguiente();
			}
			return resultado;
		}
	}
	
	public T encontrarElementoEn(int pos) {
		if(contar()==0) {
			System.out.println("Nada que encontra");
			return null;
		}else {
			Nodo<T> temp= primero;
			for(int i=0;i<pos;i++) {
				temp=temp.getSiguiente();
			}
			return temp.getElemento();
		}
	}
	
	
	public void agregarNodoEnPos(T element, int pos) {
		if(contar()==0) {
			agregarNodoAlFinal(element);
		}else {
			if(pos<contar()) {
				Nodo<T> newNode= new Nodo<>();
				newNode.setElemento(element);
				Nodo<T> temp= primero;
				for(int i=0;i<pos-1;i++) {
					temp=temp.getSiguiente();
				}
				Nodo<T> prevSiguiente= temp.getSiguiente();
				temp.setSiguiente(newNode);
				newNode.setSiguiente(prevSiguiente);
				
			}else if(pos==contar()) {
				agregarNodoAlFinal(element);
			}else {
				System.out.println("No puedes insertar en la pos: "+pos);
			}
		}
		
	}
	
	public void agregarNodoAlFinal(T element) {
		Nodo<T> newNode=new Nodo<>();
		newNode.setElemento(element);
		if(contar()==0) {
			primero= newNode;
		}else {
			Nodo<T> temp= primero;
			while(temp.getSiguiente()!=null) {
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(newNode);
		}
	}

	public Nodo<T> getPrimero() {
		return primero;
	}
	public void setPrimero(Nodo<T> primero) {
		this.primero = primero;
	}
	
	

}
