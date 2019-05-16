
public class Arista<T> {
	
	private Vertice<T> v1,v2;

	public Arista(Vertice<T> v1, Vertice<T> v2) {
		super();
		this.v1 = v1;
		this.v2 = v2;
	}

	public Vertice<T> getV1() {
		return v1;
	}

	public void setV1(Vertice<T> v1) {
		this.v1 = v1;
	}

	public Vertice<T> getV2() {
		return v2;
	}

	public void setV2(Vertice<T> v2) {
		this.v2 = v2;
	}
	
	
	

}
