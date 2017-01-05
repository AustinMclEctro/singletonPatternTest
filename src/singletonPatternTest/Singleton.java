package singletonPatternTest;


public class Singleton {
	private static Singleton instance = null;
	
	//this is here just to handle instantiation attempts
	protected Singleton(){
		System.out.println("instantiation attempt");
	}
	
	public static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
}