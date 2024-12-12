/*
 *	Author: Jshua Stone
 *  Date: 10/22/24
 * 	Collaborator(s): Chase De Leon
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	
	public static void main(String args[]) {
		Employee michael = new Employee();
		Employee dwight = new Employee(1987, "Dwight",  "Howard", 4416.66);
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250);
		Employee chaseo = new Employee(5508, "Chaseo", "DeLeeon", 3004);
	
		michael.raiseSalary(60);
		dwight.raiseSalary(10);
		jim.raiseSalary(90);
		pam.raiseSalary(800);
		chaseo.raiseSalary(4);
		
		Double michaelsalary = michael.getAnnualSalary();
		Double dwightsalary = dwight.getAnnualSalary();
		Double jimsalary = jim.getAnnualSalary();
		Double pamsalary = pam.getAnnualSalary();
		Double chaseosalary = chaseo.getAnnualSalary();
		
		michael.employeeToString();
		dwight.employeeToString();
		jim.employeeToString();
		pam.employeeToString();
		chaseo.employeeToString();
		
		System.out.println("Michael's annual salary is " + michaelsalary);
		System.out.println("Dwight's annual salary is " +dwightsalary);
		System.out.println("Jim's annual salary is " +jimsalary);
		System.out.println("Pam's annual salary is " +pamsalary);
		System.out.println("Chaseo's annual salary is " +chaseosalary);
		
		
	}
}
