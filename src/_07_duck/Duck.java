package _07_duck;

public class Duck {
	int numberOfFriends;
	String favoriteFood;
	Duck(String favoriteFood, int numberOfFriends) {
		this.favoriteFood = favoriteFood;
		this.numberOfFriends = numberOfFriends;
	}
	void quack() {
		System.out.println("Quack!");
	}
	void waddle(){
		System.out.println("*The duck waddles over to you*");
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
