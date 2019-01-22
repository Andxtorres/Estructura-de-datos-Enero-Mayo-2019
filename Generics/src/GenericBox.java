
public class GenericBox<T> {
	
	private T object;
	
	public GenericBox(T object) {
		super();
		this.object = object;
	}

	public T getObject() {
		return object;
	}

	public void setObject(T object) {
		this.object = object;
	}

}
