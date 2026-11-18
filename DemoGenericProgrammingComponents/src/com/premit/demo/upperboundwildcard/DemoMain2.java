package com.premit.demo.upperboundwildcard;

import java.util.ArrayList;
import java.util.List;

public class DemoMain2 {
	/*
	public static void display(List<Animal> list) {
		System.out.println(list);
	}
	*/
	
	public static void display(List<? extends Animal> list) {
		System.out.println(list);
	}
	
	public static void main(String[] args) {
		List<Animal> animalList = new ArrayList<Animal>();
		
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		Animal animal3 = new Animal();
		
		animal1.setName("Lion");
		animal2.setName("Tiger");
		animal3.setName("Cat");
		
		animalList.add(animal1);
		animalList.add(animal2);
		animalList.add(animal3);
		
		display(animalList);
		
		List<Dog> dogList = new ArrayList<Dog>();
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog();
		Dog dog3 = new Dog();
		
		dog1.setName("Pinky");
		dog2.setName("Bruce");
		dog3.setName("Ruth");
		
		dogList.add(dog1);
		dogList.add(dog2);
		dogList.add(dog3);
		
	//	display(dogList); //compile time exception: List<Dog> is not applicable for List<Animal>
		display(dogList);//No compile time exception.
	}
}
