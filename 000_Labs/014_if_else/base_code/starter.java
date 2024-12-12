/*
 *	Author: Joshua Stone 
 *  Date: 9/23/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
Scanner sc = new Scanner(System.in);
int x = (int)( Math.random()*100);
System.out.println("I've chosen a random number! It is between 1 and 100! Try and guess which number I have chosen!");
int guess = sc.nextInt();

if(guess<x) {
System.out.println("Nope, try going higher !");
}
else{
	System.out.println("Nope, try going lower !");
}

int guess2 = sc.nextInt();

if(guess2 < x) {
	System.out.println("You have to go higher !");
}
else{
	System.out.println("Try going lower now !");
}

int guess3 = sc.nextInt();
if(guess3 < x) {
	System.out.println("You have to go higher !");
}
else{
	System.out.println("Try going lower !");
}

int guess4 = sc.nextInt();
if(guess4 < x) {
	System.out.println("You have to go higher !");
}
else{
	System.out.println("Try going lower !");
}

int guess5 = sc.nextInt();
if(guess5 < x) {
	System.out.println("You have to go higher !");
}
else{
	System.out.println("Try going lower !");
}

int guess6 = sc.nextInt();
if(guess6 < x) {
	System.out.println("You have to go higher !");
}
else{
	System.out.println("Try going lower !");
}

int guess7 = sc.nextInt();
if(guess7 < x) {
	System.out.println("You have to go higher !");
}
else{
	System.out.println("Try going lower !");
}

int guess8 = sc.nextInt();
if(guess8 < x) {
	System.out.println("You have to go higher !");
}
else{
	System.out.println("Try going lower !");
}


int guess9 = sc.nextInt();
if(guess9 < x) {
	System.out.println("You have to go higher !");
}
else{
	System.out.println("Try going lower !");
}

int guess10 = sc.nextInt();
if(guess10 < x) {
	System.out.println("You have to go higher !");
}
else{
	System.out.println("Try going lower !");
}

if(guess==x) {
	System.out.println("That's correct! You guessed it!");
}
if(guess2==x) {
	System.out.println("That's correct! You guessed it!");
}
if(guess3==x) {
	System.out.println("That's correct! You guessed it!");
}
if(guess4==x) {
	System.out.println("That's correct! You guessed it!");
}
if(guess5==x) {
	System.out.println("That's correct! You guessed it!");
}
if(guess6==x) {
	System.out.println("That's correct! You guessed it!");
}
if(guess7==x) {
	System.out.println("That's correct! You guessed it!");
}
if(guess8==x) {
	System.out.println("That's correct! You guessed it!");
}
if(guess9==x) {
	System.out.println("That's correct! You guessed it!");
}
if(guess10==x) {
	System.out.println("That's correct! You guessed it!");
}


	}
}
