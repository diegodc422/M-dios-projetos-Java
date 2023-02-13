package sistemaVendasIngressos;

public class TesteSistema {

	public static void main(String[] args) {

		Evento evento = new Evento();
		evento.VenderIngressoPista();
		evento.VenderIngressoVip();
		evento.VenderIngressoCamarote();

	}
}