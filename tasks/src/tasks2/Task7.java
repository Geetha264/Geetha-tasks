package tasks2;

class Animal {
    public void makeSound() {
	System.out.println("Animal makes a sound.");
	}
}
class Dog extends Animal {
	public void makeSound() {
	System.out.println("Dog barks.");
    }
}
		
class Cat extends Animal {
	public void makeSound() {
    System.out.println("Cat meows.");
    }
}

class Cow extends Animal {
	public void makeSound() {
	System.out.println("Cow moos.");
	}
}

public class Task7 {
		    public static void main(String[] args) {
		        Animal a = new Animal();
		        Animal dog = new Dog(); 
		        Animal cat = new Cat(); 
		        Animal cow = new Cow();

		        a.makeSound(); 
		        dog.makeSound();         
		        cat.makeSound();        
		        cow.makeSound();        
		    }
		}


