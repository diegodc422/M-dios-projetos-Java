package sistemaVendasIngressos;

import java.util.ArrayList;
import java.util.Date;

public class Ingresso {

	int ingressoPista = 100;

	public int ingressoVip() {

		double calculo = ingressoPista + (ingressoPista * 0.3);

		return (int) calculo;
	}

	public int ingressoCamarote() {

		double calculo = ingressoPista + (ingressoPista * 0.6);
		return (int) calculo;
	}

	public ArrayList<String> ListaPista() {

		Date data = new Date();
		ArrayList<String> IngressosVendidosPista = new ArrayList<String>();

		int valor = ingressoPista;
		System.out.println("Informações do ingresso Pista e a data " + data);
		System.out.println("Valor Total: " + valor * 9 + "R$");

		IngressosVendidosPista.add("nome: Diego," + " cpf: 000 ");

		IngressosVendidosPista.add("nome: Michely," + " cpf: 111");

		IngressosVendidosPista.add("nome: Lupita," + " cpf: 432");

		IngressosVendidosPista.add("nome: Lucas," + " cpf: 921");

		IngressosVendidosPista.add("nome: Larissa," + " cpf: 860");

		IngressosVendidosPista.add("nome: Todynho," + " cpf: 073");

		IngressosVendidosPista.add("nome: Sylas," + " cpf: 862");

		IngressosVendidosPista.add("nome: Gary," + " cpf: 602");

		IngressosVendidosPista.add("nome: LulaMolusco," + " cpf: 752");

		IngressosVendidosPista.stream().limit(200).forEach(System.out::println);

		System.out.println("Total: " + IngressosVendidosPista.size());
		System.out.println("--------------------------------------------------------------");
		return IngressosVendidosPista;
	}

	public ArrayList<String> ListaVip() {

		ArrayList<String> IngressosVendidosVip = new ArrayList<String>();

		Date data = new Date();

		int valor = ingressoVip();
		System.out.println("Informações dos ingressos Vip e a data " + data);
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
