package bank;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Agency {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Count> bankAcounts;

	public static void main(String[] args) {
		bankAcounts = new ArrayList<Count>();
		operations();
	}

	private static void operations() {
		int operation = Integer.parseInt(JOptionPane.showInputDialog("-Escolha uma operação -- " + "Criar conta (1)--"
				+ " Depositar (2) --" + " Sacar (3)-- " + " Transferir (4)-- " + " Listar Contas (5)-- "
				+ "	 sair (6) "));

		switch (operation) {
			case 1:
				AccountCreate();
				break;
			case 2:
				Deposit();
				break;
			case 3:
				ToWithDraw();
				break;
			case 4:
				moneyTransfer();
				break;
			case 5:
				AccountList();
				break;
			case 6:
				JOptionPane.showMessageDialog(null, "Operação encerrada com sucesso!");
				System.exit(0);
			default:
				JOptionPane.showMessageDialog(null, "Operação inválida");
				JOptionPane.showMessageDialog(null, "Por favor escolha uma operação válida!");
				operations();
				break;
		}
	}

	private static void AccountCreate() {
		Person person = new Person();
		person.setName(JOptionPane.showInputDialog("Nome: "));
		person.setCpf(JOptionPane.showInputDialog("CPF: "));
		person.setEmail(JOptionPane.showInputDialog("E-mail: "));

		Count count = new Count(person);

		bankAcounts.add(count);
		JOptionPane.showMessageDialog(null, "Conta criada com sucesso");
		operations();
	}

	private static void Deposit() {
		int accountNumber = Integer.parseInt(JOptionPane.showInputDialog("Número da conta para depósito"));
		Count count = FindAccount(accountNumber);

		if (count != null) {
			Double depositValue = Double.parseDouble(JOptionPane.showInputDialog("Valor do depósito"));
			count.MoneyDeposit(depositValue);
			JOptionPane.showMessageDialog(null, "Valor depositado com sucesso!");
		} else
			JOptionPane.showMessageDialog(null, "Não foi possível depositar o valor");
		operations();
	}

	private static void ToWithDraw() {
		int countNumber = Integer.parseInt(JOptionPane.showInputDialog("Número da conta para sacar"));

		Count count = FindAccount(countNumber);

		if (count != null) {
			Double withdrawAmount = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor para saque"));
			count.withDrawMoney(withdrawAmount);
		} else
			JOptionPane.showMessageDialog(null, "Saldo insuficiente");
		operations();
	}

	public static void moneyTransfer() {
		int senderAccountNumber = Integer.parseInt(JOptionPane.showInputDialog("Número da conta do remetente"));

		Count senderAccount = FindAccount(senderAccountNumber);

		if (senderAccount != null) {
			int recipientAccountNumber = Integer.parseInt(JOptionPane.showInputDialog("Conta do destinatário"));

			Count recipientAccount = FindAccount(recipientAccountNumber);

			if (recipientAccount != null) {
				Double value = Double.parseDouble(JOptionPane.showInputDialog("Valor da trasnferência"));
				senderAccount.moneyTransfer(recipientAccount, value);
			} else
				JOptionPane.showMessageDialog(null, "Não foi possível realizar a transferência");
		}
		operations();
	}

	private static void AccountList() {
		if (bankAcounts.size() > 0) {
			for (Count counts : bankAcounts)
				JOptionPane.showInternalMessageDialog(null, counts);
		} else
			JOptionPane.showMessageDialog(null, "Não existe contas cadastradas");
		operations();
	}

	private static Count FindAccount(int accountNumber) {
		Count count = null;
		if (bankAcounts.size() > 0) {
			for (Count counts : bankAcounts) {
				if (counts.getAccountNumber() == accountNumber)
					count = counts;
			}
		}
		return count;
	}
}
