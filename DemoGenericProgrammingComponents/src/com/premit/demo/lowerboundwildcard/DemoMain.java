package com.premit.demo.lowerboundwildcard;
import java.util.ArrayList;
import java.util.List;
public class DemoMain {
	/*
	public static void display(List<Dog> list) {
		System.out.println(list);
	}
	*/
	public static void display(List<? super Dog> list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		List<Dog> dogList = new ArrayList<Dog>();
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.setName("Ruth");
		dog2.setName("Rose");
		dog3.setName("Jack");
		
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
		display(dogList);
		
		List<Animal> animalList = new ArrayList<Animal>();
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		
		animal1.setName("Lion");
		animal2.setName("Tiger");
		animal3.setName("Panda");
		
		animalList.add(animal1);
		animalList.add(animal2);
		animalList.add(animal3);
		
		//display(animalList); //Compile time error: List<Animal> not applicable for List<Dog>
		display(animalList);//No error.
		
	}
}
