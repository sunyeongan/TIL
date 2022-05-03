package ListQueue;

public class AnimalTest {

	public static void main(String[] args) {
		
		AnimalShelter<String> S = new AnimalShelter<String>(); 
		
		S.enter_dog("Bread");
		S.enter_dog("Tom");
		S.enter_cat("Cindy");
		S.enter_dog("Jake");
		S.enter_cat("Jenny");
		S.enter_dog("Alex");
		S.enter_dog("Lucy");
		S.enter_cat("Maggie");
		
		//S.DogPrint();
		S.print();
		
		
		System.out.println("아무거나 입양"); 
		S.adoptAny(); 
		S.print();
		System.out.println("고양이 입양");
		S.adoptCat(); S.print();
		
		System.out.println("개 입양");
		S.adoptDog(); S.print();
		System.out.println("아무거나 입양");
		S.adoptAny(); S.print();
		System.out.println("개 입양"); 
		S.adoptDog(); S.print();

	}

}
