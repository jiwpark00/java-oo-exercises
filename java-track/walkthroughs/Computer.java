
public class Computer {
	
	// Fields:
	
	private int memory;
	private double size;
	private double processor;
	private String brand;
	
	// memory - int
	// size - double
	// processor - double
	// brand - String
	
	// Behaviors
	
	// Create a computer (nearly every class we create has a constructor.
	public Computer(int memory, double size, double processor, String brand)
	{
		this.memory = memory;
		this.size = size;
		this.processor = processor;
		this.brand = brand;
	}
	// Get the brand name
	
	public String getBrand()
	{
		return this.brand;
	}
	
	// Get the size
	
	public double getSize()
	{
		return this.size;
	}
	// Get the processing speed
	public double getProcessor()
	{
		return this.processor;
	}
	
	// Get the memory
	public int getMemory()
	{
		return this.memory;
	}
	
	// Add memory
	public void addMemory(int newMemory) {
		if (this.memory + newMemory > 8) {
			return;
		}
		else {
			this.memory  = this.memory + newMemory;
		}
	}
	
	// Swap out the processor
	public void setProcessor(double newProcessor)
	{
		this.processor = newProcessor;
	}
	
	// Display information as a String
	public String toString()
	{
		return "Memory: " + this.memory + "Processor: " + this.processor +
				"Size: " + this.size + "Brand: " + this.brand;
	}
	
	public static void main(String args[]) {
		Computer myComputer = new Computer(8,2.4,15.5,"Lenovo");
		Computer JiComputer = new Computer(4,2.4,13.5,"Mac");
		System.out.println(JiComputer.getBrand());
		JiComputer.addMemory(4);
		System.out.println(JiComputer.toString());
	}
	
}
