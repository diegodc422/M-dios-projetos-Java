package sistemaVendasIngressos;

import java.util.ArrayList;
import java.util.Date;

public class IngressoCamarote {

	int ValoringressoPista = 100;

	public int ingressoCamarote() {

		double calculo = ValoringressoPista + (ValoringressoPista * 0.6);
		return (int) calculo;
	}

	public ArrayList<String> ListaCamarote() {

		Date data = new Date();
		ArrayList<String> IngressosVendidosCamarote = new ArrayList<String>();
		System.out.println("--------------------------------------------------------------");
		int valor = ingressoCamarote();

		System.out.println("Informações dos ingressos Camarote e a data " + data);
		System.out.println("Valor Total: " + valor * 7 + "R$");

		IngressosVendidosCamarote.add("nome: Darius," + " cpf: 987");

		IngressosVendidosCamarote.add("nome: Diana," + " cpf: 678");
		
		IngressosVendidosCamarote.add("nome: jax," + " cpf: 841");
		
		IngressosVendidosCamarote.add("nome: teemo," + " cpf: 051");
		
		IngressosVendidosCamarote.add("nome: irelia," + " cpf: 381");
		
		IngressosVendidosCamarote.add("nome: varus," + " cpf: 592");
		
		IngressosVendidosCamarote.add("nome: urgot," + " cpf: 034");

		IngressosVendidosCamarote.stream().limit(200).forEach(System.out::println);

		System.out.println("Total: " + IngressosVendidosCamarote.size());
		return IngressosVendidosCamarote;
	}
}
