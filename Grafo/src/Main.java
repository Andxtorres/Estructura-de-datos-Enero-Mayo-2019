
public class Main {
	
	public static void main(String[] args) {
		Grafo<String> g= new Grafo<>();
		g.addVertice("A");
		g.addVertice("B");
		g.addVertice("C");
		g.addVertice("D");
		g.addVertice("E");
		g.addVertice("F");
		g.addVertice("G");
		g.addVertice("H");
		g.addArista("A", "B");
		g.addArista("A", "C");
		g.addArista("A", "D");
		g.addArista("A", "E");
		g.addArista("B", "G");
		g.addArista("E", "F");
		g.addArista("F", "G");
		g.addArista("C", "H");
		
		g.recorreEnProfundidad();
		
	}

}
