package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
public Dog() {
	name = "Clifford";
	age = 3;
	breed = "Big Red Dog";
	}
public Dog(String a) {
		name = a;
		age = 1;
		breed = "dog dog";
		}
public Dog(String a, String b) {
		name = a;
		age = 1;
		breed = b;
		}
public Dog(String a, String b, int c) {
		name = a;
		age = c;
		breed = b;
		}
	
	
	public void	setName(String a) {
		name = a;
		}
		
	public void setAge(int c) {
		age = c;
	}
	
	public void setBreed(String b) {
		breed = b;
	}
	
	public String getName(String a) {
		return a;
	}
	
	public int getAge(int c) {
		return c;
	}
	
	public String getBreed(String b) {
		return b;
	}
	
	public boolean isSleeping() {
		int x = (int)(Math.random()*2)+1;
	}
	if (x==1) {
		System.out.println(name + " is sleeping!");
	}
	else {
		System.out.println(name + " is not asleep!");
	}
	}
	
	public String bark() {
		System.out.println(name + ": Bark bark! Woof woof woof!");
	}


