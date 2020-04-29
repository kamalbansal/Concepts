package Anonymous;

public class AnonymousClass {

	public static void main(String[] args) {
		
//		Anonymous Inner class that extends a class
		IVehicle v = new IVehicle() {
			public void display() {
				System.out.println("Anonymous Class");
			}
		}; 
		
		v.display();
		
//		Anonymous Inner class that implements a interface
		Vehicle t = new Vehicle() {
			public void display() {
				System.out.println("Child Thread");
			}
		};
		t.display();
		System.out.println("Main Thread");
		
		//Anonymous Inner class that defines inside method/constructor argument 
		Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("Child Thread");
				}
			}
		);
		t1.start();
		System.out.println("Main Thread");
	}

}
