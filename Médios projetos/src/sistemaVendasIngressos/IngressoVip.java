package sistemaVendasIngressos;

import java.util.ArrayList;
import java.util.Date;

public class IngressoVip {

	int ValoringressoPista = 100;

	public int ingressoVip() {

		double calculo = ValoringressoPista + (ValoringressoPista * 0.3);

		return (int) calculo;
	}

	public  ArrayList<String> ListaVip() {

		ArrayList<String> IngressosVendidosVip = new ArrayList<String>();
		
		Date data = new Date();

		int valor = ingressoVip();
		System.out.println("Informações dos ingressos Vip e a data " + data );
		System.out.println("Valor Total: " + valor * 8 + "R$");
		
		IngressosVendidosVip.add("nome: Singed," + " cpf: 333");

		IngressosVendidosVip.add("nome: Ashe," + " cpf: 123");

		IngressosVendidosVip.add("nome: Vayne," + " cpf: 792");
		
		IngressosVendidosVip.add("nome: jayce," + " cpf: 740");
		
		IngressosVendidosVip.add("nome: leblanc," + " cpf: 408");
		
		IngressosVendidosVip.add("nome: zed," + " cpf: 756");
		
		IngressosVendidosVip.add("nome: fizz," + " cpf: 890");
		
		IngressosVendidosVip.add("nome: nocturne," + " cpf: 375");

		IngressosVendidosVip.stream().limit(200).forEach(System.out::println);

		System.out.println("Total: " + IngressosVendidosVip.size());
		return IngressosVendidosVip;
	}
}
