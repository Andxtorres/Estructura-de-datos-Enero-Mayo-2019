
public class Main {

	public static void main(String[] args) {
		
		Arbol<Integer> arbol= new Arbol<>();
		arbol.insertarElemento(8);
		arbol.insertarElemento(6);
		arbol.insertarElemento(10);
		arbol.insertarElemento(4);
		arbol.insertarElemento(1);
		arbol.insertarElemento(7);
		arbol.insertarElemento(9);
		arbol.insertarElemento(11);
		arbol.recorreEnPreOrden();

	}

}
