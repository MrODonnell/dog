package dog;

public class DogRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog fido = new Dog();
		System.out.println(fido.breed);
		fido.speak();
		
		Dog gigi = new Dog(3, "poodle", "yip");
		System.out.println(gigi.breed);
		gigi.speak();
		
		Retriever max = new Retriever(6, "Labrador", "bark");
		max.speak();
		max.fetch();
		
	}

}
