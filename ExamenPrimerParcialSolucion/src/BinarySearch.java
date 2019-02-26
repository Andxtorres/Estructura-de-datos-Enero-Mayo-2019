import java.util.LinkedList;

public class BinarySearch<T extends Comparable<T>> {
	
	public int binarySearch(LinkedList<T> list,T element) {
		
		int inicio=0;
		int end= list.size()-1;
		while(inicio<=end) {
			int mid= (inicio+end)/2;
			if(element.equals(list.get(mid))) {
				return mid;
			}
			if(element.compareTo(list.get(mid))<0) {
				end= mid-1;
			}else {
				inicio= mid+1;
			}
		}
		
		return -1;
		
	}

}
