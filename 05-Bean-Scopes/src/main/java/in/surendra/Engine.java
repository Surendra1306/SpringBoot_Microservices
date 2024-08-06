package in.surendra;

public class Engine {
	
	public Engine()
	{
	System.out.println("0-param constructor....");	
	}
	
	public void start() {
		System.out.println("Engine started..");
	}
	
	public void performTask()
	{
		System.out.println("Engine performing the task...");
	}
	public void dead() {
		System.out.println("Engine stopped...");
	}
}
