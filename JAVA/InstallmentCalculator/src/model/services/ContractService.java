package model.services;

import java.time.LocalDate;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	private OnlinePaymentService paymentService;

	public ContractService(OnlinePaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public void processContract (Contract contract, Integer installments) {
		Double basicQuota = contract.getTotalValue() / installments;
		
		for (int i = 1; i <= installments; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			Double updatedQuota = basicQuota + paymentService.interest(basicQuota, i);
			Double finalQuota = updatedQuota + paymentService.paymentFee(updatedQuota);
			
			contract.addInstallments(new Installment(dueDate, finalQuota));
		}
	}
	
}
