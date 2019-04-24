
public class Main {

	public static void main(String[] args) {
		
		Avl<Integer> arbol= new Avl<>();
		arbol.insertarElemento(8);
		arbol.insertarElemento(6);
		arbol.insertarElemento(10);
		arbol.insertarElemento(4);
		arbol.insertarElemento(1);
		arbol.insertarElemento(7);
		arbol.insertarElemento(9); 
		arbol.insertarElemento(11);

		ArbolPrinter<Integer> ap= new ArbolPrinter<>();
		ap.printNodo(arbol.getRaiz());

	}

}
