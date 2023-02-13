package sistemaVendasIngressos;

import java.util.ArrayList;
import java.util.Date;

public class IngressoPista {

	int ValoringressoPista = 100; 
	
	public ArrayList<String> ListaPista() {
		
		Date data = new Date();
		ArrayList<String> IngressosVendidosPista = new ArrayList<String>();
		
		int valor = ValoringressoPista;
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
}