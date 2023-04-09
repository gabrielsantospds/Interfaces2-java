package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		try {
			DateTimeFormatter fdt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the contract's data");
			System.out.print("Number: ");
			int contractNumber = sc.nextInt();
			System.out.print("Date (dd/MM/yyyy): ");
			LocalDate contractDate = LocalDate.parse(sc.next(), fdt);	
			System.out.print("Total value: ");
			double contractValue = sc.nextDouble();
			
			Contract contract = new Contract(contractNumber, contractDate, contractValue);
			
			System.out.print("Enter the installment's quantity: ");
			int month = sc.nextInt();
			
			ContractService contractService = new ContractService(new PaypalService());
			
			contractService.processContract(contract, month);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

}
