package bank;

import javax.swing.JOptionPane;

public class Count {

	private static int countAccount = 1;

	private int accountNumber;
	private String name;
	private Person person;
	private Double balance = 0.0;

	public Count(Person person) {
		this.accountNumber = Count.countAccount;
		this.person = person;
		Count.countAccount += 1;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public String toString() {
		return "\nNome: " + this.person.getName() + "\nNúmero da conta: " + this.getAccountNumber()
				+ "\nNúmero do CPF: " + this.person.getCpf() + "\nE-mail: " + this.person.getEmail() + "\nSaldo: "
				+ Utilities.doubleToString(this.getBalance()) + "\n";
	}

	public void MoneyDeposit(Double value) {
		if (value > 0)
			setBalance(getBalance() + value);
		else
			JOptionPane.showMessageDialog(null, "Não foi possível realizar o depósito");
	}

	public void withDrawMoney(Double value) {
		if (value > 0 && this.getBalance() >= value) {
			setBalance(getBalance() - value);
			JOptionPane.showMessageDialog(null, "Saque realizado com sucesso!");
		} else
			JOptionPane.showMessageDialog(null, "Não foi possível realizar o saque, saldo insuficiente");
	}

	public void moneyTransfer(Count accountForDeposit, Double value) {
		if (value > 0 && this.getBalance() >= value) {
			setBalance(getBalance() - value);
			accountForDeposit.balance = accountForDeposit.getBalance() + value;
			JOptionPane.showMessageDialog(null, "Transferencia realizada com sucesso");
		} else
			JOptionPane.showMessageDialog(null, "Não foi possível realizar a transferência, Saldo insuficiente.");
	}
}
