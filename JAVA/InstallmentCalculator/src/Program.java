import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		ContractService contractService = new ContractService(new PaypalService());
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the contract data:");
		System.out.print("Number: ");
		Integer number = sc.nextInt();
		System.out.print("Date (dd/mm/yyyy): ");
		sc.nextLine();
		LocalDate date = LocalDate.parse(sc.next(), fmt);
		System.out.print("Contract value: ");
		Double totalValue = sc.nextDouble();
		System.out.print("Enter the number of installments: ");	
		Integer installments = sc.nextInt();
		
		Contract contract = new Contract(number, date, totalValue);
		contractService.processContract(contract, installments);
		
		System.out.println(contract.toString());
		
		sc.close();

	}

}
