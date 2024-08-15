package singleton;

public class Main {

	public static void main(String[] args) {
		Singleton s1 = Singleton.getInstance("a"); 
        Singleton s2 = Singleton.getInstance("b"); 
        Singleton s3 = Singleton.getInstance("c");
        
        System.out.printf("%s %n%s %n%s %n", s1,s2,s3);
        
        System.out.printf("s1: %s %ns2: %s %ns3: %s", s1.getS(), s2.getS(), s3.getS());
	}
}