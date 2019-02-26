
public class Queue<T> {
	
	Node<T> start;
	
	
	public T deque() {
		
		if(start==null) {
			System.out.println("No hay asesorias pendientes");
			return null;
		}else {
			Node<T> temp=start;
			T res= temp.getElement();
			start=start.getNext();
			return res;
		}
	
	}

}
