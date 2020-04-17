package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.taxCompany;
import entities.taxIndividual;
import entities.taxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<taxPayer> list = new ArrayList<>();
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		for (int i=1; i<=n; i++) {
			System.out.println("Tax payer #" + i + " data:");
			System.out.print("Individual or company (i/c)? ");
			char ent = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double anualIncome = sc.nextDouble();
			
			if (ent == 'i') {
				System.out.print("Health expenditures: ");
				double healthExpenditures = sc.nextDouble();
				
				list.add(new taxIndividual(name, anualIncome, healthExpenditures)); 
			}
			else {
				System.out.print("Number of employees: ");
				int numberEmployees = sc.nextInt();
				list.add(new taxCompany(name, anualIncome, numberEmployees));
			}
		}
		
		System.out.println();
		System.out.println("TAXES PAID:");
		for (taxPayer taxPayer : list) {
			System.out.println(taxPayer.taxesPaid());
		}
		
		System.out.println();
		double sum = 0.0;
		for (taxPayer taxPayer : list) {
			sum += taxPayer.taxValue();
		}
		System.out.printf("TOTAL TAXES: $%.2f", sum);
				
		sc.close();
	}

}
