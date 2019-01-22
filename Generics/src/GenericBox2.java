
public class GenericBox2 <T,U>{
	
	private T t;
	private U u;
	
	public GenericBox2(T t, U u) {
		super();
		this.t = t;
		this.u = u;
	}
	public T getT() {
		return t;
	}
	public void setT(T t) {
		this.t = t;
	}
	public U getU() {
		return u;
	}
	public void setU(U u) {
		this.u = u;
	}
}
