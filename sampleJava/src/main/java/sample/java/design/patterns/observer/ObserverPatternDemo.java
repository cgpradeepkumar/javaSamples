package sample.java.design.patterns.observer;

public class ObserverPatternDemo {
	
	public static void main(String arg[]) {
		
		Subject subject = new Subject();
		
		Observer binary = new BinaryObserver(subject);
		Observer octal = new OctalObserver(subject);
		
		subject.setState(1);
	}
}
