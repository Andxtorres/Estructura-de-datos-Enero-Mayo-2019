
public class Queue<T> {
	private LinkedList<T> linkedList;
	
	public Queue() {
		linkedList= new LinkedList<>();
	}
	
	public void enqueue(T element) {
		
		linkedList.addElementAtEnd(element);
		
	}
	
	public T dequeue() {

			
		
		if(isEmpty()) {
			System.out.println("Empty Queue");
			return null;
		}
		T result=linkedList.getFirstElement();
		linkedList.removeFirst();
		return result;
		
	}
	
	public T peek() {
		return linkedList.getElementAtIndex(0);
	}
	
	public boolean isEmpty() {
		if(linkedList.count()==0) {
			return true;
		}
		return false;
	}
	
	public void print() {
		linkedList.print();
	}

}
