
public class Stack<T>{
	
	private LinkedList<T> linkedList;
	
	public Stack() {
		linkedList= new LinkedList<>();
	}
	
	public void push(T element) {
		linkedList.addElementAtEnd(element);
	}
	
	public T peek() {
		return linkedList.getElementAtIndex(linkedList.count()-1);
	}

	public T pop() {
		return linkedList.removeLast();
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
