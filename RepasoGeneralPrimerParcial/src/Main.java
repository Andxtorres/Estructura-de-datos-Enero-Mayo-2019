
public class Main {

	public static void main(String[] args) {
		Search<String> search= new Search<>();
		Nodo<String> node= new Nodo<>();
		node.setElemento("1");
		ListaLigada<String> lista= new ListaLigada<>();
		lista.setPrimero(node);
		lista.agregarNodoAlFinal("2");
		lista.agregarNodoAlFinal("3");
		lista.agregarNodoAlFinal("4");	
		System.out.println("Binary search:  "+search.binarySearch(lista, "10"));
		
	}

}
