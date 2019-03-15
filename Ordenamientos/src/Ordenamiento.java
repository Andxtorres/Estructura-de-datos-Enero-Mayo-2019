
public class Ordenamiento<T extends Comparable<T>> {
	
	
	public LinkedList<T> bubbleSortConCopia(LinkedList<T> list) {
		LinkedList<T> res=new LinkedList<>(list);
		for(int i=0;i<res.count()-1;i++) {
			boolean swapped=false;
			for(int j=0;j<res.count()-1;j++) {
				if(res.getElementAtIndex(j).compareTo(res.getElementAtIndex(j+1))>0) {
					res.swap(j, j+1);
					swapped=true;
				}
			}
			if(!swapped)
				break;
		}
		return res;
	}
	public void bubbleSort(LinkedList<T> list) {
		for(int i=0;i<list.count()-1;i++) {
			boolean swapped=false;
			for(int j=0;j<list.count()-1;j++) {
				if(list.getElementAtIndex(j).compareTo(list.getElementAtIndex(j+1))>0) {
					list.swap(j, j+1);
					swapped=true;
				}
			}
			if(!swapped)
				break;
		}
	}
	
	public void selectionSort(LinkedList<T> list) {
		for(int i=0;i<list.count()-1;i++) {
			int smallest=i;
			for (int j=i+1;j<list.count();j++) {
				if(list.getElementAtIndex(j).compareTo(list.getElementAtIndex(smallest))<0) {
					smallest=j;
				}
			}
			list.swap(smallest, i);
		}
		
	}
	
	public void insertionSort(LinkedList<T> list) {
		int i=1;
		while(i<list.count()) {
			int j=i;
			while(j>0 && list.getElementAtIndex(j-1).compareTo(list.getElementAtIndex(j))>0) {
				list.swap(j, j-1);
				j--;
			}
			i++;
		}
	}
	
	public void quickSort(LinkedList<T> list) {
		quickSortRec(list,0,list.count()-1);
	}
	
	private void quickSortRec(LinkedList<T> list, int izquierda,int derecha) {

       T pivot = list.getElementAtIndex((izquierda+derecha)/2);
       int i = izquierda;
       int j = derecha;
      
       while (i <= j) {

           while (list.getElementAtIndex(i).compareTo(pivot) <0) {
               i++;
           }
           while (list.getElementAtIndex(j).compareTo(pivot) > 0) {
               j--;
           }
           if (i <= j) {
               list.swap(i, j);
               i++;
               j--;
           }
       }
       if (izquierda < j)
           quickSortRec(list,izquierda, j);
       if (i < derecha)
    	   quickSortRec(list,i, derecha);
    	   
	}
	
	public Node<T> mergeSortRec(Node<T> start) {
		Node<T> inicioAnterior= start;
		LinkedList<T> listaTemporal= new LinkedList<>(start);
		int mid= listaTemporal.count()/2;
		if(start.getNext()==null) {
			return start;	
		}
		while(mid-1>0) {
			inicioAnterior=inicioAnterior.getNext();
			mid--;
		}
		Node<T> nuevoInicio=inicioAnterior.getNext();
		inicioAnterior.setNext(null);
		inicioAnterior=start;
		System.out.println("Parte list inicial izquierda: "+inicioAnterior.getElement());
		System.out.println("Parte list inicial derecha: "+nuevoInicio.getElement());
		
		Node<T> izquierda= mergeSortRec(inicioAnterior);
		Node<T> derecha= mergeSortRec(nuevoInicio);
		
		return merge(izquierda,derecha);
	}
	
	
	private Node<T> merge(Node<T> node1,Node<T> node2){
		Node<T> res= null;
		if(node1==null) {
			return node2;
		}
		if(node2==null) {
			return node1;
		}
		if(node1.getElement().compareTo(node2.getElement())>0) {
			res= node2; 
			res.setNext(merge(node1,node2.getNext()));
		}else {
			res= node1; 
			res.setNext(merge(node1.getNext(),node2));		
		}
		LinkedList<T> listaTemporal= new LinkedList<>(res);
		listaTemporal.print(res);
		System.out.println("------");
		return res;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
