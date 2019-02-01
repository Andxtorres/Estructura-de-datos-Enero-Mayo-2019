
public class Search<T extends Comparable<T>> {
	
	public int linearSearch(T[] array,T element) {
		for(int i=0;i<array.length;i++){
			if(array[i].compareTo(element)==0) {
				return i;
			}
		}
		return -1;
	}
	
	public int binarySearch(T[] array,T element) {
		int start=0;
		int end= array.length-1;
		int mid=0;
		while(start<=end) {
			mid=(start+end)/2;
			if(array[mid].compareTo(element)==0) {
				return mid;
			}
			if(element.compareTo(array[mid])<0) {
				end=mid-1;
			}else {
				start=mid+1;
			}
		}
		return -1;
	}
	
	public int binarySearchRec(T[] array,T element) {
		return binarySearchRec(array,element,0,array.length-1,(array.length-1)/2);
	}
	
	private int binarySearchRec(T[] array,T element,int start, int end, int mid) {
		
		if(start>mid) {
			return -1;
		}
		if(array[mid].compareTo(element)==0) {
			return mid;
		}
		if(element.compareTo(array[mid])<0) {
			return binarySearchRec(array,element,start,mid-1,(start+(mid-1))/2);
		}else {
			return binarySearchRec(array,element,mid+1,end,((mid+1)+end)/2);
		}
		
	}
	
	
	
}
