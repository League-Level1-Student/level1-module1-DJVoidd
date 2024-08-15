package _07_duck;

public class DuckRunner {
	public static void main(String[] arg0) {
		Duck daffy = new Duck("apple", 5);
		Dog smoke = new Dog("marshmellow", 6);
		
		daffy.quack();
		daffy.waddle();
		daffy.giveFood("apple");
		daffy.giveFood("banana");
		smoke.bark();
		smoke.wag();
		smoke.giveFood("marshmellow");
		smoke.giveFood("mellowmarsh");
	}
}
