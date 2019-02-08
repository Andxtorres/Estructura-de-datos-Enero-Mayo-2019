
public class Main {
	
	public static void main(String args[]) {
		LinkedList<Alumno> linkedList= new LinkedList<>();
		Alumno a= new Alumno("A0121194","Andres");
		linkedList.addElementAtStart(new Alumno("A0121193","Andres"));
		linkedList.addElementAtStart(new Alumno("A0121192","Andres"));
		linkedList.addElementAtStart(new Alumno("A0121191","Andres"));
		linkedList.addElementAtEnd(a);
		//linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println(a.toString());
		System.out.println("");
		linkedList.print();
		System.out.println("Element count: " +linkedList.count());
		System.out.println("Final element: "+linkedList.getLastNode());
		System.out.println("First element: "+linkedList.getFirstNode());
		System.out.println("Element at: "+linkedList.getElementAtIndex(2));
		linkedList.insertElementAtIndex(0, new Alumno("A01211917","Juan"));
		linkedList.print();
	}
}
