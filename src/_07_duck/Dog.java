package _07_duck;

public class Dog {
	int numberOfFriends;
	String favoriteFood;

	Dog(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}

	void bark(){
		System.out.println("Woof!");
	}

	void wag() {
		System.out.println("*The dog wags its tails at you*");
	}
	void giveFood(String foodGiven) {
		if (foodGiven.equals(favoriteFood)) {
			System.out.println("They love it!");
		}
		else{
			System.out.println("Maybe give them something else...");
		}
	}
}