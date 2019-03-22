
public class HashTable<K,V> {
	
	private Entry<K,Node<V>>[] entries;
	
	
	public HashTable(int size) {
		entries= new Entry[size];
	}
	
	public V getValue(K key) {
		Entry<K,Node<V>> result=entries[hash(key.hashCode())];
		if(result==null) {
			System.out.println("Entry no encontrada");
			return null;
		}
		if(entries[hash(key.hashCode())].getKey().equals(key)) {
			return result.getValue().getElement();
		}else {
			Node<V> temp=result.getValue();
			System.out.println("Key :"+key.hashCode());
			while(temp!=null&&temp.getElement().hashCode()!=key.hashCode()) {
				System.out.println("Temp: "+temp.getElement().hashCode());
				temp=temp.getNext();
			}
			try{
				return temp.getElement();
			}catch(NullPointerException e) {
				return null;
			}
		}

	}
	
	
	public void insert(K key, V value) {
		Node<V> valor= new Node<>(value);
		Entry<K,Node<V>> entry= new Entry<K,Node<V>>(key,valor);
		
		int pos= hash(key.hashCode());
		/*
		while(entries[pos]!=null) {
			pos++;
		}
		*/
		if(entries[pos]!=null) {
			Node<V> temp= entries[pos].getValue();
			while(temp.getNext()!=null) {
				temp=temp.getNext();
			}
			temp.setNext(valor);
		}else {
			entries[pos]=entry;
		}
		
	}
	
	public int hash(int toHash) {
		return (toHash-1)%entries.length;
	}
	
	public void print() {
		for (int i = 0; i < entries.length; i++) {
			try {
				LinkedList<V> list= new LinkedList<>();
				list.setStart(entries[i].getValue());
				System.out.println((i+1)+".- "+list.toString());
		
			}catch(NullPointerException e) {
				System.out.println((i+1)+".- Vacío");

			}
		}
	}
}
