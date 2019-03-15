public class Main {

	public static void main(String[] args) {
		LinkedList<Integer> linkedList= new LinkedList<>();
		
		linkedList.addElementAtEnd(3);
		linkedList.addElementAtEnd(5);
		linkedList.addElementAtEnd(21);
		linkedList.addElementAtEnd(7);
		linkedList.addElementAtEnd(1);
		linkedList.addElementAtEnd(8);
		linkedList.addElementAtEnd(0);
		linkedList.addElementAtEnd(-4);
		linkedList.print();
		System.out.println("---------------");
		Ordenamiento<Integer> ordenamientos= new Ordenamiento<>();
		//ordenamientos.quickSort(linkedList);
		ordenamientos.mergeSortRec(linkedList.getFirstNode());
		linkedList.print();
		/*
		linkedList.swap(1, 4);
		System.out.println("---------------");
		linkedList.print();
		
		System.out.println("Despues de ordenar Original Bubble: ");
		Ordenamiento<Integer> o= new Ordenamiento<>();
		LinkedList<Integer> ordenada=o.bubbleSortConCopia(linkedList);
		linkedList.print();
		System.out.println("Despues de ordenar Ordenada Bubble: ");
		ordenada.print();
		System.out.println("Original Insertion: ");
		linkedList.print();
		System.out.println("Despues de ordenar Ordenada Insertion: ");
		o.insertionSort(linkedList);
		linkedList.print();
		*/
		

	}

}
