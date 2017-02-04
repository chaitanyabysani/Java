package hierarchicalInheritancePackage;

public class HirarechialInheritance {

	public static void main(String[] args) {
		
		KidOne K1 = new KidOne();
		System.out.println("\n\tKid one says: ");
		K1.ParentMethod();
		K1.KidOneMethod();
		
		KidOne K2 = new KidOne();
		System.out.println("\n\tKid two says: ");
		K2.ParentMethod();
		K2.KidOneMethod();
		
		KidOne K3 = new KidOne();
		System.out.println("\n\tKid three says: ");
		K3.ParentMethod();
		K3.KidOneMethod();

	}

}
