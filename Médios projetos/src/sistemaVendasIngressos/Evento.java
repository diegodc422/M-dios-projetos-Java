package sistemaVendasIngressos;

public class Evento {
	
	public int VenderIngressoPista() {
		IngressoPista ingressoPista = new IngressoPista();
		return ingressoPista.ListaPista().size();
	}

	public int VenderIngressoVip() {
		IngressoVip ingressoVip = new IngressoVip();
		return ingressoVip.ListaVip().size();
	}
	
	public int VenderIngressoCamarote() {
		IngressoCamarote ingressoCamarote = new IngressoCamarote();
		return ingressoCamarote.ListaCamarote().size();
	}
}
