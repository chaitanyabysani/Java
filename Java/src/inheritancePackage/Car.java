package inheritancePackage;

public class Car extends Vehicle {

	int CC;
	int gears;
	void attributescar() {
		// The subclass refers to the members of the superclass
		System.out.println("Color of Car : " + color);
		System.out.println("Speed of Car : " + speed);
		System.out.println("Size of Car : " + size);
		System.out.println("CC of Car : " + CC);
		System.out.println("No of gears of Car : " + gears);
	}

}
