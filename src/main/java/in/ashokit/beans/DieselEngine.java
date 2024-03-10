 package in.ashokit.beans;

public class DieselEngine implements IEngine{

	public 	DieselEngine()
	{
	System.out.println("Diesele Engine :: Constructor....");	
	}
	public int start() {
		System.out.println("Disele Engine Started...");
		return 1;
	}

}
