class Fineshyt{
	String name;
	
	void displayName() {
		System.out.println("Fineshyt Name: "+ name);
	}
}

public class Main {
	public static void main(String[] args) {
		
		Fineshyt n1=null;
		
		try {
			n1.displayName();
		}catch (Exception e) {
			System.out.println("Error: cannot find Fineshyt");
		}
	}
}
