package generator4j;

public interface Generator<T> {
	
	public T valid();
	
	public T invalid();

}
