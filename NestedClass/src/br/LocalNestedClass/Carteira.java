package br.LocalNestedClass;

public class Carteira {
	void processarPagamento() {
		class Transacao{
			void validar() {
				System.out.println("Transacao Aprovado");
			}
		}
		Transacao tx = new Transacao();
		tx.validar();
	}
}
