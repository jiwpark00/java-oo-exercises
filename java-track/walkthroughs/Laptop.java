
public class Laptop extends Computer {
	
	private boolean isClosed;
	
	public Laptop(int memory, double size, double processor, String brand) {
		super(memory,size,processor,brand);
		this.isClosed = true;
	}
	
	public void close() {
		this.isClosed = true;
	}
	
	public void open() {
		this.isClosed = false;
	}
}
