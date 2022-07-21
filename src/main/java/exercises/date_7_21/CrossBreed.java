package main.java.exercises.date_7_21;

public class CrossBreed extends Retriever{
	
	public String breed;
	
	public CrossBreed(String breed) {
		super(breed);
	}
	
	public void printBreed() {
		System.out.println("Dog is " + super.breed + " " + this.breed);
	}

	public void speak() {
		super.speak();
		System.out.println(" bow wow" );
	}
}
