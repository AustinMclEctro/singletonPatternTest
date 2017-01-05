package singletonPatternTest;

public class Main {

	public static void main(String[] args) {
		Singleton s = new Singleton();
		System.out.println(s.getInstance());
	}

}
