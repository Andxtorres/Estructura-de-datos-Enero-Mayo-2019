
public class LinkedList<T extends Comparable<T>> {
	
	private Node<T> start;
	
	public LinkedList() {
	}
	
	public LinkedList(Node<T> start) {
		this.start=start;
	}
	
	public LinkedList(LinkedList<T> list) {
		Node<T> temp= list.getFirstNode();
		start= new Node<>(list.getFirstNode().getElement());
		int i=0;
		while(temp!=null) {
			if(i!=0)
				addElementAtEnd(temp.getElement());
			i++;
			temp=temp.getNext();
		}
	}
	
	
	public void removeFirst() {
		if(start==null) {
			System.out.println("Nothing to remove");
		}else {
			start=start.getNext();
		}
	}
	
	public void removeLast() {
		if(start==null) {
			System.out.println("Nothing to remove");
		}else {
			if(count()==1) {
				start=null;
			}else {
				
				Node<T> temp= start;
				while(temp.getNext().getNext()!=null) {
					temp=temp.getNext();
				}				
				temp.setNext(null);
				
			}

		}
	}
	public Node<T> getLastNode(){
		if(start==null) {
			System.out.println("Nothing to get");
			return null;
		}else {
			Node<T> temp=start;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			return temp;
		}
	}
	
	public Node<T> getFirstNode(){
		if(start==null) {
			System.out.println("Nothing to get");
			return null;			
		}else {
			return start;
		}
	}
	
	public Node<T> getNodeAtIndex(int index){
		if(index<0||index>count()-1) {
			System.out.println("Index out of bounds: "+index);
			return null;
		}else {
			int count=0;
			Node<T> temp=start;
			while(count!=index) {
				count++;
				temp=temp.getNext();
			}
			return temp;
		}
		
	}
	
	public void insertElementAtIndex(int index,T element) {
		if(index<0||index>count()) {
			System.out.println("Index out of bounds");
		}else {
			if(count()==0) {
				addElementAtStart(element);
			}
			int count=0;
			Node<T> temp=start;
			if(index!=0) {
				while(count!=index-1) {
					count++;
					temp=temp.getNext();
				}
				Node<T> newNode= new Node<T>(element);
				newNode.setNext(temp.getNext());
				temp.setNext(newNode);
			}else {
				addElementAtStart(element);
			}
		}
	}
	
	public T getElementAtIndex(int index) {
		return getNodeAtIndex(index).getElement();
	}
	
	
	public T getLastElement() {
		return getLastNode().getElement();
	}
	
	public T getFirstElement() {
		return getFirstNode().getElement();
	}
	
	public void addElementAtStart(T element) {
		if(start==null) {
			start= new Node<T>(element);
		}else {
			
			Node<T> newNode= new Node<T>(element);
			newNode.setNext(start);
			start= newNode;
		}
	}
	
	public void addElementAtEnd(T element) {
		if(start==null) {
			start= new Node<T>(element);
		}else {
			Node<T> temp= start;
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(new Node<T>(element));
		}
		
	}
	
	public int count() {
		int c=0;
		if(start!=null) {
			Node<T> temp=start;
			while(temp!=null) {
				c++;
				temp=temp.getNext();
			}
		}
		return c;
	}
	
	public void print() {
		if(start==null) {
			System.out.println("Empty list");
		}else {
			Node<T> temp= start;
			while(temp!=null) {
				System.out.println(temp.getElement().toString());
				temp=temp.getNext();
			}
		}
	}
	public void print(Node<T> start) {
		if(start==null) {
			System.out.println("Empty list");
		}else {
			Node<T> temp= start;
			while(temp!=null) {
				System.out.println(temp.getElement().toString());
				temp=temp.getNext();
			}
		}
	}
		
	public void swap(int x,int y) {
		T temp1= getNodeAtIndex(x).getElement();
		T temp2= getNodeAtIndex(y).getElement();
		getNodeAtIndex(x).setElement(temp2);
		getNodeAtIndex(y).setElement(temp1);
		
	}

	public int getLength(Node<T> a) {
		int count = 0;
		Node<T> h = a;
		while (h != null) {
			count++;
			h = h.getNext();
		}
		return count;
	}
	
	
	
}

