
public class Search <T extends Comparable<T>>{
	
	public int binarySearch(ListaLigada<T> lista, T elementoABuscar) {
		int start=0;
		int end= lista.contar()-1;
		while(start<=end) {
			int mid=(start+end)/2;
			if(lista.encontrarElementoEn(mid).compareTo(elementoABuscar)==0) {
				return mid;
			}else if(lista.encontrarElementoEn(mid).compareTo(elementoABuscar)<0){
				start= mid+1;
			}else {
				end= mid-1;
			}
		}
		return -1;
		
	}

}
