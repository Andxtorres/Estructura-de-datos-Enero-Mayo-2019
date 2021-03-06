
public class Queue<T> {
	private LinkedList<T> linkedList;
	
	public void enqueue(T element) {
		
		linkedList.addElementAtEnd(element);
		
	}
	
	public T dequeue() {
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
