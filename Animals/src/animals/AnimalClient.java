/**
 * @author DanielSvrida
 * @version 1
 */
package animals;

public class AnimalClient {

	public static void printArray(Animal[] array) {
		for(int i=0; i <= (array.length - 1); i++) {
			System.out.println(array[i]);
		}
	}
	
	public static void main(String[] args) {
		int fightCounter = 0;
		int roundCounter = 0;
		
		Animal Elephant = new Animal(5, 2, "Elephant", 3);
		Animal Lion = new Animal(-5, 6, "Lion", 4);
		Animal Rabbit = new Animal(-9, -3, "Rabbit", 5);
		Animal Parrot = new Animal(2, 8, "Parrot", 4);
		Animal Cat = new Animal(9, -4, "Cat", 2);
		
		Animal[] animalArray = {Elephant, Lion, Rabbit, Parrot, Cat};
		
		printArray(animalArray);
		System.out.println();
		
		while (fightCounter < 5) {
			
			Elephant.move();
			Lion.move();
			Rabbit.move();
			Parrot.move();
			Cat.move();
			
			if (Elephant.touching(Lion)) {
				System.out.println("FIGHT\nElephant and Lion");
				System.out.println();
				fightCounter++;
			}
			if (Elephant.touching(Rabbit)) {
				System.out.println("FIGHT\nElephant and Rabbit");
				System.out.println();
				fightCounter++;
			}
			if (Elephant.touching(Parrot)) {
				System.out.println("FIGHT\nElephant and Parrot");
				System.out.println();
				fightCounter++;
			}
			if (Elephant.touching(Cat)) {
				System.out.println("FIGHT\nElephant and Cat");
				System.out.println();
				fightCounter++;
			}
			if (Lion.touching(Rabbit)) {
				System.out.println("FIGHT\nLion and Rabbit");
				System.out.println();
				fightCounter++;
			}
			if (Lion.touching(Parrot)) {
				System.out.println("FIGHT\nLion and Parrot");
				System.out.println();
				fightCounter++;
			}
			if (Lion.touching(Cat)) {
				System.out.println("FIGHT\nLion and Cat");
				System.out.println();
				fightCounter++;
			}
			if (Rabbit.touching(Parrot)) {
				System.out.println("FIGHT\nRabbit and Parrot");
				System.out.println();
				fightCounter++;
			}
			if (Rabbit.touching(Cat)) {
				System.out.println("FIGHT\nRabbit and Cat");
				System.out.println();
				fightCounter++;
			}
			if (Parrot.touching(Cat)) {
				System.out.println("FIGHT\nParrot and Cat");
				System.out.println();
				fightCounter++;
			}
			
			printArray(animalArray);
			System.out.println();
			System.out.println("+-+-+-+-+-+-+-+-+-+-+-+-+");
			System.out.println();
			
			roundCounter++;
		}
		
		System.out.println("Total number of fights: "+fightCounter);
		System.out.println("Total number of rounds: "+roundCounter);
		System.out.println();
		printArray(animalArray);
		System.out.println();
		
	}

}
