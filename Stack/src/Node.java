
public class Node <T>{
	
	private T element;
	private Node<T> next;
	
	public Node(T element) {
		super();
		this.element = element;
	}

	public T getElement() {
		return element;
	}

	public void setElement(T element) {
		this.element = element;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
	
	public String toString() {
		return element.toString();
	}

}
